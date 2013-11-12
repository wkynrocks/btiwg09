/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package managedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.xml.ws.WebServiceRef;
import service.TesoroService_Service;
import service.User;

/**
 *
 * @author wkynrocks
 */
@ManagedBean
@RequestScoped
public class ListarTesoros {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Proyecto9-war/TesoroService.wsdl")
    private TesoroService_Service service;
    /**
     * Creates a new instance of ListarTesoros
     */
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
    
    public java.util.List <service.Tesoro> listTesoros(service.User usuario){
        
        return null;
    }
}