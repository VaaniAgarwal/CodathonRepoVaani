/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.book.dao;

import com.book.pojo.*;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author VAANI
 */
public class BookDAO {
    public Connection con = null;
    public Statement stmt = null;
    public ResultSet rs=null;
    public PreparedStatement pStmt=null;
    public static BookDAO instance=null;
    
    public static synchronized BookDAO getInstance() throws ClassNotFoundException
    {
        if (instance == null)
            instance = new BookDAO();
 
        return instance;
    }
    
    private BookDAO() throws ClassNotFoundException {
        try{            
            Class.forName("org.postgresql.Driver");
            con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","030702");
            System.out.println("Connection Object--------->"+con);
            stmt=con.createStatement();
        }
        catch(SQLException e){            
        }
    }
    
    public boolean executeInsert(Book book){
        try{
            pStmt = con.prepareStatement("Insert into Book values(?,?,?,?,?,?,?,?,?,?)");
            pStmt.setInt(1,book.getBookID());
            pStmt.setString(2,book.getBookName());
            pStmt.setString(3,book.getAuthor());
            pStmt.setString(4,book.getPublisher());
            pStmt.setString(5,book.getGenre());
            pStmt.setInt(6,book.getPrice());
            pStmt.setString(7,book.getDesc());
            pStmt.setInt(6,book.getStock());
            pStmt.setBytes(6,book.getImageData());
            pStmt.setInt(8,book.getEventId());//Check this one
            int rowCount= pStmt.executeUpdate();
            if(rowCount >0){
                return true;
            }
            
        }
        catch(SQLException e){
        }
        return false;
    }
}
