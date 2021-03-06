/*
 * BorderDefinitionDialog.java
 *
 * Created on 2007��8��27��, ����4:04
 */

package dyno.swing.designer.properties.editors;

import dyno.swing.designer.properties.BorderItem;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.SoftBevelBorder;

/**
 *
 * @author  William Chen
 */
public class BorderDefinitionDialog extends javax.swing.JDialog {

    private Border value;
    private boolean OK;

    /** Creates new form BorderDefinitionDialog */
    public BorderDefinitionDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public boolean isOK() {
        return OK;
    }

    public void setValue(Border border) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.addElement(new BorderItem(null));
        model.addElement(new BorderItem(BorderFactory.createBevelBorder(BevelBorder.RAISED)));
        model.addElement(new BorderItem(BorderFactory.createCompoundBorder()));
        model.addElement(new BorderItem(BorderFactory.createEmptyBorder()));
        model.addElement(new BorderItem(BorderFactory.createEtchedBorder()));
        model.addElement(new BorderItem(BorderFactory.createLineBorder(Color.black)));
        model.addElement(new BorderItem(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black)));
        model.addElement(new BorderItem(new SoftBevelBorder(BevelBorder.RAISED)));
        model.addElement(new BorderItem(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "title")));
        int index = model.getIndexOf(new BorderItem(border));
        if (index != -1) {
            BorderItem item = (BorderItem) model.getElementAt(index);
            item.setBorder(border);
            model.setSelectedItem(item);
            bptProperties.setBean(item);
        }
        value=border;
        cmbBorders.setModel(model);
    }

    public Border getValue() {
        return value;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbBorders = new javax.swing.JComboBox();
        scrollPane = new javax.swing.JScrollPane();
        bptProperties = new dyno.swing.designer.properties.BorderPropertyTable();
        btnCancel = new javax.swing.JButton();
        btnOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cmbBorders.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbBorders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBordersActionPerformed(evt);
            }
        });

        bptProperties.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        scrollPane.setViewportView(bptProperties);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                    .addComponent(cmbBorders, 0, 382, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnOK)
                        .addGap(19, 19, 19)
                        .addComponent(btnCancel)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancel, btnOK});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbBorders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOK)
                    .addComponent(btnCancel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbBordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBordersActionPerformed
        BorderItem item = (BorderItem) cmbBorders.getSelectedItem();
        bptProperties.setBean(item);
        bptProperties.repaint();
    }//GEN-LAST:event_cmbBordersActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        OK = false;
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        if(bptProperties.isEditing()){
            bptProperties.getCellEditor().stopCellEditing();
            bptProperties.removeEditor();            
        }
        BorderItem item = (BorderItem) cmbBorders.getSelectedItem();
        value = item.getBorder();
        OK = true;
        dispose();
    }//GEN-LAST:event_btnOKActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                BorderDefinitionDialog dialog = new BorderDefinitionDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private dyno.swing.designer.properties.BorderPropertyTable bptProperties;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOK;
    private javax.swing.JComboBox cmbBorders;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
}