<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>
<%@ page import="com.liferay.portlet.PortletPreferencesFactoryUtil" %>
<%@ page import="javax.portlet.PortletPreferences" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="lui" %>

<portlet:defineObjects />

<c:set var="ns"><portlet:namespace/></c:set>
<c:set var="save"><lui:message key="save"/></c:set>
<%
    String portletResource = ParamUtil.getString(request, "portletResource");
    PortletPreferences prefs = Validator.isNotNull(portletResource) ? PortletPreferencesFactoryUtil
            .getPortletSetup(request, portletResource) : renderRequest.getPreferences();
    String wsurl = ParamUtil.getString(request, "wsurl", prefs.getValue("wsurl", "localhost"));
    String owner = ParamUtil.getString(request, "owner", prefs.getValue("owner", ""));

%>

<liferay-portlet:actionURL portletConfiguration="true" var="configurationURL"/>


<aui:form action="<%=configurationURL%>" method="post">
    <aui:fieldset>
        <aui:input name="wsurl" label="ws-address" value="<%=wsurl%>"/>
        <aui:input name="owner" label="ws-owner" value="<%=owner%>"/>
    </aui:fieldset>
    <aui:button-row>
        <aui:button type="submit" value="save" />
    </aui:button-row>

</aui:form>
