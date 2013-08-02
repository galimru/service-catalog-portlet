package ru.lanit.samara.portlet.action;

import com.liferay.portal.kernel.portlet.ConfigurationAction;

import javax.portlet.*;

/**
 * Created by Galimov Ruslan
 */
public class ConfigurationActionImpl implements ConfigurationAction {

    @Override
    public void processAction(PortletConfig portletConfig, ActionRequest request, ActionResponse response) throws Exception {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String render(PortletConfig portletConfig, RenderRequest renderRequest, RenderResponse renderResponse) throws Exception {
        return "/html/config.jsp";
    }
}
