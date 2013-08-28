<%@ page import="javax.portlet.PortletSession" %>
<%@ page import="ru.lanit.samara.portlet.model.Catalog" %>
<%@ page import="ru.lanit.samara.portlet.model.Owner" %>
<%@ page import="ru.lanit.samara.portlet.model.Department" %>
<%@ page import="ru.lanit.samara.portlet.model.Service" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<portlet:defineObjects />

<c:set var="ns"><portlet:namespace/></c:set>

<%
    String ownerFilter = (String) renderRequest.getPortletSession().getAttribute(
            "owner", PortletSession.PORTLET_SCOPE);
    Catalog catalog = (Catalog) renderRequest.getPortletSession().getAttribute(
            "catalog", PortletSession.PORTLET_SCOPE);
%>

<aui:script>
    $(function() {
        $("#catalog-widget").accordion({
            active: false,
            icons: false,
            collapsible: true,
            heightStyle: "content",
            header: ".catalog-header"
        });
    });
</aui:script>

<aui:script>
    function ${ns}showDetails(code) {
        $("#${ns}detailForm input[name=${ns}code]").val(code);
        $("#${ns}detailForm").submit();
    }
</aui:script>

<aui:script>
    function ${ns}showOwner(code) {
    $("#${ns}showOwnerForm input[name=${ns}code]").val(code);
    $("#${ns}showOwnerForm").submit();
    }
</aui:script>

<portlet:actionURL name="showOwner" var="showOwnerURL"/>
<aui:form name="showOwnerForm" action="<%=showOwnerURL.toString()%>" method="post">
    <aui:input name="code" type="hidden"/>
</aui:form>

<portlet:actionURL name="details" var="detailsURL"/>
<aui:form name="detailForm" action="<%=detailsURL.toString()%>" method="post">
    <aui:input name="code" type="hidden"/>
</aui:form>

<aui:select name="owner" label="owner" onChange="${ns}showOwner(this.value)">
    <aui:option value="" label="all-owners"/>
    <% for (Owner el : catalog.getOwners()) { %>
        <aui:option value="<%=el.getCode()%>" selected="<%=el.getCode().equals(ownerFilter)%>"><%=el.getName()%></aui:option>
    <% } %>
</aui:select>

<div class="catalog-wrap">
    <div id="catalog-widget">
        <% for (Department department : catalog.getDepartments()) { %>
            <div class="catalog-header">
                <table>
                    <tbody>
                    <tr>
                        <td class="ui-department-icon"></td>
                        <td class="ui-department-text"><%=department.getName()%></td>
                    </tr>
                    </tbody>
                </table>
                <div class="ui-department-arrow"></div>
            </div>
            <div class="catalog-content">
                <% for (Service service : department.getServices()) { %>
                    <div onclick="${ns}showDetails('<%=service.getCode()%>');"><%=service.getName()%></div>
                <% } %>
            </div>
        <% } %>
    </div>
</div>