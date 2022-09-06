<%
    if ((session.getAttribute("userid") == null) || (session.getAttribute("userid") == "")) {
%>
No esta logeado<br/>
<a href="index.jsp">Por favor ingrese</a>
<%} else {
%>
Welcome <%=session.getAttribute("userid")%>
<a href='Logout.jsp'>Log out</a>
<%
    }
%>