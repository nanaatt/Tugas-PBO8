/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Careen Emilza
 */
public class MataKuliah extends javax.swing.JFrame {

    Connection conn;
    Statement stmt;
    PreparedStatement pstmt = null;

    String driver = "org.postgresql.Driver";
    String koneksi = "jdbc:postgresql://localhost:5432/PBO";
    String user = "postgres";
    String password = "189066";
    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    BufferedReader input = new BufferedReader(inputStreamReader);

    /**
     * Creates new form MataKuliah
     */
    public MataKuliah() {
        initComponents();
        tampil();
    }

    public void tampil() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistencePU");
        EntityManager em = emf.createEntityManager();

        try {
            Query q = em.createNamedQuery("MatakuliahPersist.findAll");
            List<MatakuliahPersist> hasil = q.getResultList();

            DefaultTableModel tbmk = new DefaultTableModel(new String[]{"Kode Mata Kuliah", "Nama Mata Kuliah", "SKS", "Semester ajar"}, 0);
            for (MatakuliahPersist data : hasil) {
                Object[] baris = {data.getKodeMk(), data.getNamaMk(), data.getSks(), data.getSmtAjar()};
                tbmk.addRow(baris);
            }
            tblDMK.setModel(tbmk);
        } finally {
            em.close();
            emf.close();
        }
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
        jTable1 = new javax.swing.JTable();
        lblDMK = new javax.swing.JLabel();
        lblKM = new javax.swing.JLabel();
        lblNM = new javax.swing.JLabel();
        lblSK = new javax.swing.JLabel();
        lblSM = new javax.swing.JLabel();
        txtKM = new javax.swing.JTextField();
        txtNM = new javax.swing.JTextField();
        txtSK = new javax.swing.JTextField();
        txtSM = new javax.swing.JTextField();
        btnIN = new javax.swing.JButton();
        btnUP = new javax.swing.JButton();
        btnDEL = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDMK = new javax.swing.JTable();
        btnCT = new javax.swing.JButton();
        btnUPLOAD = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblDMK.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblDMK.setText("DATA MATA KULIAH");

        lblKM.setText("Kode Mata Kuliah:");

        lblNM.setText("Nama Mata Kuliah:");

        lblSK.setText("SKS:");

        lblSM.setText("Semester:");

        txtSK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSKActionPerformed(evt);
            }
        });

        txtSM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSMActionPerformed(evt);
            }
        });

        btnIN.setText("Tambah");
        btnIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnINActionPerformed(evt);
            }
        });

        btnUP.setText("Update");
        btnUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUPActionPerformed(evt);
            }
        });

        btnDEL.setText("Delete");
        btnDEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDELActionPerformed(evt);
            }
        });

        tblDMK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDMK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDMKMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDMK);

        btnCT.setText("Cetak");
        btnCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCTActionPerformed(evt);
            }
        });

        btnUPLOAD.setText("Upload");
        btnUPLOAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUPLOADActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(lblDMK))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblKM)
                                            .addComponent(lblNM)
                                            .addComponent(lblSK)
                                            .addComponent(lblSM)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnIN)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnUP)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtKM, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNM, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSK, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSM, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(btnDEL)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCT)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnUPLOAD))))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDMK)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblKM)
                            .addComponent(txtKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNM)
                            .addComponent(txtNM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(lblSK))
                    .addComponent(txtSK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSM)
                    .addComponent(txtSM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIN)
                    .addComponent(btnUP)
                    .addComponent(btnDEL)
                    .addComponent(btnCT)
                    .addComponent(btnUPLOAD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSKActionPerformed

    private void txtSMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSMActionPerformed

    private void btnUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUPActionPerformed
        if (txtKM.getText().equals("") || txtNM.getText().equals("") || txtSK.getText().equals("") || txtSM.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Harap mengisi semua data.");
        } else {
            String kode_mk, nama_mk;
            kode_mk = txtKM.getText();
            nama_mk = txtNM.getText();
            int sks, smt_ajar;

            try {
                sks = Integer.parseInt(txtSK.getText());
                smt_ajar = Integer.parseInt(txtSM.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "SKS dan Semester ajar harus berupa angka.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistencePU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            MatakuliahPersist mk = em.find(MatakuliahPersist.class, kode_mk);
            if (mk == null) {
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
            } else {
                mk.setKodeMk(kode_mk);
                mk.setNamaMk(nama_mk);
                mk.setSks(sks);
                mk.setSmtAjar(smt_ajar);

                em.getTransaction().commit();
                JOptionPane.showMessageDialog(null, "Data berhasil diupdate");

                em.close();
                emf.close();
                clear();
                txtKM.setEditable(true);
            }
        }
        tampil();
    }//GEN-LAST:event_btnUPActionPerformed

    private void btnINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnINActionPerformed
        if (txtKM.getText().equals("") || txtNM.getText().equals("") || txtSK.getText().equals("") || txtSM.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Harap isi semua data.");
        } else {
            String kode_mk, nama_mk;
            kode_mk = txtKM.getText();
            nama_mk = txtNM.getText();
            int sks, smt_ajar;

            try {
                sks = Integer.parseInt(txtSK.getText());
                smt_ajar = Integer.parseInt(txtSM.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "SKS dan Semester ajar harus berupa angka.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistencePU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            MatakuliahPersist mk = new MatakuliahPersist();
            mk.setKodeMk(kode_mk);
            mk.setNamaMk(nama_mk);
            mk.setSks(sks);
            mk.setSmtAjar(smt_ajar);

            em.persist(mk);

            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Data berhasil diinput.");

            clear();
            tampil();

            em.close();
            emf.close();
        }
    }//GEN-LAST:event_btnINActionPerformed

    private void btnDELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELActionPerformed
        if (txtKM.getText().equals("") || txtNM.getText().equals("") || txtSK.getText().equals("") || txtSM.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Harap isi semua data.");
        } else {
            String kode_mk;
            kode_mk = txtKM.getText();
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistencePU");
            EntityManager em = emf.createEntityManager();

            int jawab = JOptionPane.showConfirmDialog(null, "Apakah anda ingin menghapus data dengan kode : ",
                    "Konfirmasi Hapus.", JOptionPane.YES_NO_OPTION);
            switch (jawab) {
                case JOptionPane.YES_OPTION -> {
                    em.getTransaction().begin();

                    MatakuliahPersist mk = em.find(MatakuliahPersist.class, kode_mk);
                    if (mk == null) {
                        JOptionPane.showMessageDialog(null, "Data tidak ditemukan.");
                    } else {
                        em.remove(mk);

                        em.getTransaction().commit();
                        JOptionPane.showMessageDialog(null, "Data berhasil didelete.");
                        em.close();
                        clear();
                        txtKM.setEditable(true);
                    }
                }
                case JOptionPane.NO_OPTION ->
                    JOptionPane.showMessageDialog(this, "Penghapusan dibatalkan.");
            }
            tampil();
        }
    }//GEN-LAST:event_btnDELActionPerformed

    private void tblDMKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDMKMouseClicked
        int row = tblDMK.getSelectedRow();
        txtKM.setText(tblDMK.getValueAt(row, 0).toString());
        txtNM.setText(tblDMK.getValueAt(row, 1).toString());
        txtSK.setText(tblDMK.getValueAt(row, 2).toString());
        txtSM.setText(tblDMK.getValueAt(row, 3).toString());
        txtKM.setEditable(false);
    }//GEN-LAST:event_tblDMKMouseClicked

    private void btnCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCTActionPerformed
        JasperReport reports;

        try {
            if (conn == null || conn.isClosed()) {
                // Mencoba untuk membuka koneksi baru
                try {
                    conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/PBO", "postgres", "189066");
                    System.out.println("Koneksi berhasil dibuka.");
                } catch (SQLException e) {
                    System.err.println("Gagal membuka koneksi: " + e.getMessage());
                    return; // Keluar dari metode jika koneksi gagal
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MataKuliah.class.getName()).log(Level.SEVERE, null, ex);
        }

        String path = ".\\src\\persistence\\Report_MataKuliah.jasper";
        try {
            reports = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint = JasperFillManager.fillReport(path, null, conn);
            JasperViewer jviewer = new JasperViewer(jprint, false);
            jviewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            jviewer.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(MataKuliah.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCTActionPerformed

    private void btnUPLOADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUPLOADActionPerformed
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        int returnValue = jfc.showOpenDialog(null);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistencePU");
        EntityManager em = emf.createEntityManager();
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File pilihanfile = jfc.getSelectedFile();
            System.out.println("File yang dipilih : " + pilihanfile.getAbsolutePath());

            try (BufferedReader br = new BufferedReader(new FileReader(pilihanfile))) {
                Class.forName(driver);
                conn = DriverManager.getConnection(koneksi, user, password);
                String baris;
                String pemisah = ",";

                while ((baris = br.readLine()) != null) {
                    String[] dataMK = baris.split(pemisah);
                    String kode_mk = dataMK[0];
                    String nama_mk = dataMK[1];
                    int sks = 0;
                    int smt_ajar = 0;
                    try {
                        sks = Integer.parseInt(dataMK[2]);
                        smt_ajar = Integer.parseInt(dataMK[3]);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Data 'sks' atau 'semester ajar' tidak valid: " + baris);
                        continue; // Skip baris yang salah format
                    }
                    if (!kode_mk.isEmpty() && !nama_mk.isEmpty()) {
                        em.getTransaction().begin();

                        MatakuliahPersist mk = new MatakuliahPersist();
                        mk.setKodeMk(kode_mk);
                        mk.setNamaMk(nama_mk);
                        mk.setSks(sks);
                        mk.setSmtAjar(smt_ajar);

                        em.persist(mk);

                        em.getTransaction().commit();
                        JOptionPane.showMessageDialog(null, "Sukses diinput");
                        tampil();
                    } else {
                        JOptionPane.showMessageDialog(null, "Gagal diinput");
                    }
                }
                em.close();
                emf.close();
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Gagal diinput");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Gagal diinput");
            } catch (ClassNotFoundException | SQLException ex) {
            }
        }
    }//GEN-LAST:event_btnUPLOADActionPerformed

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
            java.util.logging.Logger.getLogger(MataKuliah.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MataKuliah.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MataKuliah.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MataKuliah.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MataKuliah().setVisible(true);
            }
        });
    }

    public void clear() {
        txtKM.setText("");
        txtNM.setText("");
        txtSK.setText("");
        txtSM.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCT;
    private javax.swing.JButton btnDEL;
    private javax.swing.JButton btnIN;
    private javax.swing.JButton btnUP;
    private javax.swing.JButton btnUPLOAD;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblDMK;
    private javax.swing.JLabel lblKM;
    private javax.swing.JLabel lblNM;
    private javax.swing.JLabel lblSK;
    private javax.swing.JLabel lblSM;
    private javax.swing.JTable tblDMK;
    private javax.swing.JTextField txtKM;
    private javax.swing.JTextField txtNM;
    private javax.swing.JTextField txtSK;
    private javax.swing.JTextField txtSM;
    // End of variables declaration//GEN-END:variables
}
