package evaluacion2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.sql.SQLException;
import java.util.List;
import org.junit.Test;
  
public class AppTest {
    UsuarioQueries UsuarioQueriesObject = new UsuarioQueries();    
      
      @Test
    public void listUsuariosDetails_positive() throws SQLException {
         List<Usuario> listUsuarioDetails = UsuarioQueriesObject.listUsuariosDetails();
         System.out.println("Test Case listUsuariosDetails_positive" );
         assertEquals(listUsuarioDetails.size(),2);
         System.out.println("Obtenido: "+listUsuarioDetails.size()+" Esperado: 2" );
         assertEquals(listUsuarioDetails.get(0).getRut(),9973917);
         System.out.println("Obtenido: "+listUsuarioDetails.get(0).getRut()+" Esperado: 9973917" );
         assertEquals(listUsuarioDetails.get(0).getNombre(),"Isabel");
         System.out.println("Obtenido: "+listUsuarioDetails.get(0).getNombre()+" Esperado: Isabel" );
         assertEquals(listUsuarioDetails.get(1).getUsername(),"rhys666");
         System.out.println("Obtenido: "+listUsuarioDetails.get(1).getUsername()+" Esperado: rhys666" );
         assertEquals(listUsuarioDetails.get(1).getPassword(),"123456");
         System.out.println("Obtenido: "+listUsuarioDetails.get(1).getPassword()+" Esperado: 123456" );
    }
  
    @Test
    public void listUsuariosDetails_negative() throws SQLException {
         List<Usuario> listUsuarioDetails = UsuarioQueriesObject.listUsuariosDetails();
         System.out.println("Test Case listUsuariosDetails_negative" );
         assertNotEquals(listUsuarioDetails.size(), 11);
         System.out.println("Obtenido: "+listUsuarioDetails.size()+" No Esperado: "+11 );
         assertNotEquals(listUsuarioDetails.get(0).getRut(),22626647);
         System.out.println("Obtenido: "+listUsuarioDetails.get(0).getRut()+" No Esperado: 22626647" );
         assertNotEquals(listUsuarioDetails.get(0).getNombre(),"Michel");
         System.out.println("Obtenido: "+listUsuarioDetails.get(0).getNombre()+" No Esperado: Michel" );
         assertNotEquals(listUsuarioDetails.get(1).getUsername(),"isita");
         System.out.println("Obtenido: "+listUsuarioDetails.get(1).getUsername()+" No Esperado: isita" );
         assertNotEquals(listUsuarioDetails.get(0).getPassword(),"654321");
         System.out.println("Obtenido: "+listUsuarioDetails.get(0).getPassword()+" No Esperado: 654321" );
    }    
    
    @Test
    public void getUsuarioName_PositiveTestCase() throws SQLException {
    	 System.out.println("Test Case getUsuarioName_Positive" );
         String UsuarioName = UsuarioQueriesObject.getUsuarioNameByRut(22626647);
         assertEquals(UsuarioName, "Michel");
         System.out.println("Obtenido: "+UsuarioName+" Esperado: Michel" );
         UsuarioName = UsuarioQueriesObject.getUsuarioNameByRut(9973917);
         assertEquals(UsuarioName, "Isabel");
         System.out.println("Obtenido: "+UsuarioName+" Esperado: Isabel" );
    }
    
    @Test
    public void getUsuarioName_NegativeTestCase() throws SQLException {
    	 System.out.println("Test Case getUsuarioName_Negative" );
         String UsuarioName = UsuarioQueriesObject.getUsuarioNameByRut(22626647);
         assertNotEquals(UsuarioName, "Isabel");
         System.out.println("Obtenido: "+UsuarioName+" No Esperado: Isabel" );
    }
 
    
}