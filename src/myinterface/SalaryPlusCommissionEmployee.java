package myinterface;

/**
 * @author Justin Potts
 */
public class SalaryPlusCommissionEmployee extends SalariedEmployee {
   
    private double monthlyCommission;
    

    @Override
    public double getAnnualWages() {

        return this.getMonthlySalary() * 12 
                + this.getAnnualBonus() + monthlyCommission;
    }
    

    public double getMonthlyCommission() {
        return monthlyCommission;
    }

    public void setMonthlyCommission(double monthlyCommission) {
        this.monthlyCommission = monthlyCommission;
    }
    
    
}
