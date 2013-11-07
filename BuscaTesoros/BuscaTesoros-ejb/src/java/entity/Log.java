/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author wkynrocks
 */
@Entity
@Table(name = "Log")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Log.findAll", query = "SELECT l FROM Log l"),
    @NamedQuery(name = "Log.findByIdLog", query = "SELECT l FROM Log l WHERE l.idLog = :idLog"),
    @NamedQuery(name = "Log.findByComentario", query = "SELECT l FROM Log l WHERE l.comentario = :comentario"),
    @NamedQuery(name = "Log.findByTipo", query = "SELECT l FROM Log l WHERE l.tipo = :tipo")})
public class Log implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idLog")
    private Integer idLog;
    @Size(max = 255)
    @Column(name = "comentario")
    private String comentario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "tipo")
    private String tipo;
    @JoinColumn(name = "user_idUser", referencedColumnName = "idUser")
    @ManyToOne(optional = false)
    private User useridUser;
    @JoinColumn(name = "Tesoro_idTesoro", referencedColumnName = "idTesoro")
    @ManyToOne(optional = false)
    private Tesoro tesoroidTesoro;

    public Log() {
    }

    public Log(Integer idLog) {
        this.idLog = idLog;
    }

    public Log(Integer idLog, String tipo) {
        this.idLog = idLog;
        this.tipo = tipo;
    }

    public Integer getIdLog() {
        return idLog;
    }

    public void setIdLog(Integer idLog) {
        this.idLog = idLog;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public User getUseridUser() {
        return useridUser;
    }

    public void setUseridUser(User useridUser) {
        this.useridUser = useridUser;
    }

    public Tesoro getTesoroidTesoro() {
        return tesoroidTesoro;
    }

    public void setTesoroidTesoro(Tesoro tesoroidTesoro) {
        this.tesoroidTesoro = tesoroidTesoro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLog != null ? idLog.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Log)) {
            return false;
        }
        Log other = (Log) object;
        if ((this.idLog == null && other.idLog != null) || (this.idLog != null && !this.idLog.equals(other.idLog))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Log[ idLog=" + idLog + " ]";
    }
    
}
