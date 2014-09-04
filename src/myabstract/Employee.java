package myabstract;

/**
 * @author Justin Potts
 */
public abstract class Employee {
  
    private String lastName;
    private String firstName;
    private String ssn;
    
    
    public abstract double getAnnualWages();
    
   
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    
}
