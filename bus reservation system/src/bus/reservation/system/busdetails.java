/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bus.reservation.system;

import com.sun.jdi.connect.spi.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Addbus;
import java.sql.SQLException;
import dao.addbusDao;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;


import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/**
 *
 * @author rifaa
 */
public class busdetails extends javax.swing.JFrame {

    /**
     * Creates new form busdetails
     */
    public busdetails() {
        initComponents();
        btnadd.setEnabled(false);
        
    }
    
    public void validateFields(){
        String no = bno.getText();
        String name= bname.getText();
        String source=bsource.getText();
         String des=bdes.getText();
         String price=bpr.getText();
         if(!no.equals("")&&!name.equals("")&&!source.equals("")&&!des.equals("")&&!price.equals(""))
             btnadd.setEnabled(true);
         else
             btnadd.setEnabled(false);
        
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
        bno = new javax.swing.JTextField();
        bname = new javax.swing.JTextField();
        bsource = new javax.swing.JTextField();
        bdes = new javax.swing.JTextField();
        bpr = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnadd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        backhome = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setText("Bus No");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 147, 63, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setText("Bus Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 187, 86, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setText("Source");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 227, 62, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setText("Destination");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 267, 92, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setText("Price");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 307, 49, -1));

        bno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnoActionPerformed(evt);
            }
        });
        bno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bnoKeyReleased(evt);
            }
        });
        getContentPane().add(bno, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 146, 164, -1));

        bname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnameActionPerformed(evt);
            }
        });
        bname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bnameKeyReleased(evt);
            }
        });
        getContentPane().add(bname, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 186, 166, -1));

        bsource.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bsourceKeyReleased(evt);
            }
        });
        getContentPane().add(bsource, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 226, 166, -1));

        bdes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bdesKeyReleased(evt);
            }
        });
        getContentPane().add(bdes, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 266, 166, -1));

        bpr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bprKeyReleased(evt);
            }
        });
        getContentPane().add(bpr, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 306, 166, -1));

        jLabel6.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        jLabel6.setText("ADD BUS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 84, 206, -1));

        btnadd.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnadd.setText("ADD");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        getContentPane().add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 412, 64, -1));

        btnUpdate.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 412, -1, -1));

        btndelete.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 412, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bus No", "Bus Name", "Source", "Destination", "Price"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, -1, -1));

        backhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/popupicon/left-arrow.png"))); // NOI18N
        backhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backhomeActionPerformed(evt);
            }
        });
        getContentPane().add(backhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addbusbackg.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bnameActionPerformed

    private void bnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bnoActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
        Addbus addbus = new Addbus();
        addbus.setBus_No(bno.getText());
        addbus.setBus_name(bname.getText());
        addbus.setSource(bsource.getText());
        addbus.setDestination(bdes.getText());
        addbus.setPrice(bpr.getText());
        addbusDao.save(addbus);
        setVisible(false);
        new busdetails().setVisible(true);
        
        
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        Addbus addbus =new Addbus();
        addbus.setBus_No(bno.getText());
        addbus.setBus_name(bname.getText());
        addbus.setSource(bsource.getText());
        addbus.setDestination(bdes.getText());
        addbus.setPrice(bpr.getText());
        addbusDao.update(addbus);
        setVisible(false);
        new busdetails().setVisible(true); 
       
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void bnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bnoKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_bnoKeyReleased

    private void bnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bnameKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_bnameKeyReleased

    private void bsourceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bsourceKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_bsourceKeyReleased

    private void bdesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bdesKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_bdesKeyReleased

    private void bprKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bprKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_bprKeyReleased

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        DefaultTableModel dtm= (DefaultTableModel) jTable1.getModel();
        ArrayList<Addbus> list = addbusDao.getAllRecords();
        Iterator<Addbus> itr = list.iterator();
        while(itr.hasNext()){
        Addbus addbusObj = itr.next();
        dtm.addRow(new Object[]{addbusObj.getBus_No(),addbusObj.getBus_name(),addbusObj.getSource(),addbusObj.getDestination(),addbusObj.getPrice()});
        
        }
    }//GEN-LAST:event_formComponentShown

    private void backhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backhomeActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        new Home().setVisible(true);
        
    }//GEN-LAST:event_backhomeActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        String Bus_No =model.getValueAt(index, 0).toString();
        bno.setText(Bus_No);
         String Bus_name =model.getValueAt(index, 1).toString();
        bname.setText(Bus_name);
         String Source =model.getValueAt(index, 2).toString();
        bsource.setText(Source);
         String Destination =model.getValueAt(index, 3).toString();
        bdes.setText(Destination);
         String Price =model.getValueAt(index, 4).toString();
        bpr.setText(Price);
        btnUpdate.setEnabled(true);
        btndelete.setEnabled(true);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        String Bus_No = bno.getText();
        int a = JOptionPane.showConfirmDialog(null, "Do yo want to delete this Bus","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            addbusDao.delete(Bus_No);
            setVisible(false);
            new busdetails().setVisible(true);
            
        }
    }//GEN-LAST:event_btndeleteActionPerformed

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
            java.util.logging.Logger.getLogger(busdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(busdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(busdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(busdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new busdetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backhome;
    private javax.swing.JTextField bdes;
    private javax.swing.JTextField bname;
    private javax.swing.JTextField bno;
    private javax.swing.JTextField bpr;
    private javax.swing.JTextField bsource;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}