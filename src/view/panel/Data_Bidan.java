/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.panel;

/**
 *
 * @author RESCOM-1
 */
public class Data_Bidan extends javax.swing.JPanel {

    /**
     * Creates new form Data_Bidan
     */
    public Data_Bidan() {
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

        panelShadow5 = new view.swing.panelcustom.PanelShadow();
        jScrollPane25 = new javax.swing.JScrollPane();
        table25 = new view.swing.Table();

        setBackground(new java.awt.Color(246, 246, 233));

        panelShadow5.setBackground(new java.awt.Color(234, 245, 255));

        jScrollPane25.setBorder(null);

        table25.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane25.setViewportView(table25);

        javax.swing.GroupLayout panelShadow5Layout = new javax.swing.GroupLayout(panelShadow5);
        panelShadow5.setLayout(panelShadow5Layout);
        panelShadow5Layout.setHorizontalGroup(
            panelShadow5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane25, javax.swing.GroupLayout.DEFAULT_SIZE, 961, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        panelShadow5Layout.setVerticalGroup(
            panelShadow5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane25, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(panelShadow5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(panelShadow5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(58, 58, 58))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private view.swing.panelcustom.PanelShadow panelShadow1;
    private view.swing.panelcustom.PanelShadow panelShadow2;
    private view.swing.panelcustom.PanelShadow panelShadow3;
    private view.swing.panelcustom.PanelShadow panelShadow4;
    private view.swing.panelcustom.PanelShadow panelShadow5;
    private view.swing.Table table1;
    private view.swing.Table table2;
    private view.swing.Table table25;
    private view.swing.Table table3;
    private view.swing.Table table4;
    // End of variables declaration//GEN-END:variables
}
