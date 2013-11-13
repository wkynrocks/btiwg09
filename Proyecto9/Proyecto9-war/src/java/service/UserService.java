/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import dao.UserFacade;
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
@WebService(serviceName = "UserService")
public class UserService {
    @EJB
    private UserFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "createUser")
    @Oneway
    public void createUser(@WebParam(name = "entity") User entity) {
        ejbRef.create(entity);
    }

    @WebMethod(operationName = "editUser")
    @Oneway
    public void editUser(@WebParam(name = "entity") User entity) {
        ejbRef.edit(entity);
    }

    @WebMethod(operationName = "removeUser")
    @Oneway
    public void removeUser(@WebParam(name = "entity") User entity) {
        ejbRef.remove(entity);
    }

    @WebMethod(operationName = "findUser")
    public User findUser(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAllUser")
    public List<User> findAllUser() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRangeUser")
    public List<User> findRangeUser(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "countUser")
    public int countUser() {
        return ejbRef.count();
    }

    @WebMethod(operationName = "findByPartialEmail")
    public List<User> findByPartialEmail(@WebParam(name = "email") String email) {
        return ejbRef.findByPartialEmail(email);
    }

    @WebMethod(operationName = "findByPartialUsername")
    public List<User> findByPartialUsername(@WebParam(name = "username") String username) {
        return ejbRef.findByPartialUsername(username);
    }

    @WebMethod(operationName = "findByRol")
    public List<User> findByRol(@WebParam(name = "rol") String rol) {
        return ejbRef.findByRol(rol);
    }

    @WebMethod(operationName = "findByUsername")
    public User findByUsername(@WebParam(name = "username") String username) {
        return ejbRef.findByUsername(username);
    }

    @WebMethod(operationName = "findListaTesorosCreados")
    public List<Tesoro> findListaTesorosCreados(@WebParam(name = "idUser") Integer idUser) {
        return ejbRef.findListaTesorosCreados(idUser);
    }
    
}
