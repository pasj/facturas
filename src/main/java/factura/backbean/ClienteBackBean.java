package factura.backbean;


import factura.modelo.CapaNegocio.Service.ClienteService;
import factura.modelo.Entidad.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import factura.utils.SystemSecurityException;


import javax.annotation.PostConstruct;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Pablo Sevilla on 25/10/2016.
 */
@Named
@Scope("view")
public class ClienteBackBean implements Serializable {

    @Autowired
    ClienteService clienteService;

    private List<Cliente> listCliente;
    private Cliente selectedRow;
    @PostConstruct
    public void init() throws SystemSecurityException {
        obtenerClientes();
    }

    public void obtenerClientes() {
        try {
           listCliente = clienteService.obtenerClientes();
        } catch (Exception e) {
           e.getCause();
        }

    }


    public List<Cliente> getListCliente() {
        return listCliente;
    }

    public void setListCliente(List<Cliente> listCliente) {
        this.listCliente = listCliente;
    }

    public Cliente getSelectedRow() {
        return selectedRow;
    }

    public void setSelectedRow(Cliente selectedRow) {
        this.selectedRow = selectedRow;
    }
}
