/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.sql.*;

 * @author PC
 */
public class koneksi {
    static final String driver = "Com.mysql.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost/penjualan";
    static final String user = "root";
    static final String uppas = "";
    static Connection comn;
    static Statement stat;
        public static void konek () {
            try {
                Class.forName(driver);
                comn = DriverManager.getConnection(url, user, uppas);
                System.out.println("koneksi berhasil");
            }  catch (Exception e) {
                System.out.println(e);
            }
        }
    
}
