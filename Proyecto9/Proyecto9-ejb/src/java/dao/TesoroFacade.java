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
    
    public List<Tesoro> findByNombreTesoro(String textbusqueda){
        List<Tesoro> lt = em.createNamedQuery("Tesoro.findByLikeNombre").setParameter("nombre","%"+textbusqueda+"%").getResultList();
        return lt;
    }

    public List<Tesoro> findByCiudadTesoro(String textbusqueda){
        List<Tesoro> lt = em.createNamedQuery("Tesoro.findByLikeCiudad").setParameter("ciudad","%"+textbusqueda+"%").getResultList();
        return lt;
    }
    
    public List<Tesoro> findByPaisTesoro(String textbusqueda){
        List<Tesoro> lt = em.createNamedQuery("Tesoro.findByLikePais").setParameter("pais","%"+textbusqueda+"%").getResultList();
        return lt;
    }
    
    public List<Tesoro> findByPosicionTesoro(String textbusqueda){
        List<Tesoro> lt = em.createNamedQuery("Tesoro.findByLikePosicion").setParameter("posicion","%"+textbusqueda+"%").getResultList();
        return lt;
    }
    
    public List<Log> findAllLogs(Integer tesoroId){
        return em.createNamedQuery("Tesoro.findAllLogs").setParameter("tesoroId",tesoroId).getResultList();
    }
    
    public void seguirTesoro(Integer usuarioId, Integer tesoroId){
        em.createNativeQuery("INSERT INTO Usuario_Tesoro_Map VALUES ("+ usuarioId + "," + tesoroId + ")").executeUpdate();
    }
    
    public void dejarseguirTesoro(Integer usuarioId, Integer tesoroId){
        em.createNativeQuery("DELETE FROM Usuario_Tesoro_Map WHERE user_idUser="+ usuarioId + " AND Tesoro_idTesoro=" + tesoroId).executeUpdate();
    }
}
