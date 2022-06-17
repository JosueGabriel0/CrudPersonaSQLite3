package implementacion;

import conexion.ConexionSqlite;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ImplTrabajador {
    ConexionSqlite conn;
    public boolean loginSistema(String user,
                             String pasword){
        boolean a= false;
        try {
            String query =
                    " select * from persona"
                    + " where per_user='"+user+"' "
                    + "and   per_paswd='"+pasword+"' ";
            Statement st = conn.getConnect().createStatement() ;
            ResultSet rs=st.executeQuery(query);
            if(rs.next()){
                a=true;
                System.out.println("si estoy logueado");
            }            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return a;
      }
    
    }
    
