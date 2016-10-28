package factura.utils;

import java.util.Map;
import javax.faces.context.FacesContext;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

/**
 * Created by Pablo Sevilla on 24/10/2016.
 */
public class ViewScope implements Scope {
    public ViewScope() {
    }

    public Object get(String name, ObjectFactory<?> objectFactory) {
        if(FacesContext.getCurrentInstance().getViewRoot() != null) {
            Map viewMap = FacesContext.getCurrentInstance().getViewRoot().getViewMap();
            if(viewMap.containsKey(name)) {
                return viewMap.get(name);
            } else {
                Object object = objectFactory.getObject();
                viewMap.put(name, object);
                return object;
            }
        } else {
            return null;
        }
    }

    public Object remove(String name) {
        return FacesContext.getCurrentInstance().getViewRoot() != null?FacesContext.getCurrentInstance().getViewRoot().getViewMap().remove(name):null;
    }

    public void registerDestructionCallback(String name, Runnable callback) {
    }

    public Object resolveContextualObject(String key) {
        return null;
    }

    public String getConversationId() {
        return null;
    }


}

