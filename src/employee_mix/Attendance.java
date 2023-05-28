/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee_mix;
import java.io.*;
import java.util.Date;

/**
 *
 * @author Riyad
 */
public class Attendance implements Serializable {
    
    private Date date;
    private String status;
    private String name;

    public Attendance(Date date, String status, String name) {
        this.date = date;
        this.status = status;
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    
    
  
 }
