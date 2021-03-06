package DoAn;

import static DoAn.FrmServer.listModel;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author NHATNGUYEN
 */
public class FrmServer extends javax.swing.JFrame {

    /**
     * Creates new form FrmServer
     */
    public FrmServer() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        txtNoiDung = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtHostSV = new javax.swing.JTextField();
        btnKetNoi = new javax.swing.JButton();
        btnDisConnect = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListDS = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNoiDung.setColumns(20);
        txtNoiDung.setRows(5);
        jScrollPane1.setViewportView(txtNoiDung);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("SERVER MANAGER");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("HOST :");

        txtHostSV.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtHostSV.setText("1456");
        txtHostSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHostSVActionPerformed(evt);
            }
        });

        btnKetNoi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnKetNoi.setText("CONNECT");
        btnKetNoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetNoiActionPerformed(evt);
            }
        });

        btnDisConnect.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDisConnect.setText("DISCONNECT");
        btnDisConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisConnectActionPerformed(evt);
            }
        });

        ListDS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jScrollPane2.setViewportView(ListDS);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Danh s??ch :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("N???i dung :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHostSV, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnKetNoi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnDisConnect)))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(238, 238, 238))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHostSV, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKetNoi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDisConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static List<DatagramPacket> listClient = new ArrayList<>();
    public static DefaultListModel listModel = new DefaultListModel();

    public JTextArea getTxtNoiDung() {
        return txtNoiDung;
    }

    public void setTxtNoiDung(JTextArea txtNoiDung) {
        this.txtNoiDung = txtNoiDung;
    }

    public static void kiemTraTrungSocket(DatagramPacket dt, List<DatagramPacket> list) {
        for (DatagramPacket items : list) {
            if (dt.getPort() == items.getPort() && dt.getAddress().equals(items.getAddress())) {
                System.out.println("Tr??ng client");
                return;
            }

        }
        list.add(dt);

    }
    public static DatagramSocket server;
    private void btnKetNoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetNoiActionPerformed
        if (txtHostSV.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Kh??ng ???????c ????? tr???ng Host !");
        } else {
            try {

                String ND = "";
                Integer host = Integer.valueOf(txtHostSV.getText());
                server = new DatagramSocket(host);

                JOptionPane.showMessageDialog(this, "Kh???i ?????ng th??nh c??ng !");
                txtNoiDung.setText("Server ??ang ch???y ...\n");
                writeServer write = new writeServer(server, host, txtNoiDung, ListDS);
                write.start();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Kh???i ?????ng th???t b???i!");
            }
        }

    }//GEN-LAST:event_btnKetNoiActionPerformed

    private void btnDisConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisConnectActionPerformed
        try {
            for (DatagramPacket item : listClient) {
                String ngatketnoi = "Ph??ng chat ???? ????ng !";
                DatagramPacket bmw = new DatagramPacket(ngatketnoi.getBytes(), ngatketnoi.getBytes().length, item.getAddress(), item.getPort());
                server.send(bmw);

            }
            txtNoiDung.setText("");
            listModel.clear();
            server.close();
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnDisConnectActionPerformed

    private void txtHostSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHostSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHostSVActionPerformed

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
            java.util.logging.Logger.getLogger(FrmServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmServer().setVisible(true);

            }

        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListDS;
    private javax.swing.JButton btnDisConnect;
    private javax.swing.JButton btnKetNoi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtHostSV;
    private javax.swing.JTextArea txtNoiDung;
    // End of variables declaration//GEN-END:variables
}

class writeServer extends Thread {

    private DatagramSocket server;
    private Integer host;
    private JTextArea ND;
    private JList ListDS;

    public writeServer(DatagramSocket server, Integer host, JTextArea ND, JList ListDS) {
        this.server = server;
        this.host = host;
        this.ND = ND;
        this.ListDS = ListDS;
    }

    @Override
    public void run() {
        try {

            while (true) {

                byte[] buffer = new byte[5000];
                DatagramPacket incoming = new DatagramPacket(buffer, buffer.length);
                server.receive(incoming);
                String incomingString = new String(incoming.getData(), 0, incoming.getLength());
                if (incomingString.equals("ketnoi")) {
                    String kq = "success";
                    DatagramPacket Note = new DatagramPacket(kq.getBytes(), kq.getBytes().length, incoming.getAddress(), incoming.getPort());
                    server.send(Note);
                } else if (incomingString.equals("nhapthongtin")) {
                    byte[] buffer1 = new byte[5000];
                    byte[] buffer2 = new byte[5000];
                    DatagramPacket incoming1 = new DatagramPacket(buffer1, buffer1.length);
                    DatagramPacket incoming2 = new DatagramPacket(buffer2, buffer2.length);
                    server.receive(incoming1);
                    server.receive(incoming2);
                    String hoten = new String(incoming1.getData(), 0, incoming1.getLength());
                    String lastname = hoten.substring(hoten.lastIndexOf(' ') + 1);
                    String mssv = new String(incoming2.getData(), 0, incoming2.getLength());
                    String kq = " Ch??o m???ng b???n  " + lastname + "\n"
                            + " MSSV: " + mssv + "\n"
                            + "?????n v???i ph??ng chat\n"
                            + "m?? ph??ng chat c???a b???n l??:ST132";
                    DatagramPacket Note = new DatagramPacket(kq.getBytes(), kq.getBytes().length, incoming.getAddress(), incoming.getPort());
                    server.send(Note);

                } else if (incomingString.equals("KTMA")) {
                    byte[] buffer1 = new byte[5000];
                    DatagramPacket incoming1 = new DatagramPacket(buffer1, buffer1.length);
                    server.receive(incoming1);
                    String ma = new String(incoming1.getData(), 0, incoming1.getLength());
                    if(ma.equals("ST132"))
                    {
                        String kq = "MAOKE";
                        DatagramPacket Note = new DatagramPacket(kq.getBytes(), kq.getBytes().length, incoming.getAddress(), incoming.getPort());
                        server.send(Note);
                    }
                    else
                    {
                        String kq = "MASAI";
                        DatagramPacket Note = new DatagramPacket(kq.getBytes(), kq.getBytes().length, incoming.getAddress(), incoming.getPort());
                        server.send(Note);
                    }

                } else {

                    if (incomingString.contains("???? tham gia v??o phong chat")) {
                        String[] name = incomingString.split(" ");
                        listModel.addElement(name[0].toUpperCase());
                        System.out.println(listModel.size());
                        ListDS.setModel(listModel);
                    } else if (incomingString.contains("???? tho??t")) {
                        String[] name = incomingString.split(" ");
                        listModel.removeElement(name[0].toUpperCase());
                        System.out.println(listModel.size());

                        ListDS.setModel(listModel);
                    }

                    FrmServer.kiemTraTrungSocket(incoming, FrmServer.listClient);
                    for (DatagramPacket item : FrmServer.listClient) {
                        if (!(incoming.getPort() == item.getPort() && incoming.getAddress().equals(item.getAddress()))) {

                            DatagramPacket bmw = new DatagramPacket(incomingString.getBytes(), incomingString.getBytes().length, item.getAddress(), item.getPort());
                            server.send(bmw);
                        }
                    }

                    ND.append(incomingString + "\n");

                }
            }

        } catch (Exception e) {
        }
    }
}
