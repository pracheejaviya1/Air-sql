
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author NIsarg Thoriya
 */
public class B777_ERB extends javax.swing.JFrame {

    /**
     * Creates new form B777_ERB
     */
    Connection conn = null;
    int seat_number;
    String flightno;
    String date;
    String ebclass;
    String refno;
    String name;
    /**
     * Creates new form B777_ER
     */
    public B777_ERB(final String flightno, final String date, final String ebclass, String bcode, String name) throws SQLException {

        conn = DB_Connect.connect();
        this.flightno = flightno;
        this.name = name;
        this.refno = bcode;
        this.date = date;
        this.ebclass = ebclass;
        System.out.println(flightno);
        System.out.println(date);
        System.out.println(ebclass);
        initComponents();
        final String SEATQuery = "SELECT * from B777_ER\n" + "WHERE flightno = ? and date = ? and class = ?";
        PreparedStatement seatps = conn.prepareStatement(SEATQuery, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
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
            if (rs.getInt("seat_number") == 5) {
                jToggleButton5.setBackground(Color.RED);
                jToggleButton5.setSelected(true);
            }
            if (rs.getInt("seat_number") == 6) {
                jToggleButton6.setBackground(Color.RED);
                jToggleButton6.setSelected(true);
            }
            if (rs.getInt("seat_number") == 7) {
                jToggleButton7.setBackground(Color.RED);
                jToggleButton7.setSelected(true);
            }
            if (rs.getInt("seat_number") == 8) {
                jToggleButton8.setBackground(Color.RED);
                jToggleButton8.setSelected(true);
            }
        }
    }

    public B777_ERB() {
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
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        submit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToggleButton1.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("1");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });

        jToggleButton2.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton2.setText("2");
        jToggleButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton2MouseClicked(evt);
            }
        });

        jToggleButton3.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton3.setText("3");
        jToggleButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton3MouseClicked(evt);
            }
        });

        jToggleButton4.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton4.setText("4");
        jToggleButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton4MouseClicked(evt);
            }
        });

        jToggleButton5.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton5.setText("5");
        jToggleButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton5MouseClicked(evt);
            }
        });

        jToggleButton6.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton6.setText("6");
        jToggleButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton6MouseClicked(evt);
            }
        });

        jToggleButton7.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton7.setText("7");
        jToggleButton7.setToolTipText("");
        jToggleButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton7MouseClicked(evt);
            }
        });

        jToggleButton8.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton8.setText("8");
        jToggleButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(submit)
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(445, Short.MAX_VALUE)
                .addComponent(submit)
                .addGap(21, 21, 21))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        // TODO add your handling code here:
        if (jToggleButton1.isSelected()) {
            seat_number = 1;
        } 
        if (jToggleButton1.getBackground() == Color.GREEN) {
            jToggleButton1.setBackground(Color.WHITE);
        } else {
            jToggleButton1.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_jToggleButton1MouseClicked

    private void jToggleButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton2MouseClicked
        // TODO add your handling code here:
        if (jToggleButton2.isSelected()) {
            seat_number = 1;
        }
        if (jToggleButton2.getBackground() == Color.GREEN) {
            jToggleButton2.setBackground(Color.WHITE);
        } else {
            jToggleButton2.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_jToggleButton2MouseClicked

    private void jToggleButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton3MouseClicked
        // TODO add your handling code here:
        if (jToggleButton3.isSelected()) {
            seat_number = 1;
        } 
        if (jToggleButton3.getBackground() == Color.GREEN) {
            jToggleButton3.setBackground(Color.WHITE);
        } else {
            jToggleButton3.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_jToggleButton3MouseClicked

    private void jToggleButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton4MouseClicked
        // TODO add your handling code here:
        if (jToggleButton4.isSelected()) {
            seat_number = 1;
        }
        if (jToggleButton4.getBackground() == Color.GREEN) {
            jToggleButton4.setBackground(Color.WHITE);
        } else {
            jToggleButton4.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_jToggleButton4MouseClicked

    private void jToggleButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton5MouseClicked
        // TODO add your handling code here:
        if (jToggleButton5.isSelected()) {
            seat_number = 1;
        }
        if (jToggleButton5.getBackground() == Color.GREEN) {
            jToggleButton5.setBackground(Color.WHITE);
        } else {
            jToggleButton5.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_jToggleButton5MouseClicked

    private void jToggleButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton6MouseClicked
        // TODO add your handling code here:
        if (jToggleButton6.isSelected()) {
            seat_number = 1;
        } 
        if (jToggleButton6.getBackground() == Color.GREEN) {
            jToggleButton6.setBackground(Color.WHITE);
        } else {
            jToggleButton6.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_jToggleButton6MouseClicked

    private void jToggleButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton7MouseClicked
        // TODO add your handling code here:
        if (jToggleButton7.isSelected()) {
            seat_number = 1;
        } 
        if (jToggleButton7.getBackground() == Color.GREEN) {
            jToggleButton7.setBackground(Color.WHITE);
        } else {
            jToggleButton7.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_jToggleButton7MouseClicked

    private void jToggleButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton8MouseClicked
        // TODO add your handling code here:
        if (jToggleButton8.isSelected()) {
            seat_number = 1;
        }
        if (jToggleButton8.getBackground() == Color.GREEN) {
            jToggleButton8.setBackground(Color.WHITE);
        } else {
            jToggleButton8.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_jToggleButton8MouseClicked

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        try {                                       
            // TODO add your handling code here:
            try {
                
                if (jToggleButton1.getBackground() == Color.GREEN) {
                    final String status = "T";
                    final String SQLUpdateQuery = "INSERT into B777_ER\n" + "values(?, ?, ?, ?, ?)";
                    final PreparedStatement pstmt = conn.prepareStatement(SQLUpdateQuery);
                    pstmt.setInt(1, seat_number);
                    pstmt.setString(2, status);
                    pstmt.setString(3, flightno);
                    pstmt.setString(4, ebclass);
                    pstmt.setString(5, date);
                    pstmt.execute();
                } else if (jToggleButton2.getBackground() == Color.GREEN) {
                    final String status = "T";
                    final String SQLUpdateQuery = "INSERT into B777_ER\n" + "values(?, ?, ?, ?, ?)";
                    final PreparedStatement pstmt = conn.prepareStatement(SQLUpdateQuery);
                    pstmt.setInt(1, seat_number);
                    pstmt.setString(2, status);
                    pstmt.setString(3, flightno);
                    pstmt.setString(4, ebclass);
                    pstmt.setString(5, date);
                    pstmt.execute();
                } else if (jToggleButton3.getBackground() == Color.GREEN) {
                    final String status = "T";
                    final String SQLUpdateQuery = "INSERT into B777_ER\n" + "values(?, ?, ?, ?, ?)";
                    final PreparedStatement pstmt = conn.prepareStatement(SQLUpdateQuery);
                    pstmt.setInt(1, seat_number);
                    pstmt.setString(2, status);
                    pstmt.setString(3, flightno);
                    pstmt.setString(4, ebclass);
                    pstmt.setString(5, date);
                    pstmt.execute();
                    
                }else if (jToggleButton4.getBackground() == Color.GREEN) {
                    final String status = "T";
                    final String SQLUpdateQuery = "INSERT into B777_ER\n" + "values(?, ?, ?, ?, ?)";
                    final PreparedStatement pstmt = conn.prepareStatement(SQLUpdateQuery);
                    pstmt.setInt(1, seat_number);
                    pstmt.setString(2, status);
                    pstmt.setString(3, flightno);
                    pstmt.setString(4, ebclass);
                    pstmt.setString(5, date);
                    pstmt.execute();
                }else if (jToggleButton5.getBackground() == Color.GREEN) {
                    final String status = "T";
                    final String SQLUpdateQuery = "INSERT into B777_ER\n" + "values(?, ?, ?, ?, ?)";
                    final PreparedStatement pstmt = conn.prepareStatement(SQLUpdateQuery);
                    pstmt.setInt(1, seat_number);
                    pstmt.setString(2, status);
                    pstmt.setString(3, flightno);
                    pstmt.setString(4, ebclass);
                    pstmt.setString(5, date);
                    pstmt.execute();
                }else if (jToggleButton6.getBackground() == Color.GREEN) {
                    final String status = "T";
                    final String SQLUpdateQuery = "INSERT into B777_ER\n" + "values(?, ?, ?, ?, ?)";
                    final PreparedStatement pstmt = conn.prepareStatement(SQLUpdateQuery);
                    pstmt.setInt(1, seat_number);
                    pstmt.setString(2, status);
                    pstmt.setString(3, flightno);
                    pstmt.setString(4, ebclass);
                    pstmt.setString(5, date);
                    pstmt.execute();
                }else if (jToggleButton7.getBackground() == Color.GREEN) {
                    final String status = "T";
                    final String SQLUpdateQuery = "INSERT into B777_ER\n" + "values(?, ?, ?, ?, ?)";
                    final PreparedStatement pstmt = conn.prepareStatement(SQLUpdateQuery);
                    pstmt.setInt(1, seat_number);
                    pstmt.setString(2, status);
                    pstmt.setString(3, flightno);
                    pstmt.setString(4, ebclass);
                    pstmt.setString(5, date);
                    pstmt.execute();
                } else if (jToggleButton8.getBackground() == Color.GREEN) {
                    final String status = "T";
                    final String SQLUpdateQuery = "INSERT into B777_ER\n" + "values(?, ?, ?, ?, ?)";
                    final PreparedStatement pstmt = conn.prepareStatement(SQLUpdateQuery);
                    pstmt.setInt(1, seat_number);
                    pstmt.setString(2, status);
                    pstmt.setString(3, flightno);
                    pstmt.setString(4, ebclass);
                    pstmt.setString(5, date);
                    pstmt.execute();
                }
            } catch (final Exception ex) {
                Logger.getLogger(B777_ERB.class.getName()).log(Level.SEVERE, null, ex);
                
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
            Logger.getLogger(B777_ERB.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_submitActionPerformed

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
            java.util.logging.Logger.getLogger(B777_ERB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(B777_ERB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(B777_ERB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(B777_ERB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new B777_ERB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
