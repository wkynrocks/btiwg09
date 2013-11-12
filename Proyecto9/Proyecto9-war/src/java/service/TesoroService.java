/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import dao.TesoroFacade;
import entity.Tesoro;
import entity.User;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author wkynrocks
 */
@WebService(serviceName = "TesoroService")
public class TesoroService {
    @EJB
    private TesoroFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "createTesoro")
    @Oneway
    public void create(@WebParam(name = "entity") Tesoro entity) {
        ejbRef.create(entity);
    }

    @WebMethod(operationName = "editTesoro")
    @Oneway
    public void edit(@WebParam(name = "entity") Tesoro entity) {
        ejbRef.edit(entity);
    }

    @WebMethod(operationName = "removeTesoro")
    @Oneway
    public void remove(@WebParam(name = "entity") Tesoro entity) {
        ejbRef.remove(entity);
    }

    @WebMethod(operationName = "findTesoro")
    public Tesoro find(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAllTesoro")
    public List<Tesoro> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRangeTesoro")
    public List<Tesoro> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "countTesoro")
    public int count() {
        return ejbRef.count();
    }

    @WebMethod(operationName = "findByUsuarioBuscando")
    public List<Tesoro> findByUsuarioBuscando(@WebParam(name = "user") User user) {
        return ejbRef.findByUsuarioBuscando(user);
    }
    
}
