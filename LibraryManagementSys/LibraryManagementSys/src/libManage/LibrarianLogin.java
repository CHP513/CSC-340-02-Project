package libManage;
/**
 * @author Frank Einstein\
 * @author Charles Brady
 * 
 * Last updated 2/20
 * 
 * This class is for the login for the librarians
 */
public class LibrarianLogin extends VerifyLogin {

    /**
     * Creates new form librarianLogin1
     */
    public LibrarianLogin() {
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

        loginLabel = new javax.swing.JLabel();
        librarian_username_label = new javax.swing.JLabel();
        librarian_password_label = new javax.swing.JLabel();
        librarian_username_txtfield = new javax.swing.JTextField();
        librarian_password_txtfield = new javax.swing.JTextField();
        libLoginButton = new javax.swing.JButton();
        libLoginExitButton = new javax.swing.JButton();

        loginLabel.setText("Librarian Login");

        librarian_username_label.setText("Username");

        librarian_password_label.setText("Password");

        librarian_username_txtfield.setText("Username");

        librarian_password_txtfield.setText("Password");

        libLoginButton.setText("Login");
        libLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libLoginButtonActionPerformed(evt);
            }
        });

        libLoginExitButton.setText("Exit Program");
        libLoginExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libLoginExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(librarian_username_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(librarian_username_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(librarian_password_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(librarian_password_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(loginLabel)))
                .addContainerGap(173, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(libLoginExitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(libLoginButton)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginLabel)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(librarian_username_label)
                    .addComponent(librarian_username_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(librarian_password_label)
                    .addComponent(librarian_password_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(libLoginButton)
                    .addComponent(libLoginExitButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void libLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libLoginButtonActionPerformed

        String username = librarian_username_txtfield.getText();
        String password = librarian_password_txtfield.getText();
        String filePath = "librarians.txt";

        verifyLogin(username, password, filePath);
    }//GEN-LAST:event_libLoginButtonActionPerformed

    private void libLoginExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libLoginExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_libLoginExitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton libLoginButton;
    private javax.swing.JButton libLoginExitButton;
    private javax.swing.JLabel librarian_password_label;
    private javax.swing.JTextField librarian_password_txtfield;
    private javax.swing.JLabel librarian_username_label;
    private javax.swing.JTextField librarian_username_txtfield;
    private javax.swing.JLabel loginLabel;
    // End of variables declaration//GEN-END:variables
}