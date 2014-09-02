/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritancepractice;



/**
 *
 * @author justinpotts
 */
public class InheritancePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        Employee e1 = new Employee("Justin Potts, 100-111-222, Owner");
        Employee e2 = new Employee("Kelly Saeger, 111-222-333, SalesRep");
        Employee e3 = new Employee("Justin Potts, 100-111-222, Owner");
        
        if (e1 == e2){
            System.out.println("They are the same person");
        }
        
        else {
            System.out.println("They are not the same person");
        }
               
         if (e1==e3){
            System.out.println("They are the same person");
        }
        
        else {
            System.out.println("They are not the same person");
        }
               
        }
    }


   
    
