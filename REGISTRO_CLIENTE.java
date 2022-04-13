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
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author renzo
 */
public class REGISTRO_CLIENTE extends javax.swing.JFrame {

    ButtonGroup btnGr;
    public REGISTRO_CLIENTE() {
        initComponents();
        setLocationRelativeTo(null);
        txtCodCliente.setVisible(false);
        btnGr = new ButtonGroup();
        btnGr.add(rbMasculinoCliente);
        btnGr.add(rbFemeninoCliente);
        cargarTabla();
        this.cboDistritoCliente.removeAllItems();
        try{
             Connection con = PRINCIPAL.getPRINCIPAL();
             Statement Sent = con.createStatement();
             ResultSet rs = Sent.executeQuery("Select * from DISTRITO");
             while(rs.next()){
                 this.cboDistritoCliente.addItem(rs.getString("nom_dis"));
             }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        txtDirCliente = new javax.swing.JTextField();
        txtDniCliente = new javax.swing.JTextField();
        txtCelularCliente = new javax.swing.JTextField();
        btnRegistrarCliente = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        btnEliminarCliente = new javax.swing.JButton();
        btnModificarCliente = new javax.swing.JButton();
        btnSalirCliente = new javax.swing.JButton();
        rbMasculinoCliente = new javax.swing.JRadioButton();
        rbFemeninoCliente = new javax.swing.JRadioButton();
        txtCodCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cboDistritoCliente = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("REGISTRO CLIENTE");

        jLabel2.setText("NOMBRE:");

        jLabel3.setText("DIRECCION:");

        jLabel4.setText("SEXO:");

        jLabel5.setText("DNI:");

        jLabel6.setText("CELULAR:");

        btnRegistrarCliente.setText("REGISTRAR");
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "DIRECCION", "DISTRITO", "SEXO", "DNI", "CELULAR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCliente);

        btnEliminarCliente.setText("ELIMINAR");
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        btnModificarCliente.setText("MODIFICAR");
        btnModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarClienteActionPerformed(evt);
            }
        });

        btnSalirCliente.setText("SALIR");
        btnSalirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirClienteActionPerformed(evt);
            }
        });

        rbMasculinoCliente.setText("M");

        rbFemeninoCliente.setText("F");

        jLabel8.setText("DISTRITO");

        cboDistritoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboDistritoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNombreCliente)
                                .addComponent(txtDirCliente)
                                .addComponent(txtDniCliente)
                                .addComponent(txtCelularCliente)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rbMasculinoCliente)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rbFemeninoCliente))))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModificarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalirCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(27, Short.MAX_VALUE)
                        .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnRegistrarCliente))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificarCliente))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEliminarCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSalirCliente))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cboDistritoCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(rbMasculinoCliente)
                                        .addComponent(rbFemeninoCliente)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDniCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCelularCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
        String nom_cli = txtNombreCliente.getText();
        String dir_cli = txtDirCliente.getText();
        int dni = Integer.parseInt(txtDniCliente.getText());
        int celular = Integer.parseInt(txtCelularCliente.getText());
        String cod_dis = (String) cboDistritoCliente.getSelectedItem();
        String sexo;
        if(rbMasculinoCliente.isSelected() == true){
            sexo="M";
        }else if(rbFemeninoCliente.isSelected() == true){
            sexo="F";
        }else{
            sexo="F";
        }
        
        try{
            Connection con = PRINCIPAL.getPRINCIPAL();
            PreparedStatement ps = con.prepareStatement("INSERT INTO CLIENTE (nom_cli,dir_cli,cod_dis,sexo,dni,celular,activo) VALUES(?,?,(select cod_dis from DISTRITO where nom_dis=?),?,?,?,?");
            ps.setString(1, nom_cli);
            ps.setString(2, dir_cli);
            ps.setString(3, cod_dis);
            ps.setString(4, sexo);
            ps.setInt(5, dni);
            ps.setInt(6, celular);
            ps.setInt(7, 1);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente Registrado");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        limpiar();
        cargarTabla();
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    private void btnModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarClienteActionPerformed
        int cod_cli =Integer.parseInt(txtCodCliente.getText());
        String nom_cli = txtNombreCliente.getText();
        String dir_cli = txtDirCliente.getText();
        int dni = Integer.parseInt(txtDniCliente.getText());
        int celular = Integer.parseInt(txtCelularCliente.getText());
        
        String cod_dis = (String) cboDistritoCliente.getSelectedItem();
        String sexo;
        if(rbFemeninoCliente.isSelected() == true){
            sexo="F";
        }else if(rbMasculinoCliente.isSelected() == true){
            sexo="M";
        }else{
            sexo="M";
        }
        
        try{
            Connection con = PRINCIPAL.getPRINCIPAL();
            PreparedStatement ps = con.prepareStatement("UPDATE CLIENTE SET nom_cli=?,dir_cli=?,cod_dis=?,sexo=?,dni=?,celular=? WHERE cod_cli=?");
            ps.setString(1, nom_cli);
            ps.setString(2, dir_cli);
            ps.setString(3, cod_dis);
            ps.setString(4, sexo);
            ps.setInt(5, dni);
            ps.setInt(6, celular);
            ps.setInt(7, 1);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente Modificado");
            limpiar();
            cargarTabla();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnModificarClienteActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        int cod_cli =Integer.parseInt(txtCodCliente.getText());

        try{
            Connection con = PRINCIPAL.getPRINCIPAL();
            PreparedStatement ps = con.prepareStatement("UPDATE CLIENTE SET activo=0 WHERE cod_cli=?");
            ps.setInt(1,cod_cli);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "CLIENTE ELIMINADO");
            limpiar();
            cargarTabla();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void btnSalirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirClienteActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirClienteActionPerformed
     private void limpiar(){
        txtNombreCliente.setText("");
        txtDirCliente.setText("");
        btnGr.clearSelection();
        txtDniCliente.setText("");
        txtCelularCliente.setText("");
    }
    
    private void cargarTabla(){
        DefaultTableModel modeloTabla = (DefaultTableModel) tblCliente.getModel();
        modeloTabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        
        try{
            Connection con = PRINCIPAL.getPRINCIPAL();
            ps = con.prepareStatement("SELECT cod_cli,nom_cli,dir_cli,distrito.nom_dis,sexo,dni,celular FROM CLIENTE inner join DISTRITO on distrito.cod_dis=cliente.cod_dis WHERE cliente.activo=1");
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
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(REGISTRO_CLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REGISTRO_CLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REGISTRO_CLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REGISTRO_CLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REGISTRO_CLIENTE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnModificarCliente;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnSalirCliente;
    private javax.swing.JComboBox<String> cboDistritoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbFemeninoCliente;
    private javax.swing.JRadioButton rbMasculinoCliente;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtCelularCliente;
    private javax.swing.JTextField txtCodCliente;
    private javax.swing.JTextField txtDirCliente;
    private javax.swing.JTextField txtDniCliente;
    private javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables
}
