/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import lab2.AdvancedJavaCourse;
import lab2.Collage;
import lab2.CollageCatalog;
import lab2.IntroToProgramming;
import lab2.PrintReport;

/**
 *
 * @author vekivulic
 */

    public class StartUp {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        PrintReport report = new PrintReport();
        lab2.ProgrammingCourse programingCourse1 = new IntroToProgramming("IntroProgramming","152-107",2.0);
        lab2.ProgrammingCourse programmingCourse2 = new lab2.IntroToJava("Intro To Java","152-134",4);
        lab2.ProgrammingCourse programmingCourse3 = new AdvancedJavaCourse("Advanced Java Programming","152-135",4);
        Collage college = new Collage("Waukesha County Technical Collage");
        CollageCatalog catalog = new CollageCatalog();
        catalog.addCourse(programingCourse1);
        catalog.addCourse(programmingCourse2);
        catalog.addCourse(programmingCourse3); 
        programmingCourse2.setPrerequisites(" Intro Programming course.");
        programmingCourse3.setPrerequisites("Java Programming course.");
        college.addCouse(programingCourse1);
        college.setCollegeName("College Name: "+ "Waukesha County Technical College");
        report.printReport(college.getCollegeName());
        college.printCatalog();
    }   
}

