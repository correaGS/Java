/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import com.sun.rowset.CachedRowSetImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Aluno
 */
public class DBUtil {
    private static Connection con;

    public DBUtil() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/teste?zeroDateTimeBehavior=convertToNull", "root", "");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
}
    
    public static void estabelecerConexao() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/teste?zeroDateTimeBehavior=convertToNull", "root", "");

        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
    public static void fecharConexao() {
        try {
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
     public static ResultSet dbExecutaQuery(String queryStmt) throws SQLException, ClassNotFoundException {

        Statement stmt = null;
        ResultSet resultSet = null;
        CachedRowSetImpl crs = null;
        try {

            estabelecerConexao();
            
            System.out.println("Select statement: " + queryStmt + "\n");
 
            stmt = con.createStatement();
 
            resultSet = stmt.executeQuery(queryStmt);
            
                 crs = new CachedRowSetImpl();
            crs.populate(resultSet);
        } catch (SQLException e) {
            System.out.println("Problem occurred at executeQuery operation : " + e);
            throw e;
        } finally {
            if (resultSet != null) {
                //Close resultSet
                resultSet.close();
            }
            if (stmt != null) {

                stmt.close();
            }

            fecharConexao();
        }

        return crs;
    }
     
         public static void dbExecutaUpdate(String sqlStmt) throws SQLException, ClassNotFoundException {

        Statement stmt = null;
        try {

            estabelecerConexao();

            stmt = con.createStatement();

            stmt.executeUpdate(sqlStmt);
        } catch (SQLException e) {
            System.out.println("Problem occurred at executeUpdate operation : " + e);
            throw e;
        } finally {
            if (stmt != null) {

                stmt.close();
            }

            fecharConexao();
        }
    } 
}
