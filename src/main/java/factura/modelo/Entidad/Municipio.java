package factura.modelo.Entidad;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Pablo Sevilla on 28/10/2016.
 */
@Entity
@javax.persistence.SequenceGenerator(name = "municipio_SEQ", sequenceName = "ubicacion.municipio_id_seq", allocationSize = 1)
@Table(name = "municipio", schema = "ubicacion")
public class Municipio implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String codmunicipio;
    private String municipio;
    private Integer idestado;
    private Integer idnivel;

   
    @Id
    @Column(name = "idmunicipio")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @Basic
    @Column(name = "codmunicipio")
    public String getCodmunicipio() {
        return codmunicipio;
    }

    public void setCodmunicipio(String codmunicipio) {
        this.codmunicipio = codmunicipio;
    }

    @Basic
    @Column(name = "municipio")
    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    @Basic
    @Column(name = "idestado")
    public Integer getIdestado() {
        return idestado;
    }

    public void setIdestado(Integer idestado) {
        this.idestado = idestado;
    }
    
    @Basic
    @Column(name = "idnivel")
    public Integer getIdnivel() {
        return idnivel;
    }

    public void setIdnivel(Integer idnivel) {
        this.idnivel = idnivel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Municipio)) return false;

        Municipio that = (Municipio) o;
/*
if (this == o) return true;
        if (!(o instanceof Cliente)) return false;

        Cliente that = (Cliente) o;
 */
        if (idestado != that.idestado) return false;
        if (id.equals(that.id)) return false;
        if (codmunicipio != null ? !codmunicipio.equals(that.codmunicipio) : that.codmunicipio != null)
            return false;
        if (municipio != null ? !municipio.equals(that.municipio) : that.municipio != null) return false;
        if (idnivel != null ? !idnivel.equals(that.idnivel) : that.idnivel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (codmunicipio != null ? codmunicipio.hashCode() : 0);
        result = 31 * result + (municipio != null ? municipio.hashCode() : 0);
        result = 31 * result + (int) idestado;
        result = 31 * result + (idnivel != null ? idnivel.hashCode() : 0);
        return result;
    }
}
