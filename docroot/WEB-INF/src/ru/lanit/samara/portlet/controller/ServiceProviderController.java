package ru.lanit.samara.portlet.controller;

import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.util.bridges.mvc.MVCPortlet;

import javax.portlet.*;

/**
 * Created by Galimov Ruslan
 */
public class ServiceProviderController extends MVCPortlet implements ConfigurationAction {
    @Override
    public void processAction(PortletConfig portletConfig, ActionRequest request, ActionResponse response) throws Exception {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String render(PortletConfig portletConfig, RenderRequest renderRequest, RenderResponse renderResponse) throws Exception {
        return "/html/config.jsp";
    }
}
