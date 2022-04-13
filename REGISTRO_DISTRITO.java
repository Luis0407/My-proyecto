
package FERRETERIA;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class REGISTRO_DISTRITO extends javax.swing.JFrame {

    ButtonGroup btnGr;
    public REGISTRO_DISTRITO() {
        initComponents();
        setLocationRelativeTo(null);
        txtCodDistrito.setVisible(false);
        btnGr = new ButtonGroup();
        btnGr.add(rbSiDis);
        btnGr.add(rbNoDis);
        cargarTabla();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreDistrito = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDistrito = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        rbSiDis = new javax.swing.JRadioButton();
        rbNoDis = new javax.swing.JRadioButton();
        btnRegistrarDistrito = new javax.swing.JButton();
        btnEliminarDistrito = new javax.swing.JButton();
        btnSalirDistrito = new javax.swing.JButton();
        btnModificarDistrito = new javax.swing.JButton();
        txtCodDistrito = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("REGISTRO DISTRITO");

        jLabel2.setText("NOMBRE:");

        tblDistrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "AMAZONIA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDistrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDistritoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDistrito);

        jLabel3.setText("Amazonía");

        rbSiDis.setText("SI");

        rbNoDis.setText("NO");

        btnRegistrarDistrito.setText("REGISTRAR");
        btnRegistrarDistrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarDistritoActionPerformed(evt);
            }
        });

        btnEliminarDistrito.setText("ELIMINAR");
        btnEliminarDistrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDistritoActionPerformed(evt);
            }
        });

        btnSalirDistrito.setText("SALIR");

        btnModificarDistrito.setText("MODIFICAR");
        btnModificarDistrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarDistritoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(rbSiDis)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbNoDis))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombreDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(txtCodDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrarDistrito)
                            .addComponent(btnEliminarDistrito)
                            .addComponent(btnSalirDistrito)
                            .addComponent(btnModificarDistrito))
                        .addGap(27, 27, 27))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(182, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(150, 150, 150))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rbSiDis)
                    .addComponent(rbNoDis))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistrarDistrito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModificarDistrito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarDistrito)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalirDistrito)
                        .addGap(49, 49, 49))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarDistritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarDistritoActionPerformed
       
        String nom_dis = txtNombreDistrito.getText();
        String amazonia;
        if(rbSiDis.isSelected() == true){
            amazonia="S";
        }else if(rbNoDis.isSelected() == true){
            amazonia="N";
        }else{
            amazonia="N";
        }
        try{
            Connection con = PRINCIPAL.getPRINCIPAL();
            PreparedStatement ps = con.prepareStatement("INSERT INTO DISTRITO (nom_dis,amazonia,activo) VALUES(?,?,?)");
            ps.setString(1, nom_dis);
            ps.setString(2, amazonia);
            ps.setInt(3, 1);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Distrito Registrado");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        limpiar();
        cargarTabla();
    }//GEN-LAST:event_btnRegistrarDistritoActionPerformed

    private void tblDistritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDistritoMouseClicked
        try{
            int fila = tblDistrito.getSelectedRow();
            int cod_dis = Integer.parseInt(tblDistrito.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            
            Connection con = PRINCIPAL.getPRINCIPAL();
            ps = con.prepareStatement("SELECT nom_dis,amazonia FROM DISTRITO WHERE cod_dis=?");
            ps.setInt(1, cod_dis);
            rs = ps.executeQuery();
            
            while(rs.next()){
                txtCodDistrito.setText(String.valueOf(cod_dis));
                txtNombreDistrito.setText(rs.getString("nom_dis"));
                if(rs.getString("amazonia").equals("S")){
                    rbSiDis.setSelected(true);
                } else if(rs.getString("amazonia").equals("N")){
                    rbNoDis.setSelected(true);
                }
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_tblDistritoMouseClicked

    private void btnModificarDistritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarDistritoActionPerformed
        int cod_dis =Integer.parseInt(txtCodDistrito.getText());
        String nom_dis = txtNombreDistrito.getText();
        String amazonia;
        if(rbSiDis.isSelected() == true){
            amazonia="S";
        }else if(rbNoDis.isSelected() == true){
            amazonia="N";
        }else{
            amazonia="N";
        }
        try{
            Connection con = PRINCIPAL.getPRINCIPAL();
            PreparedStatement ps = con.prepareStatement("UPDATE DISTRITO SET nom_dis=?,amazonia=? WHERE cod_dis=?");
            ps.setString(1, nom_dis);
            ps.setString(2, amazonia);
            ps.setInt(3, cod_dis);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Distrito Modificado");
            limpiar();
            cargarTabla();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
    }//GEN-LAST:event_btnModificarDistritoActionPerformed

    private void btnEliminarDistritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDistritoActionPerformed
        int cod_dis =Integer.parseInt(txtCodDistrito.getText());

        try{
            Connection con = PRINCIPAL.getPRINCIPAL();
            PreparedStatement ps = con.prepareStatement("UPDATE DISTRITO SET activo=0 WHERE cod_dis=?");
            ps.setInt(1,cod_dis);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DISTRITO ELIMINADO");
            limpiar();
            cargarTabla();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnEliminarDistritoActionPerformed
    private void limpiar(){
        txtNombreDistrito.setText("");
        btnGr.clearSelection();
    }
    
    private void cargarTabla(){
        DefaultTableModel modeloTabla = (DefaultTableModel) tblDistrito.getModel();
        modeloTabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        
        try{
            Connection con = PRINCIPAL.getPRINCIPAL();
            ps = con.prepareStatement("SELECT cod_dis,nom_dis,amazonia FROM DISTRITO WHERE activo=1");
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
            java.util.logging.Logger.getLogger(REGISTRO_DISTRITO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REGISTRO_DISTRITO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REGISTRO_DISTRITO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REGISTRO_DISTRITO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REGISTRO_DISTRITO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarDistrito;
    private javax.swing.JButton btnModificarDistrito;
    private javax.swing.JButton btnRegistrarDistrito;
    private javax.swing.JButton btnSalirDistrito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbNoDis;
    private javax.swing.JRadioButton rbSiDis;
    private javax.swing.JTable tblDistrito;
    private javax.swing.JTextField txtCodDistrito;
    private javax.swing.JTextField txtNombreDistrito;
    // End of variables declaration//GEN-END:variables
}
