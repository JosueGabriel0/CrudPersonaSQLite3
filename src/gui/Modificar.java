package gui;

import conexion.ConexionSqlite;
import entidades.Persona;
import implementacion.ImplPersona;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Modificar extends javax.swing.JInternalFrame {
    DefaultTableModel modelo;


    public Modificar() {
        initComponents();

        ConexionSqlite cnx = new ConexionSqlite();

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
        info[13]= "********";//p.getContrasenia();
        modelo.addRow(info);



           }


        } catch (SQLException ex) {
            Logger.getLogger(ImplPersona.class.getName()).log(Level.SEVERE, null, ex);
        }





    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_reporte = new javax.swing.JTable();
        jLabel_id = new javax.swing.JLabel();
        jTextField_id = new javax.swing.JTextField();
        jButton_modificar = new javax.swing.JButton();
        jLabel_nombres = new javax.swing.JLabel();
        jTextField_nombres = new javax.swing.JTextField();
        jLabel_apell_paterno = new javax.swing.JLabel();
        jTextField_apell_paterno = new javax.swing.JTextField();
        jLabel_apell_materno = new javax.swing.JLabel();
        jTextField_apell_materno = new javax.swing.JTextField();
        jLabel_direccion = new javax.swing.JLabel();
        jTextField_direccion = new javax.swing.JTextField();
        jLabel_correo = new javax.swing.JLabel();
        jTextField_correo = new javax.swing.JTextField();
        jLabel_num_celular = new javax.swing.JLabel();
        jTextField_num_celular = new javax.swing.JTextField();
        jLabel_edad = new javax.swing.JLabel();
        jTextField_edad = new javax.swing.JTextField();
        jLabel_dni = new javax.swing.JLabel();
        jTextField_dni = new javax.swing.JTextField();
        jLabel_nivel_educacion = new javax.swing.JLabel();
        jComboBox_nivel_educacion = new javax.swing.JComboBox<>();
        jLabel_estado_civil = new javax.swing.JLabel();
        jComboBox_estado_civil = new javax.swing.JComboBox<>();
        jLabel_genero = new javax.swing.JLabel();
        jComboBox_genero = new javax.swing.JComboBox<>();
        jLabel_titulo = new javax.swing.JLabel();
        jLabel_usuario = new javax.swing.JLabel();
        jTextField_usuario = new javax.swing.JTextField();
        jLabel_contrasenia = new javax.swing.JLabel();
        jPasswordField_contrasenia = new javax.swing.JPasswordField();
        jButton1_Limpiar_Modificar_Personas = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Modificar Personas");

        jTable1_reporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13", "Title 14"
            }
        ));
        jTable1_reporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1_reporteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1_reporte);

        jLabel_id.setText("Ingrese el ID de la persona a modificar:");

        jButton_modificar.setText("Modificar");
        jButton_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_modificarActionPerformed(evt);
            }
        });

        jLabel_nombres.setText("Ingrese los nuevos nombres:");

        jLabel_apell_paterno.setText("Ingrese el nuevo apellido paterno:");

        jLabel_apell_materno.setText("Ingrese el nuevo apellido materno:");

        jLabel_direccion.setText("Ingrese la nueva dirección:");

        jLabel_correo.setText("Ingrese el nuevo correo:");

        jLabel_num_celular.setText("Ingrese el nuevo numero de celular:");

        jLabel_edad.setText("Ingrese la nueva edad:");

        jLabel_dni.setText("Ingrese el nuevo DNI:");

        jLabel_nivel_educacion.setText("Seleccione el nuevo nivel de educación:");

        jComboBox_nivel_educacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inicial", "Primario", "Secundario", "Superior" }));

        jLabel_estado_civil.setText("Seleccione el nuevo estado civil:");

        jComboBox_estado_civil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero", "Casado", "Viudo", "Divorciado" }));

        jLabel_genero.setText("Seleccione el nuevo género:");

        jComboBox_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Prefiero no decirlo" }));

        jLabel_titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_titulo.setText("Modificación:");

        jLabel_usuario.setText("Ingrese el nuevo usuario:");

        jLabel_contrasenia.setText("Ingrese la nueva contraseña:");

        jButton1_Limpiar_Modificar_Personas.setText("Limpiar");
        jButton1_Limpiar_Modificar_Personas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_Limpiar_Modificar_PersonasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_id)
                            .addComponent(jLabel_nombres)
                            .addComponent(jLabel_apell_paterno)
                            .addComponent(jLabel_apell_materno)
                            .addComponent(jLabel_direccion)
                            .addComponent(jLabel_correo)
                            .addComponent(jLabel_num_celular)
                            .addComponent(jLabel_edad)
                            .addComponent(jLabel_dni)
                            .addComponent(jLabel_usuario))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_id)
                            .addComponent(jTextField_nombres)
                            .addComponent(jTextField_apell_paterno)
                            .addComponent(jTextField_apell_materno)
                            .addComponent(jTextField_direccion)
                            .addComponent(jTextField_correo)
                            .addComponent(jTextField_num_celular)
                            .addComponent(jTextField_edad)
                            .addComponent(jTextField_dni)
                            .addComponent(jTextField_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(205, 205, 205)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_nivel_educacion)
                            .addComponent(jLabel_estado_civil)
                            .addComponent(jLabel_genero)
                            .addComponent(jLabel_contrasenia))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_estado_civil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_nivel_educacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField_contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1_Limpiar_Modificar_Personas)
                        .addGap(308, 308, 308)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_titulo)
                            .addComponent(jButton_modificar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_titulo)
                    .addComponent(jButton1_Limpiar_Modificar_Personas))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_id)
                    .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nombres)
                    .addComponent(jTextField_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_nivel_educacion)
                    .addComponent(jComboBox_nivel_educacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_apell_paterno)
                    .addComponent(jTextField_apell_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_apell_materno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_apell_materno))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_direccion)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_estado_civil)
                        .addComponent(jComboBox_estado_civil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_correo)
                    .addComponent(jTextField_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_num_celular)
                    .addComponent(jTextField_num_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_edad)
                    .addComponent(jTextField_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_genero)
                    .addComponent(jComboBox_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_dni)
                    .addComponent(jTextField_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_usuario)
                    .addComponent(jTextField_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_contrasenia)
                    .addComponent(jPasswordField_contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton_modificar)
                .addGap(286, 286, 286))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    public void addOneReporteData(){
    
        Object[] fila = new Object[14];
            fila[0]= jTextField_id.getText();
            fila[1]= jTextField_nombres.getText();
            fila[2]= jTextField_apell_paterno.getText();
            fila[3]= jTextField_apell_materno.getText();
            fila[4]= jTextField_direccion.getText();
            fila[5]= jTextField_correo.getText();
            fila[6]= jTextField_num_celular.getText();
            fila[7]= jTextField_edad.getText();
            fila[8]= jTextField_dni.getText();
            fila[9]= jComboBox_nivel_educacion.getSelectedItem();
            fila[10]= jComboBox_estado_civil.getSelectedItem();
            fila[11]= jComboBox_genero.getSelectedItem();
            fila[12]= jTextField_usuario.getText();
            fila[13]= "********";
            
            modelo.addRow(fila);
            
            jTable1_reporte.setModel(modelo);
    
            
    }
    */
    
    public void updateOneReporteData(int rowSelected){
      
        jTable1_reporte.setValueAt(jTextField_id.getText(), rowSelected, 0);
        jTable1_reporte.setValueAt(jTextField_nombres.getText(), rowSelected, 1);
        jTable1_reporte.setValueAt(jTextField_apell_paterno.getText(), rowSelected, 2);
        jTable1_reporte.setValueAt(jTextField_apell_materno.getText(), rowSelected, 3);
        jTable1_reporte.setValueAt(jTextField_direccion.getText(), rowSelected, 4);
        jTable1_reporte.setValueAt(jTextField_correo.getText(), rowSelected, 5);
        jTable1_reporte.setValueAt(jTextField_num_celular.getText(), rowSelected, 6);
        jTable1_reporte.setValueAt(jTextField_edad.getText(), rowSelected, 7);
        jTable1_reporte.setValueAt(jTextField_dni.getText(), rowSelected, 8);
        jTable1_reporte.setValueAt(jComboBox_nivel_educacion.getSelectedItem(), rowSelected, 9);
        jTable1_reporte.setValueAt(jComboBox_estado_civil.getSelectedItem(), rowSelected, 10);
        jTable1_reporte.setValueAt(jComboBox_genero.getSelectedItem(), rowSelected, 11);
        jTable1_reporte.setValueAt(jTextField_usuario.getText(), rowSelected, 12);
        jTable1_reporte.setValueAt("********", rowSelected, 13);
    }
    
    private void jButton_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_modificarActionPerformed
        ImplPersona ipm = new ImplPersona();
        Persona m = new Persona();

        if( jTextField_id.getText().equals("")||
            jTextField_nombres.getText().equals("")||
            jTextField_apell_paterno.getText().equals("")||
            jTextField_apell_materno.getText().equals("")||
            jTextField_direccion.getText().equals("")||
            jTextField_correo.getText().equals("")||
            jTextField_num_celular.getText().equals("")||
            jTextField_edad.getText().equals("")||
            jTextField_dni.getText().equals("")||
            jTextField_usuario.getText().equals("")||
            jPasswordField_contrasenia.getText().equals("")
           ){
            JOptionPane.showMessageDialog(null, "Ingrese los datos completos");
            
        }else{
        
        m.setId(jTextField_id.getText());
        m.setNombres(jTextField_nombres.getText());
        m.setApellido_pater(jTextField_apell_paterno.getText());
        m.setApellido_mater(jTextField_apell_materno.getText());
        m.setDireccion(jTextField_direccion.getText());
        m.setCorreo(jTextField_correo.getText());
        m.setNum_celular(jTextField_num_celular.getText());
        m.setAnios_edad(jTextField_edad.getText());
        m.setDni(jTextField_dni.getText());
        m.setNivel_educacion(jComboBox_nivel_educacion.getSelectedItem());
        m.setEstado_civil(jComboBox_estado_civil.getSelectedItem());
        m.setGenero(jComboBox_genero.getSelectedItem());
        m.setUsuario(jTextField_usuario.getText());
        m.setContrasenia(jPasswordField_contrasenia.getText());
        
        ipm.modificarpersonas(m);
            JOptionPane.showMessageDialog(null, "Modificado con exito");
            int row = jTable1_reporte.getSelectedRow();
            updateOneReporteData(row);
            limpiarJTextField();
        }
        //ipm.actualizar2(m);
    }//GEN-LAST:event_jButton_modificarActionPerformed

    private void jTable1_reporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1_reporteMouseClicked

        int row = jTable1_reporte.getSelectedRow();

        System.out.println("asodgjsda"+row);
        String id = jTable1_reporte.getValueAt(row, 0).toString();
        String nombres = jTable1_reporte.getValueAt(row, 1).toString();
        String apell_paterno = jTable1_reporte.getValueAt(row, 2).toString();
        String apell_materno = jTable1_reporte.getValueAt(row, 3).toString();
        String direccion = jTable1_reporte.getValueAt(row, 4).toString();
        String correo = jTable1_reporte.getValueAt(row, 5).toString();
        String numero = jTable1_reporte.getValueAt(row, 6).toString();
        String anios = jTable1_reporte.getValueAt(row, 7).toString();
        String dni = jTable1_reporte.getValueAt(row, 8).toString();
        /*
        ComboBoxModel nivelEduc = jTable1_reporte.getValueAt(row, 9).toString;
        String estCivil = jTable1_reporte.getValueAt(row, 10).toString();
        String genero = jTable1_reporte.getValueAt(row, 11).toString();
        */
        String usuario = jTable1_reporte.getValueAt(row, 12).toString();
        String contrasenia = jTable1_reporte.getValueAt(row, 13).toString();

        
        jTextField_id.setText(id);
        jTextField_nombres.setText(nombres);
        jTextField_apell_paterno.setText(apell_paterno);
        jTextField_apell_materno.setText(apell_materno);
        jTextField_direccion.setText(direccion);
        jTextField_correo.setText(correo);
        jTextField_num_celular.setText(numero);
        jTextField_edad.setText(anios);
        jTextField_dni.setText(dni);
        /*
        jComboBox_nivel_educacion.setModel("nivelEduc");
        jComboBox_estado_civil.setModel(estCivil);
        */
        jTextField_usuario.setText(usuario);
        jPasswordField_contrasenia.setText(contrasenia);
        
    }//GEN-LAST:event_jTable1_reporteMouseClicked

    private void jButton1_Limpiar_Modificar_PersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_Limpiar_Modificar_PersonasActionPerformed
        
        limpiarJTextField();
        
    }//GEN-LAST:event_jButton1_Limpiar_Modificar_PersonasActionPerformed

    public void limpiarJTextField(){
        jTextField_id.setText("");
        jTextField_nombres.setText("");
        jTextField_apell_paterno.setText("");
        jTextField_apell_materno.setText("");
        jTextField_direccion.setText("");
        jTextField_correo.setText("");
        jTextField_num_celular.setText("");
        jTextField_edad.setText("");
        jTextField_dni.setText("");
        jTextField_usuario.setText("");
        jPasswordField_contrasenia.setText("");
        
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_Limpiar_Modificar_Personas;
    private javax.swing.JButton jButton_modificar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox_estado_civil;
    private javax.swing.JComboBox<String> jComboBox_genero;
    private javax.swing.JComboBox<String> jComboBox_nivel_educacion;
    private javax.swing.JLabel jLabel_apell_materno;
    private javax.swing.JLabel jLabel_apell_paterno;
    private javax.swing.JLabel jLabel_contrasenia;
    private javax.swing.JLabel jLabel_correo;
    private javax.swing.JLabel jLabel_direccion;
    private javax.swing.JLabel jLabel_dni;
    private javax.swing.JLabel jLabel_edad;
    private javax.swing.JLabel jLabel_estado_civil;
    private javax.swing.JLabel jLabel_genero;
    private javax.swing.JLabel jLabel_id;
    private javax.swing.JLabel jLabel_nivel_educacion;
    private javax.swing.JLabel jLabel_nombres;
    private javax.swing.JLabel jLabel_num_celular;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JLabel jLabel_usuario;
    private javax.swing.JPasswordField jPasswordField_contrasenia;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1_reporte;
    private javax.swing.JTextField jTextField_apell_materno;
    private javax.swing.JTextField jTextField_apell_paterno;
    private javax.swing.JTextField jTextField_correo;
    private javax.swing.JTextField jTextField_direccion;
    private javax.swing.JTextField jTextField_dni;
    private javax.swing.JTextField jTextField_edad;
    private javax.swing.JTextField jTextField_id;
    private javax.swing.JTextField jTextField_nombres;
    private javax.swing.JTextField jTextField_num_celular;
    private javax.swing.JTextField jTextField_usuario;
    // End of variables declaration//GEN-END:variables
}
