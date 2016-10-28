package factura.modelo.CapaNegocio.ServiceImpl;

import com.googlecode.genericdao.search.Search;
import factura.modelo.CapaDatos.Dao.ClienteDAO;
import factura.modelo.CapaNegocio.Service.ClienteService;
import factura.modelo.Entidad.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import factura.utils.BusinessException;
import factura.utils.DAOException;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Pablo Sevilla on 26/10/2016.
 */
@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    ClienteDAO clienteDAO;

    public void agregar(Cliente cliente) throws BusinessException, DAOException {
        clienteDAO.saveUpper(cliente);
    }

    public void actualizar(Cliente cliente) throws BusinessException, DAOException {
        clienteDAO.updateUpper(cliente);
    }

    public void eliminar(Cliente cliente) throws  BusinessException, DAOException {
        clienteDAO.remove(cliente);
    }

    @Transactional
    public List<Cliente> obtenerClientes() throws BusinessException, DAOException {
        Search search = new Search();
        search.addSortAsc("nombres");
        return clienteDAO.search(search);
    }
}
