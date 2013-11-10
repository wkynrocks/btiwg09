/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import dao.UserFacade;
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

    @WebMethod(operationName = "findByUsername")
    public User findByUsername(@WebParam(name = "username") String username) {
        return ejbRef.findByUsername(username);
    }
    
}
