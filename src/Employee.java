/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author justinpotts
 */
public class Employee {

    private String name;
    private String ssn;
    private String jobTitle;

    public Employee(String name, String ssn, String jobTitle) {
        this.name = name;
        this.ssn = ssn;
        this.jobTitle = jobTitle;
    }

    public Employee(String justin_Potts_100111222_Owner) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    
    
    

}