/*
 * SpinnerListModelEditor.java
 *
 * Created on 2007��9��1��, ����11:58
 */

package dyno.swing.designer.properties.editors;

import dyno.swing.designer.properties.editors.accessibles.AccessibleEditor;
import dyno.swing.designer.properties.ValidationException;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import javax.swing.SpinnerListModel;
import javax.swing.event.ChangeListener;

/**
 *
 * @author  William Chen
 */
public class SpinnerListModelEditor extends javax.swing.JPanel implements AccessibleEditor {

    /** Creates new form SpinnerListModelEditor */
    public SpinnerListModelEditor() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtList = new javax.swing.JTextArea();

        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Spinner List Model", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), java.awt.Color.black));

        txtList.setColumns(20);
        txtList.setRows(5);
        jScrollPane1.setViewportView(txtList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtList;
    // End of variables declaration//GEN-END:variables
    public void validateValue() throws ValidationException {
    }

    public Object getValue() {
        try {
            StringReader r = new StringReader(txtList.getText());
            BufferedReader br = new BufferedReader(r);
            SpinnerListModel m = new SpinnerListModel();
            ArrayList<String> lists = new ArrayList<String>();
            String line;
            while ((line = br.readLine()) != null) {
                lists.add(line);
            }
            if (lists.size() > 0) {
                m.setList(lists);
            }
            return m;
        } catch (IOException ex) {
            ex.printStackTrace();
            return new SpinnerListModel();
        }
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