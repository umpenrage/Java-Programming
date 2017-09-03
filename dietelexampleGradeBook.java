/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Java-programming
 */
public class GradeBook {
    private String courseName;
    private int[] grades;
    
    public GradeBook(String courseName, int[] grade){
        this.courseName = courseName;
        this.grades=grades;
        
    }
    public void setCourseName(String courseName){//not sure why we need this. 
        this.courseName=courseName;
        
    }
    public String getCourseName(){
        return courseName;
    }
    public void processGrades(){
        
    }
}
