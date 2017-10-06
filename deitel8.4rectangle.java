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
public class Rectangle {
    private double length;
    private double width;
    private double area;
    private double perimeter;
    public Rectangle(double length, double width){
        if(length <=0 || length >20){
            throw new IllegalArgumentException("Length is less than or equal to 0 or greater than 20 ");
            
        }
        if(width <=0 || width >20){
            throw new IllegalArgumentException("Width is less than or equal to 0 or greater than 20 ");
        }
        this.length = length;
        this.width = width;        
        this.perimeter = 2*(length + width);
        this.area = length * width;
        System.out.printf("The Area and Perimeter for the following:%n%s", this);
    }
    
    
    
    public String toString(){
        return String.format("Length: %2.2f%nWidth: %2.2f%nArea: %2.2f%nPerimeter: %2.2f%n", length, width, area, perimeter);
    }
}
