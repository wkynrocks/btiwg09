/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package managedBeans;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.xml.ws.WebServiceRef;
import service.Log;
import service.TesoroService_Service;
import service.UserService_Service;

/**
 *
 * @author wkynrocks
 */
@ManagedBean
@SessionScoped
public class Notificaciones {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Proyecto9-war/TesoroService.wsdl")
    private TesoroService_Service service_1;
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Proyecto9-war/UserService.wsdl")
    private UserService_Service service;
    private String[] lista;
    
    private java.util.List<service.Log> ll=new java.util.ArrayList<>();
    
    private java.util.List<service.Log> llAll=new java.util.ArrayList<>();

    public List<Log> getLlAll() {
        return llAll;
    }

    public void setLlAll(List<Log> llAll) {
        this.llAll = llAll;
    }
    
    public String goToLog(service.Log log){
        
        return null;
    }

    public List<Log> getLl() {
        return ll;
    }

    public void setLl(List<Log> ll) {
        this.ll = ll;
    }

    public String[] getLista() {
        return lista;
    }

    public void setLista(String[] lista) {
        this.lista = lista;
    }
    /**
     * Creates a new instance of Notificacionesr
     */
    public Notificaciones() {
    }
    
    public void cargarNotificacionesProblemas(service.User user){
        java.util.List<service.Tesoro> tl = findListaTesorosCreados(user.getIdUser());
        for(service.Tesoro t: tl){
            for(service.Log l:findAllLogs(t.getIdTesoro())){
                if(l.getTipo().equals("problemas")){
                   ll.add(l);
                }
                    
            }
        }
    }
    
    public Integer numeroNotificacionesProblemas(service.User user){
        if(ll.isEmpty()){
            System.out.println("CAGANDO NOTIFICACIONES???");
            cargarNotificacionesProblemas(user);
        }else{
            System.out.println("POR QUE NO ESTA VACIO???");
        }
        return ll.size();
    }

    private java.util.List<service.Tesoro> findListaTesorosCreados(java.lang.Integer idUser) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.UserService port = service.getUserServicePort();
        return port.findListaTesorosCreados(idUser);
    }

    private java.util.List<service.Log> findAllLogs(java.lang.Integer tesoroId) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.TesoroService port = service_1.getTesoroServicePort();
        return port.findAllLogs(tesoroId);
    }
    
}
