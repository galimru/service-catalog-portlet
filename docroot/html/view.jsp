<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<portlet:defineObjects />

<c:set var="ns"><portlet:namespace/></c:set>

<aui:script>
    $(function() {
        $("#${ns}catalog").accordion({
            active: false,
            collapsible: true,
            heightStyle: "content"
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

<div id="${ns}catalog">
    <h3>Group 1</h3>
    <div>
        <div><a onclick="${ns}showDetails('s1');">Service 1</a></div>
        <div><a onclick="${ns}showDetails('s2');">Service 2</a></div>
        <div><a onclick="${ns}showDetails('s3');">Service 3</a></div>
        <div><a onclick="${ns}showDetails('s4');">Service 4</a></div>
    </div>
    <h3>Group 2</h3>
    <div>
        <div><a onclick="${ns}showDetails('s5');">Service 5</a></div>
        <div><a onclick="${ns}showDetails('s6');">Service 6</a></div>
        <div><a onclick="${ns}showDetails('s7');">Service 7</a></div>
        <div><a onclick="${ns}showDetails('s8');">Service 8</a></div>
    </div>
    <h3>Group 3</h3>
    <div>
        <div><a onclick="${ns}showDetails('s9');">Service 9</a></div>
        <div><a onclick="${ns}showDetails('s10');">Service 10</a></div>
        <div><a onclick="${ns}showDetails('s11');">Service 11</a></div>
        <div><a onclick="${ns}showDetails('s12');">Service 12</a></div>
    </div>
    <h3>Group 4</h3>
    <div>
        <div><a onclick="${ns}showDetails('s13');">Service 13</a></div>
        <div><a onclick="${ns}showDetails('s14');">Service 14</a></div>
        <div><a onclick="${ns}showDetails('s15');">Service 15</a></div>
        <div><a onclick="${ns}showDetails('s16');">Service 16</a></div>
    </div>
</div>