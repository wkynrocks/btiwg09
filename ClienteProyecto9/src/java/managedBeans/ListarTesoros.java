/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package managedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.xml.ws.WebServiceRef;
import service.tesoro.TesoroService_Service;

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
    
    public java.util.List<service.tesoro.Tesoro> porUsuarioBuscando(){
        return findByUsuarioBuscando(null);
    }

    private java.util.List<service.tesoro.Tesoro> findByUsuarioBuscando(service.tesoro.User user) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.tesoro.TesoroService port = service.getTesoroServicePort();
        return port.findByUsuarioBuscando(user);
    }
    
}
