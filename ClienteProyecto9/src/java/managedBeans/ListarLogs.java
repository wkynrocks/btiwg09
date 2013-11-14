/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package managedBeans;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.xml.ws.WebServiceRef;
import service.Log;
import service.TesoroService_Service;
import service.UserService_Service;

/**
 *
 * @author wkynrocks
 */
@ManagedBean
@RequestScoped
public class ListarLogs {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Proyecto9-war/TesoroService.wsdl")
    private TesoroService_Service service_1;

    public java.util.List<service.Log> cargarLogsPorTesoro(service.Tesoro tes){
        return findAllLogs(tes.getIdTesoro());
    }
    

    private java.util.List<service.Log> findAllLogs(java.lang.Integer tesoroId) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.TesoroService port = service_1.getTesoroServicePort();
        return port.findAllLogs(tesoroId);
    }
    /**
     * Creates a new instance of ListarLogs
     */
    public ListarLogs() {
    }
    
}
