package factura.modelo.Entidad;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

/**
 * Created by Pablo Sevilla on 25/10/2016.
 */
@Entity
@javax.persistence.SequenceGenerator(name = "cliente_SEQ", sequenceName = "catalogo.cliente_id_seq", allocationSize = 1)
@Table(name = "cliente", schema = "catalogo")
public class Cliente implements Serializable{
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String cedula;
    private String nombres;
    private String apellidos;
    private String idsexo;
    private Municipio municipioPorId;
    private Tabladetalle estadocivil;
    private Date fechanacimiento;
    private String telefono;
    private String celular;
    private String direccion;
    private String email;



    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.SEQUENCE, generator = "cliente_SEQ")
    @Column(name = "idcliente")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "cedula")
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Basic
    @Column(name = "nombres")
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Basic
    @Column(name = "apellidos")
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Basic
    @Column(name = "idsexo")
    public String getIdsexo() {
        return idsexo;
    }

    public void setIdsexo(String idsexo) {
        this.idsexo = idsexo;
    }

    @ManyToOne
    @JoinColumn(name="idestadocivil",referencedColumnName = "idlinea")
    public Tabladetalle getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(Tabladetalle estadocivil) {
        this.estadocivil = estadocivil;
    }



    @ManyToOne
    @JoinColumn(name = "idmunicipio", referencedColumnName = "idmunicipio")
    public Municipio getMunicipioPorId() {
        return municipioPorId;
    }

    public void setMunicipioPorId(Municipio municipioPorId) {
        this.municipioPorId = municipioPorId;
    }


    @Basic
    @Column(name = "fechanacimiento")
    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    @Basic
    @Column(name = "telefono")
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Basic
    @Column(name = "celular")
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Basic
    @Column(name = "direccion")
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;

        Cliente that = (Cliente) o;

        if (!id.equals(that.id)) return false;
        if (!cedula.equals(that.cedula)) return false  ;
        if (!nombres.equals(that.nombres)) return false;
        if (apellidos.equals(that.apellidos)) return false;
        if (idsexo.equals(that.idsexo)) return false;
        if (estadocivil.equals(that.estadocivil)) return false;
        if (fechanacimiento != null ? !fechanacimiento.equals(that.fechanacimiento) : that.fechanacimiento != null)
            return false;
        if (telefono.equals(that.telefono)) return false;
        if (celular.equals(that.celular)) return false;
        if (direccion.equals(that.direccion)) return false;
        if (email.equals(that.email)) return false;

        return true;
    }


    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (cedula != null ? cedula.hashCode() : 0);
        result = 31 * result + (nombres != null ? nombres.hashCode() : 0);
        result = 31 * result + (apellidos != null ? apellidos.hashCode() : 0);
        result = 31 * result + (idsexo != null ? idsexo.hashCode() : 0);
        result = 31 * result + (estadocivil != null ? estadocivil.hashCode() : 0);
        result = 31 * result + (fechanacimiento != null ? fechanacimiento.hashCode() : 0);
        result = 31 * result + (telefono != null ? telefono.hashCode() : 0);
        result = 31 * result + (celular != null ? celular.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}
