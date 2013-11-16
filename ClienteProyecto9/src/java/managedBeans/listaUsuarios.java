/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBeans;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.AjaxBehaviorEvent;
import javax.xml.ws.WebServiceRef;
import service.User;
import service.UserService_Service;

/**
 *
 * @author wkynrocks
 */
@ManagedBean
@ViewScoped
public class listaUsuarios {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Proyecto9-war/UserService.wsdl")
    private UserService_Service service;

    private String modoBusqueda = "todos";

    private String[] parametros = {"username", "email", "rol"};

    public void actualizaListener(AjaxBehaviorEvent event) {
        busca();
    }
    
    public void borrarListener(AjaxBehaviorEvent event) {
        busca();
    }

    public List<service.User> dameLista() {
        System.out.println("DAME LISTA");
        busca();
        return lista;
    }

    public void setParametros(String[] parametros) {
        this.parametros = parametros;
    }

    private String valorParametro = "";

    public String[] getParametros() {
        return parametros;
    }

    private List<User> lista;

    public List<User> getLista() {
        return lista;
    }

    public void setLista(List<User> lista) {
        this.lista = lista;
    }

    public String getValorParametro() {
        return valorParametro;
    }

    public void setValorParametro(String valorParametro) {
        this.valorParametro = valorParametro;
    }

    public String getModoBusqueda() {
        return modoBusqueda;
    }

    public String[] parametros() {
        return parametros;
    }

    public void busca() {
        if (valorParametro.equals("")) {
            lista = findAllUser();
        } else {
            switch (modoBusqueda) {
                case "username":
                    lista = findByPartialUsername(valorParametro);
                    break;
                case "email":
                    lista = findByPartialEmail(valorParametro);
                    break;
                case "rol":
                    lista = findByRol(valorParametro);
                    break;
            }
        }

    }

    public void setModoBusqueda(String ModoBusqueda) {
        this.modoBusqueda = ModoBusqueda;
    }

    /**
     * Creates a new instance of listaUsuarios
     */
    public listaUsuarios() {
    }

    @PostConstruct
    public void init() {
        lista = findAllUser();
    }

    public java.util.List<service.User> listaTodos() {
        lista = findAllUser();
        return findAllUser();
    }

    private java.util.List<service.User> findAllUser() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.UserService port = service.getUserServicePort();
        return port.findAllUser();
    }

    private User findByUsername(java.lang.String username) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.UserService port = service.getUserServicePort();
        return port.findByUsername(username);
    }

    private java.util.List<service.User> findByPartialUsername(java.lang.String username) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.UserService port = service.getUserServicePort();
        return port.findByPartialUsername(username);
    }

    private java.util.List<service.User> findByPartialEmail(java.lang.String email) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.UserService port = service.getUserServicePort();
        return port.findByPartialEmail(email);
    }

    private java.util.List<service.User> findByRol(java.lang.String rol) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.UserService port = service.getUserServicePort();
        return port.findByRol(rol);
    }
    
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
    
    public String borrar(User user) {
        //Si usuario creó tesoros, busco tesoros o creo logs no se puede borrar
        removeUser(user);
        busca();
        return null;
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

}
