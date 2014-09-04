package my.concrete;

/**
 * 
 * 
 * @author Justin Potts
 */
public class SalariedEmployee extends Employee {
  
    private double monthlySalary;
    private double annualBonus;
    

    @Override
    public double getAnnualWages() {
        return monthlySalary * 12 + annualBonus;
    }
    
   
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }
    
}
