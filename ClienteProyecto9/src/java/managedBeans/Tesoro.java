/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package managedBeans;

import java.io.IOException;
import java.util.ArrayList;
import rest.domains.elevation.Elevation;
import rest.domains.geocaching.GeocodeResponse;
import rest.domains.geocaching.Results;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.core.GenericType;
import javax.xml.ws.WebServiceRef;
import rest.flickr.photoservice.flickrresponse.Rsp;
import rest.flickr.photoservice.flickrresponse.Rsp.Photo;
import rest.flickr.photoservice.flickrresponse.Rsp.Photos;
import service.TesoroService_Service;
import service.UserService_Service;

/**
 *
 * @author wkynrocks
 */
@ManagedBean
@SessionScoped
public class Tesoro {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Proyecto9-war/UserService.wsdl")
    private UserService_Service service_1;
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Proyecto9-war/TesoroService.wsdl")
    private TesoroService_Service service;
    
    private String direccion;
    private boolean errorTesoroCrear=false;
    private List<String> imagenestes;
    private boolean booleanimg;
    private String[] pos;
    

    public boolean isErrorTesoroCrear() {
        return errorTesoroCrear;
    }

    public void setErrorTesoroCrear(boolean errorTesoroCrear) {
        this.errorTesoroCrear = errorTesoroCrear;
    }
    
    private service.Tesoro tesoro;

    public service.Tesoro getTesoro() {
        return tesoro;
    }

    public void setTesoro(service.Tesoro tesoro) {
        this.tesoro = tesoro;
    }
    
    
    /**
     * Creates a new instance of Tesoro
     */
    public Tesoro() {
    }
    

    public String pagcrearTesoro(){
        return "crearTesoro.xhtml";
    }

    private void create(service.Tesoro entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.TesoroService port = service.getTesoroServicePort();
        port.createTesoro(entity);
    }
    
    public String crearTesoro(service.User usuario){
        setDireccion(getDireccion() + " " + tesoro.getCiudad() + " " + tesoro.getPais());
        tesoro.setUseridUser(usuario);
        tesoro.setHabilitado(true);
        rest.clients.GoogleGeoClient client = new rest.clients.GoogleGeoClient();
        GeocodeResponse googleresponse = client.geocode(GeocodeResponse.class, getDireccion(), "true", "");
        if (googleresponse.getStatus().equals("OK")){
            List<Results> lr = googleresponse.getResults();
            String lat = lr.get(0).getGeometry().getLocation().getLat().toString();
            String lng = lr.get(0).getGeometry().getLocation().getLng().toString();
            tesoro.setPosicion(lat+","+lng);
            
            rest.clients.ElevationClient eleclient = new rest.clients.ElevationClient();
            Elevation ele = eleclient.elevation(Elevation.class, "true", lat+","+lng,"");
            tesoro.setAltitud(ele.getResults().get(0).getElevation().toString());
            create(tesoro);
            usuario.setRol("Colaborador");
            editUser(usuario);
        }
        return "paginaHomeUsuario.xhtml";
    }
    
    
    @PostConstruct
    public void init(){
        tesoro=new service.Tesoro();
        
    }

    private void editUser(service.User entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.UserService port = service_1.getUserServicePort();
        port.editUser(entity);
    }
    
    public String pagInfo(service.Tesoro tesoro){
        this.tesoro = tesoro;
        return "infoTesoro.xhtml";
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String obtenerDireccion(){
        rest.clients.GoogleGeoClient client = new rest.clients.GoogleGeoClient();
        pos = tesoro.getPosicion().split(",");
        GeocodeResponse googleInverso = client.geocodeInverso(GeocodeResponse.class, pos[0] + "," + pos[1], "true", "");
        Results resultInverso = googleInverso.getResults().get(0);
        booleanimg=false;
        return resultInverso.getFormatted_address();
    }
    
    public List<String> imagenestesoro() throws ClientErrorException, IOException{
        if (!booleanimg){
            rest.clients.FlickrClient flickrclient = new rest.clients.FlickrClient();
            Rsp responseflickr = flickrclient.photos_ownsearch(Rsp.class, "4bb4a7f3590b07606fc71d4e4e34c656", pos[0],pos[1]);
            List<Photos.Photo> lphotos = responseflickr.getPhotos().getPhoto().subList(0, 3);

            //http://farmX.staticflickr.com/SERVER/ID_SECRET_A.jpg
            List<String> dirphotos = new ArrayList();
            StringBuilder direc = new StringBuilder();
            StringBuilder direcz = new StringBuilder();
            for (Photos.Photo p: lphotos){
                Rsp responsephoto = flickrclient.photos_owngetInfo(Rsp.class,"4bb4a7f3590b07606fc71d4e4e34c656", p.getId(), "");
                direc.append("http://farm");
                direc.append(responsephoto.getPhoto().getFarm());
                direc.append(".staticflickr.com/");
                direc.append(responsephoto.getPhoto().getServer()).append("/");
                direc.append(responsephoto.getPhoto().getId()).append("_");  
                direc.append(responsephoto.getPhoto().getSecret()).append("_t.jpg");
                dirphotos.add(direc.toString());
                direc.delete( 0, direc.length() );
            }
            imagenestes = dirphotos;
            booleanimg = true;
        }
        return imagenestes;
    }
}
