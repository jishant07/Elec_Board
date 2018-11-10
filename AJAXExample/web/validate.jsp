<%-- 
    Document   : validate
    Created on : 10 Nov, 2018, 5:35:40 PM
    Author     : 00109
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <% String value = request.getParameter("val");
    for(int i =0 ; i<value.length() ; i++)
        {
            char ch=value.charAt(i);
            if(ch == '@' || ch == '#' || ch == '!' || ch == '$')
            {
                response.getWriter().write("The name cannot contain any special characters");
            }
        }
    %>
    
</html>
