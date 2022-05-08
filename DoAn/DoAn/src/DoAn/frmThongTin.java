package DoAn;

import static DoAn.FrmConnect.Address;
import static DoAn.FrmConnect.Host;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author NHATNGUYEN
 */
public class frmThongTin extends javax.swing.JFrame {

    /**
     * Creates new form frmThongTin
     */
    public frmThongTin() {
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

        btnXacNhanTT = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMSSV = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnXacNhanTT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnXacNhanTT.setText("Xác nhận");
        btnXacNhanTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanTTActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Họ tên :");

        txtHoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoTenActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("MSSV :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMSSV, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXacNhanTT, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXacNhanTT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtHoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoTenActionPerformed

    public static String ten;
    public static String massv;

    private void btnXacNhanTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanTTActionPerformed
        if (txtHoTen.getText().equals("") || txtMSSV.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Không được để trống thông tin !", "Inane warning",JOptionPane.WARNING_MESSAGE);
        }
        else if(txtMSSV.getText().matches("[N,n]{1}[0-9]{2}[D,d]{1}[c,C]{2}[N,n]{1}[0-9]{3}")==false)
        {
            JOptionPane.showMessageDialog(this, "Mã sinh viên phải đúng định dạng !", "Inane warning",JOptionPane.WARNING_MESSAGE);

        }
        else if((txtHoTen.getText().matches("^[a-zA-Z\\\\s]+$")))
        {
            JOptionPane.showMessageDialog(this, "Tên sinh viên không được chứa số !", "Inane warning",JOptionPane.WARNING_MESSAGE);

        }
        else {
            String hoten = txtHoTen.getText().trim();
            String mssv = txtMSSV.getText().trim();
            ten = hoten.substring(hoten.lastIndexOf(' ') + 1);
            massv = mssv;
            try {
                DatagramSocket client = new DatagramSocket();
                InetAddress server = InetAddress.getByName(Address);
                String congviec = "nhapthongtin";
                byte[] datacv = congviec.getBytes();
                DatagramPacket cv = new DatagramPacket(datacv, datacv.length, server, Host);
                byte[] dataht = hoten.getBytes();
                DatagramPacket ht = new DatagramPacket(dataht, dataht.length, server, Host);
                byte[] datamsv = mssv.getBytes();
                DatagramPacket msv = new DatagramPacket(datamsv, datamsv.length, server, Host);
                client.send(cv);
                client.send(ht);
                client.send(msv);
                byte[] buffer = new byte[5000];
                DatagramPacket dataRecieve = new DatagramPacket(buffer, buffer.length);
                client.receive(dataRecieve);
                String ketQua = new String(dataRecieve.getData(), 0, dataRecieve.getLength());
  
                JOptionPane.showMessageDialog(this, ketQua);
                this.setVisible(false);
                FrmMa fmMa = new FrmMa();
                fmMa.setVisible(true);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Kết nối thất bại vui lòng kiểm tra lại địa chỉ và port !","Inane warning", JOptionPane.WARNING_MESSAGE);

            }
        }

    }//GEN-LAST:event_btnXacNhanTTActionPerformed

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
            java.util.logging.Logger.getLogger(frmThongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmThongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmThongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmThongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmThongTin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnXacNhanTT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMSSV;
    // End of variables declaration//GEN-END:variables
}