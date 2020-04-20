
import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.lang.model.util.Elements;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Panth
 */
public class flight_avail extends javax.swing.JFrame {

    Connection conn = null;
    String origin;
    String dest;
    int date;
    String s_date;
    String ebclass;
//    String date;

    /**
     * Creates new form reg_info
     */
    public flight_avail() throws SQLException {
        initComponents();
    }

    public flight_avail(String from, String To, int fdate, String s_date, String ebclass) throws SQLException {
        this.origin = from;
        this.dest = To;
        this.ebclass = ebclass;
        this.date = fdate;
        this.s_date = s_date;
        initComponents();
        conn = DB_Connect.connect();
        System.out.println("flight_avail"+ebclass);
        showUser();
      //  System.out.println(origin+dest);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        flight_jTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Available Flights");

        flight_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "From", "To", "Flight No.", "Departure", "Arrival", "Aircraft", "Stops", "Fare", "Flight Index"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        flight_jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flight_jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(flight_jTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void flight_jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flight_jTableMouseClicked
        //int i = flight_jTable.getSelectedRow();
        TableModel model = flight_jTable.getModel();
        int selectedRowIndex = flight_jTable.getSelectedRow();
        String origin = model.getValueAt(selectedRowIndex, 0).toString();
        String dest = model.getValueAt(selectedRowIndex, 1).toString();
        String index = model.getValueAt(selectedRowIndex, 8).toString();
        if (ebclass.compareTo("Economy")==0) {
            try {
                show_flight sf1;
                sf1 = new show_flight(index, ebclass, s_date);
                sf1.setVisible(true);
                sf1.setLocationRelativeTo(null);
            } catch (SQLException ex) {
                Logger.getLogger(flight_avail.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {

                show_flight sf1;
                sf1 = new show_flight(index, ebclass, s_date);
                sf1.setVisible(true);
                sf1.setLocationRelativeTo(null);
            } catch (SQLException ex) {
                Logger.getLogger(flight_avail.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_flight_jTableMouseClicked
    public ArrayList<flight> flightLists() throws SQLException {
        ArrayList<flight> flightsList = new ArrayList<>(10);
        flight Flight;
        System.out.println(date);

        switch (date)
        {
            case 1: {
                System.out.println("INSIDE case 1");
                String SQLQuery = "SELECT a.origin, a.dest, a.flightno , a.dep, a.arr, a.aircraft, a.stops, a.index, b.efare, b.bfare\n" + "FROM public.flightdetails a,public.fare b where a.aircraft=b.aircraft and a.origin =? and a.dest =? and a.freq LIKE '%1%' ;";
                PreparedStatement pst = conn.prepareStatement(SQLQuery,ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                pst.setString(1, origin);
                pst.setString(2, dest);
                ResultSet rs = pst.executeQuery();
                while(rs.next()) {
                    Flight = new flight(rs.getString("origin"), rs.getString("dest"), rs.getString("flightno"), rs.getString("dep"), rs.getString("arr"), rs.getString("aircraft"), rs.getInt("stops"), rs.getInt("index"), rs.getInt("efare"), rs.getInt("bfare"));
                    flightsList.add(Flight);

                }
                break;
            }

            case 2:
            {System.out.println("INSIDE case 2");
                String SQLQuery = "SELECT a.origin, a.dest, a.flightno , a.dep, a.arr, a.aircraft, a.stops, a.index,b.efare,b.bfare\n" + "FROM public.flightdetails a,public.fare b where a.aircraft=b.aircraft and a.origin = ? and a.dest = ? and a.freq LIKE '%2%' ;";
                PreparedStatement pst = conn.prepareStatement(SQLQuery, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                pst.setString(1, origin);
                pst.setString(2, dest);
                // pst.setInt(3, date);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    Flight = new flight(rs.getString("origin"), rs.getString("dest"), rs.getString("flightno"), rs.getString("dep"), rs.getString("arr"), rs.getString("aircraft"), rs.getInt("stops"), rs.getInt("index"), rs.getInt("efare"), rs.getInt("bfare"));
                    flightsList.add(Flight);
                    System.out.println(Flight);

                }
                break;
            }
            case 3:
            {
                System.out.println("INSIDE case 3");
                String SQLQuery = "SELECT a.origin, a.dest, a.flightno , a.dep, a.arr, a.aircraft, a.stops, a.index,b.efare,b.bfare\n" + "FROM public.flightdetails a,public.fare b where a.aircraft=b.aircraft and a.origin = ? and a.dest = ? and a.freq LIKE '%3%' ;";
                PreparedStatement pst = conn.prepareStatement(SQLQuery, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                pst.setString(1, origin);
                pst.setString(2, dest);
                // pst.setInt(3, date);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    Flight = new flight(rs.getString("origin"), rs.getString("dest"), rs.getString("flightno"), rs.getString("dep"), rs.getString("arr"), rs.getString("aircraft"), rs.getInt("stops"), rs.getInt("index"), rs.getInt("efare"), rs.getInt("bfare"));
                    flightsList.add(Flight);
                    System.out.println(Flight);

                }
                break;
            }
            case 4:
            {
                System.out.println("INSIDE case 4");
                String SQLQuery = "SELECT a.origin, a.dest, a.flightno , a.dep, a.arr, a.aircraft, a.stops, a.index,b.efare,b.bfare\n" + "FROM public.flightdetails a,public.fare b where a.aircraft=b.aircraft and a.origin = ? and a.dest = ? and a.freq LIKE '%4%' ;";
                PreparedStatement pst = conn.prepareStatement(SQLQuery, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                pst.setString(1, origin);
                pst.setString(2, dest);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    Flight = new flight(rs.getString("origin"), rs.getString("dest"), rs.getString("flightno"), rs.getString("dep"), rs.getString("arr"), rs.getString("aircraft"), rs.getInt("stops"), rs.getInt("index"), rs.getInt("efare"), rs.getInt("bfare"));
                    flightsList.add(Flight);
                    System.out.println(Flight);

                }
                break;
            }
            case 5:
            {
                System.out.println("INSIDE case 5");
                String SQLQuery = "SELECT a.origin, a.dest, a.flightno , a.dep, a.arr, a.aircraft, a.stops, a.index,b.efare,b.bfare\n" + "FROM public.flightdetails a,public.fare b where a.aircraft=b.aircraft and a.origin = ? and a.dest = ? and a.freq LIKE '%5%' ;";
                PreparedStatement pst = conn.prepareStatement(SQLQuery, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                pst.setString(1, origin);
                pst.setString(2, dest);
                // pst.setInt(3, date);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    Flight = new flight(rs.getString("origin"), rs.getString("dest"), rs.getString("flightno"), rs.getString("dep"), rs.getString("arr"), rs.getString("aircraft"), rs.getInt("stops"), rs.getInt("index"), rs.getInt("efare"), rs.getInt("bfare"));
                    flightsList.add(Flight);
                    System.out.println(Flight);

                }
                break;
            }
            case 6:
            {
                System.out.println("INSIDE case 6");
                String SQLQuery = "SELECT a.origin, a.dest, a.flightno , a.dep, a.arr, a.aircraft, a.stops, a.index,b.efare,b.bfare\n" + "FROM public.flightdetails a,public.fare b where a.aircraft=b.aircraft and a.origin = ? and a.dest = ? and a.freq LIKE '%6%' ;";
                PreparedStatement pst = conn.prepareStatement(SQLQuery, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                pst.setString(1, origin);
                pst.setString(2, dest);
                // pst.setInt(3, date);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    Flight = new flight(rs.getString("origin"), rs.getString("dest"), rs.getString("flightno"), rs.getString("dep"), rs.getString("arr"), rs.getString("aircraft"), rs.getInt("stops"), rs.getInt("index"), rs.getInt("efare"), rs.getInt("bfare"));
                    flightsList.add(Flight);
                    System.out.println(Flight);

                }
                break;
            }

            case 7:
            {
                System.out.println("INSIDE case 7");
                String SQLQuery = "SELECT a.origin, a.dest, a.flightno , a.dep, a.arr, a.aircraft, a.stops, a.index,b.efare,b.bfare\n" + "FROM public.flightdetails a,public.fare b where a.aircraft=b.aircraft and a.origin = ? and a.dest = ? and a.freq LIKE '%7%' ;";
                PreparedStatement pst = conn.prepareStatement(SQLQuery, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                pst.setString(1, origin);
                pst.setString(2, dest);
                ResultSet rs = pst.executeQuery();

                while (rs.next()) {
                    Flight = new flight(rs.getString("origin"), rs.getString("dest"), rs.getString("flightno"), rs.getString("dep"), rs.getString("arr"), rs.getString("aircraft"), rs.getInt("stops"), rs.getInt("index"), rs.getInt("efare"), rs.getInt("bfare"));
                    flightsList.add(Flight);
                    System.out.println(Flight);
                }
                break;
            }
            default:
            {
                System.out.println("no luck");
            }
        }

        return flightsList;
    }

    public void showUser() throws SQLException {
        ArrayList<flight> listx = flightLists();
        System.out.println(listx.size());
        DefaultTableModel model = (DefaultTableModel) flight_jTable.getModel();
        Object row[] = new Object[9];
        for (int i = 0; i < listx.size(); i++) {
            row[0] = listx.get(i).getOrigin();
            row[1] = listx.get(i).getDest();
            row[2] = listx.get(i).getFlightno();
            row[3] = listx.get(i).getDep();
            row[4] = listx.get(i).getArr();
            row[5] = listx.get(i).getAircraft();
            row[6] = listx.get(i).getStops();
            row[8] = listx.get(i).getIndex();
//            System.out.println(" FAREEEE" + ebclass.compareTo("Economy"));
            if (ebclass.compareTo("Economy")==0)
            {
                row[7] = listx.get(i).getEfare();
            }else{
                row[7] = listx.get(i).getBfare();
            }

            model.addRow(row);

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
            java.util.logging.Logger.getLogger(flight_avail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(flight_avail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(flight_avail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(flight_avail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new flight_avail().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(flight_avail.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable flight_jTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
