/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.panel;

import Repository.ibu_hamilRepository;
import Repository.pemeriksaan_ibuhamilRepository;
import entity.ibu_hamil;
import entity.pemeriksaan_ibuhamil;
import java.awt.Font;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import javax.swing.SwingUtilities;
import main.main;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import util.Conn;
import view.dialog.formcari_ibuhamil;
import view.notif.Notification;

/**
 *
 * @author RESCOM-1
 */
public class Pelayanan_periksa_ibuhamil extends javax.swing.JPanel {
    main main =(main)SwingUtilities.getWindowAncestor(this);
    formcari_ibuhamil apaa = new formcari_ibuhamil(main);
    private int id = apaa.id;
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    ibu_hamilRepository ibuhh = new ibu_hamilRepository();
    pemeriksaan_ibuhamilRepository hayo = new pemeriksaan_ibuhamilRepository();
    
    public Pelayanan_periksa_ibuhamil() {
        initComponents();
        Date hariini = new Date();
        input_Tanggal_periksa.setText(sdf.format(hariini));
        if(id != 0){
            input_id_ibu.setText(String.valueOf(id));
            input_namaibu.setText(ibuhh.get(id).getNama());
            input_TempatLahir.setText(ibuhh.get(id).getTempat_lahir());
            input_Tanggal_lahir.setText(sdf.format(ibuhh.get(id).getTanggal_lahir()));
        }else{
            input_id_ibu.setText("");
        }
        Font font = new Font("Quicksand", Font.PLAIN, 20);
        input_id_ibu.setFont(font);
        input_namaibu.setFont(font);
        input_usiakandungan.setFont(font);
        input_hamil_ke.setFont(font);
        input_riwayat_penyakit.setFont(font);
        input_BB.setFont(font);
        input_TB.setFont(font);
        input_Deteksi.setFont(font);
        input_Keterangan.setFont(font);
        input_Tanggal_lahir.setFont(font);
        input_TempatLahir.setFont(font);
        input_Tanggal_periksa.setFont(font);
        cmbbox();
    }
    public void cmbbox(){

        try {
            for(ibu_hamil apa : ibuhh.get()){
                cmb_pilih.addItem(apa.getNama());
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
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

        date1 = new view.customdate.DateChooser();
        txt_form = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnsimpan = new javax.swing.JLabel();
        btnreset = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        input_id_ibu = new view.swing.textfieldcustom.txtfieldcustom();
        input_namaibu = new view.swing.textfieldcustom.txtfieldcustom();
        input_usiakandungan = new view.swing.textfieldcustom.txtfieldcustom();
        input_hamil_ke = new view.swing.textfieldcustom.txtfieldcustom();
        input_riwayat_penyakit = new view.swing.textfieldcustom.txtfieldcustom();
        input_BB = new view.swing.textfieldcustom.txtfieldcustom();
        jLabel13 = new javax.swing.JLabel();
        input_TB = new view.swing.textfieldcustom.txtfieldcustom();
        jLabel15 = new javax.swing.JLabel();
        input_Deteksi = new view.swing.textfieldcustom.txtfieldcustom();
        input_Keterangan = new view.swing.textfieldcustom.txtfieldcustom();
        jLabel8 = new javax.swing.JLabel();
        input_TempatLahir = new view.swing.textfieldcustom.txtfieldcustom();
        jLabel9 = new javax.swing.JLabel();
        input_Tanggal_lahir = new view.swing.textfieldcustom.txtfieldcustom();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        input_Tanggal_periksa = new view.swing.textfieldcustom.txtfieldcustom();
        cmb_pilih = new javax.swing.JComboBox<>();

        date1.setTextRefernce(input_Tanggal_lahir);

        setBackground(new java.awt.Color(246, 246, 233));

        txt_form.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/txt_Pelayanan periksa Ibu Hamil.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/laporanperiksa_ID Ibu Hamil.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/laporanperiksa_Usia Kandungan.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/laporanperiksa_Nama Ibu.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/laporanperiksa_BB.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/laporanperiksa_Hamil ke -.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/laporanpenimbangan_TB.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/laporanperiksa_Keterangan.png"))); // NOI18N

        btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnsimpan1.png"))); // NOI18N
        btnsimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsimpanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsimpanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsimpanMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnsimpanMousePressed(evt);
            }
        });

        btnreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnreset1.png"))); // NOI18N
        btnreset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnresetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnresetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnresetMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnresetMousePressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("MInggu");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/laporanperiksa_Riwayat Penyakit.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/laporanperiksa_Deteksi.png"))); // NOI18N

        input_id_ibu.setBackground(new java.awt.Color(246, 246, 233));
        input_id_ibu.setFocusable(false);
        input_id_ibu.setRound(50);

        input_namaibu.setBackground(new java.awt.Color(246, 246, 233));
        input_namaibu.setFocusable(false);
        input_namaibu.setRound(50);

        input_usiakandungan.setBackground(new java.awt.Color(246, 246, 233));
        input_usiakandungan.setRound(50);

        input_hamil_ke.setBackground(new java.awt.Color(246, 246, 233));
        input_hamil_ke.setRound(50);

        input_riwayat_penyakit.setBackground(new java.awt.Color(246, 246, 233));
        input_riwayat_penyakit.setRound(50);

        input_BB.setBackground(new java.awt.Color(246, 246, 233));
        input_BB.setRound(50);

        jLabel13.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Kg");

        input_TB.setBackground(new java.awt.Color(246, 246, 233));
        input_TB.setRound(50);
        input_TB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_TBActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("Cm");

        input_Deteksi.setBackground(new java.awt.Color(246, 246, 233));
        input_Deteksi.setRound(50);

        input_Keterangan.setBackground(new java.awt.Color(246, 246, 233));
        input_Keterangan.setRound(50);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/laporanperiksa_Tempat Lahir.png"))); // NOI18N

        input_TempatLahir.setBackground(new java.awt.Color(246, 246, 233));
        input_TempatLahir.setFocusable(false);
        input_TempatLahir.setRound(50);
        input_TempatLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_TempatLahirActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/laporanperiksa_Tanggal Lahir.png"))); // NOI18N

        input_Tanggal_lahir.setBackground(new java.awt.Color(246, 246, 233));
        input_Tanggal_lahir.setFocusable(false);
        input_Tanggal_lahir.setRound(50);
        input_Tanggal_lahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_Tanggal_lahirActionPerformed(evt);
            }
        });

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagetxt/laporanperiksa_Tanggal Periksa.png"))); // NOI18N

        input_Tanggal_periksa.setBackground(new java.awt.Color(246, 246, 233));
        input_Tanggal_periksa.setFocusable(false);
        input_Tanggal_periksa.setRound(50);
        input_Tanggal_periksa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_Tanggal_periksaActionPerformed(evt);
            }
        });

        cmb_pilih.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--pilih dulu--" }));
        cmb_pilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_pilihActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(553, 553, 553)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel16))
                                        .addGap(0, 44, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(input_Tanggal_periksa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(input_Tanggal_lahir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(input_TempatLahir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(38, 38, 38))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnreset)
                                .addGap(40, 40, 40)
                                .addComponent(btnsimpan))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(input_Keterangan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(input_Deteksi, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(input_id_ibu, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmb_pilih, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(202, 202, 202)
                                    .addComponent(jLabel12)
                                    .addGap(216, 216, 216))
                                .addComponent(txt_form, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel2))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(input_hamil_ke, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(input_BB, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(input_TB, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel15))))
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(input_usiakandungan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(input_namaibu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(input_riwayat_penyakit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txt_form, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input_TempatLahir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(input_id_ibu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmb_pilih, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input_namaibu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(input_Tanggal_lahir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(input_usiakandungan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_hamil_ke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input_riwayat_penyakit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel12)
                            .addComponent(jLabel6))
                        .addGap(3, 3, 3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input_Tanggal_periksa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(142, 142, 142)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(input_Deteksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(input_BB, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input_Keterangan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnsimpan)
                            .addComponent(btnreset)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(input_TB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(jLabel13)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void input_id_bayiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_id_bayiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_id_bayiActionPerformed

    private void input_tempatlahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_tempatlahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_tempatlahirActionPerformed

    private void input_tanggallahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_tanggallahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_tanggallahirActionPerformed

    private void input_tanggalhariiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_tanggalhariiniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_tanggalhariiniActionPerformed

    private void input_usiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_usiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_usiaActionPerformed

    private void input_jenisvitaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_jenisvitaminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_jenisvitaminActionPerformed

    private void input_namaibuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_namaibuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_namaibuActionPerformed

    private void btnsimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpanMouseClicked
        try {
            ibu_hamil id_ibu = new ibu_hamil(Integer.parseInt(input_id_ibu.getText()));
        pemeriksaan_ibuhamil ibu = new pemeriksaan_ibuhamil(id_ibu, sdf.parse(input_Tanggal_periksa.getText()),
                Integer.valueOf(input_usiakandungan.getText()), Integer.valueOf(input_hamil_ke.getText()),
                input_riwayat_penyakit.getText(), Integer.valueOf(input_BB.getText()), Integer.valueOf(input_TB.getText()),
                input_Deteksi.getText(), input_Keterangan.getText());
        boolean cobak = hayo.add(ibu);
        if(cobak){
            
            int idfinalrekap = hayo.getlastid().getId();
            InputStream struk = getClass().getResourceAsStream("/jasper_report/report_pelayanan_periksaibu.jrxml");
            String query = "SELECT * FROM pemeriksaan_ibu_hamil JOIN ibu_hamil ON pemeriksaan_ibu_hamil.id_ibu_hamil = ibu_hamil.id where pemeriksaan_ibu_hamil.id = " + idfinalrekap;
//        String path = "E:/SEMUA FOLDER/imam/kuliah/semester 3/joki/SIsiloam/SIsiloam/SISILOAM/src/jasper_report/no_antrian.jrxml";

        try {
               Connection koneksi = (Connection) Conn.configDB();
            Statement pstCek = koneksi.createStatement();
            ResultSet res = pstCek.executeQuery(query);
            JasperDesign design = JRXmlLoader.load(struk);
            JasperReport jr = JasperCompileManager.compileReport(design);
            JRResultSetDataSource rsDataSource = new JRResultSetDataSource(res);
            JasperPrint jp = JasperFillManager.fillReport(jr, new HashMap<>(), rsDataSource);

            JasperViewer viewer = new JasperViewer(jp, false); // argumen 'false' mencegah aplikasi keluar
            viewer.setVisible(true);
            main main =(main)SwingUtilities.getWindowAncestor(this);
            Notification panel = new Notification(main, Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Data Berhasil Ditambahakan");
            panel.showNotification();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
             main main =(main)SwingUtilities.getWindowAncestor(this);
            Notification panel = new Notification(main, Notification.Type.SUCCESS, Notification.Location.TOP_CENTER, "Data Berhasil Ditambahakan");
            panel.showNotification();
        }else {
             main main =(main)SwingUtilities.getWindowAncestor(this);
            Notification panel = new Notification(main, Notification.Type.WARNING, Notification.Location.TOP_CENTER, "Data Gagal Ditambahakan");
            panel.showNotification();
        }
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_btnsimpanMouseClicked

    private void btnsimpanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpanMouseEntered
        btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnsimpan2.png")));
    }//GEN-LAST:event_btnsimpanMouseEntered

    private void btnsimpanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpanMouseExited
        btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnsimpan1.png")));
    }//GEN-LAST:event_btnsimpanMouseExited

    private void btnsimpanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpanMousePressed
        btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnsimpan3.png")));
    }//GEN-LAST:event_btnsimpanMousePressed

    private void btnresetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnresetMouseClicked
        input_id_ibu.setText("");
        input_BB.setText("");
        input_Deteksi.setText("");
        input_namaibu.setText("");
        input_Keterangan.setText("");
        input_TB.setText("");
        input_TempatLahir.setText("");
        input_riwayat_penyakit.setText("");
        input_usiakandungan.setText("");
        input_hamil_ke.setText("");
        

    }//GEN-LAST:event_btnresetMouseClicked

    private void btnresetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnresetMouseEntered
        btnreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnreset2.png")));
    }//GEN-LAST:event_btnresetMouseEntered

    private void btnresetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnresetMouseExited
        btnreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnreset1.png")));
    }//GEN-LAST:event_btnresetMouseExited

    private void btnresetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnresetMousePressed
        btnreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnreset3.png")));
    }//GEN-LAST:event_btnresetMousePressed

    private void input_jenisImunisasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_jenisImunisasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_jenisImunisasiActionPerformed

    private void input_keteranganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_keteranganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_keteranganActionPerformed

    private void input_TBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_TBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_TBActionPerformed

    private void input_TempatLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_TempatLahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_TempatLahirActionPerformed

    private void input_Tanggal_lahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_Tanggal_lahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_Tanggal_lahirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    date1.showPopup();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void input_Tanggal_periksaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_Tanggal_periksaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_Tanggal_periksaActionPerformed

    private void cmb_pilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_pilihActionPerformed
    Object cmb_pilih1 = cmb_pilih.getSelectedItem();
        input_id_ibu.setText(String.valueOf(ibuhh.getidbynama(cmb_pilih1.toString()).getId()));
        input_namaibu.setText(ibuhh.getidbynama(cmb_pilih1.toString()).getNama());
        
        input_TempatLahir.setText(ibuhh.getidbynama(cmb_pilih1.toString()).getTempat_lahir());
        input_Tanggal_lahir.setText(String.valueOf(ibuhh.getidbynama(cmb_pilih1.toString()).getTanggal_lahir()));
    }//GEN-LAST:event_cmb_pilihActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnreset;
    private javax.swing.JLabel btnsimpan;
    private javax.swing.JComboBox<String> cmb_pilih;
    private view.customdate.DateChooser date1;
    private view.swing.textfieldcustom.txtfieldcustom input_BB;
    private view.swing.textfieldcustom.txtfieldcustom input_Deteksi;
    private view.swing.textfieldcustom.txtfieldcustom input_Keterangan;
    private view.swing.textfieldcustom.txtfieldcustom input_TB;
    private view.swing.textfieldcustom.txtfieldcustom input_Tanggal_lahir;
    private view.swing.textfieldcustom.txtfieldcustom input_Tanggal_periksa;
    private view.swing.textfieldcustom.txtfieldcustom input_TempatLahir;
    private view.swing.textfieldcustom.txtfieldcustom input_hamil_ke;
    private view.swing.textfieldcustom.txtfieldcustom input_id_ibu;
    private view.swing.textfieldcustom.txtfieldcustom input_namaibu;
    private view.swing.textfieldcustom.txtfieldcustom input_riwayat_penyakit;
    private view.swing.textfieldcustom.txtfieldcustom input_usiakandungan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel txt_form;
    // End of variables declaration//GEN-END:variables
}
