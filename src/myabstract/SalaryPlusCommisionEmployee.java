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
public abstract class SalaryPlusCommisionEmployee extends Employee {

   private double commision;
   private double salary;

    public SalaryPlusCommisionEmployee(int employeeNumber, String name) {
        super(employeeNumber, name);
    }

    public double getCommision() {
        return commision;
    }

    public void setCommision(double commision) {
        this.commision = commision;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
   
}
