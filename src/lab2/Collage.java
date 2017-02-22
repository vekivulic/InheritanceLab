/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author vekivulic
 */
public class Collage {
   
     private final CollageCatalog catalog;
     private final PrintReport printReport;
     private String name;

    public Collage(String collegeName) {
        this.catalog = new CollageCatalog();
        this.printReport = new PrintReport();
        
    }



    public void addCouse(ProgrammingCourse course){
        this.catalog.addCourse(course);
    }
    
    public void printCatalog(){
        for (ProgrammingCourse c : catalog.getProgrammingCource() ){
            printReport.printReport("Course Name : " + c.getCourseName()+" Couse Number: "+ c.getCourseNumber()+" " + 
                    "Credit:"+ c.getCredits()+ " " + " Prerequisites:" + c.getPrerequisites() );
        }
    }

    public String getCollegeName() {
        return name;
    }

    public void setCollegeName(String collegeName) {
        this.name = collegeName;
    }
}
    

