package ru.lanit.samara.portlet.utils;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import org.apache.axis.AxisFault;
import ru.lanit.samara.portlet.logic.CatalogBuilder;
import ru.lanit.samara.portlet.model.Catalog;
import ru.lanit.samara.portlet.webservice.ServiceCatalog_PortType;
import ru.lanit.samara.portlet.webservice.ServiceCatalog_ServiceLocator;
import ru.lanit.samara.portlet.webservice.ServiceFault;
import ru.lanit.samara.portlet.webservice.ServiceItem;

import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

/**
 * Created by Galimov Ruslan
 */
public class AxisUtil {

    private static final Log _log =  LogFactoryUtil.getLog(AxisUtil.class);

    public static Catalog getServices(String wsUrl, String owner) {
        Catalog catalog = new Catalog();
        try {
            ServiceCatalog_ServiceLocator serviceLocator = new ServiceCatalog_ServiceLocator();
            ServiceCatalog_PortType portType = serviceLocator.getServiceCatalogPort(new URL(wsUrl));
            ServiceItem[] services = portType.getServices(owner);
            CatalogBuilder builder = new CatalogBuilder(services);
            catalog = builder.build();
        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return catalog;
    }

    public static String serviceInfo(String wsUrl, String code) {
        String serviceInfo = null;
        try {
            ServiceCatalog_ServiceLocator serviceLocator = new ServiceCatalog_ServiceLocator();
            ServiceCatalog_PortType portType = serviceLocator.getServiceCatalogPort(new URL(wsUrl));
            serviceInfo = portType.serviceInfo(code);
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ServiceFault serviceFault) {
            serviceFault.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return serviceInfo;
    }
}
