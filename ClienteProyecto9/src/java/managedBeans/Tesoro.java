/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package managedBeans;

import javax.annotation.PostConstruct;
import javax.ejb.EJBException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
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
public class Tesoro {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Proyecto9-war/UserService.wsdl")
    private UserService_Service service_1;
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Proyecto9-war/TesoroService.wsdl")
    private TesoroService_Service service;
    
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
        tesoro.setUseridUser(usuario);
        tesoro.setHabilitado(true);
        create(tesoro);
        usuario.setRol("Colaborador");
        editUser(usuario);
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
}
