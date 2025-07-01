package perhiasan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import perhiasan.FormatHarga;
/**
 *
 * @author Asus
 */
public class perhiasan extends javax.swing.JFrame {

    /**
     * Creates new form UAS
     */
    public perhiasan() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        IDProduk = new javax.swing.JLabel();
        NamaProduk = new javax.swing.JLabel();
        TipePerhiasan = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtnama_produk = new javax.swing.JTextField();
        txtid_produk = new javax.swing.JTextField();
        txtstok = new javax.swing.JTextField();
        txtharga = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelProduk = new javax.swing.JTable();
        txttipe_perhiasan = new javax.swing.JComboBox<>();
        btnTambah = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        lblMerek = new javax.swing.JLabel();
        txtberat_perhiasan = new javax.swing.JTextField();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("DATA PRODUK PERHIASAN");
        jLabel1.setToolTipText("");

        IDProduk.setBackground(new java.awt.Color(255, 204, 204));
        IDProduk.setText("ID Produk");

        NamaProduk.setBackground(new java.awt.Color(255, 204, 204));
        NamaProduk.setText("Nama Produk");

        TipePerhiasan.setBackground(new java.awt.Color(255, 204, 204));
        TipePerhiasan.setText("Tipe Perhiasan");

        jLabel6.setBackground(new java.awt.Color(255, 204, 204));
        jLabel6.setText("Stok");

        jLabel7.setBackground(new java.awt.Color(255, 204, 204));
        jLabel7.setText("Harga");

        txtnama_produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnama_produkActionPerformed(evt);
            }
        });

        txtstok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstokActionPerformed(evt);
            }
        });

        txtharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthargaActionPerformed(evt);
            }
        });

        tabelProduk.setBackground(new java.awt.Color(204, 204, 204));
        tabelProduk.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelProduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelProdukMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelProduk);

        txttipe_perhiasan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Earrings", "Bangle", "Pendant", "Ring", "Angklate" }));
        txttipe_perhiasan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttipe_perhiasanActionPerformed(evt);
            }
        });

        btnTambah.setBackground(new java.awt.Color(255, 0, 0));
        btnTambah.setText("Tambah");
        btnTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTambahMouseClicked(evt);
            }
        });
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(255, 0, 0));
        btnReset.setText("Reset");
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        lblMerek.setBackground(new java.awt.Color(255, 204, 204));
        lblMerek.setText("Berat Perhiasan");

        txtberat_perhiasan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtberat_perhiasanActionPerformed(evt);
            }
        });

        btnUbah.setBackground(new java.awt.Color(255, 0, 0));
        btnUbah.setText("Ubah");
        btnUbah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUbahMouseClicked(evt);
            }
        });
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(255, 0, 0));
        btnHapus.setText("Hapus");
        btnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHapusMouseClicked(evt);
            }
        });
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnHapus)
                        .addGap(18, 18, 18)
                        .addComponent(btnUbah)
                        .addGap(27, 27, 27)
                        .addComponent(btnReset)
                        .addGap(30, 30, 30)
                        .addComponent(btnTambah))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TipePerhiasan, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txttipe_perhiasan, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMerek, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtstok, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtberat_perhiasan, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NamaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtnama_produk, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(IDProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtid_produk, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addGap(284, 284, 284))))
                .addGap(0, 40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid_produk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDProduk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnama_produk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NamaProduk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TipePerhiasan)
                    .addComponent(txttipe_perhiasan, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtberat_perhiasan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMerek))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtstok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHapus)
                    .addComponent(btnUbah)
                    .addComponent(btnReset)
                    .addComponent(btnTambah))
                .addContainerGap(302, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtstokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstokActionPerformed

    private void txtnama_produkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnama_produkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnama_produkActionPerformed

    private void txthargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthargaActionPerformed

    private void tabelProdukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelProdukMouseClicked
int baris = tabelProduk.rowAtPoint(evt.getPoint());
txtid_produk.setText(tabelProduk.getValueAt(baris, 0).toString());
txtnama_produk.setText(tabelProduk.getValueAt(baris, 1).toString());
txttipe_perhiasan.setSelectedItem(tabelProduk.getValueAt(baris, 2).toString());
txtberat_perhiasan.setText(tabelProduk.getValueAt(baris, 3).toString());
txtstok.setText(tabelProduk.getValueAt(baris, 4).toString());
txtharga.setText(tabelProduk.getValueAt(baris, 5).toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelProdukMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        tampilData();
        txtnama_produk.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void txttipe_perhiasanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttipe_perhiasanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttipe_perhiasanActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        try {
    Connection con = koneksi.getConnection();
    String sql = "INSERT INTO tb_perhiasan (id_produk=?, nama_produk=?, tipe_perhiasan=?, berat_perhiasan=?, stok=?, harga=?) VALUES (?, ?, ?, ?, ?, ?)";
    PreparedStatement pst = con.prepareStatement(sql);
    pst.setString(1, txtnama_produk.getText());
    pst.setInt(2, Integer.parseInt(txtid_produk.getText()));
    pst.setString(3, txttipe_perhiasan.getSelectedItem().toString());
    pst.setString(4, txtberat_perhiasan.getText());
    pst.setInt(5, Integer.parseInt(txtstok.getText()));
    pst.setDouble(6, Double.parseDouble(txtharga.getText()));
    pst.executeUpdate();
    JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan!");
    tampilData();
    resetForm();
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, e.getMessage());
}
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnTambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTambahMouseClicked

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        resetForm();
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtberat_perhiasanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtberat_perhiasanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtberat_perhiasanActionPerformed

    private void btnUbahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUbahMouseClicked

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
         try {
    Connection con = koneksi.getConnection();
    String sql = "INSERT INTO tb_perhiasan (id_produk=?, nama_produk=?, tipe_perhiasan=?, berat_perhiasan=?, stok=?, harga=?) VALUES (?, ?, ?, ?, ?, ?)";
    PreparedStatement pst = con.prepareStatement(sql);
    pst.setString(1, txtnama_produk.getText());
    pst.setInt(2, Integer.parseInt(txtid_produk.getText()));
    pst.setString(3, txttipe_perhiasan.getSelectedItem().toString());
    pst.setString(4, txtberat_perhiasan.getText());
    pst.setInt(5, Integer.parseInt(txtstok.getText()));
    pst.setDouble(6, Double.parseDouble(txtharga.getText()));
    pst.executeUpdate();
    JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan!");
    tampilData();
    resetForm();
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, e.getMessage());
}
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHapusMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try {
    Connection con = koneksi.getConnection();
    String sql = "DELETE FROM tb_perhiasan WHERE kode_produk=?";
    PreparedStatement pst = con.prepareStatement(sql);
    pst.setString(1, txtnama_produk.getText());
    pst.executeUpdate();
    JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
    tampilData();
    resetForm();
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, e.getMessage());
}
    }//GEN-LAST:event_btnHapusActionPerformed

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
                java.util.logging.Logger.getLogger(perhiasan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(perhiasan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(perhiasan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(perhiasan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            //</editor-fold>
            //</editor-fold>
            //</editor-fold>
            //</editor-fold>
            //</editor-fold>
            //</editor-fold>
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new perhiasan().setVisible(true);
                }
            });
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDProduk;
    private javax.swing.JLabel NamaProduk;
    private javax.swing.JLabel TipePerhiasan;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMerek;
    private javax.swing.JTable tabelProduk;
    private javax.swing.JTextField txtberat_perhiasan;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtid_produk;
    private javax.swing.JTextField txtnama_produk;
    private javax.swing.JTextField txtstok;
    private javax.swing.JComboBox<String> txttipe_perhiasan;
    // End of variables declaration//GEN-END:variables
private void tampilData() {
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Nama Produk");
    model.addColumn("ID Produk");
    model.addColumn("Tipe Perhiasan");
    model.addColumn("Berat Perhiasan");
    model.addColumn("Stok");
    model.addColumn("Harga");

    try {
        Connection con = koneksi.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM tb_perhiasan");
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("id_produk"),
                rs.getString("nama_produk"),
                rs.getString("tipe_perhiasan"),
                rs.getString("berat_perhiasan"),
                rs.getInt("stok"),
                FormatHarga.formatRupiah(rs.getDouble("harga"))
            });
        }
//        FormatHarga.formatRupiah(rs.getDouble("harga"));
        tabelProduk.setModel(model);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Gagal menampilkan data: " + e.getMessage());
    }
}

private void resetForm() {
    txtnama_produk.setText("");
    txtid_produk.setText("");
    txttipe_perhiasan.setSelectedIndex(0);
    txtberat_perhiasan.setText("");
    txtstok.setText("");
    txtharga.setText("");
}
}