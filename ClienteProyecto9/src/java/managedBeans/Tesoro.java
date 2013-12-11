/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package managedBeans;

import dominiogeocaching.GeocodeResponse;
import dominiogeocaching.Results;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.ws.rs.core.GenericType;
import javax.xml.ws.WebServiceRef;
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
        rest.googlegeo.GoogleGeoClient client = new rest.googlegeo.GoogleGeoClient();
        GeocodeResponse googleresponse = client.geocode(GeocodeResponse.class, getDireccion(), "true", "");
        if (googleresponse.getStatus().equals("OK")){
            List<Results> lr = googleresponse.getResults();
            String lat = lr.get(0).getGeometry().getLocation().getLat().toString();
            String lng = lr.get(0).getGeometry().getLocation().getLng().toString();
            tesoro.setPosicion(lat+","+lng);
            tesoro.setAltitud("0");
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
        rest.googlegeo.GoogleGeoClient client = new rest.googlegeo.GoogleGeoClient();
        String[] pos = tesoro.getPosicion().split(",");
        GeocodeResponse googleInverso = client.geocodeInverso(GeocodeResponse.class, pos[0] + "," + pos[1], "true", "");
        Results resultInverso = googleInverso.getResults().get(0);
        return resultInverso.getFormatted_address();
    }
}
