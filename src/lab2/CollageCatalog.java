/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vekivulic
 */
public class CollageCatalog {
    

    private List<ProgrammingCourse> programmingCource;

    public CollageCatalog() {
        this.programmingCource = new ArrayList();
    }

    public void addCourse(ProgrammingCourse course) {
        this.programmingCource.add(course);
    }

    public void setProgrammingCource(List<ProgrammingCourse> programmingCource) {
        this.programmingCource = programmingCource;
    }

    public List<ProgrammingCourse> getProgrammingCource() {
        return programmingCource;
    }

}


