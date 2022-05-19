/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.todouno.HulkStore.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "kardex")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kardex.findAll", query = "SELECT k FROM Kardex k"),
    @NamedQuery(name = "Kardex.findByIdventas", query = "SELECT k FROM Kardex k WHERE k.idventas = :idventas"),
    @NamedQuery(name = "Kardex.findByFecha", query = "SELECT k FROM Kardex k WHERE k.fecha = :fecha"),
    @NamedQuery(name = "Kardex.findByDescripcion", query = "SELECT k FROM Kardex k WHERE k.descripcion = :descripcion"),
    @NamedQuery(name = "Kardex.findByVunitario", query = "SELECT k FROM Kardex k WHERE k.vunitario = :vunitario"),
    @NamedQuery(name = "Kardex.findByIntCant", query = "SELECT k FROM Kardex k WHERE k.intCant = :intCant"),
    @NamedQuery(name = "Kardex.findByIntVal", query = "SELECT k FROM Kardex k WHERE k.intVal = :intVal"),
    @NamedQuery(name = "Kardex.findByKardexdes", query = "SELECT k FROM Kardex k WHERE k.kardexdes = :kardexdes"),
    @NamedQuery(name = "Kardex.findByOutCant", query = "SELECT k FROM Kardex k WHERE k.outCant = :outCant"),
    @NamedQuery(name = "Kardex.findByOutVal", query = "SELECT k FROM Kardex k WHERE k.outVal = :outVal"),
    @NamedQuery(name = "Kardex.findBySalCant", query = "SELECT k FROM Kardex k WHERE k.salCant = :salCant"),
    @NamedQuery(name = "Kardex.findBySalValor", query = "SELECT k FROM Kardex k WHERE k.salValor = :salValor")})
public class Kardex implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idventas")
    private Integer idventas;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "vunitario")
    private Integer vunitario;
    @Column(name = "int_cant")
    private Integer intCant;
    @Column(name = "int_val")
    private Integer intVal;
    @Column(name = "kardexdes")
    private Integer kardexdes;
    @Column(name = "out_cant")
    private String outCant;
    @Column(name = "out_val")
    private Integer outVal;
    @Column(name = "sal_cant")
    private Integer salCant;
    @Column(name = "sal_valor")
    private Integer salValor;
    @JoinColumn(name = "idproducto", referencedColumnName = "idproducto")
    @ManyToOne
    private Producto idproducto;

    public Kardex() {
    }

    public Kardex(Integer idventas) {
        this.idventas = idventas;
    }

    public Integer getIdventas() {
        return idventas;
    }

    public void setIdventas(Integer idventas) {
        this.idventas = idventas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getVunitario() {
        return vunitario;
    }

    public void setVunitario(Integer vunitario) {
        this.vunitario = vunitario;
    }

    public Integer getIntCant() {
        return intCant;
    }

    public void setIntCant(Integer intCant) {
        this.intCant = intCant;
    }

    public Integer getIntVal() {
        return intVal;
    }

    public void setIntVal(Integer intVal) {
        this.intVal = intVal;
    }

    public Integer getKardexdes() {
        return kardexdes;
    }

    public void setKardexdes(Integer kardexdes) {
        this.kardexdes = kardexdes;
    }

    public String getOutCant() {
        return outCant;
    }

    public void setOutCant(String outCant) {
        this.outCant = outCant;
    }

    public Integer getOutVal() {
        return outVal;
    }

    public void setOutVal(Integer outVal) {
        this.outVal = outVal;
    }

    public Integer getSalCant() {
        return salCant;
    }

    public void setSalCant(Integer salCant) {
        this.salCant = salCant;
    }

    public Integer getSalValor() {
        return salValor;
    }

    public void setSalValor(Integer salValor) {
        this.salValor = salValor;
    }

    public Producto getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Producto idproducto) {
        this.idproducto = idproducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idventas != null ? idventas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kardex)) {
            return false;
        }
        Kardex other = (Kardex) object;
        if ((this.idventas == null && other.idventas != null) || (this.idventas != null && !this.idventas.equals(other.idventas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.co.todouno.HulkStore.entity.Kardex[ idventas=" + idventas + " ]";
    }
    
}
