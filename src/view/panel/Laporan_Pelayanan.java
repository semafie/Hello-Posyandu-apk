
package view.panel;
import Repository.imunisasiRepository;
import Repository.pemeriksaan_ibuhamilRepository;
import Repository.penimbanganRepository;
import entity.imunisasi;
import entity.pemeriksaan_ibuhamil;
import entity.penimbangan;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import main.main;
import util.Conn;
import view.dialog.formedit_laporanpelayanan_Penimbangan;
import view.dialog.formedit_laporanpelayanan_ibuhamil;
import view.dialog.formedit_laporanpelayanan_imunisasi;
import view.dialog.validasiberhasil;
public class Laporan_Pelayanan extends javax.swing.JPanel {
    
    public static int id = 0;
    private String pilih1 = "imunisasi";
    
    imunisasiRepository imunisasi = new imunisasiRepository();
    penimbanganRepository penimbangan = new penimbanganRepository();
    pemeriksaan_ibuhamilRepository periksaibu = new pemeriksaan_ibuhamilRepository();
    
    public Laporan_Pelayanan() {
        initComponents();
        dataperiksaibu.setVisible(false);
        datapenimbangan.setVisible(false);
        dataimunisasi1.setVisible(false);
        load_tabelimunisasi();
    }

    public void load_tabelimunisasi(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nama Bayi");
        model.addColumn("Tanggal Imunisasi");
        model.addColumn("Usia");
        model.addColumn("Jenis Imunisasi");
        model.addColumn("Jenis Vitamin");
        model.addColumn("Keterangan");
        
        try {
            for(imunisasi apa:imunisasi.get()){
                model.addRow(new Object[]{
                    apa.getId(),
                    apa.getId_bayi().getNama(),
                    apa.getTanggal_imunisasi(),
                    apa.getUsia() + " bulan",
                    apa.getJenis_imunisasi(),
                    apa.getJenis_vitamin(),
                    apa.getKeterangan()
                });
            }
            table.setModel(model);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void load_tabelimunisasi(String search) {
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("ID");
    model.addColumn("Nama Bayi");
    model.addColumn("Tanggal Imunisasi");
    model.addColumn("Usia");
    model.addColumn("Jenis Imunisasi");
    model.addColumn("Jenis Vitamin");
    model.addColumn("Keterangan");

    try {
        String sql = "SELECT * FROM imunisasi JOIN bayi ON imunisasi.id_bayi = bayi.id WHERE imunisasi.id = ? OR bayi.nama LIKE ? tanggal_imunisasi LIKE ? OR jenis_imunisasi LIKE ? OR jenis_vitamin LIKE ? OR keterangan LIKE ?";
        Connection koneksi = (Connection) Conn.configDB();
        PreparedStatement pst = koneksi.prepareStatement(sql);
        pst.setString(1, "%" + search + "%");
        pst.setString(2, "%" + search + "%");
        pst.setString(3, "%" + search + "%");
        pst.setString(4, "%" + search + "%");
        pst.setString(5, "%" + search + "%");
        pst.setString(6, "%" + search + "%");

        ResultSet res = pst.executeQuery();

        while (res.next()) {
            model.addRow(new Object[]{
                res.getString("id"),
                res.getString("nama_bayi"),
                res.getString("tanggal_imunisasi"),
                res.getString("usia") + " bulan",
                res.getString("jenis_imunisasi"),
                res.getString("jenis_vitamin"),
                res.getString("keterangan")
            });
        }

        table.setModel(model);
    } catch (Exception e) {
        e.printStackTrace();
    }
}

    
    public void load_tabelpenimbangan(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nama Bayi");
        model.addColumn("Tanggal Penimbangan");
        model.addColumn("BB");
        model.addColumn("TB");
        model.addColumn("Deteksi");
        model.addColumn("Keterangan");
        
        try {
            for(penimbangan apa:penimbangan.get()){
                model.addRow(new Object[]{
                    apa.getId(),
                    apa.getId_bayi().getNama(),
                    apa.getTanggal_timbang(),
                    apa.getBb() + " kg",
                    apa.getTb() + " cm",
                    apa.getDeteksi(),
                    apa.getKeterangan()
                });
            }
            table.setModel(model);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void load_tabelpemeriksanibu(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nama Ibu");
        model.addColumn("Tanggal Periksa");
        model.addColumn("Usia Kandungan");
        model.addColumn("Hamil ke");
        model.addColumn("Riwayat Penyakit");
        model.addColumn("BB");
        model.addColumn("TB");
        model.addColumn("Deteksi");
        model.addColumn("Keterangan");
        
        try {
            for(pemeriksaan_ibuhamil apa:periksaibu.get()){
                model.addRow(new Object[]{
                    apa.getId(),
                    apa.getId_ibuhamil().getNama(),
                    apa.getTanggal_periksa(),
                    apa.getUsia_kandungan() + " minggu",
                    apa.getHamil_ke(),
                    apa.getRiwayat_penyakit(),
                    apa.getBb() + " kg",
                    apa.getTb() + " cm",
                    apa.getDeteksi(),
                    apa.getKeterangan()
                });
            }
            table.setModel(model);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        dataperiksaibu = new javax.swing.JLabel();
        datapenimbangan = new javax.swing.JLabel();
        dataimunisasi = new javax.swing.JLabel();
        dataperiksaibu1 = new javax.swing.JLabel();
        dataimunisasi1 = new javax.swing.JLabel();
        datapenimbangan1 = new javax.swing.JLabel();
        pilih = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txt_search = new javax.swing.JTextField();
        bgsearch = new javax.swing.JLabel();
        btnedit = new javax.swing.JLabel();
        btnhapus = new javax.swing.JLabel();
        btnsimpancetak = new javax.swing.JLabel();
        txt_form = new javax.swing.JLabel();
        panelShadow25 = new view.swing.panelcustom.PanelShadow();
        jScrollPane25 = new javax.swing.JScrollPane();
        table = new view.swing.Table();

        setBackground(new java.awt.Color(246, 246, 233));

        jPanel3.setBackground(new Color(0,0,0,0)
        );
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dataperiksaibu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/pilih pemeriksaanibuhamil.png"))); // NOI18N
        dataperiksaibu.setRequestFocusEnabled(false);
        dataperiksaibu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataperiksaibuMouseClicked(evt);
            }
        });
        jPanel3.add(dataperiksaibu, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 8, -1, -1));

        datapenimbangan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/pilih penimbangan.png"))); // NOI18N
        datapenimbangan.setRequestFocusEnabled(false);
        datapenimbangan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datapenimbanganMouseClicked(evt);
            }
        });
        jPanel3.add(datapenimbangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 8, -1, -1));

        dataimunisasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/pilih imunisasi.png"))); // NOI18N
        dataimunisasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataimunisasiMouseClicked(evt);
            }
        });
        jPanel3.add(dataimunisasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 8, -1, -1));

        dataperiksaibu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dataperiksaibu1.setRequestFocusEnabled(false);
        dataperiksaibu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataperiksaibu1MouseClicked(evt);
            }
        });
        jPanel3.add(dataperiksaibu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 10, 140, 20));

        dataimunisasi1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dataimunisasi1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataimunisasi1MouseClicked(evt);
            }
        });
        jPanel3.add(dataimunisasi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 20));

        datapenimbangan1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        datapenimbangan1.setRequestFocusEnabled(false);
        datapenimbangan1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datapenimbangan1MouseClicked(evt);
            }
        });
        jPanel3.add(datapenimbangan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 140, 20));

        pilih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/bg pilih1.png"))); // NOI18N
        jPanel3.add(pilih, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 46));

        jPanel1.setBackground(new Color(0,0,0,0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_search.setBackground(new Color(0,0,0,0)
        );
        txt_search.setBorder(null);
        jPanel1.add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 230, 30));

        bgsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/bgsearch.png"))); // NOI18N
        jPanel1.add(bgsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 284, 57));

        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnedit1.png"))); // NOI18N
        btnedit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btneditMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btneditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btneditMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btneditMousePressed(evt);
            }
        });

        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnhapus1.png"))); // NOI18N
        btnhapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnhapusMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnhapusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnhapusMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnhapusMousePressed(evt);
            }
        });

        btnsimpancetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnsimpan&cetak1.png"))); // NOI18N
        btnsimpancetak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsimpancetakMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsimpancetakMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsimpancetakMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnsimpancetakMousePressed(evt);
            }
        });

        txt_form.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/txt_Laporan Pemeriksaan Ibu Hamil.png"))); // NOI18N

        panelShadow25.setBackground(new java.awt.Color(234, 245, 255));

        jScrollPane25.setBorder(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane25.setViewportView(table);

        javax.swing.GroupLayout panelShadow25Layout = new javax.swing.GroupLayout(panelShadow25);
        panelShadow25.setLayout(panelShadow25Layout);
        panelShadow25Layout.setHorizontalGroup(
            panelShadow25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow25Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane25)
                .addGap(30, 30, 30))
        );
        panelShadow25Layout.setVerticalGroup(
            panelShadow25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow25Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane25, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelShadow25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnsimpancetak))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap(743, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnedit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnhapus))
                            .addComponent(txt_form)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_form, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelShadow25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(btnsimpancetak)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnsimpancetakMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpancetakMousePressed
        btnsimpancetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnsimpan&cetak3.png")));
    }//GEN-LAST:event_btnsimpancetakMousePressed

    private void btnsimpancetakMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpancetakMouseExited
        btnsimpancetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnsimpan&cetak1.png")));
    }//GEN-LAST:event_btnsimpancetakMouseExited

    private void btnsimpancetakMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpancetakMouseEntered
        btnsimpancetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnsimpan&cetak2.png")));
    }//GEN-LAST:event_btnsimpancetakMouseEntered

    private void btnsimpancetakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpancetakMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsimpancetakMouseClicked

    private void btnhapusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhapusMousePressed
        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnhapus3.png")));
    }//GEN-LAST:event_btnhapusMousePressed

    private void btnhapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhapusMouseExited
        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnhapus1.png")));
    }//GEN-LAST:event_btnhapusMouseExited

    private void btnhapusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhapusMouseEntered
        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnhapus2.png")));
    }//GEN-LAST:event_btnhapusMouseEntered

    private void btnhapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhapusMouseClicked
    if(pilih1.equals("imunisasi")){
        boolean cobak = imunisasi.delete(id);
        if(cobak){
            main wow = (main)SwingUtilities.getWindowAncestor(this);
            validasiberhasil aa = new validasiberhasil(wow,"Data Berhasil di hapus");
            aa.showPopUp();
            load_tabelimunisasi();
        }
    }else if(pilih1.equals("penimbangan")){
        boolean cobak1 = penimbangan.delete(id);
        if(cobak1){
             main wow = (main)SwingUtilities.getWindowAncestor(this);
            validasiberhasil aa = new validasiberhasil(wow,"Data Berhasil di hapus");
            aa.showPopUp();
            load_tabelpenimbangan();
        }
    }else{
        boolean cobak2 = periksaibu.delete(id);
        if(cobak2){
            main wow = (main)SwingUtilities.getWindowAncestor(this);
            validasiberhasil aa = new validasiberhasil(wow,"Data Berhasil di hapus");
            aa.showPopUp();
            load_tabelpemeriksanibu();
        }
    }
    }//GEN-LAST:event_btnhapusMouseClicked

    private void btneditMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditMousePressed
        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnedit3.png")));
    }//GEN-LAST:event_btneditMousePressed

    private void btneditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditMouseExited
        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnedit1.png")));
    }//GEN-LAST:event_btneditMouseExited

    private void btneditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditMouseEntered
        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnedit2.png")));
    }//GEN-LAST:event_btneditMouseEntered

    private void btneditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditMouseClicked
    if (pilih1.equals("imunisasi")){
        main main = (main)SwingUtilities.getWindowAncestor(this);
        formedit_laporanpelayanan_imunisasi a = new formedit_laporanpelayanan_imunisasi(main);
        a.showPopUp();
        load_tabelimunisasi();
    }else if(pilih1.equals("penimbangan")){
        main main = (main)SwingUtilities.getWindowAncestor(this);
        formedit_laporanpelayanan_Penimbangan a = new formedit_laporanpelayanan_Penimbangan(main);
        a.showPopUp();
        load_tabelpenimbangan();
    } else{
        main mian =(main)SwingUtilities.getWindowAncestor(this);
        formedit_laporanpelayanan_ibuhamil apa = new formedit_laporanpelayanan_ibuhamil(mian);
        apa.showPopUp();
        load_tabelpemeriksanibu();
    }
    }//GEN-LAST:event_btneditMouseClicked

    private void dataimunisasi1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataimunisasi1MouseClicked
    dataperiksaibu.setVisible(false);
        datapenimbangan.setVisible(false);
        dataimunisasi1.setVisible(false);
        dataperiksaibu1.setVisible(true);
        datapenimbangan1.setVisible(true);
        dataimunisasi.setVisible(true);
        pilih1 = "imunasasi";
        load_tabelimunisasi();
    }//GEN-LAST:event_dataimunisasi1MouseClicked

    private void datapenimbanganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datapenimbanganMouseClicked
    
    }//GEN-LAST:event_datapenimbanganMouseClicked

    private void dataperiksaibuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataperiksaibuMouseClicked
    
    }//GEN-LAST:event_dataperiksaibuMouseClicked

    private void datapenimbangan1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datapenimbangan1MouseClicked
    datapenimbangan.setVisible(true);
    dataimunisasi1.setVisible(true);
    dataperiksaibu1.setVisible(true);
    datapenimbangan1.setVisible(false);
    dataperiksaibu.setVisible(false);
    dataimunisasi.setVisible(false);
    pilih1 = "penimbangan";
    load_tabelpenimbangan();
    }//GEN-LAST:event_datapenimbangan1MouseClicked

    private void dataperiksaibu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataperiksaibu1MouseClicked
    dataperiksaibu.setVisible(true);
    dataimunisasi1.setVisible(true);
    datapenimbangan1.setVisible(true);
    dataperiksaibu1.setVisible(false);
    dataimunisasi.setVisible(false);
    datapenimbangan.setVisible(false);
    pilih1 = "periksaibu";
    load_tabelpemeriksanibu();
    }//GEN-LAST:event_dataperiksaibu1MouseClicked

    private void dataimunisasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataimunisasiMouseClicked
    
    }//GEN-LAST:event_dataimunisasiMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int baris = table.rowAtPoint(evt.getPoint());
        String idd = table.getValueAt(baris, 0).toString();
        id = Integer.valueOf(idd);
    }//GEN-LAST:event_tableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgsearch;
    private javax.swing.JLabel btnedit;
    private javax.swing.JLabel btnhapus;
    private javax.swing.JLabel btnsimpancetak;
    private javax.swing.JLabel dataimunisasi;
    private javax.swing.JLabel dataimunisasi1;
    private javax.swing.JLabel datapenimbangan;
    private javax.swing.JLabel datapenimbangan1;
    private javax.swing.JLabel dataperiksaibu;
    private javax.swing.JLabel dataperiksaibu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane25;
    private view.swing.panelcustom.PanelShadow panelShadow25;
    private javax.swing.JLabel pilih;
    private view.swing.Table table;
    private javax.swing.JLabel txt_form;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
