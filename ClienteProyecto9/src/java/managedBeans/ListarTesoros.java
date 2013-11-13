/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package managedBeans;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.xml.ws.WebServiceRef;
import service.TesoroService_Service;
import service.User;
import service.UserService_Service;

/**
 *
 * @author wkynrocks
 */
@ManagedBean
@RequestScoped
public class ListarTesoros {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Proyecto9-war/UserService.wsdl")
    private UserService_Service service_1;
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Proyecto9-war/TesoroService.wsdl")
    private TesoroService_Service service;
    /** 
     * Creates a new instance of ListarTesoros
     */
    
    private String criterio;
    private String textbusqueda;
    private boolean busqueda=false;
    
    
    public ListarTesoros() {
    }
    
    public java.util.List<service.Tesoro> listaTesoros(service.User user){
        return findByUsuarioBuscando(user.getUsername());
    }

    private java.util.List<service.Tesoro> findByUsuarioBuscando(String user) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.TesoroService port = service.getTesoroServicePort();
        return port.findByUsuarioBuscando(user);
    }
    
    
    public java.util.List <service.Tesoro> listarTesorosCreados(service.User usuario){
        
        return findListaTesorosCreados(usuario.getIdUser());
    }

    private java.util.List<service.Tesoro> findListaTesorosCreados(java.lang.Integer idUser) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.UserService port = service_1.getUserServicePort();
        return port.findListaTesorosCreados(idUser);
    }

    /**
     * @return the criterio
     */
    public String getCriterio() {
        return criterio;
    }

    /**
     * @param criterio the criterio to set
     */
    public void setCriterio(String criterio) {
        this.criterio = criterio;
    }

    /**
     * @return the textbusqueda
     */
    public String getTextbusqueda() {
        return textbusqueda;
    }

    /**
     * @param textbusqueda the textbusqueda to set
     */
    public void setTextbusqueda(String textbusqueda) {
        this.textbusqueda = textbusqueda;
    }
    
    public String listarBusquedaTesoros(){
        busqueda = true;

        return "busquedaTesoro.xhtml";
    }
    
    private java.util.List<service.Tesoro> findByCriterioTesoro(java.lang.String criterio, java.lang.String textbusqueda) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.TesoroService port = service.getTesoroServicePort();
        return port.findByCriterioTesoro(criterio, textbusqueda);
    }
    
    public java.util.List<service.Tesoro> listarTesorosporCriterio(){
        return findByCriterioTesoro(criterio,textbusqueda);
    }

    /**
     * @return the busqueda
     */
    public boolean isBusqueda() {
        return busqueda;
    }

    /**
     * @param busqueda the busqueda to set
     */
    public void setBusqueda(boolean busqueda) {
        this.busqueda = busqueda;
    }
    
    public boolean hacerSeguimiento(Integer idUser, Integer idTesoro){
        return false;
    }
    
    public boolean estaSiguiendo(User usuario,service.Tesoro tesoro){
        java.util.List<service.Tesoro> lt = listaTesoros(usuario);
        boolean encontrado = false;
        int i=0;
        while ((i<lt.size())&&(!encontrado)){
            if (lt.get(i).getIdTesoro()==tesoro.getIdTesoro()){
                encontrado = true;
            }
            i++;
        }
        
        return encontrado;
    }


}