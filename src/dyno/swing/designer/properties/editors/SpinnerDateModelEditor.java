/*
 * SpinnerListModelEditor.java
 *
 * Created on 2007��9��1��, ����11:58
 */

package dyno.swing.designer.properties.editors;

import dyno.swing.designer.properties.editors.accessibles.AccessibleEditor;
import dyno.swing.designer.properties.ValidationException;
import dyno.swing.designer.properties.items.CalendarItems;
import dyno.swing.designer.properties.items.ItemProvider;
import dyno.swing.designer.properties.types.Item;
import java.awt.Component;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerDateModel;
import javax.swing.event.ChangeListener;

/**
 *
 * @author  William Chen
 */
public class SpinnerDateModelEditor extends javax.swing.JPanel implements AccessibleEditor {
    private static ItemProvider provider=new CalendarItems();
    /** Creates new form SpinnerListModelEditor */
    public SpinnerDateModelEditor() {
        initComponents();
        initializeCalendarFields();
    }

    private void initializeCalendarFields() {
        DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
        Item[]calendar_items=provider.getItems();
        for (Item item : calendar_items) {
            dcbm.addElement(item);
        }
        cmbStepSize.setModel(dcbm);
        cmbStepSize.setSelectedIndex(5);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        spInitValue = new javax.swing.JSpinner();
        cbMin = new javax.swing.JCheckBox();
        cbMax = new javax.swing.JCheckBox();
        spMin = new javax.swing.JSpinner();
        spMax = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        cbInitNow = new javax.swing.JCheckBox();
        cbMinNow = new javax.swing.JCheckBox();
        cbMaxNow = new javax.swing.JCheckBox();
        cmbStepSize = new javax.swing.JComboBox();

        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Spinner Number Model", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), java.awt.Color.black));

        jLabel2.setText("Initial Value:");

        spInitValue.setModel(new javax.swing.SpinnerDateModel());
        spInitValue.setPreferredSize(new java.awt.Dimension(29, 24));

        cbMin.setText("Minimum:");
        cbMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMinActionPerformed(evt);
            }
        });

        cbMax.setText("Maximum:");
        cbMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMaxActionPerformed(evt);
            }
        });

        spMin.setModel(new javax.swing.SpinnerDateModel());
        spMin.setEnabled(false);
        spMin.setPreferredSize(new java.awt.Dimension(29, 24));

        spMax.setModel(new javax.swing.SpinnerDateModel());
        spMax.setEnabled(false);
        spMax.setPreferredSize(new java.awt.Dimension(29, 24));

        jLabel3.setText("Step Size:");

        cbInitNow.setText("Now");
        cbInitNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbInitNowActionPerformed(evt);
            }
        });

        cbMinNow.setText("Now");
        cbMinNow.setEnabled(false);
        cbMinNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMinNowActionPerformed(evt);
            }
        });

        cbMaxNow.setText("Now");
        cbMaxNow.setEnabled(false);
        cbMaxNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMaxNowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbMax)
                    .addComponent(jLabel2)
                    .addComponent(cbMin)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbStepSize, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spMax, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(spMin, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(spInitValue, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbInitNow)
                    .addComponent(cbMinNow)
                    .addComponent(cbMaxNow))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cmbStepSize, spInitValue, spMax, spMin});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbInitNow)
                    .addComponent(spInitValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMin)
                    .addComponent(spMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMinNow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMax)
                    .addComponent(spMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMaxNow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbStepSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMinActionPerformed
        boolean min = cbMin.isSelected();
        boolean now = cbMinNow.isSelected();
        spMin.setEnabled(min && !now);
        cbMinNow.setEnabled(min);
    }//GEN-LAST:event_cbMinActionPerformed

    private void cbMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMaxActionPerformed
        boolean max = cbMax.isSelected();
        boolean now = cbMaxNow.isSelected();
        spMax.setEnabled(max && !now);
        cbMaxNow.setEnabled(max);
    }//GEN-LAST:event_cbMaxActionPerformed

    private void cbInitNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbInitNowActionPerformed
        boolean b = cbInitNow.isSelected();
        spInitValue.setEnabled(!b);        
    }//GEN-LAST:event_cbInitNowActionPerformed

    private void cbMinNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMinNowActionPerformed
        boolean now=cbMinNow.isSelected();
        boolean min = cbMin.isSelected();
        spMin.setEnabled(min && !now);
    }//GEN-LAST:event_cbMinNowActionPerformed

    private void cbMaxNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMaxNowActionPerformed
        boolean now=cbMaxNow.isSelected();
        boolean max = cbMax.isSelected();
        spMax.setEnabled(max && !now);
    }//GEN-LAST:event_cbMaxNowActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbInitNow;
    private javax.swing.JCheckBox cbMax;
    private javax.swing.JCheckBox cbMaxNow;
    private javax.swing.JCheckBox cbMin;
    private javax.swing.JCheckBox cbMinNow;
    private javax.swing.JComboBox cmbStepSize;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSpinner spInitValue;
    private javax.swing.JSpinner spMax;
    private javax.swing.JSpinner spMin;
    // End of variables declaration//GEN-END:variables
    public void validateValue() throws ValidationException {
    }

    public Object getValue() {
        boolean isInitNow=cbInitNow.isSelected();
        Date initDate=(Date) spInitValue.getValue();
        boolean hasMin=cbMin.isSelected();
        boolean isMinNow=cbMinNow.isSelected();
        Date minDate=(Date) spMin.getValue();
        boolean hasMax=cbMax.isSelected();
        boolean isMaxNow=cbMaxNow.isSelected();
        Date maxDate=(Date) spMax.getValue();
        Item item=(Item)cmbStepSize.getSelectedItem();
        int calendar_field=(Integer)item.getValue();
        return new SpinnerDateModel(initDate, 
                hasMin?(isMinNow?new Date():minDate):null, 
                hasMax?(isMaxNow?new Date():maxDate):null, 
                calendar_field);
    }

    public void setValue(Object v) {
        
    }

    public Component getEditor() {
        return this;
    }

    public void addChangeListener(ChangeListener l) {
    }

    public void removeChangeListener(ChangeListener l) {
    }
}