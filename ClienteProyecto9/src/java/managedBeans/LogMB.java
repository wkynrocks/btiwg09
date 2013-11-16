/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package managedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.xml.ws.WebServiceRef;
import service.Log;
import service.LogService_Service;

/**
 *
 * @author Luby
 */
@ManagedBean
@SessionScoped
public class LogMB {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Proyecto9-war/LogService.wsdl")
    private LogService_Service service;
    
    private Log log1;

    public Log getLog1() {
        return log1;
    }

    public void setLog1(Log log1) {
        this.log1 = log1;
    }

    /**
     * Creates a new instance of Log
     */
    public LogMB() {
    }
    
    
    
    private service.Log comentario = new service.Log();

    public service.Log getComentario() {
        return comentario;
    }

    public void setComentario(service.Log comentario) {
        this.comentario = comentario;
    }
    
    public String pagcrearLog(){
        return "crearLog.xhtml";
    }

    private void createLog(service.Log entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.LogService port = service.getLogServicePort();
        port.createLog(entity);
    }
    
    public String crearLog (service.Tesoro tesoro, service.User usuario){
        comentario.setTesoroidTesoro(tesoro);
        comentario.setUseridUser(usuario);
        createLog(comentario);
        return "listaTesoro.xhtml"; 
    }
    
    public String cargarEdicionLog(){
        ExternalContext et = FacesContext.getCurrentInstance().getExternalContext();
        Integer logid = Integer.parseInt(et.getRequestParameterMap().get("logparam"));
        log1 = findLog(logid);
        return "editarLog";
    }
    
    

    private void editLog(service.Log entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.LogService port = service.getLogServicePort();
        port.editLog(entity);
    }

    private Log findLog(java.lang.Object id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.LogService port = service.getLogServicePort();
        return port.findLog(id);
    }
    
    
}
