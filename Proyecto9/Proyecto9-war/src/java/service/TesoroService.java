/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import dao.TesoroFacade;
import entity.Tesoro;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author tolkirlaptop
 */
@WebService(serviceName = "TesoroService")
public class TesoroService {
    @EJB
    private TesoroFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "createTesoro")
    @Oneway
    public void createTesoro(@WebParam(name = "entity") Tesoro entity) {
        ejbRef.create(entity);
    }

    @WebMethod(operationName = "editTesoro")
    @Oneway
    public void editTesoro(@WebParam(name = "entity") Tesoro entity) {
        ejbRef.edit(entity);
    }

    @WebMethod(operationName = "removeTesoro")
    @Oneway
    public void removeTesoro(@WebParam(name = "entity") Tesoro entity) {
        ejbRef.remove(entity);
    }

    @WebMethod(operationName = "findTesoro")
    public Tesoro findTesoro(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAllTesoro")
    public List<Tesoro> findAllTesoro() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRangeTesoro")
    public List<Tesoro> findRangeTesoro(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "countTesoro")
    public int countTesoro() {
        return ejbRef.count();
    }

    @WebMethod(operationName = "findByUsuarioBuscando")
    public List<Tesoro> findByUsuarioBuscando(@WebParam(name = "usu") String usu) {
        return ejbRef.findByUsuarioBuscando(usu);
    }

    @WebMethod(operationName = "findByCriterioTesoro")
    public List<Tesoro> findByCriterioTesoro(@WebParam(name = "criterio") String criterio, @WebParam(name = "textbusqueda") String textbusqueda) {
        return ejbRef.findByCriterioTesoro(criterio, textbusqueda);
    }
    
}
