package evaluacion2;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
  
public class UsuarioQueries {

    public List<Usuario> listUsuariosDetails() throws SQLException
    {
       
        Connection con = null;
		String dname = "com.mysql.cj.jdbc.Driver";
        String dbConnUrl = "jdbc:mysql://localhost:3306/bdlogin";
        String dbUserName = "root";
        String dbPassword ="";
        try {
			Class.forName(dname);
			con = DriverManager.getConnection(dbConnUrl, dbUserName, dbPassword);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
      
		
        List<Usuario> list = new ArrayList<Usuario>();
        Usuario usuario = null;
        ResultSet rs = null;
        Statement stmt = null;

        String query = "SELECT a.rut,a.nombre, a.apellido, a.telefono, a.fechaingreso, b.username, b.password FROM persona a , usuario b WHERE a.rut = b.rut;";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            
            while (rs.next()) {
            	usuario = new Usuario();
                usuario.setRut(rs.getInt(1));
                usuario.setNombre(rs.getString(2));
                usuario.setApellido(rs.getString(3));
                usuario.setTelefono(rs.getLong(4));
                usuario.setFechaingreso(rs.getDate(5));
                
                usuario.setUsername(rs.getString(6));
                usuario.setPassword(rs.getString(7));
                // System.out.println(rs.getInt(1) + " " +
                // rs.getString(2));
                list.add(usuario);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            ConnectionClass.close(con);
            ConnectionClass.close(stmt);
            ConnectionClass.close(rs);
        }
        return list;
    }
    
    public String getUsuarioNameByRut(int usuarioRUT) throws SQLException
    {
    	Connection con = null;
    	String dname = "com.mysql.cj.jdbc.Driver";
        String dbConnUrl = "jdbc:mysql://localhost:3306/bdlogin";
        String dbUserName = "root";
        String dbPassword ="";
        try {
			Class.forName(dname);
			con = DriverManager.getConnection(dbConnUrl, dbUserName, dbPassword);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        PreparedStatement pStmt = null;
        ResultSet rs = null;
        String usuarioName = null;
        try {
          
            String query= "SELECT a.rut, a.nombre, a.apellido, a.telefono, a.fechaingreso, b.username, b.password FROM persona a , usuario b WHERE a.rut = b.rut and a.rut=?;";
            pStmt = con.prepareStatement(query);
            pStmt.setInt(1, usuarioRUT);
            rs = pStmt.executeQuery();
  
            while (rs.next()) {
               	usuarioName = rs.getString(2);
                //System.out.println(rs.getString(2));
            }
        }
        catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally {
        	ConnectionClass.close(con);
        	ConnectionClass.close(pStmt);
        	ConnectionClass.close(rs);
        }
        return usuarioName;
    }

}