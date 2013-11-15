/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.xml.ws.WebServiceRef;
import service.User;
import service.UserService_Service;

/**
 *
 * @author wkynrocks
 */
@ManagedBean
@ViewScoped
public class BorrarYDeshabilitarUsuario {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Proyecto9-war/UserService.wsdl")
    private UserService_Service service;
    
    
    boolean estaDeshabilitado;
    
    
    public boolean estaDeshabilitado(String rol) {
        estaDeshabilitado= rol.equals("Deshabilitado");
        return estaDeshabilitado;
    }
    
    public boolean isEstaDeshabilitado() {
        return estaDeshabilitado;
    }

    public void setEstaDeshabilitado(boolean estaDeshabilitado) {
        this.estaDeshabilitado = estaDeshabilitado;
    }
    
    public void borrar(User user) {
        //Si usuario creó tesoros, busco tesoros o creo logs no se puede borrar
        removeUser(user);
//        return null;
    }

    public String deshabilitar(User user) {
        if (user.getRol().equals("Deshabilitado")) {
            if (findListaTesorosCreados(user.getIdUser()).isEmpty()) {
                user.setRol("BuscaTesoros");
            } else {
                user.setRol("Colaborador");
            }
        } else {
            user.setRol("Deshabilitado");
        }
        editUser(user);
        return null;
    }

    /**
     * Creates a new instance of BorrarYDeshabilitarUsuario
     */
    public BorrarYDeshabilitarUsuario() {
    }

    private void editUser(service.User entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.UserService port = service.getUserServicePort();
        port.editUser(entity);
    }

    private void removeUser(service.User entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.UserService port = service.getUserServicePort();
        port.removeUser(entity);
    }

    private java.util.List<service.Tesoro> findListaTesorosCreados(java.lang.Integer idUser) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.UserService port = service.getUserServicePort();
        return port.findListaTesorosCreados(idUser);
    }

    private java.util.List<service.Tesoro> findListaTesorosCreados_1(java.lang.Integer idUser) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.UserService port = service.getUserServicePort();
        return port.findListaTesorosCreados(idUser);
    }

}
