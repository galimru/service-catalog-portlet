package ru.lanit.samara.portlet.utils;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import org.apache.axis.AxisFault;
import ru.lanit.samara.portlet.controller.CatalogBuilder;
import ru.lanit.samara.portlet.model.Catalog;
import ru.lanit.samara.portlet.webservice.ServiceCatalog_PortType;
import ru.lanit.samara.portlet.webservice.ServiceCatalog_ServiceLocator;
import ru.lanit.samara.portlet.webservice.ServiceEntry;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

/**
 * Created by Galimov Ruslan
 */
public class AxisUtil {

    private static final Log _log =  LogFactoryUtil.getLog(AxisUtil.class);

    public static Object fetch() {
        Catalog catalog = new Catalog();
        try {
            ServiceCatalog_ServiceLocator serviceLocator = new ServiceCatalog_ServiceLocator();
            ServiceCatalog_PortType portType = serviceLocator.getServiceCatalogPort();
            ServiceEntry[] services = portType.getServices();
            CatalogBuilder builder = new CatalogBuilder(services);
            catalog = builder.build();
        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (ServiceException e) {
            e.printStackTrace();
        }
        return catalog;
    }
}
