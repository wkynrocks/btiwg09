/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package managedBeans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.xml.ws.WebServiceRef;
import service.user.User;
import service.user.UserService_Service;

/**
 *
 * @author wkynrocks
 */
@ManagedBean
@SessionScoped
public class Usuario {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Proyecto9-war/UserService.wsdl")
    private UserService_Service service;
    private service.user.User usuario;

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }
    /**
     * Creates a new instance of Usuario
     */
    public Usuario() {
    }
    
    public String registrarse(){
        usuario.setRol("BuscaTesoros");
        User u = findByUsername(usuario.getUsername());
        if(u==null){ 
            crearUsuario();
            return paginicio(); 
        }
        return pagregistro();
    }
    
    public String pagregistro(){
        return "/faces/Registrarse.xhtml";
    }
    
    public String paginicio(){
        return "/faces/index.xhtml";
    }
    
    public void crearUsuario(){
        createUser(usuario);
    }
    
    public String loginUsuario(){
        User u = findByUsername(usuario.getUsername());
        if(u!=null && usuario.getPassword().equals(u.getPassword())){
            usuario=u;
            //LOGIN SUCCESSFUL
        }else{
            //LOGIN ERROR
        }
        return null;
    }
    
    
    
    private void createUser(service.user.User entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.user.UserService port = service.getUserServicePort();
        port.createUser(entity);
    }
    
    @PostConstruct
    public void init(){
        usuario=new service.user.User();
    }

    private void editUser(service.user.User entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.user.UserService port = service.getUserServicePort();
        port.editUser(entity);
    }

    private User findByUsername(java.lang.String username) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.user.UserService port = service.getUserServicePort();
        return port.findByUsername(username);
    }
    
    
    
}
