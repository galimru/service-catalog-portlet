<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<portlet:defineObjects />

<portlet:actionURL name="sendHello" var="sendHelloURL"/>

<c:if test="${not empty username}">
<div>Hello, ${username}!</div>
</c:if>

<form action="<%=sendHelloURL.toString()%>" method="post">
    <input type="text" name="username"/>
    <input type="submit" value="send"/>
</form>

<script type="text/javascript">
    $(function() {
        $( "#accordion" ).accordion({
            active: false,
            collapsible: true
        });
    });
</script>

<div id="accordion">
    <h3>First header</h3>
    <div>First content</div>
    <h3>Second header</h3>
    <div>Second content</div>
</div>