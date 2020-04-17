
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Panth
 */
public class Bookings extends javax.swing.JFrame {

    /**
     * Creates new form Bookings
     */
  Connection conn = null;
    public Bookings() {
        initComponents();
        jDateChooser1.setMinSelectableDate(new Date());
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
        from_jComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        to_jComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        passng_jTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ebclass_jComboBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("From :");

        from_jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abu Dhabi", "AgartalaAgatti", "Agra", "Ahmedabad", "Aizawl", "Allahabad", "Amritsar", "Aurangabad", "Bagdogra", "Bahrain", "Bangkok", "Belgaum", "Bengaluru", "Bhatinda", "Bhavnagar", "Bhopal", "Bhubaneswar", "Bhuj", "Bikaner", "Birmingham", "Chandigarh", "Chennai", "Chicago", "Coimbatore", "Colombo", "Copenhagen", "Dammam", "Dehra Dun", "Delhi", "Dhaka", "Dharamshala", "Dimapur", "DIU", "Doha", "Dubai", "Durgapur", "Frankfurt", "Gaya", "Goa", "Gorakhpur", "Guwahati", "Gwalior", "Hong Kong", "Hubli", "Hyderabad", "Imphal", "Indore", "Jabalpur", "Jaffna", "Jaipur", "Jammu", "Jamnagar", "Jeddah", "Jharsuguda", "Jodhpur", "Kabul", "Gulbarga", "Kandla ", "Kathmandu", "Khajuraho", "Kochi", "Kolhapur", "Kolkata", "Kozhikode", "Kullu", "Kuwait", "Leh", "Lilabari", "London", "Lucknow", "Ludhiana", "Madrid", "Madurai", "Male", "Mangalore", "Melbourne", "Milan", "Mumbai", "Muscat", "Mysore", "Nagpur", "Nairobi", "Nanded", "Nasik", "New York", "Newark", "Pantnagar", "Paris", "Pasighat", "Pathankot", "Patna", "Port Blair", "Pune", "Raipur", "Rajkot", "Ranchi", "Riyadh", "Rome", "San Francisco", "Seoul", "Shanghai", "Sharjah", "Shirdi", "Silchar", "Shimla", "Singapore", "Srinagar", "Srckholm", "Surat", "Sydney", "Tel Aviv", "Tezpur", "Thiruvananthapuram", "Tiruchirapalli", "Tirupati", "Tokyo", "Toronto", "Udaipur", "Vadodara", "Varanasi", "Vienna", "Vijayawada", "Visakhapatnam", "Washington", "Yangon", " ", " ", " ", " " }));

        jLabel2.setText("To :");

        to_jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abu Dhabi", "AgartalaAgatti", "Agra", "Ahmedabad", "Aizawl", "Allahabad", "Amritsar", "Aurangabad", "Bagdogra", "Bahrain", "Bangkok", "Belgaum", "Bengaluru", "Bhatinda", "Bhavnagar", "Bhopal", "Bhubaneswar", "Bhuj", "Bikaner", "Birmingham", "Chandigarh", "Chennai", "Chicago", "Coimbatore", "Colombo", "Copenhagen", "Dammam", "Dehra Dun", "Delhi", "Dhaka", "Dharamshala", "Dimapur", "DIU", "Doha", "Dubai", "Durgapur", "Frankfurt", "Gaya", "Goa", "Gorakhpur", "Guwahati", "Gwalior", "Hong Kong", "Hubli", "Hyderabad", "Imphal", "Indore", "Jabalpur", "Jaffna", "Jaipur", "Jammu", "Jamnagar", "Jeddah", "Jharsuguda", "Jodhpur", "Kabul", "Gulbarga", "Kandla ", "Kathmandu", "Khajuraho", "Kochi", "Kolhapur", "Kolkata", "Kozhikode", "Kullu", "Kuwait", "Leh", "Lilabari", "London", "Lucknow", "Ludhiana", "Madrid", "Madurai", "Male", "Mangalore", "Melbourne", "Milan", "Mumbai", "Muscat", "Mysore", "Nagpur", "Nairobi", "Nanded", "Nasik", "New York", "Newark", "Pantnagar", "Paris", "Pasighat", "Pathankot", "Patna", "Port Blair", "Pune", "Raipur", "Rajkot", "Ranchi", "Riyadh", "Rome", "San Francisco", "Seoul", "Shanghai", "Sharjah", "Shirdi", "Silchar", "Shimla", "Singapore", "Srinagar", "Srckholm", "Surat", "Sydney", "Tel Aviv", "Tezpur", "Thiruvananthapuram", "Tiruchirapalli", "Tirupati", "Tokyo", "Toronto", "Udaipur", "Vadodara", "Varanasi", "Vienna", "Vijayawada", "Visakhapatnam", "Washington", "Yangon", " ", " ", " ", " " }));

        jLabel3.setText("Date :");

        jLabel4.setText("Passengers :");

        jLabel5.setText("Class :");

        ebclass_jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Economy", "Business" }));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ebclass_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(to_jComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(from_jComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(passng_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jButton1)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(from_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(to_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(passng_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ebclass_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String origin = from_jComboBox.getSelectedItem().toString();
        String dest = to_jComboBox.getSelectedItem().toString();
        flight_avail fd1;
        int fdate;
        //System.out.println(new Date());
        java.util.Date d = jDateChooser1.getDate();
        String date1=d.toString();
        String day=date1.substring(0, 2);
        String date = date1.substring(0, 10);
        if(day.compareTo("Mon")==0)
            fdate=1;
        else if(day.compareTo("Tue")==0)
            fdate=2;
        else if(day.compareTo("Wed")==0)
            fdate=3;
        else if(day.compareTo("Thu")==0)
            fdate=4;
        if(day.compareTo("Fri")==0)
           fdate=5;
        if(day.compareTo("Sat")==0)
            fdate=6;
        else
            fdate =7;

        String passng1 = passng_jTextField.getText();
        String ebclass;
        ebclass = ebclass_jComboBox.getSelectedItem().toString();
//        System.out.println(date);
        try {
            fd1 = new flight_avail(origin, dest, fdate, date, passng1, ebclass);
            fd1.setVisible(true);
            fd1.setLocationRelativeTo(null);
        } catch (SQLException ex) {
            Logger.getLogger(Bookings.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Bookings().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ebclass_jComboBox;
    private javax.swing.JComboBox<String> from_jComboBox;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField passng_jTextField;
    private javax.swing.JComboBox<String> to_jComboBox;
    // End of variables declaration//GEN-END:variables
}
