/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBeans;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.PostActivate;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.xml.ws.WebServiceRef;
import service.Tesoro;
import service.TesoroService_Service;
import service.User;
import service.UserService_Service;

/**
 *
 * @author wkynrocks
 */
@ManagedBean
@ViewScoped
public class ListarTesoros implements Serializable{
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Proyecto9-war/UserService.wsdl")
    private UserService_Service service_1;
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Proyecto9-war/TesoroService.wsdl")
    private TesoroService_Service service;
    /**
     * Creates a new instance of ListarTesoros
     */
    
    java.util.List<service.Tesoro> lista;

    public List<Tesoro> getLista() {
        return lista;
    }

    public void setLista(List<Tesoro> lista) {
        this.lista = lista;
    }
    
    @ManagedProperty("#{usuario.usuario}")
    private service.User activeUser;

    public service.User getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(service.User activeUser) {
        this.activeUser = activeUser;
    }
    
    private String criterio;
    private String textbusqueda;
    private boolean busqueda = false;
    
    @PostConstruct
    public void init(){
        System.out.println("LAAAAAAAAAAAAAAAA :"+activeUser.getUsername());
        setLista(findByUsuarioBuscando(activeUser.getUsername()));
        setBusqueda(!getLista().isEmpty());
    }

    public ListarTesoros() {
    }


    public java.util.List<service.Tesoro> listaTesoros(service.User user) {
        List lista = findByUsuarioBuscando(user.getUsername());
        busqueda = !lista.isEmpty();
        return lista;
    }

    private java.util.List<service.Tesoro> findByUsuarioBuscando(String user) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.TesoroService port = service.getTesoroServicePort();
        return port.findByUsuarioBuscando(user);
    }

    public java.util.List<service.Tesoro> listarTesorosCreados(service.User usuario) {
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

    private java.util.List<service.Tesoro> findByNombreTesoro(java.lang.String textbusqueda) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.TesoroService port = service.getTesoroServicePort();
        return port.findByNombreTesoro(textbusqueda);
    }

    public java.util.List<service.Tesoro> listarTesorosporCriterio() {
        if (textbusqueda == null) {
            return findByNombreTesoro("");
        } else {
            java.util.List<service.Tesoro> lt = null;
            switch (criterio) {
                case "nombre":
                    lt = findByNombreTesoro(textbusqueda);
                    break;
                case "ciudad":
                    lt = findByCiudadTesoro(textbusqueda);
                    break;
                case "pais":
                    lt = findByPaisTesoro(textbusqueda);
                    break;
                case "posicion":
                    lt = findByPosicionTesoro(textbusqueda);
                    break;
            }
            return lt;
        }

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

    public boolean estaSiguiendo(User usuario, Integer idTesoro) {
        java.util.List<service.Tesoro> lt = listaTesoros(usuario);
        boolean encontrado = false;
        int i = 0;
        while ((i < lt.size()) && (!encontrado)) {
            if (lt.get(i).getIdTesoro() == idTesoro) {
                encontrado = true;
            }
            i++;
        }

        return encontrado;
    }

    public String habilitar(service.Tesoro tesoro) {
        tesoro.setHabilitado(true);
        editTesoro(tesoro);
        return null;
    }

    public String deshabilitar(service.Tesoro tesoro) {
        tesoro.setHabilitado(false);
        editTesoro(tesoro);
        return null;
    }

    private void editTesoro(service.Tesoro entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.TesoroService port = service.getTesoroServicePort();
        port.editTesoro(entity);
    }

    private void seguirTesoro(java.lang.Integer usuarioId, java.lang.Integer tesoroId) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.TesoroService port = service.getTesoroServicePort();
        port.seguirTesoro(usuarioId, tesoroId);
    }

    public String hacerSeguimiento(Integer idUser, Integer idTesoro) {
        seguirTesoro(idUser, idTesoro);
        return null;
    }

    private void dejarseguirTesoro(java.lang.Integer usuarioId, java.lang.Integer tesoroId) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.TesoroService port = service.getTesoroServicePort();
        port.dejarseguirTesoro(usuarioId, tesoroId);
    }

    public String quitarSeguimiento(Integer idUser, Integer idTesoro) {
        dejarseguirTesoro(idUser, idTesoro);
        return null;
    }

    private java.util.List<service.Tesoro> findByCiudadTesoro(java.lang.String textbusqueda) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.TesoroService port = service.getTesoroServicePort();
        return port.findByCiudadTesoro(textbusqueda);
    }

    private java.util.List<service.Tesoro> findByPaisTesoro(java.lang.String textbusqueda) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.TesoroService port = service.getTesoroServicePort();
        return port.findByPaisTesoro(textbusqueda);
    }

    private java.util.List<service.Tesoro> findByPosicionTesoro(java.lang.String textbusqueda) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.TesoroService port = service.getTesoroServicePort();
        return port.findByPosicionTesoro(textbusqueda);
    }


}
