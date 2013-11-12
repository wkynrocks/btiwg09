/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package managedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.xml.ws.WebServiceRef;
import service.tesoro.TesoroService_Service;
import service.user.User;

/**
 *
 * @author wkynrocks
 */
@ManagedBean
@RequestScoped
public class Tesoro {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Proyecto9-war/TesoroService.wsdl")
    private TesoroService_Service service;
    
    private service.tesoro.Tesoro tes;
  
    @ManagedProperty(value="#{Usuario.usuario}")
    private User us;
    
    
    /**
     * Creates a new instance of Tesoro
     */
    public Tesoro() {
    }
    

    public String pagcrearTesoro(){
        return "crearTesoro.xhtml";
    }

    private void create(service.tesoro.Tesoro entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.tesoro.TesoroService port = service.getTesoroServicePort();
        port.create(entity);
    }
    
    public void crearTesoro(){
        create(tes);
    }

    /**
     * @return the tes
     */
    public service.tesoro.Tesoro getTes() {
        return tes;
    }

    /**
     * @param tes the tes to set
     */
    public void setTes(service.tesoro.Tesoro tes) {
        this.tes = tes;
    }
    
    public String registrarTes(){
        tes.setHabilitado(true);
        return null;
    }
    
    
}
