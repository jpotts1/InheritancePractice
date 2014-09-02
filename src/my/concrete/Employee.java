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
class Employee {

    private String name;
    private String wage;
    private String jobTitle;

    public Employee(String name, String ssn, String jobTitle) {
        this.name = name;
        this.wage = ssn;
        this.jobTitle = jobTitle;
    }

    Employee(String justin_Potts_100111222_Owner) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String ssn) {
        this.wage = ssn;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    
    
    

}
