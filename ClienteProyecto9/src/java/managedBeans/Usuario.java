/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBeans;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.xml.ws.WebServiceRef;
import service.User;
import service.UserService_Service;

/**
 *
 * @author wkynrocks
 */
@ManagedBean
@SessionScoped
public class Usuario {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Proyecto9-war/UserService.wsdl")
    private UserService_Service service;

    private service.User usuario;

    boolean existe = true;
    private boolean fallologin = false;
    private boolean falloDes;

    public boolean isFalloDes() {
        return falloDes;
    }

    public void setFalloDes(boolean falloDes) {
        this.falloDes = falloDes;
    }

    public boolean isAdmin() {
        return usuario.getRol().equals("Admin");
    }

    public boolean isFallologin() {
        return fallologin;
    }

    public void setFallologin(boolean fallologin) {
        this.fallologin = fallologin;
    }

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

    public String registrarse() {
        usuario.setRol("BuscaTesoros");
        User u = findByUsername(usuario.getUsername());
        if (u == null) {
            crearUsuario();
            return paginicio();
        }
        existe = false;
        return pagregistro();
    }

    public String pagregistro() {
        return "/faces/Registrarse.xhtml";
    }

    public String errorregistro() {
        if (!existe) {
            existe = true;
            return "Ese usuario ya existe. Elige otro nombre";
        } else {
            return "";
        }
    }

    public String paginicio() {
        return "/faces/index.xhtml";
    }

    public void crearUsuario() {
        createUser(usuario);
    }

    private void crearMensaje(String s) {
        
        FacesContext facesContext = FacesContext.getCurrentInstance();
        
//        facesContext.release();
        FacesMessage msg = new FacesMessage("Error en el login: "+s,
                s);
        msg.setSeverity(FacesMessage.SEVERITY_ERROR);
        facesContext.addMessage(null, msg);
        
    }

    public String loginUsuario() {
        fallologin = false;
        falloDes = false;
        User u = findByUsername(usuario.getUsername());
        if (u != null && usuario.getPassword().equals(u.getPassword())) {
            if (u.getRol().equals("Deshabilitado")) {
                falloDes = true;
                crearMensaje("El usuario esta desactivado :(");
            } else {
                usuario = u;
                //LOGIN SUCCESSFUL
                return "paginaHomeUsuario";
            }
        } else {
            //LOGIN ERROR
            crearMensaje("Usuario o contraseña incorrecto");
        }
        return null;
    }

    public String logout() {
        usuario = new User();
        return "index";
    }

    private void createUser(service.User entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.UserService port = service.getUserServicePort();
        port.createUser(entity);
    }

    @PostConstruct
    public void init() {
        usuario = new service.User();
    }

    private void editUser(service.User entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.UserService port = service.getUserServicePort();
        port.editUser(entity);
    }

    private User findByUsername(java.lang.String username) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.UserService port = service.getUserServicePort();
        return port.findByUsername(username);
    }

}
