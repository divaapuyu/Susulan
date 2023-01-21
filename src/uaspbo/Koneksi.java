
package uaspbo;

import java.sql.*;
import java.util.*;
import javax.swing.*;

public class Koneksi {

    static Connection connrp;
    public static void main (String [] args)throws SQLException{
        getKoneksi();
    }
    public static Connection getKoneksi()throws SQLException{
        try {
            if (connrp == null) {
                String url = "jdbc:mysql://localhost:3306/restopadang";
                String username = "root";
                String pass = "";
                connrp = DriverManager.getConnection(url, username, pass);
                if (connrp != null) {
                    System.out.println("Connected");
                }
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null,err.toString());
            //Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, x);
        }
        return connrp;
    }
}
