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
public class AdvancedJava extends ProgrammingCourse {
    
    private String prerequisites;
    
    public AdvancedJava(String courseName, String courseNumber, double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
    }
    //"open for extension, but closed for modification".(open,closed principal)
    @Override
    public String getPrerequisites() {
        return prerequisites;
    }
    
    @Override
    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            throw new IllegalArgumentException("Error: prerequisites cannot be null of empty string");
        }
        this.prerequisites = prerequisites;
    }
    
}
    

