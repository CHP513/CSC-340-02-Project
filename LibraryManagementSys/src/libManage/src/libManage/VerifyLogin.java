package libManage;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Charles Brady
 * 
 * Last updated 2/20
 * 
 * This class is used to check if the username and login exist
 */
public class VerifyLogin extends javax.swing.JPanel {
    
     public static void verifyLogin(String _username,
            String _password, String _filePath) {
        boolean _found = false;
        String _tempUsername = "";
        String _tempPassword = "";


        try {
            Scanner reader = new Scanner(System.in);

            reader = new Scanner(new File(_filePath));
            reader.useDelimiter("[,\n]");

            while (reader.hasNext() && !_found) {
                _tempUsername = reader.next();
                _tempPassword = reader.next();

                if (_tempUsername.trim().equals(_username)
                        && _tempPassword.trim().equals(_password)) {
                    _found = true;
                    JOptionPane.showMessageDialog(null, "Sucessful login");
                 
                 JFrame frame = new JFrame("Testing");
        LibrarianView librarianView = new LibrarianView();
        frame.add(BorderLayout.CENTER, librarianView); 
              librarianView.setPreferredSize(new Dimension(640, 480));
                frame.pack();
        frame.setVisible(true);
        
        librarianView.setVisible(true);
        
                }
            }
            if (_found == false) {
                JOptionPane.showMessageDialog(null, "Unsucessful login");
            }
            reader.close();
        } catch (Exception e) {

        }
    }
    
}
