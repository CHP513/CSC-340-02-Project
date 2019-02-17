/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libManage;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.print.Book;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HttpsURLConnection;
import javax.swing.JFrame;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import sun.rmi.runtime.Log;

/**
 *
 * @author DELL6420
 */
public class LibraryManagementGUI extends javax.swing.JFrame {

    /**
     * Creates new form LibraryManagementGUI
     */
    public LibraryManagementGUI() {
        initComponents();
        this.setTitle("Library Management System");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LibManageSys = new javax.swing.JPanel();
        selectUserTypeLbl = new javax.swing.JLabel();
        cusotmer_button = new javax.swing.JButton();
        librarian_button = new javax.swing.JButton();
        exitProgramButton = new javax.swing.JButton();
        searchDatabaseNoLogin = new javax.swing.JLabel();
        searchAuthorNoLoginTxtFld = new javax.swing.JTextField();
        searchDatabaseNoLoginButton = new javax.swing.JButton();
        searchVolumeNoLoginTxtFld = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LibManageSys.setBorder(javax.swing.BorderFactory.createTitledBorder("Library Management System"));

        selectUserTypeLbl.setText("Select User type");

        cusotmer_button.setText("Customer");
        cusotmer_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusotmer_buttonActionPerformed(evt);
            }
        });

        librarian_button.setText("Librarian");
        librarian_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                librarian_buttonActionPerformed(evt);
            }
        });

        exitProgramButton.setText("Exit Program");
        exitProgramButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitProgramButtonActionPerformed(evt);
            }
        });

        searchDatabaseNoLogin.setText("Search database ");

        searchAuthorNoLoginTxtFld.setText("Enter Author");
        searchAuthorNoLoginTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchAuthorNoLoginTxtFldActionPerformed(evt);
            }
        });

        searchDatabaseNoLoginButton.setText("Search");
        searchDatabaseNoLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDatabaseNoLoginButtonActionPerformed(evt);
            }
        });

        searchVolumeNoLoginTxtFld.setText("Enter Volume");
        searchVolumeNoLoginTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchVolumeNoLoginTxtFldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LibManageSysLayout = new javax.swing.GroupLayout(LibManageSys);
        LibManageSys.setLayout(LibManageSysLayout);
        LibManageSysLayout.setHorizontalGroup(
            LibManageSysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LibManageSysLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LibManageSysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LibManageSysLayout.createSequentialGroup()
                        .addComponent(selectUserTypeLbl)
                        .addGap(18, 18, 18)
                        .addComponent(cusotmer_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(librarian_button))
                    .addComponent(exitProgramButton)
                    .addGroup(LibManageSysLayout.createSequentialGroup()
                        .addComponent(searchDatabaseNoLogin)
                        .addGap(156, 156, 156)
                        .addComponent(searchDatabaseNoLoginButton))
                    .addGroup(LibManageSysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(searchVolumeNoLoginTxtFld, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(searchAuthorNoLoginTxtFld, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        LibManageSysLayout.setVerticalGroup(
            LibManageSysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LibManageSysLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(LibManageSysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectUserTypeLbl)
                    .addComponent(cusotmer_button)
                    .addComponent(librarian_button))
                .addGap(18, 18, 18)
                .addGroup(LibManageSysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchDatabaseNoLogin)
                    .addComponent(searchDatabaseNoLoginButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchAuthorNoLoginTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchVolumeNoLoginTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(exitProgramButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LibManageSys, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LibManageSys, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        LibManageSys.getAccessibleContext().setAccessibleName("\"LMS\"");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cusotmer_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusotmer_buttonActionPerformed

        JFrame frame = new JFrame("Testing");
        customerLogin1 customer = new customerLogin1();
        frame.add(BorderLayout.CENTER, customer);
        customer.setPreferredSize(new Dimension(640, 480));
        frame.pack();
        frame.setVisible(true);

        customer.setVisible(true);
    }//GEN-LAST:event_cusotmer_buttonActionPerformed

    private void librarian_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_librarian_buttonActionPerformed

        JFrame frame = new JFrame("Testing");
        librarianLogin1 libLogin = new librarianLogin1();
        frame.add(BorderLayout.CENTER, libLogin);
        libLogin.setPreferredSize(new Dimension(640, 480));
        frame.pack();
        frame.setVisible(true);

        libLogin.setVisible(true);

    }//GEN-LAST:event_librarian_buttonActionPerformed
    private void getRequest(String Author, String Volume) throws ProtocolException, IOException {

        
        String responseString = "";

        URL url = new URL("https://www.googleapis.com/books/v1/volumes?q="+ Volume + "+inauthor:" + Author + "&AIzaSyD2l4xicCXG_xS6iszQodS9O2u5e18s3Ck");
        //connecting to url
        HttpURLConnection c = (HttpURLConnection) url.openConnection();

        c.setRequestMethod("GET");

        try (
                BufferedReader in = new BufferedReader //stream to resource
                (new InputStreamReader(c.getInputStream()))) {
            String str;
            while ((str = in.readLine()) != null) {
                //process the response and save it in some string 
                responseString += str + "\n";
                System.out.println(responseString);
                parseBook(responseString);
            }

        }
    }
    private void writeToText(String title, String author, String imageLink) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        try (FileWriter writer = new FileWriter("books.txt", true)) {
            writer.write(author + "\n");
            writer.write(title + "\n");
            writer.write(imageLink + "\n");
            writer.close();
        }
    }
    private void parseBook(String responseString) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        try {
            JSONObject root = new JSONObject(responseString);
            JSONArray books = root.getJSONArray("items");
            for (int i = 0; i < books.length(); i++) {
                JSONObject book = books.getJSONObject(i);
                JSONObject info = book.getJSONObject("volumeInfo");
                String title = info.getString("title");
                JSONArray authors = info.getJSONArray("authors");
                String author = authors.getString(0);
                JSONObject imageLinks = info.getJSONObject("imageLinks");
                String imageLink = imageLinks.getString("smallThumbnail");
                
                writeToText(title, author, imageLink);
                System.out.println("");
                
//                BookObject bookObject = new BookObject(author,title,imageLink);
//                recordBooks.add(bookObject);
            }
        } catch (JSONException e) {

        }
    }

    private void postRequest(String website) throws ProtocolException, IOException {

        URL obj = new URL(null, "https://www.example.com", 
                new sun.net.www.protocol.https.Handler());
        
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

        con.setRequestMethod("POST");

        String urlParameters = "test";

        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(urlParameters);
        wr.flush();
        wr.close();

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer res = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            res.append(inputLine);
        }
        in.close();
    }
    private void exitProgramButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitProgramButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitProgramButtonActionPerformed

    private void searchAuthorNoLoginTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchAuthorNoLoginTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchAuthorNoLoginTxtFldActionPerformed

    private void searchDatabaseNoLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchDatabaseNoLoginButtonActionPerformed

//        try {
//            postRequest("example.com");
//        } catch (IOException ex) {
//            Logger.getLogger(LibraryManagementGUI.class.getName()).log(Level.SEVERE, null, ex);
//        }
        try {
            getRequest(searchAuthorNoLoginTxtFld.getText(),searchVolumeNoLoginTxtFld.getText());
        } catch (IOException ex) {
            Logger.getLogger(LibraryManagementGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_searchDatabaseNoLoginButtonActionPerformed

    private void searchVolumeNoLoginTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchVolumeNoLoginTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchVolumeNoLoginTxtFldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LibraryManagementGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibraryManagementGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibraryManagementGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibraryManagementGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibraryManagementGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LibManageSys;
    private javax.swing.JButton cusotmer_button;
    private javax.swing.JButton exitProgramButton;
    private javax.swing.JButton librarian_button;
    private javax.swing.JTextField searchAuthorNoLoginTxtFld;
    private javax.swing.JLabel searchDatabaseNoLogin;
    private javax.swing.JButton searchDatabaseNoLoginButton;
    private javax.swing.JTextField searchVolumeNoLoginTxtFld;
    private javax.swing.JLabel selectUserTypeLbl;
    // End of variables declaration//GEN-END:variables
}
