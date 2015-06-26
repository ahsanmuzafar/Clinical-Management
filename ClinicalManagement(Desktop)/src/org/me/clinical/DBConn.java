/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.clinical;

/**
 *
 * @author Asim Rana
 */
import java.sql.*;
public class DBConn {
    private Connection conn;
    private Statement stmt;
    public DBConn()
    {
        
    }
    public void create()
    {
        try{
                 Class.forName ("org.sqlite.JDBC");

		conn = DriverManager.getConnection("jdbc:sqlite:test.db");

		stmt = conn.createStatement();
        }
        catch(Throwable e)
        {
            System.out.println("Exception in create");
        }
    }
    public Statement getStatement()
    {
        return stmt;
    }
    public void close() throws Throwable
    {
        stmt.close();
        conn.close();
    }
    
}
