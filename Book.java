/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.book.pojo;

/**
 *
 * @author VAANI
 */
public class Book {
    String bname,author,publisher,genre,desc;
    int bid,price,stock;
    byte[] image;
    public Book(int bid,String bname,String author,String publisher,String genre,int price,String desc,int stock,byte[] image)
    {
        this.bid=bid;
        this.bname=bname;
        this.author=author;
        this.publisher=publisher;
        this.genre=genre;
        this.price=price;
        this.desc=desc;
        this.stock=stock;
        this.image=image;//Check for image in every addbook file
    }
    public Book() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public int getBookID()
    {
        return bid;
    }
    public void setBookID(int bid)
    {
        this.bid=bid;
    }
    public String getBookName()
    {
        return bname;
    }
    public void setBookName(String bname)
    {
        this.bname=bname;
    }
    public String getAuthor()
    {
        return author;
    }
    public void setAuthor(String author)
    {
        this.author=author;
    }
    public String getPublisher()
    {
        return publisher;
    }
    public void setPublisher(String publisher)
    {
        this.publisher=publisher;
    }
    public String getGenre()
    {
        return genre;
    }
    public void setGenre(String genre)
    {
        this.genre=genre;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price=price;
    }
    public String getDesc()
    {
        return desc;
    }
    public void setDesc(String desc)
    {
        this.desc=desc;
    }
    public int getStock()
    {
        return stock;
    }
    public void setStock(int stock)
    {
        this.stock=stock;
    }
    public byte[] getImageData()
    {
        return image;
    }
    public void setImageData(byte[] image)
    {
        this.image=image;
    }
}
