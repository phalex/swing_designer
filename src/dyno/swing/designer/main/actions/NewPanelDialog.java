/*
 * NewPanelDialog.java
 *
 * Created on 2007��9��17��, ����11:32
 */

package dyno.swing.designer.main.actions;

import dyno.swing.designer.beans.Util;
import dyno.swing.designer.properties.types.Item;
import java.util.StringTokenizer;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author  rehte
 */
public class NewPanelDialog extends javax.swing.JDialog {

    private boolean OK;
    private String className;
    private String packageName;
    private Item selectedType;
    public boolean isOK(){
        return OK;
    }
    public String getClassName(){
        return className;
    }
    public String getPackageName(){
        return packageName;
    }
    /** Creates new form NewPanelDialog */
    public NewPanelDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        DefaultComboBoxModel types=new DefaultComboBoxModel();
        for(Item item:Util.getGuiTypes())
            types.addElement(item);
        cmbType.setModel(types);        
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
        txtClassName = new javax.swing.JTextField();
        txtPackageName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cmbType = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New JPanel");
        setModal(true);

        jLabel1.setText("Class Name:");

        jLabel2.setText("Package Name:");

        txtClassName.setText("NewJFrame");
        txtClassName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClassNameActionPerformed(evt);
            }
        });

        txtPackageName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPackageNameActionPerformed(evt);
            }
        });

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("GUI Type:");

        cmbType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPackageName, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(txtClassName, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(cmbType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtClassName, txtPackageName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtClassName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPackageName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtClassNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClassNameActionPerformed
        jButton2ActionPerformed(evt);
}//GEN-LAST:event_txtClassNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        OK=false;
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String cn=txtClassName.getText().trim();
        if(cn.length()==0){
            JOptionPane.showMessageDialog(this, "Please input new class name!");
            return;
        }
        if(!isSyntaxCorrect(cn)){
            JOptionPane.showMessageDialog(this, cn + " is not correct class name!");
            return;
        }
        className=cn;
        String pack=txtPackageName.getText().trim();
        if(pack.length()==0){
            packageName=null;
        }else{
            StringTokenizer tokenizer=new StringTokenizer(pack, ".");
            while(tokenizer.hasMoreTokens()){
                String token=tokenizer.nextToken();
                if(!isSyntaxCorrect(token)){
                    JOptionPane.showMessageDialog(this, pack + " is not correct package name!");
                    return;
                }
            }
            packageName=pack;
        }
        selectedType=(Item)cmbType.getSelectedItem();
        OK=true;
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtPackageNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPackageNameActionPerformed
        jButton2ActionPerformed(evt);
    }//GEN-LAST:event_txtPackageNameActionPerformed

    private void cmbTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTypeActionPerformed
        Item item=(Item)cmbType.getSelectedItem();
        if(item!=null){
            txtClassName.setText((String)item.getValue());
        }
    }//GEN-LAST:event_cmbTypeActionPerformed
    private boolean isSyntaxCorrect(String identifier){
        if(Util.isStringNull(identifier))
            return false;
        char c=identifier.charAt(0);
        if(!Character.isJavaIdentifierStart(c))
            return false;
        for(int i=1;i<identifier.length();i++){
            c=identifier.charAt(i);
            if(!Character.isJavaIdentifierPart(c))
                return false;
        }
        return true;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewPanelDialog dialog = new NewPanelDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox cmbType;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtClassName;
    private javax.swing.JTextField txtPackageName;
    // End of variables declaration//GEN-END:variables

    public Item getSelectedType() {
        return selectedType;
    }

    public void setSelectedType(Item selectedType) {
        this.selectedType = selectedType;
    }
    
}
