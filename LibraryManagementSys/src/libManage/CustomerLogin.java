package libManage;
/**
 *
 * @author Frank Einstein
 * @author Charles Brady
 * 
 * Last updated 2/20
 */
public class CustomerLogin extends VerifyLogin {

    /** Creates new form CustomerLogin */
    public CustomerLogin() {
        initComponents();
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customer_username_txtfield = new javax.swing.JTextField();
        customer_password_txtfield = new javax.swing.JTextField();
        cust_login_button = new javax.swing.JButton();
        custLoginLbl = new javax.swing.JLabel();
        custLoginExitButton = new javax.swing.JButton();
        customer_username_label = new javax.swing.JLabel();
        customer_password_label = new javax.swing.JLabel();

        customer_username_txtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_username_txtfieldActionPerformed(evt);
            }
        });

        cust_login_button.setText("Login");
        cust_login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cust_login_buttonActionPerformed(evt);
            }
        });

        custLoginLbl.setText("Customer Login");

        custLoginExitButton.setText("Exit Program");
        custLoginExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custLoginExitButtonActionPerformed(evt);
            }
        });

        customer_username_label.setText("Username");

        customer_password_label.setText("Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(custLoginLbl)
                        .addGap(0, 165, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(customer_username_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(customer_username_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(customer_password_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(customer_password_txtfield))
                            .addComponent(custLoginExitButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cust_login_button)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(custLoginLbl)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customer_username_label)
                    .addComponent(customer_username_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customer_password_label)
                    .addComponent(customer_password_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cust_login_button)
                    .addComponent(custLoginExitButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cust_login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cust_login_buttonActionPerformed
        String username = customer_username_txtfield.getText();
        String password = customer_password_txtfield.getText();
        String filePath = "customers.txt";

        verifyLogin(username, password, filePath);
        
    }//GEN-LAST:event_cust_login_buttonActionPerformed
  
    private void custLoginExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custLoginExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_custLoginExitButtonActionPerformed

    private void customer_username_txtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_username_txtfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customer_username_txtfieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton custLoginExitButton;
    private javax.swing.JLabel custLoginLbl;
    private javax.swing.JButton cust_login_button;
    private javax.swing.JLabel customer_password_label;
    private javax.swing.JTextField customer_password_txtfield;
    private javax.swing.JLabel customer_username_label;
    private javax.swing.JTextField customer_username_txtfield;
    // End of variables declaration//GEN-END:variables

}
