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
public abstract class HourlyEmployee extends Employee{
    
   private double hoursWorked;
   private double hourlyWage;

    public HourlyEmployee(double hoursWorked, double hourlyWage, int employeeNumber, String name) {
        super(employeeNumber, name);
        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyWage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    
}
