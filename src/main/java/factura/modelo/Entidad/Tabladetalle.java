package factura.modelo.Entidad;

import javafx.scene.control.Tab;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Pablo Sevilla on 26/10/2016.
 */
@Entity
@javax.persistence.SequenceGenerator(name = "tablaDet_SEQ", sequenceName = "catalogo.tabladetalle_id_seq", allocationSize = 1)
@Table(name = "tabladetalle", schema = "catalogo")
public class Tabladetalle implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String linea;
    private String codequivalencia;
    private String codpadre;
    private Integer idactivo;



    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.SEQUENCE, generator = "tablaDet_SEQ")
    @Column(name = "idlinea")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "linea")
    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    @Basic
    @Column(name = "codequivalencia")
    public String getCodequivalencia() {
        return codequivalencia;
    }

    public void setCodequivalencia(String codequivalencia) {
        this.codequivalencia = codequivalencia;
    }

    @Basic
    @Column(name = "codpadre")
    public String getCodpadre() {
        return codpadre;
    }

    public void setCodpadre(String codpadre) {
        this.codpadre = codpadre;
    }

    @Basic
    @Column(name = "idactivo")
    public Integer getIdactivo() {
        return idactivo;
    }

    public void setIdactivo(Integer idactivo) {
        this.idactivo = idactivo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tabladetalle)) return false;

        Tabladetalle that = (Tabladetalle) o;


        if (id.equals(that.id)) return false;
        if (linea != null ? !linea.equals(that.linea) : that.linea != null) return false;
        if (codequivalencia != null ? !codequivalencia.equals(that.codequivalencia) : that.codequivalencia != null)
            return false;
        if (codpadre != null ? !codpadre.equals(that.codpadre) : that.codpadre != null) return false;
        if (idactivo != null ? !idactivo.equals(that.idactivo) : that.idactivo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (linea != null ? linea.hashCode() : 0);
        result = 31 * result + (codequivalencia != null ? codequivalencia.hashCode() : 0);
        result = 31 * result + (codpadre != null ? codpadre.hashCode() : 0);
        result = 31 * result + (idactivo != null ? idactivo.hashCode() : 0);
        return result;
    }
}
