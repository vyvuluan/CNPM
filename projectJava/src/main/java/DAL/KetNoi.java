/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class KetNoi 
{
    private Connection con;

    public KetNoi() {
    }
    
    public boolean openConnection()
    {
        try {
            String dbUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=QLMT";
            con = DriverManager.getConnection(dbUrl, "sa", "sa");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(KetNoi.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public void closeConnection()
    {
        if(con!= null)
        {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(KetNoi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
}
