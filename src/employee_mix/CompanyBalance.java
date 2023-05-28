/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee_mix;

/**
 *
 * @author Riyad
 */
public class CompanyBalance {
    private double balance;
    private String account_number = "AFG123456789";

    public CompanyBalance() {
        this.balance = balance;
        this.account_number = account_number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
    //for access the value
    public String AcNum(){
        return account_number;
    }
    
    public double Balance(){
        return balance;
    }
}
