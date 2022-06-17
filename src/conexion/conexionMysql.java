package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexionMysql {
    
    Connection conexion= null;
    String userDB = "";
    String password = "";
    String url = "";
    
    public Connection conectaMysql(){

            try {
                userDB = "root";
                url = "jdbc";
                conexion= DriverManager.getConnection(url,userDB,password);
                if (conexion!=null){
                    System.out.println("Se establecio la conexion");
                    
            }else{
                    System.out.println("No hay conexion");
                }
                
                
            }catch(SQLException ex){
            
                Logger.getLogger(conexionMysql.class.getName()).log(Level.SEVERE, null, ex);
                    ex.getMessage();
            }
              
        return conexion;
        
        }
    
    public static void main(String args[]){
        conexionMysql cd = new conexionMysql();
        cd.conectaMysql();
    
    }
        
    }
    
    
    

