/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package managedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.xml.ws.WebServiceRef;
import service.user.UserService_Service;

/**
 *
 * @author wkynrocks
 */
@ManagedBean
@RequestScoped
public class listaUsuarios {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Proyecto9-war/UserService.wsdl")
    private UserService_Service service;

    /**
     * Creates a new instance of listaUsuarios
     */
    public listaUsuarios() {
    }
    
    public java.util.List<service.user.User> listaTodos(){
        return findAllUser();
    }

    private java.util.List<service.user.User> findAllUser() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.user.UserService port = service.getUserServicePort();
        return port.findAllUser();
    }
    
}
