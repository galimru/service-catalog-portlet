<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<portlet:defineObjects />

<c:set var="ns"><portlet:namespace/></c:set>

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

<portlet:actionURL name="details" var="detailsURL"/>
<aui:form name="detailForm" action="<%=detailsURL.toString()%>" method="post">
    <aui:input name="code" type="hidden"/>
</aui:form>

<div class="catalog-wrap">
    <div id="catalog-widget">
        <%--<div class="catalog-column">--%>
            <c:forEach items="${catalog.departments}" var="department" varStatus="loop">
                <%--<c:if test="${loop.index % 2 == 0}">--%>
                    <div class="catalog-header">
                        <table>
                            <tbody>
                            <tr>
                                <td class="ui-department-icon"></td>
                                <td class="ui-department-text">${department.name}</td>
                            </tr>
                            </tbody>
                        </table>
                        <div class="ui-department-arrow"></div>
                    </div>
                    <div class="catalog-content">
                        <c:forEach items="${department.services}" var="service">
                        <div onclick="${ns}showDetails('${service.code}');">${service.name}</div>
                        </c:forEach>
                    </div>
                <%--</c:if>--%>
            </c:forEach>
        <%--</div>--%>
        <%--<div class="catalog-column">--%>
            <%--<c:forEach items="${catalog.departments}" var="department" varStatus="loop">--%>
                <%--<c:if test="${loop.index % 2 == 1}">--%>
                    <%--<div class="catalog-header">--%>
                        <%--<table>--%>
                            <%--<tbody>--%>
                            <%--<tr>--%>
                                <%--<td class="ui-department-icon"></td>--%>
                                <%--<td class="ui-department-text">${department.name}</td>--%>
                            <%--</tr>--%>
                            <%--</tbody>--%>
                        <%--</table>--%>
                        <%--<div class="ui-department-arrow"></div>--%>
                    <%--</div>--%>
                    <%--<div class="catalog-content">--%>
                        <%--<c:forEach items="${department.services}" var="service">--%>
                            <%--<div onclick="${ns}showDetails('${service.code}');">${service.name}</div>--%>
                        <%--</c:forEach>--%>
                    <%--</div>--%>
                <%--</c:if>--%>
            <%--</c:forEach>--%>
        <%--</div>--%>
    </div>
</div>