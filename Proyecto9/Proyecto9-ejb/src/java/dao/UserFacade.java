/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Tesoro;
import entity.User;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author wkynrocks
 */
@Stateless
public class UserFacade extends AbstractFacade<User> {

    @PersistenceContext(unitName = "Proyecto9-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserFacade() {
        super(User.class);
    }

    public List<User> findByPartialEmail(String email) {
        return em.createNamedQuery("User.findByPartialEmail").setParameter("email", "%" + email + "%").getResultList();
    }

    public List<User> findByPartialUsername(String username) {
        return em.createNamedQuery("User.findByPartialUsername").setParameter("username", "%" + username + "%").getResultList();
    }
    
    public List<User> findByRol(String rol) {
        return em.createNamedQuery("User.findByRol").setParameter("rol", "%" + rol + "%").getResultList();
    }

    public User findByUsername(String username) {
        List<User> lu = em.createNamedQuery("User.findByUsername").setParameter("username", username).getResultList();
        return !lu.isEmpty() ? lu.get(0) : null;

    }

    public java.util.List<entity.Tesoro> findListaTesorosCreados(Integer idUser) {
        List<Tesoro> lt = em.createNamedQuery("User.findAllUserTreasures").setParameter("idUser", idUser).getResultList();
        return lt;
    }
    
}