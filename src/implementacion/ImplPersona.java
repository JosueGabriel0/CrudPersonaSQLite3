package implementacion;

import entidades.Persona;
import java.sql.SQLException;
import conexion.ConexionSqlite;
import org.sqlite.SQLiteException;
import java.sql.Statement;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ImplPersona {
    
    //Metodo 1 Statement
    ConexionSqlite cnx = new ConexionSqlite();
    
    public void registrarPersona(Persona p){
        
        //System.out.print("Hola: "+p.getNombres()+" "+p.getApellido_pater()+" "+p.getApellido_mater()+"\n"+"Con direccion: "+p.getDireccion()+"\n"+"Con correo: "+p.getCorreo()+"\n"+"Con Usuario : "+p.getUsuario()+"\n"+"Con contraseña: "+p.getContrasenia());
       
       try{
           //Estatico(es como el interactivo pero sin los getters y con valores estaticos encerrados y separados con '','',etc)
           
           //Interactivo
           String query="INSERT INTO personas VALUES('"+p.getId()+"','"+p.getNombres()+"','"+p.getApellido_pater()+"','"+p.getApellido_mater()+"','"+p.getDireccion()+"','"+p.getCorreo()+"','"+p.getNum_celular()+"','"+p.getAnios_edad()+"','"+p.getDni()+"','"+p.getNivel_educacion()+"','"+p.getEstado_civil()+"','"+p.getGenero()+"','"+p.getUsuario()+"','"+p.getContrasenia()+"')";
           
           
           Statement st= cnx.getConnect().createStatement();                 
           st.execute(query);
           
          
           
       }catch(SQLException ex){
           System.out.println(ex.getMessage());
       
       }
       
       
       
      
    
    }
    
    
    
    
    /*
    //Metodo 2 PreparedStatement mas rapido
    
    ConexionSqlite cnx = new ConexionSqlite();
    Connection cn = cnx.getConnect();
    
    public void registrarPersona2(){
    
            try {
                
                //SOLO USAR UNO 
                
                //Estatico
                PreparedStatement ps = cn.prepareStatement("INSERT INTO personas VALUES(3,'jerson','Flores','Vargas','Jr. Huancane','jerson@gmail','Jersont','JERSONT');");
                ps.executeUpdate();
                
                //Interactivo                
                
                PreparedStatement ps = cn.prepareStatement("INSERT INTO personas VALUES(?,?,?,?,?,?,?,?);");
                
                ps.setInt(1, 2);
                ps.setString(2, "Abel");
                ps.setString(3, "Jilaja");
                ps.setString(4, "Calcin");
                ps.setString(5, "Jr. Puno");
                ps.setString(6, "abel@gmail");
                ps.setString(7, "JILAJAS");
                ps.setString(8, "Jilajas");
                
                ps.executeUpdate();
                
                
                
            } catch (SQLException ex) {
                Logger.getLogger(ImplPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
         
    }
    */
    
    //Reporte de personas por consola
    ArrayList<Persona> listapersonas = new ArrayList<>();
    public void reportePersonas(){
    
            
            try {
                String query = "select * from personas";
                Statement st = cnx.getConnect().createStatement();
                ResultSet rs = st.executeQuery(query);
                
                while(rs.next()){
                Persona p = new Persona();
                
                p.setId(rs.getString("PER_ID"));
                p.setNombres(rs.getString(2));
                p.setApellido_pater(rs.getString(3));
                p.setApellido_mater(rs.getString(4));
                p.setDireccion(rs.getString(5));
                p.setCorreo(rs.getString(6));
                p.setNum_celular(rs.getString(7));
                p.setAnios_edad(rs.getString(8));
                p.setDni(rs.getString(9));
                p.setNivel_educacion(rs.getObject(10));
                p.setEstado_civil(rs.getObject(11));
                p.setGenero(rs.getObject(12));
                p.setUsuario(rs.getString(13));
                p.setContrasenia(rs.getString(14));
                listapersonas.add(p);
                
               for(Persona l  : listapersonas){
                   
                   System.out.println("ID: "+l.getId());
                   System.out.println("Nombres: "+l.getNombres());
                   System.out.println("Apellido Paterno: "+l.getApellido_pater());
                   System.out.println("Apellido Materno: "+l.getApellido_mater());
                   System.out.println("Direccion: "+l.getDireccion());
                   System.out.println("Correo: "+l.getCorreo());
                   System.out.println("Numero de Celular: "+l.getNum_celular());
                   System.out.println("Años de Edad: "+l.getAnios_edad());
                   System.out.println("DNI: "+l.getDni());
                   System.out.println("Nivel de Educacion: "+l.getNivel_educacion());
                   System.out.println("Estado Civil: "+l.getEstado_civil());
                   System.out.println("Genero: "+l.getGenero());
                   System.out.println("Usuario: "+l.getUsuario());
                   System.out.println("Contraseña: "+l.getContrasenia());
                   
                   
               }
                
                }
                
                
                
            } catch (SQLException ex) {
                Logger.getLogger(ImplPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
                  
    }
    
    
    //Ubicacion en reportes
    
    
    public void reportepersonas2 (){
    
        try {
           Statement st = cnx.getConnect().createStatement();
           String query = "select * from personas";
           ResultSet rs = st.executeQuery(query);
           Persona pr = new Persona();
           
           while(rs.next()){
           
           
           pr.setId(rs.getString("PER_ID"));
           pr.setNombres(rs.getString(2));
           pr.setApellido_pater(rs.getString(3));
           pr.setApellido_mater(rs.getString(4));
           pr.setDireccion(rs.getString(5));
           pr.setCorreo(rs.getString(6));
           pr.setNum_celular(rs.getString(7));
           pr.setAnios_edad(rs.getString(8));
           pr.setDni(rs.getString(9));
           pr.setNivel_educacion(rs.getObject(10));
           pr.setEstado_civil(rs.getObject(11));
           pr.setGenero(rs.getObject(12));
           pr.setUsuario(rs.getString(13));
           pr.setContrasenia(rs.getString(14));
           
           
           }
           
           
           
           
        } catch (SQLException ex) {
            Logger.getLogger(ImplPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    /*DefaultTableModel modelo;
    
   
   
    public Reportar() {
        
        
        ConexionSqlite cnx = new ConexionSqlite();
        
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellido paterno");
        modelo.addColumn("Apellido materno");
        modelo.addColumn("Direccion");
        modelo.addColumn("Correo");
        modelo.addColumn("Numero de celular");
        modelo.addColumn("Años de edad");
        modelo.addColumn("DNI");
        modelo.addColumn("Nivel de educacion");
        modelo.addColumn("Estado civil");
        modelo.addColumn("Genero");
        modelo.addColumn("Usuario");
        modelo.addColumn("Contraseña");
        this.jTable1_reporte.setModel(modelo);
        
        
       
        try {
           Statement st = cnx.getConnect().createStatement();
           String query = "select * from personas";
           ResultSet rs = st.executeQuery(query);
           
           
           while(rs.next()){
           Persona p = new Persona();
           
           p.setId(rs.getString("PER_ID"));
           p.setNombres(rs.getString(2));
           p.setApellido_pater(rs.getString(3));
           p.setApellido_mater(rs.getString(4));
           p.setDireccion(rs.getString(5));
           p.setCorreo(rs.getString(6));
           p.setNum_celular(rs.getString(7));
           p.setAnios_edad(rs.getString(8));
           p.setDni(rs.getString(9));
           p.setNivel_educacion(rs.getObject(10));
           p.setEstado_civil(rs.getObject(11));
           p.setGenero(rs.getObject(12));
           p.setUsuario(rs.getString(13));
           p.setContrasenia(rs.getString(14));
           
        String info[] = new String[14];
        info[0]= p.getId();
        info[1]= p.getNombres();
        info[2]= p.getApellido_pater();
        info[3]= p.getApellido_mater();
        info[4]= p.getDireccion();
        info[5]= p.getCorreo();
        info[6]= p.getNum_celular();
        info[7]= p.getAnios_edad();
        info[8]= p.getDni();
        info[9]= ""+p.getNivel_educacion();
        info[10]= ""+p.getEstado_civil();
        info[11]= ""+p.getGenero();
        info[12]=p.getUsuario();
        info[13]= p.getContrasenia();
        modelo.addRow(info);
           
         
           
           }
           
     
        } catch (SQLException ex) {
            Logger.getLogger(ImplPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }*/
    
    }
    
    public void modificarpersonas(Persona m){
    
        try {
                          
                Connection cn= cnx.getConnect();
                
                PreparedStatement ps = cn.prepareStatement("UPDATE personas SET PER_NOMBRE = ?, PER_APELL_PATERNO = ?,PER_APELL_MATERNO = ?,PER_DIRECCION = ?, PER_CORREO = ?, PER_NUM_CELULAR = ?, PER_ANIOS_EDAD = ?, PER_DNI = ?, PER_NIVEL_EDUCACION = ?, PER_ESTADO_CIVIL = ?, PER_GENERO = ?, PER_USUARIO = ?, PER_CONTRASENIA = ? WHERE PER_ID = ?;");
                
                ps.setString(1, m.getNombres());
                ps.setString(2, m.getApellido_pater());
                ps.setString(3, m.getApellido_mater());
                ps.setString(4, m.getDireccion());
                ps.setString(5, m.getCorreo());
                ps.setString(6, m.getNum_celular());
                ps.setString(7, m.getAnios_edad());
                ps.setString(8, m.getDni());
                ps.setObject(9, m.getNivel_educacion());
                ps.setObject(10, m.getEstado_civil());
                ps.setObject(11, m.getGenero());
                ps.setString(12, m.getUsuario());
                ps.setString(13, m.getContrasenia());
                ps.setString(14, m.getId());
                
                ps.executeUpdate();
                
                
                
            } catch (SQLException ex) {
                Logger.getLogger(ImplPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
    
    }
    
    //Con el Statement
    /*
    public void actualizar2(Persona m){
            
        try {
            
            String qurey= "UPDATE personas SET PER_NOMBRE = '"+m.getNombres()+"', PER_APELL_PATERNO = '"+m.getApellido_pater()+"' WHERE PER_ID = '"+m.getId()+"';";
             
             Statement st = cnx.getConnect().createStatement();
             st.executeUpdate(qurey);
             
        } catch (SQLException ex) {
            Logger.getLogger(ImplPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
             
             
    
    }*/
    
    public void eliminarpersonas(Persona e){
    
        try {
                          
                Connection cn= cnx.getConnect();
                
                PreparedStatement ps = cn.prepareStatement("DELETE FROM personas WHERE PER_ID = ?;");
                
                ps.setString(1, e.getId());

                ps.executeUpdate();
                
                
                
            } catch (SQLException ex) {
                Logger.getLogger(ImplPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
    
    }
    
    
    
}
