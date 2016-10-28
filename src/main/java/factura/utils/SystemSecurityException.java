package factura.utils;

/**
 * Created by Pablo Sevilla on 27/10/2016.
 */
public class SystemSecurityException extends Exception {
    private static final long serialVersionUID = 5394136727929338065L;

    public SystemSecurityException(String msg) {
        super(msg);
    }

    public SystemSecurityException(Throwable cause) {
        super(cause);
    }

    public SystemSecurityException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
