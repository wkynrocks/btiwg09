/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Log;
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
        List<Tesoro> lt = null;
        switch (criterio){
            case "nombre": lt = em.createNamedQuery("Tesoro.findByLikeNombre").setParameter("nombre","%"+textbusqueda+"%").getResultList(); break;
            case "ciudad": lt = em.createNamedQuery("Tesoro.findByLikeCiudad").setParameter("ciudad","%"+textbusqueda+"%").getResultList(); break;
            case "pais": lt = em.createNamedQuery("Tesoro.findByLikePais").setParameter("pais","%"+textbusqueda+"%").getResultList(); break;
            case "posicion": lt = em.createNamedQuery("Tesoro.findByLikePosicion").setParameter("posicion","%"+textbusqueda+"%").getResultList(); break; 
            default: break;
        }
        return lt;
    }
    
    public List<Log> findAllLogs(Integer tesoroId){
        return em.createNamedQuery("Tesoro.findAllLogs").setParameter("tesoroId",tesoroId).getResultList();
    }
    
    public void seguirTesoro(Integer usuarioId, Integer tesoroId){
        em.createNativeQuery("INSERT INTO usuario_tesoro_map VALUES ("+ usuarioId + "," + tesoroId + ")").executeUpdate();
    }
    
    public void dejarseguirTesoro(Integer usuarioId, Integer tesoroId){
        em.createNativeQuery("DELETE FROM usuario_tesoro_map WHERE user_idUser="+ usuarioId + " AND Tesoro_idTesoro=" + tesoroId).executeUpdate();
    }
}
