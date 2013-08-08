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
            header: ".catalog-item-header"
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
        <div class="catalog-column">
            <div class="catalog-item-header">
                <div class="ui-arrow"></div>
                <table>
                    <tbody>
                    <tr>
                        <td class="ui-icon"></td>
                        <td class="ui-text">Department 1</td>
                    </tr>
                    </tbody>
                </table>
            </div>
            <div class="catalog-item-content">
                <div class="service-item" onclick="${ns}showDetails('s1');">Service 1</div>
                <div class="service-item" onclick="${ns}showDetails('s2');">Service 2</div>
                <div class="service-item" onclick="${ns}showDetails('s3');">Service 3</div>
                <div class="service-item" onclick="${ns}showDetails('s4');">Service 4</div>
            </div>
            <div class="catalog-item-header">
                <div class="ui-arrow"></div>
                <table>
                    <tbody>
                    <tr>
                        <td class="ui-icon"></td>
                        <td class="ui-text">Department 2</td>
                    </tr>
                    </tbody>
                </table>
            </div>
            <div class="catalog-item-content">
                <div class="service-item" onclick="${ns}showDetails('s5');">Service 5</div>
                <div class="service-item" onclick="${ns}showDetails('s6');">Service 6</div>
                <div class="service-item" onclick="${ns}showDetails('s7');">Service 7</div>
                <div class="service-item" onclick="${ns}showDetails('s8');">Service 8</div>
            </div>
        </div>
        <div class="catalog-column">
            <div class="catalog-item-header">
                <div class="ui-arrow"></div>
                <table>
                    <tbody>
                    <tr>
                        <td class="ui-icon"></td>
                        <td class="ui-text">Department 3</td>
                    </tr>
                    </tbody>
                </table>
            </div>
            <div class="catalog-item-content">
                <div class="service-item" onclick="${ns}showDetails('s9');">Service 9</div>
                <div class="service-item" onclick="${ns}showDetails('s10');">Service 10</div>
                <div class="service-item" onclick="${ns}showDetails('s11');">Service 11</div>
                <div class="service-item" onclick="${ns}showDetails('s12');">Service 12</div>
            </div>
            <div class="catalog-item-header">
                <div class="ui-arrow"></div>
                <table>
                    <tbody>
                    <tr>
                        <td class="ui-icon"></td>
                        <td class="ui-text">Department 4</td>
                    </tr>
                    </tbody>
                </table>
            </div>
            <div class="catalog-item-content">
                <div class="service-item" onclick="${ns}showDetails('s13');">Service 13</div>
                <div class="service-item" onclick="${ns}showDetails('s14');">Service 14</div>
                <div class="service-item" onclick="${ns}showDetails('s15');">Service 15</div>
                <div class="service-item" onclick="${ns}showDetails('s16');">Service 16</div>
            </div>
        </div>
    </div>
</div>