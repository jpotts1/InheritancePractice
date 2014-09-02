/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myabstract;

/**
 *
 * @author justinpotts
 */
public abstract class SalariedEmployee extends Employee{

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

   private double salary;
   private double payRate;

    public SalariedEmployee(int employeeNumber, String name) {
        super(employeeNumber, name);
    }
   
    
}
