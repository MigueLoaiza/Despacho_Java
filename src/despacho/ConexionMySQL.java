/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package despacho;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.sql.DataSource;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel Loaiza
 */
public class ConexionMySQL {
   public String BD = "despacho";
   public String url = "jdbc:mysql://localhost:3306/" +  BD;
   public String usuario= "root";
   public String contraseña= "";
   public DataSource dataSource;
   
   public Connection Conectar() {
       Connection link = null;
       try {
           Class.forName("com.mysql.jdbc.Driver");
           link = DriverManager.getConnection(this.url, this.usuario, this.contraseña);
           System.out.println("Conexiòn Existosa");
       }
       catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
       }
       return link;
   }   
}
