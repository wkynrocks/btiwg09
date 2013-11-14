/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package managedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.xml.ws.WebServiceRef;
import service.LogService_Service;

/**
 *
 * @author Luby
 */
@ManagedBean
@SessionScoped
public class Log {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Proyecto9-war/LogService.wsdl")
    private LogService_Service service;

    /**
     * Creates a new instance of Log
     */
    public Log() {
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
        return null; //falta poner la pagina correspondiente cuando se haya creado
    }

    private void editLog(service.Log entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.LogService port = service.getLogServicePort();
        port.editLog(entity);
    }
    
    
}
