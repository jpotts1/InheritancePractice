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

    public SalaryPlusCommissionEmployee() {
        super (wage, name, employeeID, gender);
        this.payRate = payRate;
        this.wage = wage;
        this.commission = commission;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

        




}
