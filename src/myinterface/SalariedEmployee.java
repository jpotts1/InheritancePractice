package myinterface;

/**
 * 
 * @author Justin Potts
 */
public class SalariedEmployee implements Employee {

    private String lastName;
    private String firstName;
    private String ssn;

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
    
    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getSsn() {
        return ssn;
    }

    @Override
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }        
}
