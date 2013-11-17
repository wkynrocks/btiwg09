/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import dao.LogFacade;
import entity.Log;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Luby
 */
@WebService(serviceName = "LogService")
public class LogService {
    @EJB
    private LogFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "createLog")
    @Oneway
    public void createLog(@WebParam(name = "entity") Log entity) {
        ejbRef.create(entity);
    }

    @WebMethod(operationName = "editLog")
    @Oneway
    public void editLog(@WebParam(name = "entity") Log entity) {
        ejbRef.edit(entity);
    }

    @WebMethod(operationName = "removeLog")
    @Oneway
    public void removeLog(@WebParam(name = "entity") Log entity) {
        ejbRef.remove(entity);
    }

    @WebMethod(operationName = "findLog")
    public Log findLog(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAllLog")
    public List<Log> findAllLog() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRangeLog")
    public List<Log> findRangeLog(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "countLog")
    public int countLog() {
        return ejbRef.count();
    }

    @WebMethod(operationName = "findByTesoroId")
    public List<Log> findByTesoroId(@WebParam(name = "logtes") int logtes) {
        return ejbRef.findByTesoroId(logtes);
    }
    
}
