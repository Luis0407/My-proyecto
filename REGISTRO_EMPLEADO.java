/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FERRETERIA;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author renzo
 */
public class REGISTRO_EMPLEADO extends javax.swing.JFrame {

    /**
     * Creates new form REGISTRO_EMPLEADO
     */
    public REGISTRO_EMPLEADO() {
        initComponents();
        setLocationRelativeTo(null);
        txtcodEmpleado.setVisible(false);
        cargarTabla();
        this.cboDistritoEmpleado.removeAllItems();
        try{
             Connection con = PRINCIPAL.getPRINCIPAL();
             Statement Sent = con.createStatement();
             ResultSet rs = Sent.executeQuery("Select * from DISTRITO");
             while(rs.next()){
                 this.cboDistritoEmpleado.addItem(rs.getString("nom_dis"));
             }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        this.cboCargoEmpleado.removeAllItems();
        try{
             Connection con = PRINCIPAL.getPRINCIPAL();
             Statement Sent = con.createStatement();
             ResultSet rs = Sent.executeQuery("Select * from CARGO");
             while(rs.next()){
                 this.cboCargoEmpleado.addItem(rs.getString("nom_cargo"));
             }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        txtEdadEmpleado = new javax.swing.JTextField();
        txtCelularEmpleado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnRegistrarEmpleado = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cboDistritoEmpleado = new javax.swing.JComboBox<>();
        cboCargoEmpleado = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleado = new javax.swing.JTable();
        btnEliminarEmpleado = new javax.swing.JButton();
        btnSalirEmpleado = new javax.swing.JButton();
        txtNombreEmpleado = new javax.swing.JTextField();
        btnModificarEmpleado = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtcodEmpleado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setText("CELULAR:");

        jLabel2.setText("NOMBRE:");

        btnRegistrarEmpleado.setText("REGISTRAR");
        btnRegistrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEmpleadoActionPerformed(evt);
            }
        });

        jLabel5.setText("EDAD:");

        jLabel7.setText("DISTRITO:");

        jLabel8.setText("CARGO:");

        cboDistritoEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboCargoEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tblEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "CARGO", "EDAD", "CELULAR", "DISTRITO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpleadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpleado);

        btnEliminarEmpleado.setText("ELIMINAR");
        btnEliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEmpleadoActionPerformed(evt);
            }
        });

        btnSalirEmpleado.setText("SALIR");
        btnSalirEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirEmpleadoActionPerformed(evt);
            }
        });

        btnModificarEmpleado.setText("MODIFICAR");
        btnModificarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarEmpleadoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("REGISTRO EMPLEADO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboCargoEmpleado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombreEmpleado)
                            .addComponent(txtCelularEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(txtEdadEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(cboDistritoEmpleado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegistrarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModificarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalirEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(txtcodEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2)
                    .addContainerGap(922, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(txtcodEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegistrarEmpleado)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificarEmpleado)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarEmpleado)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalirEmpleado))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtEdadEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtCelularEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(cboDistritoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(cboCargoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(76, 76, 76))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addComponent(jLabel2)
                    .addContainerGap(255, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirEmpleadoActionPerformed
        // TODO add your handling code here:
        dispose();
       // MENU_PRINCIPAL menu = new MENU_PRINCIPAL();
       // menu.setVisible(true);
    }//GEN-LAST:event_btnSalirEmpleadoActionPerformed

    private void btnRegistrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEmpleadoActionPerformed
        String nom_emp = txtNombreEmpleado.getText();
        String cod_cargo = (String) cboCargoEmpleado.getSelectedItem();
        int edad = Integer.parseInt(txtEdadEmpleado.getText());
        int celular = Integer.parseInt(txtCelularEmpleado.getText());
        String cod_dis = (String) cboDistritoEmpleado.getSelectedItem();
        
        try{
            Connection con = PRINCIPAL.getPRINCIPAL();
            PreparedStatement ps = con.prepareStatement("INSERT INTO EMPLEADO (nom_emp,cod_cargo,edad,celular,cod_dis,activo) VALUES(?,(select cod_cargo from CARGO where nom_cargo=?),?,?,(select cod_dis from DISTRITO where nom_dis=?),?");
            ps.setString(1, nom_emp);
            ps.setString(2, cod_cargo);
            ps.setInt(3, edad);
            ps.setInt(4, celular);
            ps.setString(5, cod_dis);
            ps.setInt(6, 1);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Empleado Registrado");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        limpiar();
        cargarTabla();
    }//GEN-LAST:event_btnRegistrarEmpleadoActionPerformed

    private void btnModificarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarEmpleadoActionPerformed
        int cod_emp =Integer.parseInt(txtcodEmpleado.getText());
        String nom_emp = txtNombreEmpleado.getText();
        String cod_cargo = (String) cboCargoEmpleado.getSelectedItem();
        int edad = Integer.parseInt(txtEdadEmpleado.getText());
        int celular = Integer.parseInt(txtCelularEmpleado.getText());
        String cod_dis = (String) cboDistritoEmpleado.getSelectedItem();
        
        try{
            Connection con = PRINCIPAL.getPRINCIPAL();
            PreparedStatement ps = con.prepareStatement("UPDATE EMPLEADO SET nom_emp=?,cod_cargo=?,edad,celular,cod_dis=? WHERE cod_emp=?");
            ps.setString(1, nom_emp);
            ps.setString(2, cod_cargo);
            ps.setInt(3, edad);
            ps.setInt(4, celular);
            ps.setString(5, cod_dis);
            ps.setInt(6, cod_emp);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Empleado Modificado");
            limpiar();
            cargarTabla();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnModificarEmpleadoActionPerformed

    private void tblEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleadoMouseClicked
        try{
            int fila = tblEmpleado.getSelectedRow();
            int cod_emp = Integer.parseInt(tblEmpleado.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            
            Connection con = PRINCIPAL.getPRINCIPAL();
            ps = con.prepareStatement("SELECT nom_emp,cod_cargo,edad,celular,cod_dis FROM PROVEEDOR WHERE cod_emp=?");
            ps.setInt(1, cod_emp);
            rs = ps.executeQuery();
            
            while(rs.next()){
                txtcodEmpleado.setText(String.valueOf(cod_emp));
                txtNombreEmpleado.setText(rs.getString("nom_emp"));
                txtEdadEmpleado.setText(String.valueOf(rs.getString("edad")));
                txtCelularEmpleado.setText(String.valueOf(rs.getString("celular")));
                
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_tblEmpleadoMouseClicked

    private void btnEliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEmpleadoActionPerformed
        int cod_emp =Integer.parseInt(txtcodEmpleado.getText());

        try{
            Connection con = PRINCIPAL.getPRINCIPAL();
            PreparedStatement ps = con.prepareStatement("UPDATE EMPLEADO SET activo=0 WHERE cod_emp=?");
            ps.setInt(1,cod_emp);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "EMPLEADO ELIMINADO");
            limpiar();
            cargarTabla();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnEliminarEmpleadoActionPerformed

    private void limpiar(){
        txtNombreEmpleado.setText("");
        txtEdadEmpleado.setText("");
        txtCelularEmpleado.setText("");

    }
    
    private void cargarTabla(){
        DefaultTableModel modeloTabla = (DefaultTableModel) tblEmpleado.getModel();
        modeloTabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        
        try{
            Connection con = PRINCIPAL.getPRINCIPAL();
            ps = con.prepareStatement("SELECT cod_emp,nom_emp,cargo.nom_cargo,edad,celular,distrito.nom_dis FROM EMPLEADO inner join CARGO on cargo.cod_cargo=empleado.cod_cargo inner join DISTRITO on distrito.cod_dis=empleado.cod_dis WHERE empleado.activo=1");
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();
            while(rs.next()){
                Object[] fila = new Object[columnas];
                for(int indice=0;indice<columnas;indice++){
                    fila[indice]= rs.getObject(indice + 1);
                }
                modeloTabla.addRow(fila);
                
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(REGISTRO_EMPLEADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REGISTRO_EMPLEADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REGISTRO_EMPLEADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REGISTRO_EMPLEADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REGISTRO_EMPLEADO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarEmpleado;
    private javax.swing.JButton btnModificarEmpleado;
    private javax.swing.JButton btnRegistrarEmpleado;
    private javax.swing.JButton btnSalirEmpleado;
    private javax.swing.JComboBox<String> cboCargoEmpleado;
    private javax.swing.JComboBox<String> cboDistritoEmpleado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmpleado;
    private javax.swing.JTextField txtCelularEmpleado;
    private javax.swing.JTextField txtEdadEmpleado;
    private javax.swing.JTextField txtNombreEmpleado;
    private javax.swing.JTextField txtcodEmpleado;
    // End of variables declaration//GEN-END:variables
}
