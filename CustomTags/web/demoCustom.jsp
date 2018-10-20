<%-- 
    Document   : demoCustom
    Created on : Oct 13, 2018, 6:10:34 PM
    Author     : MRuser
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="WEB-INF/tlds/cust_tag.tld" prefix="d" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        Current date is <d:date></d:date>
        
            The cube of 5 is <d:cube number="5"></d:cube>
        
        3 ^ 5 = <d:power number="3" power="5">  
 body
</d:power>  
    </body>
</html>
