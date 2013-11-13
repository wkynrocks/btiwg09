/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Tesoro;
import entity.User;
import java.util.ArrayList;
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
    
    public List<Tesoro> findByCriterioTesoro(String criterio, String textbusqueda){
        List<Tesoro> lt = new ArrayList<Tesoro>();
        switch (criterio){
            case "nombre": em.createNamedQuery("Tesoro.findByNombre").setParameter("nombre", textbusqueda).getResultList(); break;
            case "ciudad": em.createNamedQuery("Tesoro.findByCiudad").setParameter("ciudad", textbusqueda).getResultList(); break;
            case "pais":   em.createNamedQuery("Tesoro.findByPais").setParameter("pais", textbusqueda).getResultList(); break;
            case "posicion": em.createNamedQuery("Tesoro.findByPosicion").setParameter("posicion", textbusqueda).getResultList(); break; 
            default: break;
        }
        return lt;
    }
}
