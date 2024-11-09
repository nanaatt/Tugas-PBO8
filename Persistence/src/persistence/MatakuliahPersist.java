/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Nidzzz
 */
@Entity
@Table(name = "matakuliah_persist")
@NamedQueries({
    @NamedQuery(name = "MatakuliahPersist.findAll", query = "SELECT m FROM MatakuliahPersist m"),
    @NamedQuery(name = "MatakuliahPersist.findByKodeMk", query = "SELECT m FROM MatakuliahPersist m WHERE m.kodeMk = :kodeMk"),
    @NamedQuery(name = "MatakuliahPersist.findByNamaMk", query = "SELECT m FROM MatakuliahPersist m WHERE m.namaMk = :namaMk"),
    @NamedQuery(name = "MatakuliahPersist.findBySks", query = "SELECT m FROM MatakuliahPersist m WHERE m.sks = :sks"),
    @NamedQuery(name = "MatakuliahPersist.findBySmtAjar", query = "SELECT m FROM MatakuliahPersist m WHERE m.smtAjar = :smtAjar")})
public class MatakuliahPersist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kode_mk")
    private String kodeMk;
    @Column(name = "nama_mk")
    private String namaMk;
    @Column(name = "sks")
    private Integer sks;
    @Column(name = "smt_ajar")
    private Integer smtAjar;

    public MatakuliahPersist() {
    }

    public MatakuliahPersist(String kodeMk) {
        this.kodeMk = kodeMk;
    }

    public String getKodeMk() {
        return kodeMk;
    }

    public void setKodeMk(String kodeMk) {
        this.kodeMk = kodeMk;
    }

    public String getNamaMk() {
        return namaMk;
    }

    public void setNamaMk(String namaMk) {
        this.namaMk = namaMk;
    }

    public Integer getSks() {
        return sks;
    }

    public void setSks(Integer sks) {
        this.sks = sks;
    }

    public Integer getSmtAjar() {
        return smtAjar;
    }

    public void setSmtAjar(Integer smtAjar) {
        this.smtAjar = smtAjar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodeMk != null ? kodeMk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MatakuliahPersist)) {
            return false;
        }
        MatakuliahPersist other = (MatakuliahPersist) object;
        if ((this.kodeMk == null && other.kodeMk != null) || (this.kodeMk != null && !this.kodeMk.equals(other.kodeMk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistence.MatakuliahPersist[ kodeMk=" + kodeMk + " ]";
    }
    
}
