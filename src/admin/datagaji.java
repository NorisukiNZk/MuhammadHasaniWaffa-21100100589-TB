
package admin;


import java.sql.Connection;
import java.sql.DriverManager;
import koneksi.input;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author User
 */

public class datagaji extends javax.swing.JFrame {
DefaultTableModel tabelModel;
public String nip, nama, jekel, tempat, lahir, pendidikan, pangkat, jabatan, masa, gaji;
 
    public String getnip() {
        return nip;
    }
 
    public String getnama() {
        return nama;
    }
 
    public String getjekel() {
        return jekel;
    }
    
    public String gettempat() {
        return tempat;
    }
    public String getlahir() {
        return lahir;
    }
    public String getpendidikan() {
        return pendidikan;
    }
    public String getpangkat() {
        return pangkat;
    }
    
    public String getjabatan() {
        return jabatan;
    }
    public String getmasa() {
        return masa;
    }
    public String getgaji() {
        return gaji;
    }
    /**
     * Creates new form datagaji
     */
    public datagaji() {
        initComponents();
        tabelModel = new DefaultTableModel();
        tabeldata.setModel(tabelModel);
        
        tabelModel.addColumn("Nip");
        tabelModel.addColumn("Nama");
        tabelModel.addColumn("Jenis Kelamin");
        tabelModel.addColumn("Tempat");
        tabelModel.addColumn("Tanggal Lahir");
        tabelModel.addColumn("Pendidikan");
        tabelModel.addColumn("Pangkat/Gol");
        tabelModel.addColumn("Jabatan");
        tabelModel.addColumn("Masa Kerja");
        tabelModel.addColumn("Gaji");
        
        tampilTabel();
    
   
    }
    public void tampilTabel()
    {
        tabelModel.getDataVector().removeAllElements();
	tabelModel.fireTableDataChanged();
        try
        {
            Connection konek = input.getKoneksi();
            Statement state = konek.createStatement();
            String query = "SELECT * FROM gaji";
            
            ResultSet rs = state.executeQuery(query);
            
            while(rs.next())
            {
                Object obj[] = new Object[10];
                obj[0] = rs.getString(1);
                obj[1] = rs.getString(2);
                obj[2] = rs.getString(3);
                obj[3] = rs.getString(4);
                obj[4] = rs.getString(5);
                obj[5] = rs.getString(6);
                obj[6] = rs.getString(7);
                obj[7] = rs.getString(8);
                obj[8] = rs.getString(9);
                obj[9] = rs.getString(10);
                
                
                tabelModel.addRow(obj);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
    
    public void itemTerpilih(){
    report fDB = new report();
    fDB.fAB = this;
    txtnip.setText(nip);
    txtnama.setText(nama);
    txtjekel.setText(jekel);
    txttempat.setText(tempat);
    txtlahir.setText(lahir);
    txtpendidikan.setText(pendidikan);
    txtpangkat.setText(pangkat);
    txtjabatan.setText(jabatan);
    txtmasa.setText(masa);
    txtgaji.setText(gaji);
    
}
    public void refresh()
    {
        txtnip.setText("");
        txtnama.setText("");
        txtjekel.setText("");
        txttempat.setText("");
        txtlahir.setText("");
        txtpendidikan.setText("");
        txtpangkat.setText("");
        txtjabatan.setText("");
        txtmasa.setText("");
        txtgaji.setText("");
        txtnip.requestFocus();
        
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
        tabeldata = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtjekel = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txttempat = new javax.swing.JTextField();
        txtpendidikan = new javax.swing.JTextField();
        txtpangkat = new javax.swing.JTextField();
        txtjabatan = new javax.swing.JTextField();
        txtmasa = new javax.swing.JTextField();
        txtgaji = new javax.swing.JTextField();
        txtlahir = new javax.swing.JTextField();
        txtnip = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        tabeldata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabeldata);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jButton2.setText("bersihkan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(230, 370, 90, 40);

        jButton1.setText("keluar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(978, 455, 62, 28);

        jButton3.setText("laporan");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(130, 370, 90, 40);

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 130, 33, 16);

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Jenis Kelamin");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 160, 90, 16);

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tempat, Tgl Lahir");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 190, 100, 16);

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pendidikan");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 220, 80, 16);

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pangkat/Gol");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 250, 70, 16);

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Jabatan");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 280, 70, 16);

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Masa Kerja");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 310, 90, 16);

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Gaji");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 340, 21, 16);

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("NIP");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 100, 19, 16);
        getContentPane().add(txtjekel);
        txtjekel.setBounds(150, 150, 220, 28);

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });
        getContentPane().add(txtnama);
        txtnama.setBounds(150, 120, 220, 28);
        getContentPane().add(txttempat);
        txttempat.setBounds(150, 180, 120, 28);
        getContentPane().add(txtpendidikan);
        txtpendidikan.setBounds(150, 210, 220, 28);
        getContentPane().add(txtpangkat);
        txtpangkat.setBounds(150, 240, 220, 28);
        getContentPane().add(txtjabatan);
        txtjabatan.setBounds(150, 270, 220, 28);
        getContentPane().add(txtmasa);
        txtmasa.setBounds(150, 300, 220, 28);
        getContentPane().add(txtgaji);
        txtgaji.setBounds(150, 330, 220, 28);
        getContentPane().add(txtlahir);
        txtlahir.setBounds(270, 180, 130, 28);
        getContentPane().add(txtnip);
        txtnip.setBounds(150, 90, 220, 28);

        jButton4.setText("......");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(370, 90, 46, 28);

        jButton5.setText("keluar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(330, 370, 90, 40);

        jButton6.setText("cetak");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(20, 370, 100, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cetak.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-20, -20, 1040, 1010);

        setSize(new java.awt.Dimension(600, 444));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         try
        {
            Connection konek = input.getKoneksi();
            String query = "DELETE FROM gaji WHERE nip ";
            PreparedStatement prepare = konek.prepareStatement(query);
            
            prepare.executeUpdate();
            JOptionPane.showMessageDialog(null, "Siap digunakan kembali");
            prepare.close();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Data gagal dihapus");
            System.out.println(ex);
        }
        finally
        {
            tampilTabel();
            refresh();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 try{
           String file = "src/laporan/laporan_gaji2.jasper";
           Connection konek = input.getKoneksi();
           JasperPrint jp = JasperFillManager.fillReport(file, null, input.getKoneksi());
           JasperViewer jv = new JasperViewer(jp, false);
           jv.setVisible(true);
        } catch (Exception e){
        }
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    cetaksemua fDB = new cetaksemua();
    fDB.fAB = this;
    fDB.setVisible(true);
    fDB.setResizable(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        menuutama a = new menuutama();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try
        {
        Connection konek = input.getKoneksi();
        String query = "INSERT INTO gaji VALUES(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement prepare = konek.prepareStatement(query);
        
        prepare.setString(1, txtnip.getText());
        prepare.setString(2, txtnama.getText());
        prepare.setString(3, txtjekel.getText());
        prepare.setString(4, txttempat.getText());
        prepare.setString(5, txtlahir.getText());
        prepare.setString(6, txtpendidikan.getText());
        prepare.setString(7, txtpangkat.getText());
        prepare.setString(8, txtjabatan.getText());
        prepare.setString(9, txtmasa.getText());
        
        prepare.setString(10, txtgaji.getText());
        
        prepare.executeUpdate();
        JOptionPane.showMessageDialog(null, "Data siap dicetak");
        prepare.close();
        }
        
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "belum siap");
            System.out.println(ex);
        }
        finally
        {

            tampilTabel();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(datagaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(datagaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(datagaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(datagaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new datagaji().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabeldata;
    private javax.swing.JTextField txtgaji;
    private javax.swing.JTextField txtjabatan;
    private javax.swing.JTextField txtjekel;
    private javax.swing.JTextField txtlahir;
    private javax.swing.JTextField txtmasa;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnip;
    private javax.swing.JTextField txtpangkat;
    private javax.swing.JTextField txtpendidikan;
    private javax.swing.JTextField txttempat;
    // End of variables declaration//GEN-END:variables

    
}
