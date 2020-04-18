
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
public class A319E extends javax.swing.JFrame {
    Connection conn = null;
    int seat_number;
    String flightno;
    String date;
    String ebclass;
    public A319E(final String flightno, final String date, final String ebclass)throws SQLException  {
        conn = DB_Connect.connect();
        this.flightno = flightno;
        this.date = date;
        this.ebclass = ebclass;
        System.out.println(flightno);
        System.out.println(date);
        System.out.println(ebclass);
        initComponents();
        final String SEATQuery = "SELECT * from A319\n" + "WHERE flightno = ? and date = ? and class = ?";
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
            if (rs.getInt("seat_number") == 9) {
                jToggleButton9.setBackground(Color.RED);
                jToggleButton9.setSelected(true);
            }
            if (rs.getInt("seat_number") == 10) {
                jToggleButton10.setBackground(Color.RED);
                jToggleButton10.setSelected(true);
            }
        }
    }
   public A319E() throws SQLException {
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
        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(266, 446));

        jToggleButton1.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("1");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton2.setText("2");
        jToggleButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton2MouseClicked(evt);
            }
        });
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton3.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton3.setText("3");
        jToggleButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton3MouseClicked(evt);
            }
        });
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jToggleButton4.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton4.setText("4");
        jToggleButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton4MouseClicked(evt);
            }
        });
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jToggleButton5.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton5.setText("5");
        jToggleButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton5MouseClicked(evt);
            }
        });
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        jToggleButton6.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton6.setText("6");
        jToggleButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton6MouseClicked(evt);
            }
        });
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });

        jToggleButton7.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton7.setText("7");
        jToggleButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton7MouseClicked(evt);
            }
        });
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });

        jToggleButton8.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton8.setText("8");
        jToggleButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton8MouseClicked(evt);
            }
        });
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });

        jToggleButton9.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton9.setText("9");
        jToggleButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton9MouseClicked(evt);
            }
        });
        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton9ActionPerformed(evt);
            }
        });

        jToggleButton10.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton10.setText("10");
        jToggleButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton10MouseClicked(evt);
            }
        });
        jToggleButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton10ActionPerformed(evt);
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
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(jToggleButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(97, 97, 97))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        // TODO add your handling code here:
        if(jToggleButton1.getBackground()== Color.GREEN){
            jToggleButton1.setBackground(Color.WHITE);
        }
        else
        {
            jToggleButton1.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_jToggleButton1MouseClicked

    private void jToggleButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton2MouseClicked
        // TODO add your handling code here:
        if(jToggleButton2.getBackground()== Color.GREEN){
            jToggleButton2.setBackground(Color.WHITE);
        }
        else
        {
            jToggleButton2.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_jToggleButton2MouseClicked

    private void jToggleButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton3MouseClicked
        // TODO add your handling code here:
        if(jToggleButton3.getBackground()== Color.GREEN){
            jToggleButton3.setBackground(Color.WHITE);
        }
        else
        {
            jToggleButton3.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_jToggleButton3MouseClicked

    private void jToggleButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton4MouseClicked
        // TODO add your handling code here:
        if(jToggleButton4.getBackground()== Color.GREEN){
            jToggleButton4.setBackground(Color.WHITE);
        }
        else
        {
            jToggleButton4.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_jToggleButton4MouseClicked

    private void jToggleButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton5MouseClicked
        // TODO add your handling code here:
        if(jToggleButton5.getBackground()== Color.GREEN){
            jToggleButton5.setBackground(Color.WHITE);
        }
        else
        {
            jToggleButton5.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_jToggleButton5MouseClicked

    private void jToggleButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton6MouseClicked
        // TODO add your handling code here:
        if(jToggleButton6.getBackground()== Color.GREEN){
            jToggleButton6.setBackground(Color.WHITE);
        }
        else
        {
            jToggleButton6.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_jToggleButton6MouseClicked

    private void jToggleButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton7MouseClicked
        // TODO add your handling code here:
        if(jToggleButton7.getBackground()== Color.GREEN){
            jToggleButton7.setBackground(Color.WHITE);
        }
        else
        {
            jToggleButton7.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_jToggleButton7MouseClicked

    private void jToggleButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton8MouseClicked
        // TODO add your handling code here:
        if(jToggleButton8.getBackground()== Color.GREEN){
            jToggleButton8.setBackground(Color.WHITE);
        }
        else
        {
            jToggleButton8.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_jToggleButton8MouseClicked

    private void jToggleButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton9MouseClicked
        // TODO add your handling code here:
        if(jToggleButton9.getBackground()== Color.GREEN){
            jToggleButton9.setBackground(Color.WHITE);
        }
        else
        {
            jToggleButton9.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_jToggleButton9MouseClicked

    private void jToggleButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton10MouseClicked
        // TODO add your handling code here:
        if(jToggleButton10.getBackground()== Color.GREEN){
            jToggleButton10.setBackground(Color.WHITE);
        }
        else
        {
            jToggleButton10.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_jToggleButton10MouseClicked

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
         try {

            if (jToggleButton1.getBackground() == Color.GREEN) {
                final String status = "T";
                final String SQLUpdateQuery = "INSERT into A319\n" + "values(?, ?, ?, ?, ?)";
                final PreparedStatement pstmt = conn.prepareStatement(SQLUpdateQuery);
                pstmt.setInt(1, seat_number);
                pstmt.setString(2, status);
                pstmt.setString(3, flightno);
                pstmt.setString(4, ebclass);
                pstmt.setString(5, date);
                pstmt.execute();
            } else if (jToggleButton2.getBackground() == Color.GREEN) {
                final String status = "T";
                final String SQLUpdateQuery = "INSERT into A319\n" + "values(?, ?, ?, ?, ?)";
                final PreparedStatement pstmt = conn.prepareStatement(SQLUpdateQuery);
                pstmt.setInt(1, seat_number);
                pstmt.setString(2, status);
                pstmt.setString(3, flightno);
                pstmt.setString(4, ebclass);
                pstmt.setString(5, date);
                pstmt.execute();
            } else if (jToggleButton3.getBackground() == Color.GREEN) {
                final String status = "T";
                final String SQLUpdateQuery = "INSERT into A319\n" + "values(?, ?, ?, ?, ?)";
                final PreparedStatement pstmt = conn.prepareStatement(SQLUpdateQuery);
                pstmt.setInt(1, seat_number);
                pstmt.setString(2, status);
                pstmt.setString(3, flightno);
                pstmt.setString(4, ebclass);
                pstmt.setString(5, date);
                pstmt.execute();
            } else if (jToggleButton4.getBackground() == Color.GREEN) {
                final String status = "T";
                final String SQLUpdateQuery = "INSERT into A319\n" + "values(?, ?, ?, ?, ?)";
                final PreparedStatement pstmt = conn.prepareStatement(SQLUpdateQuery);
                pstmt.setInt(1, seat_number);
                pstmt.setString(2, status);
                pstmt.setString(3, flightno);
                pstmt.setString(4, ebclass);
                pstmt.setString(5, date);
                pstmt.execute();
            } else if (jToggleButton5.getBackground() == Color.GREEN) {
                final String status = "T";
                final String SQLUpdateQuery = "INSERT into A319\n" + "values(?, ?, ?, ?, ?)";
                final PreparedStatement pstmt = conn.prepareStatement(SQLUpdateQuery);
                pstmt.setInt(1, seat_number);
                pstmt.setString(2, status);
                pstmt.setString(3, flightno);
                pstmt.setString(4, ebclass);
                pstmt.setString(5, date);
                pstmt.execute();
            } else if (jToggleButton6.getBackground() == Color.GREEN) {
                final String status = "T";
                final String SQLUpdateQuery = "INSERT into A319\n" + "values(?, ?, ?, ?, ?)";
                final PreparedStatement pstmt = conn.prepareStatement(SQLUpdateQuery);
                pstmt.setInt(1, seat_number);
                pstmt.setString(2, status);
                pstmt.setString(3, flightno);
                pstmt.setString(4, ebclass);
                pstmt.setString(5, date);
                pstmt.execute();
            } else if (jToggleButton7.getBackground() == Color.GREEN) {
                final String status = "T";
                final String SQLUpdateQuery = "INSERT into A319\n" + "values(?, ?, ?, ?, ?)";
                final PreparedStatement pstmt = conn.prepareStatement(SQLUpdateQuery);
                pstmt.setInt(1, seat_number);
                pstmt.setString(2, status);
                pstmt.setString(3, flightno);
                pstmt.setString(4, ebclass);
                pstmt.setString(5, date);
                pstmt.execute();
            } else if (jToggleButton8.getBackground() == Color.GREEN) {
                final String status = "T";
                final String SQLUpdateQuery = "INSERT into A319\n" + "values(?, ?, ?, ?, ?)";
                final PreparedStatement pstmt = conn.prepareStatement(SQLUpdateQuery);
                pstmt.setInt(1, seat_number);
                pstmt.setString(2, status);
                pstmt.setString(3, flightno);
                pstmt.setString(4, ebclass);
                pstmt.setString(5, date);
                pstmt.execute();
            }  else if (jToggleButton9.getBackground() == Color.GREEN) {
                final String status = "T";
                final String SQLUpdateQuery = "INSERT into A319\n" + "values(?, ?, ?, ?, ?)";
                final PreparedStatement pstmt = conn.prepareStatement(SQLUpdateQuery);
                pstmt.setInt(1, seat_number);
                pstmt.setString(2, status);
                pstmt.setString(3, flightno);
                pstmt.setString(4, ebclass);
                pstmt.setString(5, date);
                pstmt.execute();
            } else {
                final String status = "T";
                final String SQLUpdateQuery = "INSERT into A319\n" + "values(?, ?, ?, ?, ?)";
                final PreparedStatement pstmt = conn.prepareStatement(SQLUpdateQuery);
                pstmt.setInt(1, seat_number);
                pstmt.setString(2, status);
                pstmt.setString(3, flightno);
                pstmt.setString(4, ebclass);
                pstmt.setString(5, date);
                pstmt.execute();
            }
        } catch (final Exception ex) {
            Logger.getLogger(A319E.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_SubmitActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        if (jToggleButton1.isSelected()) {
            seat_number = 1;
        }else{
            seat_number = 0;
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
        }else{
            seat_number = 0;
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
        }else{
            seat_number = 0;
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
        }else{
            seat_number = 0;
        }

        if (jToggleButton4.getBackground() == Color.GREEN) {
            jToggleButton4.setBackground(Color.WHITE);
        } else {
            jToggleButton4.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        // TODO add your handling code here:
        if (jToggleButton5.isSelected()) {
            seat_number = 1;
        }else{
            seat_number = 0;
        }

        if (jToggleButton5.getBackground() == Color.GREEN) {
            jToggleButton5.setBackground(Color.WHITE);
        } else {
            jToggleButton5.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        // TODO add your handling code here:
        if (jToggleButton6.isSelected()) {
            seat_number = 1;
        }else{
            seat_number = 0;
        }

        if (jToggleButton6.getBackground() == Color.GREEN) {
            jToggleButton6.setBackground(Color.WHITE);
        } else {
            jToggleButton6.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        // TODO add your handling code here:
        if (jToggleButton7.isSelected()) {
            seat_number = 1;
        }else{
            seat_number = 0;
        }

        if (jToggleButton7.getBackground() == Color.GREEN) {
            jToggleButton7.setBackground(Color.WHITE);
        } else {
            jToggleButton7.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
        // TODO add your handling code here:
        if (jToggleButton8.isSelected()) {
            seat_number = 1;
        }else{
            seat_number = 0;
        }

        if (jToggleButton8.getBackground() == Color.GREEN) {
            jToggleButton8.setBackground(Color.WHITE);
        } else {
            jToggleButton8.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_jToggleButton8ActionPerformed

    private void jToggleButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton9ActionPerformed
        // TODO add your handling code here:
        if (jToggleButton9.isSelected()) {
            seat_number = 1;
        }else{
            seat_number = 0;
        }

        if (jToggleButton9.getBackground() == Color.GREEN) {
            jToggleButton9.setBackground(Color.WHITE);
        } else {
            jToggleButton9.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_jToggleButton9ActionPerformed

    private void jToggleButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton10ActionPerformed
        // TODO add your handling code here:
        if (jToggleButton10.isSelected()) {
            seat_number = 1;
        }else{
            seat_number = 0;
        }

        if (jToggleButton10.getBackground() == Color.GREEN) {
            jToggleButton10.setBackground(Color.WHITE);
        } else {
            jToggleButton10.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_jToggleButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(A319E.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A319E.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A319E.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A319E.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new A319E().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(A319E.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    // End of variables declaration//GEN-END:variables
}
