/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee_mix;
import java.io.*;

/**
 *
 * @author Riyad
 */

//remember!! Serializable use kora hoy data file bananor jonno & eta Serialy hoy.
public class Employee implements Serializable{
    
    private String name;
    private String lastname;
    private Job job;
    private int employee_id;
    
    
    //constructor

    public Employee(String name, String lastname, Job job, int employee_id) {
        this.name = name;
        this.lastname = lastname;
        this.job = job;
        this.employee_id = employee_id;
    }
    
    ////getset go

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }
    
}
