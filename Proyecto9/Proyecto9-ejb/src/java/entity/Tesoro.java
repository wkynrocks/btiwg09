/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.AUTO;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author wkynrocks
 */
@Entity
@Table(name = "Tesoro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tesoro.findAll", query = "SELECT t FROM Tesoro t"),
    @NamedQuery(name = "Tesoro.findByIdTesoro", query = "SELECT t FROM Tesoro t WHERE t.idTesoro = :idTesoro"),
    @NamedQuery(name = "Tesoro.findByNombre", query = "SELECT t FROM Tesoro t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tesoro.findByCiudad", query = "SELECT t FROM Tesoro t WHERE t.ciudad = :ciudad"),
    @NamedQuery(name = "Tesoro.findByPais", query = "SELECT t FROM Tesoro t WHERE t.pais = :pais"),
    @NamedQuery(name = "Tesoro.findByPosicion", query = "SELECT t FROM Tesoro t WHERE t.posicion = :posicion"),
    @NamedQuery(name = "Tesoro.findByCodigoSecreto", query = "SELECT t FROM Tesoro t WHERE t.codigoSecreto = :codigoSecreto"),
    @NamedQuery(name = "Tesoro.findByHabilitado", query = "SELECT t FROM Tesoro t WHERE t.habilitado = :habilitado"),
    @NamedQuery(name = "Tesoro.findByBusquedaTesoro", query = "SELECT t FROM Tesoro t WHERE t.userList IN :usuario")})
public class Tesoro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @GeneratedValue(strategy = AUTO)
    @Column(name = "idTesoro")
    private Integer idTesoro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ciudad")
    private String ciudad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "pais")
    private String pais;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "posicion")
    private String posicion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "codigoSecreto")
    private String codigoSecreto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "habilitado")
    private boolean habilitado;
    @ManyToMany(mappedBy = "buscarTesoroList")
    private List<User> userList;
    @JoinColumn(name = "user_idUser", referencedColumnName = "idUser")
    @ManyToOne(optional = false)
    private User useridUser;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tesoroidTesoro")
    private List<Log> logList;

    public Tesoro() {
    }

    public Tesoro(Integer idTesoro) {
        this.idTesoro = idTesoro;
    }

    public Tesoro(Integer idTesoro, String nombre, String ciudad, String pais, String posicion, String codigoSecreto, boolean habilitado) {
        this.idTesoro = idTesoro;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.posicion = posicion;
        this.codigoSecreto = codigoSecreto;
        this.habilitado = habilitado;
    }

    public Integer getIdTesoro() {
        return idTesoro;
    }

    public void setIdTesoro(Integer idTesoro) {
        this.idTesoro = idTesoro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getCodigoSecreto() {
        return codigoSecreto;
    }

    public void setCodigoSecreto(String codigoSecreto) {
        this.codigoSecreto = codigoSecreto;
    }

    public boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    @XmlTransient
    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public User getUseridUser() {
        return useridUser;
    }

    public void setUseridUser(User useridUser) {
        this.useridUser = useridUser;
    }

    @XmlTransient
    public List<Log> getLogList() {
        return logList;
    }

    public void setLogList(List<Log> logList) {
        this.logList = logList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTesoro != null ? idTesoro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tesoro)) {
            return false;
        }
        Tesoro other = (Tesoro) object;
        if ((this.idTesoro == null && other.idTesoro != null) || (this.idTesoro != null && !this.idTesoro.equals(other.idTesoro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Tesoro[ idTesoro=" + idTesoro + " ]";
    }
    
}
