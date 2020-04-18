
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.event.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NIsarg Thoriya
 */
public class A320B extends javax.swing.JFrame {

    Connection conn = null;
    int seat_number;
    String flightno;
    String date;
    String ebclass;
    String refno;
    String name;
    public A320B(final String flightno, final String date, final String ebclass, String bcode, String name)throws SQLException  {
        conn = DB_Connect.connect();
        this.refno = bcode;
        this.name = name;
        this.flightno = flightno;
        this.date = date;
        this.ebclass = ebclass;
        System.out.println(flightno);
        System.out.println(date);
        System.out.println(ebclass);
        initComponents();
         final String SEATQuery = "SELECT * from A320B\n" + "WHERE flightno = ? and date = ? and class = ?";
        PreparedStatement seatps= conn.prepareStatement(SEATQuery,ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        seatps.setString(1, flightno);
        seatps.setString(2, date);
        seatps.setString(3, ebclass);
        
        final ResultSet rs = seatps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt("seat_number"));
            if (rs.getInt("seat_number") == 1) {
                jToggleButton1.setBackground(Color.RED);
                jToggleButton1.setSelected(true);
            }
            if (rs.getInt("seat_number") == 2) {
                jToggleButton2.setBackground(Color.RED);
                jToggleButton2.setSelected(true);
            }
            if (rs.getInt("seat_number") == 3) {
                jToggleButton3.setBackground(Color.RED);
                jToggleButton3.setSelected(true);
            }
            if (rs.getInt("seat_number") == 4) {
                jToggleButton4.setBackground(Color.RED);
                jToggleButton4.setSelected(true);
            }
            
        }
    }
        
    public A320B() throws SQLException {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToggleButton1.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("1");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton2.setText("2");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton3.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton3.setText("3");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jToggleButton4.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton4.setText("4");
        jToggleButton4.setToolTipText("");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 306, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
         try {                                       
             // TODO add your handling code here:
             try {
                 
                 if (jToggleButton1.getBackground() == Color.GREEN) {
                     final String status = "T";
                     final String SQLUpdateQuery = "INSERT into A320\n" + "values(?, ?, ?, ?, ?)";
                     final PreparedStatement pstmt = conn.prepareStatement(SQLUpdateQuery);
                     pstmt.setInt(1, seat_number);
                     pstmt.setString(2, status);
                     pstmt.setString(3, flightno);
                     pstmt.setString(4, ebclass);
                     pstmt.setString(5, date);
                     pstmt.execute();
                 } else if (jToggleButton2.getBackground() == Color.GREEN) {
                     final String status = "T";
                     final String SQLUpdateQuery = "INSERT into A320\n" + "values(?, ?, ?, ?, ?)";
                     final PreparedStatement pstmt = conn.prepareStatement(SQLUpdateQuery);
                     pstmt.setInt(1, seat_number);
                     pstmt.setString(2, status);
                     pstmt.setString(3, flightno);
                     pstmt.setString(4, ebclass);
                     pstmt.setString(5, date);
                     pstmt.execute();
                 } else if (jToggleButton3.getBackground() == Color.GREEN) {
                     final String status = "T";
                     final String SQLUpdateQuery = "INSERT into A320\n" + "values(?, ?, ?, ?, ?)";
                     final PreparedStatement pstmt = conn.prepareStatement(SQLUpdateQuery);
                     pstmt.setInt(1, seat_number);
                     pstmt.setString(2, status);
                     pstmt.setString(3, flightno);
                     pstmt.setString(4, ebclass);
                     pstmt.setString(5, date);
                     pstmt.execute();
                 }else {
                     final String status = "T";
                     final String SQLUpdateQuery = "INSERT into A320\n" + "values(?, ?, ?, ?, ?)";
                     final PreparedStatement pstmt = conn.prepareStatement(SQLUpdateQuery);
                     pstmt.setInt(1, seat_number);
                     pstmt.setString(2, status);
                     pstmt.setString(3, flightno);
                     pstmt.setString(4, ebclass);
                     pstmt.setString(5, date);
                     pstmt.execute();
                 }
             } catch (final Exception ex) {
                 Logger.getLogger(A320B.class.getName()).log(Level.SEVERE, null, ex);
                 
             }
             
             String SQLQuery = "Update reservation\n"
                     + "set seatno = ?\n"
                     + "where bcode = ? and name = ?";
             PreparedStatement pst = conn.prepareStatement(SQLQuery);
             pst.setString(1, String.valueOf(seat_number));
             pst.setString(2, refno);
             pst.setString(3, name);
             pst.executeUpdate();
             
             dispose();
             JOptionPane.showMessageDialog(null, "Your Ticket has been booked Succesfully");
         } catch (SQLException ex) {
            Logger.getLogger(A320B.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_SubmitActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        if (jToggleButton1.isSelected()) {
            seat_number = 1;
        }

        if (jToggleButton1.getBackground() == Color.GREEN) {
            jToggleButton1.setBackground(Color.WHITE);
        } else {
            jToggleButton1.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        if (jToggleButton2.isSelected()) {
            seat_number = 1;
        }

        if (jToggleButton2.getBackground() == Color.GREEN) {
            jToggleButton2.setBackground(Color.WHITE);
        } else {
            jToggleButton2.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        // TODO add your handling code here:
        if (jToggleButton3.isSelected()) {
            seat_number = 1;
        }

        if (jToggleButton3.getBackground() == Color.GREEN) {
            jToggleButton3.setBackground(Color.WHITE);
        } else {
            jToggleButton3.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
        if (jToggleButton4.isSelected()) {
            seat_number = 1;
        }
        if (jToggleButton4.getBackground() == Color.GREEN) {
            jToggleButton4.setBackground(Color.WHITE);
        } else {
            jToggleButton4.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_jToggleButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(A320B.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A320B.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A320B.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A320B.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new A320B().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(A320B.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    // End of variables declaration//GEN-END:variables
}
