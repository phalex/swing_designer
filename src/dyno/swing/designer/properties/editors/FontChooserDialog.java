/*
 * FontChooserDialog.java
 *
 * Created on 2007��8��15��, ����12:15
 */

package dyno.swing.designer.properties.editors;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Window;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author  William Chen
 */
public class FontChooserDialog extends javax.swing.JDialog {

    private boolean OK;
    private Font fontValue;
    public FontChooserDialog(Window parent, boolean modal) {
        super(parent);
        setModal(modal);
        initComponents();
        initFontFamily();
        initFontStyle();
        initFontSize();
    }
    private void initFontSize() {
        DefaultListModel mSize = new DefaultListModel();
        mSize.addElement(3);
        mSize.addElement(5);
        mSize.addElement(8);
        mSize.addElement(10);
        mSize.addElement(12);
        mSize.addElement(14);
        mSize.addElement(18);
        mSize.addElement(24);
        mSize.addElement(36);
        mSize.addElement(48);
        lstSize.setModel(mSize);
    }

    private void initFontStyle() {
        DefaultListModel mStyle = new DefaultListModel();
        mStyle.addElement("Plain");
        mStyle.addElement("Bold");
        mStyle.addElement("Italic");
        mStyle.addElement("Bold Italic");
        lstStyle.setModel(mStyle);
    }

    private void initFontFamily() {
        DefaultListModel mFamily = new DefaultListModel();
        String[] font_families = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String family_name : font_families) {
            mFamily.addElement(family_name);
        }
        lstFamily.setModel(mFamily);
    }

    public boolean isOK() {
        return OK;
    }

    public Font getFontValue() {
        return fontValue;
    }

    public void setFontValue(Font f) {
        if (f != null) {
            txtFamily.setText(f.getFamily());
            lstFamily.setSelectedValue(f.getFamily(), true);
            String style = "Plain";
            switch (f.getStyle()) {
                case Font.PLAIN:
                    style = "Plain";
                    break;
                case Font.BOLD:
                    style = "Bold";
                    break;
                case Font.ITALIC:
                    style = "Italic";
                    break;
                case Font.BOLD | Font.ITALIC:
                    style = "Bold Italic";
                    break;
            }
            txtStyle.setText(style);
            lstStyle.setSelectedValue(style, true);
            txtSize.setText("" + f.getSize());
            lstSize.setSelectedValue(f.getSize(), true);
            lblPreview.setFont(f);
            lblPreview.setText(f.getFamily() + " " + f.getSize() + " " + style);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFamily = new javax.swing.JTextField();
        txtStyle = new javax.swing.JTextField();
        txtSize = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstFamily = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstStyle = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstSize = new javax.swing.JList();
        btnCancel = new javax.swing.JButton();
        btnOK = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblPreview = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Choose Font");
        setModal(true);

        jLabel1.setText("Font:");

        jLabel2.setText("Font Style:");

        jLabel3.setText("Size:");

        txtFamily.setEditable(false);

        txtStyle.setEditable(false);

        txtSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSizeActionPerformed(evt);
            }
        });

        lstFamily.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstFamily.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstFamily.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstFamilyValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstFamily);

        lstStyle.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstStyle.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstStyle.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstStyleValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstStyle);

        lstSize.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstSize.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstSize.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstSizeValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(lstSize);

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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Preview"));
        jPanel2.setLayout(new java.awt.BorderLayout());

        lblPreview.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPreview.setText("jLabel4");
        jPanel2.add(lblPreview, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFamily, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(txtStyle, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(txtSize, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                        .addComponent(btnOK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancel, btnOK});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStyle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFamily, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, 0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, 0, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnOK))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        OK = false;
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        String family = txtFamily.getText();
        if (family.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Please choose a font family!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String style = txtStyle.getText();
        if (style.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Please choose a font style!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String size = txtSize.getText();
        if (size.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Please choose a font size!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            int isize = Integer.parseInt(size);
            if (isize < 3) {
                JOptionPane.showMessageDialog(this, "Font size should be an integer bigger than 2!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            int istyle = Font.PLAIN;
            if (style.equals("Plain")) {
                istyle = Font.PLAIN;
            } else if (style.equals("Bold")) {
                istyle = Font.BOLD;
            } else if (style.equals("Italic")) {
                istyle = Font.ITALIC;
            } else if (style.equals("Bold Italic")) {
                istyle = Font.ITALIC | Font.BOLD;
            }
            OK = true;
            fontValue = new Font(family, istyle, isize);
            dispose();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Font size should be an integer!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void lstFamilyValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstFamilyValueChanged
        String family = (String) lstFamily.getSelectedValue();
        txtFamily.setText(family);
        refreshPreview();
    }//GEN-LAST:event_lstFamilyValueChanged

    private void lstStyleValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstStyleValueChanged
        String style = (String) lstStyle.getSelectedValue();
        txtStyle.setText(style);
        refreshPreview();
    }//GEN-LAST:event_lstStyleValueChanged

    private void lstSizeValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstSizeValueChanged
        String size = ((Integer) lstSize.getSelectedValue()).toString();
        txtSize.setText(size);
        refreshPreview();
    }//GEN-LAST:event_lstSizeValueChanged

    private void txtSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSizeActionPerformed
        String tSize = txtSize.getText();
        try {
            int size = Integer.parseInt(tSize);
            if (size < 3) {
                JOptionPane.showMessageDialog(this, "Font size should be an integer bigger than 2!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            lstSize.setSelectedValue(size, true);
            refreshPreview();
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Font size should be an integer!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtSizeActionPerformed

    private void refreshPreview() {
        String family = txtFamily.getText();
        if (family.trim().length() == 0) {
            return;
        }
        String style = txtStyle.getText();
        if (style.trim().length() == 0) {
            return;
        }
        String size = txtSize.getText();
        if (size.trim().length() == 0) {
            return;
        }
        try {
            int isize = Integer.parseInt(size);
            if (isize < 3) {
                return;
            }
            int istyle = Font.PLAIN;
            if (style.equals("Plain")) {
                istyle = Font.PLAIN;
            } else if (style.equals("Bold")) {
                istyle = Font.BOLD;
            } else if (style.equals("Italic")) {
                istyle = Font.ITALIC;
            } else if (style.equals("Bold Italic")) {
                istyle = Font.ITALIC | Font.BOLD;
            }
            Font f = new Font(family, istyle, isize);
            lblPreview.setFont(f);
            lblPreview.setText(f.getFamily() + " " + f.getSize() + " " + style);
        } catch (NumberFormatException e) {
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                FontChooserDialog dialog = new FontChooserDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblPreview;
    private javax.swing.JList lstFamily;
    private javax.swing.JList lstSize;
    private javax.swing.JList lstStyle;
    private javax.swing.JTextField txtFamily;
    private javax.swing.JTextField txtSize;
    private javax.swing.JTextField txtStyle;
    // End of variables declaration//GEN-END:variables
}
