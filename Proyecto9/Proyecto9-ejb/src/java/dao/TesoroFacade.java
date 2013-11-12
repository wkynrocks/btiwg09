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
public class TesoroFacade extends AbstractFacade<Tesoro> {

    @PersistenceContext(unitName = "Proyecto9-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TesoroFacade() {
        super(Tesoro.class);
    }

    public List<Tesoro> findByUsuarioBuscando(String usu) {        
        List<Tesoro> lt = em.createNamedQuery("Tesoro.findByBusquedaTesoro").setParameter("username", usu).getResultList();
        return lt;
    }
}
