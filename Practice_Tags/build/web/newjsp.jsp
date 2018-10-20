

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="j" uri="WEB-INF/tlds/newtag_library.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <j:mycustomtag></j:mycustomtag>
        <j:cube ber="5"></j:cube>
        <j:power b="3" pow="5"></j:power>
    </body>
</html>
