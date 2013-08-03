package ru.lanit.samara.portlet.controller;

import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import javax.portlet.*;
import java.io.IOException;

/**
 * Created by Galimov Ruslan
 */
public class ServiceCatalogController extends MVCPortlet implements ConfigurationAction {

    @Override
    public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
        super.doView(renderRequest, renderResponse);
    }

    @Override
    public void processAction(PortletConfig portletConfig, ActionRequest request, ActionResponse response) throws Exception {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String render(PortletConfig portletConfig, RenderRequest renderRequest, RenderResponse renderResponse) throws Exception {
        return "/html/config.jsp";
    }

    public void details(ActionRequest request, ActionResponse response) {
        String code = ParamUtil.get(request, "code", "empty");
        request.setAttribute("code", code);
        response.setRenderParameter("jspPage", "/html/details.jsp");
    }
}
