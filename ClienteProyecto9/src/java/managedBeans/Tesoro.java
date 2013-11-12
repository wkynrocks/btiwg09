/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package managedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.xml.ws.WebServiceRef;
import service.tesoro.TesoroService_Service;

/**
 *
 * @author wkynrocks
 */
@ManagedBean
@RequestScoped
public class Tesoro {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Proyecto9-war/TesoroService.wsdl")
    private TesoroService_Service service;
    
    /**
     * Creates a new instance of Tesoro
     */
    public Tesoro() {
    }
    
    }
