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
public class HourlyEmployee extends Employee{
    private double  payRate;
    private double  hours;
    private double  wage; 

    public HourlyEmployee(double payRate, double hours, double wage, String name, int employeeID, String gender) {
        super(name, employeeID, gender);
        this.payRate = payRate;
        this.hours = hours;
        this.wage = wage;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }
    


}
