/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

/**
 *
 * @author vekivulic
 */
public class IntoToPrograming  extends ProgrammingCourse {

 String prerequisites;

    public IntoToPrograming(String prerequisites) {
        this.prerequisites = "none";
    }
 

    @Override
    public void setPrerequisites(String prerequisites) {
        
    }

    @Override
    public String getPrerequisites() {
       return "None";
    }
   
}   
    
  
    

