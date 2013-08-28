package ru.lanit.samara.portlet.logic;

import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portlet.PortletPreferencesFactoryUtil;

import javax.portlet.*;

/**
 * Created by Galimov Ruslan
 */
public class ConfigController implements ConfigurationAction {

    @Override
    public void processAction(PortletConfig portletConfig, ActionRequest request, ActionResponse response) throws Exception {
        String portletResource = ParamUtil.getString(request, "portletResource");
        PortletPreferences prefs = PortletPreferencesFactoryUtil.getPortletSetup(request, portletResource);
        prefs.setValue("wsurl", ParamUtil.getString(request, "wsurl"));
        prefs.store();
    }

    @Override
    public String render(PortletConfig portletConfig, RenderRequest renderRequest, RenderResponse renderResponse) throws Exception {
        return "/html/config.jsp";
    }
}
