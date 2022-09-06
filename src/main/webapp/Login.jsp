<%@ page import="java.sql.*"%>
<%
    String userName = request.getParameter("userName");   
    String password = request.getParameter("password");
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdlogin",
            "root", "");
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from usuario where username='" + userName + "' and password='" +password + "'");
    if (rs.next()) {
        session.setAttribute("userid", userName);
        
        response.sendRedirect("logeado.jsp");
    } else {
        out.println("Contraseña invalida <a href='index.jsp'>Intentelo de nuevo</a>");
    }
%>