package factura.modelo.CapaNegocio.Service;

import factura.modelo.Entidad.Cliente;
import factura.utils.BusinessException;
import factura.utils.DAOException;

import java.util.List;

/**
 * Created by Pablo Sevilla on 26/10/2016.
 */
public interface ClienteService {

    public void agregar(Cliente cliente) throws BusinessException, DAOException;

    public void actualizar(Cliente cliente) throws BusinessException, DAOException;

    public void eliminar(Cliente cliente) throws  BusinessException, DAOException;

    public List<Cliente> obtenerClientes() throws BusinessException, DAOException;
}
