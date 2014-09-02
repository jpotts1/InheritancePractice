/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.concrete;

/**
 *
 * @author justinpotts
 */
public class SalariedEmployee extends Employee {

    private double  payRate;
    private double  wage; 

    public SalariedEmployee(double payRate, double wage, String name, int employeeID, String gender) {
        super(name, employeeID, gender);
        this.payRate = payRate;
        this.wage = wage;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }


    
}
