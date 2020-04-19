
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import b787b

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Panth
 */
public class passng_details extends javax.swing.JFrame {

    /**
     * Creates new form passng_details
     */
    String refno;
    String username;
    int logon;
    String name;
    int age;
    String gender;
    String seatno;
    String origin;
    String dest;
    String flightno;
    String date;
    String dep;
    String arr;
    String aircraft;
    String ebclass;
    String s_index;
    String fare;
    int i_index;
    int i_fare;
    Connection conn = null;

    public passng_details() {
        initComponents();
    }

    public passng_details(String index, String refno, String ebclass, String s_date) throws SQLException {

        seatno = "10-A";
        initComponents();
        conn = DB_Connect.connect();
        this.s_index = index;
        this.date = s_date;
        this.refno = refno;
        this.ebclass = ebclass;
        i_index = Integer.parseInt(index);
        try {
            String SQLQuery1 = "SELECT username FROM userdetails where logon = ?";
            PreparedStatement pst1 = conn.prepareStatement(SQLQuery1);
            pst1.setInt(1, 1);
            ResultSet rs1 = pst1.executeQuery();
            while (rs1.next()) {
                username = rs1.getString("username");
            }
            String SQLQuery = "SELECT a.origin, a.dest, a.flightno, a.dep, a.arr, a.aircraft, a.index, b.efare, b.bfare\n" + "FROM public.flightdetails a,public.fare b where a.index = ?;";
            PreparedStatement pst = conn.prepareStatement(SQLQuery);
            pst.setInt(1, i_index);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                origin = rs.getString("origin");
                dest = rs.getString("dest");
                flightno = rs.getString("flightno");
                dep = rs.getString("dep");
                arr = rs.getString("arr");
                aircraft = rs.getString("aircraft");
                if ("Economy".equals(ebclass)) {
                    fare = rs.getString("efare");
                } else {
                    fare = rs.getString("bfare");
                }
                i_fare = Integer.parseInt(fare);
                i_fare = i_fare / 2;
            }

        } catch (SQLException ex) {
            Logger.getLogger(show_flight.class.getName()).log(Level.SEVERE, null, ex);
        }
        jLabel4.setText(refno);

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
        pass_fname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pass_age = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pass_gender = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Full Name :");

        jLabel2.setText("Age :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setText("Booking Reference No. :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel5.setText("Gender :");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        pass_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pass_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass_age, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jButton1)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pass_fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pass_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pass_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jButton1)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        try {
            if ("B787".equals(aircraft) && "Economy".equals(ebclass)) {
                System.out.println("B787");
                B787E model_m;
                model_m = new B787E(flightno, date, ebclass, refno, pass_fname.getText());
                model_m.setVisible(true);
                model_m.setLocationRelativeTo(null);
                
            }else if ("B787".equals(aircraft) && "Business".equals(ebclass)) {
                System.out.println("B787");
                B787B model_m;
                model_m = new B787B(flightno, date, ebclass, refno, pass_fname.getText());
                model_m.setVisible(true);
                model_m.setLocationRelativeTo(null);
            }else if ("B777-ER".equals(aircraft) && "Economy".equals(ebclass)) {
                System.out.println("B777-ER");
                B777_ERE model_m;
                model_m = new B777_ERE(flightno, date, ebclass, refno, pass_fname.getText());
                model_m.setVisible(true);
                model_m.setLocationRelativeTo(null);
            }else if ("B777-ER".equals(aircraft) && "Business".equals(ebclass)) {
                System.out.println("B777-ER");
                B777_ERB model_m;
                model_m = new B777_ERB(flightno, date, ebclass, refno, pass_fname.getText());
                model_m.setVisible(true);
                model_m.setLocationRelativeTo(null);
            }else if ("A-319".equals(aircraft) && "Business".equals(ebclass)) {
                System.out.println("A319");
                A319B model_m;
                model_m = new A319B(flightno, date, ebclass, refno, pass_fname.getText());
                model_m.setVisible(true);
                model_m.setLocationRelativeTo(null);
            }else if ("A-319".equals(aircraft) && "Economy".equals(ebclass)) {
                System.out.println("A319");
                A319E model_m;
                model_m = new A319E(flightno, date, ebclass, refno, pass_fname.getText());
                model_m.setVisible(true);
                model_m.setLocationRelativeTo(null);
            }
            else if ("A-320".equals(aircraft) && "Business".equals(ebclass)) {
                System.out.println("A320");
                B787B model_m;
                model_m = new B787B(flightno, date, ebclass, refno, pass_fname.getText());
                model_m.setVisible(true);
                model_m.setLocationRelativeTo(null);
            }
            else if ("A-320".equals(aircraft) && "Economy".equals(ebclass)) {
                System.out.println("A320");
                A320E model_m;
                model_m = new A320E(flightno, date, ebclass, refno, pass_fname.getText());
                model_m.setVisible(true);
                model_m.setLocationRelativeTo(null);
            }
        } catch (SQLException ex) {
            Logger.getLogger(passng_details.class.getName()).log(Level.SEVERE, null, ex);
        }

        dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(passng_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(passng_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(passng_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(passng_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new passng_details().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField pass_age;
    private javax.swing.JTextField pass_fname;
    private javax.swing.JComboBox<String> pass_gender;
    // End of variables declaration//GEN-END:variables
}
