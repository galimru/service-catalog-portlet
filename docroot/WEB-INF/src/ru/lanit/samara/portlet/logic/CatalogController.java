package ru.lanit.samara.portlet.logic;

import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.webcache.WebCachePoolUtil;
import com.liferay.portlet.PortletPreferencesFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import ru.lanit.samara.portlet.cache.WebServiceCacheItem;
import ru.lanit.samara.portlet.model.Catalog;
import ru.lanit.samara.portlet.utils.AxisUtil;

import javax.portlet.*;
import java.io.IOException;

/**
 * Created by Galimov Ruslan
 */
public class CatalogController extends MVCPortlet implements ConfigurationAction {

    private String WS_URL = "http://localhost";
    private String owner = "";

    @Override
    public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
        WS_URL = renderRequest.getPreferences().getValue("wsurl", null);
        owner = renderRequest.getPreferences().getValue("owner", null);
        Catalog catalog = (Catalog) WebCachePoolUtil.get(WebServiceCacheItem.CACHE_KEY, new WebServiceCacheItem(WS_URL, owner));
        renderRequest.setAttribute("catalog", catalog);
        super.doView(renderRequest, renderResponse);
    }

    @Override
    public void processAction(PortletConfig portletConfig, ActionRequest request, ActionResponse response) throws Exception {
        String portletResource = ParamUtil.getString(request, "portletResource");
        PortletPreferences prefs = PortletPreferencesFactoryUtil.getPortletSetup(request, portletResource);
        String wsUrl = ParamUtil.getString(request, "wsurl");
        String owner = ParamUtil.getString(request, "owner");
        prefs.setValue("wsurl", wsUrl);
        prefs.setValue("owner", owner);
        prefs.store();
    }

    @Override
    public String render(PortletConfig portletConfig, RenderRequest renderRequest, RenderResponse renderResponse) throws Exception {
        return "/html/config.jsp";
    }

    public void details(ActionRequest request, ActionResponse response) {
        WS_URL = request.getPreferences().getValue("wsurl", null);
        String code = ParamUtil.get(request, "code", "empty");
        String html = AxisUtil.serviceInfo(WS_URL, code);
        request.setAttribute("code", html);
        response.setRenderParameter("jspPage", "/html/details.jsp");
    }
}
