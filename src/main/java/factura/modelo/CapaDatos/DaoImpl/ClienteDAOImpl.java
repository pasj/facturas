package factura.modelo.CapaDatos.DaoImpl;

import factura.modelo.CapaDatos.Dao.ClienteDAO;
import factura.modelo.Entidad.Cliente;
import org.springframework.stereotype.Repository;
import factura.utils.BaseGenericDAOImpl;

/**
 * Created by Pablo Sevilla on 26/10/2016.
 */
@Repository
public class ClienteDAOImpl  extends BaseGenericDAOImpl<Cliente, Integer> implements ClienteDAO {


}
