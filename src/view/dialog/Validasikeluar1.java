/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.dialog;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import main.main;
import main.mainlogin;

/**
 *
 * @author RESCOM-1
 */
public class Validasikeluar1 extends Dialog {

    /**
     * Creates new form Validasikeluar
     */
    public Validasikeluar1(JFrame fram) {
        super(fram);
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

        btnya = new javax.swing.JLabel();
        btntidak = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        btnya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnya1.png"))); // NOI18N
        btnya.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnyaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnyaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnyaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnyaMousePressed(evt);
            }
        });
        getContentPane().add(btnya);
        btnya.setBounds(130, 270, 120, 40);

        btntidak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btntidak1.png"))); // NOI18N
        btntidak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btntidakMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btntidakMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btntidakMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btntidakMousePressed(evt);
            }
        });
        getContentPane().add(btntidak);
        btntidak.setBounds(330, 270, 120, 40);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/Validasilogoutakun.png"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 570, 333);

        setSize(new java.awt.Dimension(585, 341));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnyaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnyaMouseClicked
    main main = (main)SwingUtilities.getWindowAncestor(this);
    main.dispose();
    new mainlogin().setVisible(true);
    
    }//GEN-LAST:event_btnyaMouseClicked

    private void btntidakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntidakMouseClicked
    closeMessage();
    }//GEN-LAST:event_btntidakMouseClicked

    private void btnyaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnyaMouseEntered
    btnya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnya2.png")));
    }//GEN-LAST:event_btnyaMouseEntered

    private void btnyaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnyaMouseExited
    btnya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnya1.png")));
    }//GEN-LAST:event_btnyaMouseExited

    private void btnyaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnyaMousePressed
    btnya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnya3.png")));
    }//GEN-LAST:event_btnyaMousePressed

    private void btntidakMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntidakMouseEntered
    btntidak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btntidak2.png")));
    }//GEN-LAST:event_btntidakMouseEntered

    private void btntidakMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntidakMouseExited
    btntidak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btntidak1.png")));
    }//GEN-LAST:event_btntidakMouseExited

    private void btntidakMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntidakMousePressed
    btntidak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btntidak3.png")));
    }//GEN-LAST:event_btntidakMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel btntidak;
    private javax.swing.JLabel btnya;
    // End of variables declaration//GEN-END:variables
}
