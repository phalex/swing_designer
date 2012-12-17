/*
 * IconChooserDialog.java
 *
 * Created on 2007��8��27��, ����2:27
 */
package dyno.swing.designer.properties.editors;

import dyno.swing.designer.properties.types.DesignTimeImage;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author  William Chen
 */
public class ImageChooserDialog extends javax.swing.JDialog {

    private DesignTimeImage value;
    private boolean OK;

    /** Creates new form IconChooserDialog */
    public ImageChooserDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public ImageChooserDialog(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public boolean isOK() {
        return OK;
    }

    public void setValue(Image image) {
        if (image instanceof DesignTimeImage) {
            value = (DesignTimeImage) image;
        } else {
            value = new DesignTimeImage();
            value.setImage(image);
            value.setPath(null);
        }
        String path = value.getPath();
        txtPath.setText(path == null ? "" : path);
        if (value.getImage() != null) {
            lblImg.setIcon(new ImageIcon(value.getImage()));
        } else {
            lblImg.setIcon(null);
        }
    }

    public Image getValue() {
        return value;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lblImg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtPath = new javax.swing.JTextField();
        btnBrowse = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Choose Icon");
        setModal(true);

        jScrollPane1.setViewportView(lblImg);

        jLabel1.setText("File Path:");

        txtPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPathActionPerformed(evt);
            }
        });

        btnBrowse.setText("Browse ...");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPath, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBrowse))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                        .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBrowse, btnCancel, btnOK});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnOK))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        OK = false;
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private DesignTimeImage updateIcon(String file_path) {
        File file = new File(file_path);
        if (!file.exists()) {
            JOptionPane.showMessageDialog(this, file_path + " does not exist!", "ERROR", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        Image img = Toolkit.getDefaultToolkit().getImage(file_path);
        if (img == null) {
            JOptionPane.showMessageDialog(this, file_path + " is not a proper image file!", "ERROR", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        DesignTimeImage dti = new DesignTimeImage();
        dti.setImage(img);
        dti.setPath(file_path);
        return dti;
    }

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        String file_path = txtPath.getText().trim();
        if (file_path.length() == 0) {
            value = null;
            OK = true;
            dispose();
        } else {
            DesignTimeImage dti = updateIcon(file_path);
            if (dti != null) {
                setValue(dti);
                OK = true;
                dispose();
            }
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        JFileChooser file_chooser = new JFileChooser();
        file_chooser.setDialogType(JFileChooser.OPEN_DIALOG);
        file_chooser.setFileFilter(new FileFilter() {

                    @Override
            public boolean accept(File f) {
                        String fname = f.getName();
                        return f.isDirectory() || fname.endsWith(".gif") || fname.endsWith(".jpg") || fname.endsWith(".png");
                    }

                    @Override
            public String getDescription() {
                        return "*.gif;*.jpg;*.png";
                    }
                });
        file_chooser.setCurrentDirectory(new File("."));
        int btn = file_chooser.showOpenDialog(this);
        if (btn == JFileChooser.APPROVE_OPTION) {
            try {
                String file_path = file_chooser.getSelectedFile().getCanonicalPath();
                DesignTimeImage dti = updateIcon(file_path);
                if (dti != null) {
                    setValue(dti);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void txtPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPathActionPerformed
        btnOKActionPerformed(evt);
    }//GEN-LAST:event_txtPathActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImg;
    private javax.swing.JTextField txtPath;
    // End of variables declaration//GEN-END:variables
}