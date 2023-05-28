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
public class Job implements Serializable {
    private double salary;
    private String name_of_job;

    
    
    public Job(double salary, String name_of_job) {
        this.salary = salary;
        this.name_of_job = name_of_job;
    }

    
    /////////both obj same hoile return korlam koj korte
    public boolean equals(Job job){
       return (this.salary == job.salary  &&  
               this.name_of_job.equals(job.name_of_job));   
    }

    //////////get set nilam
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName_of_job() {
        return name_of_job;
    }

    public void setName_of_job(String name_of_job) {
        this.name_of_job = name_of_job;
    }


}
