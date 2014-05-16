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
public class ViewController extends MVCPortlet {

    @Override
    public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
        System.out.println("doView");
        String wsurl = renderRequest.getPreferences().getValue("wsurl", null);
        String owner = (String) renderRequest.getPortletSession().getAttribute("owner", PortletSession.PORTLET_SCOPE);
        // workaround
        if (owner == null) {
            owner = "null";
        }
        Catalog catalog = (Catalog) WebCachePoolUtil.get(WebServiceCacheItem.CACHE_KEY + owner, new WebServiceCacheItem(wsurl, owner));
        renderRequest.getPortletSession().setAttribute("catalog", catalog, PortletSession.PORTLET_SCOPE);
        super.doView(renderRequest, renderResponse);
    }

    public void details(ActionRequest request, ActionResponse response) {
        String wsurl = request.getPreferences().getValue("wsurl", null);
        String code = ParamUtil.get(request, "code", "empty");
        String html = AxisUtil.serviceInfo(wsurl, code);
        request.setAttribute("code", html);
        response.setRenderParameter("jspPage", "/html/details.jsp");
    }

    public void showOwner(ActionRequest request, ActionResponse response) {
        System.out.println("showOwner");
        String wsurl = request.getPreferences().getValue("wsurl", null);
        String owner = ParamUtil.getString(request, "code", null);
        System.out.println("owner:" + owner);
        Catalog catalog = (Catalog) WebCachePoolUtil.get(WebServiceCacheItem.CACHE_KEY + owner, new WebServiceCacheItem(wsurl, owner));
        request.getPortletSession().setAttribute("owner", owner, PortletSession.PORTLET_SCOPE);
        request.getPortletSession().setAttribute("catalog", catalog, PortletSession.PORTLET_SCOPE);
    }
}
