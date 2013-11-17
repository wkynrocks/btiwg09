/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import entity.Log;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author wkynrocks
 */
@Stateless
public class LogFacade extends AbstractFacade<Log> {
    @PersistenceContext(unitName = "Proyecto9-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public List<Log> findByTesoroId (int logtes){
        List<Log> lt = em.createNamedQuery("Tesoro.findByTesoroId").setParameter("idTesoro", logtes).getResultList();
        return lt;
    }
    public LogFacade() {
        super(Log.class);
    }
    
}
