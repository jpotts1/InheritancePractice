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
public class SalaryPlusCommissionEmployee extends SalariedEmployee{

        private double  payRate;
        private double  wage; 
        private double  commission;

    public SalaryPlusCommissionEmployee(double payRate, double wage, String name, int employeeID, String gender) {
        super(payRate, wage, name, employeeID, gender);
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }


        




}
