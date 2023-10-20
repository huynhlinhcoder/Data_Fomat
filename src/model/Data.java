/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author huynh
 */
public class Data 
{
    private String String;
    private String Date;
    private String Phone;
    private String Email;

    public Data() {
    }

    public Data(String String, String Date, String Phone, String Email) {
        this.String = String;
        this.Date = Date;
        this.Phone = Phone;
        this.Email = Email;
    }

    public String getString() {
        return String;
    }

    public void setString(String String) {
        this.String = String;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    
    
    
}