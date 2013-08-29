<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="lui" %>

<portlet:defineObjects/>

<input type="button" value="<lui:message key="back"/>" onclick="self.location = '<portlet:renderURL><portlet:param name="view" value="" /></portlet:renderURL>';"/>

<div class="ui-service-info">
    ${code}
</div>