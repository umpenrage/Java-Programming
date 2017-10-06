package javaapplication1;

/**
 *
 * @author Java-programming
 */
public class Date1 {
    private int month;
    private int day;
    private int year;

    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date1(int month, int day, int year){
    	if(month <=0 || month > 12){
    		throw new IllegalArgumentException("Month ("+ month +") must be 1-12");
    	}
    	if(day <= 0 || (day>daysPerMonth[month] && !(month == 2 && day == 29))){
    		throw new IllegalArgumentException("day(" + day + ") out of range for the specified month and year");
    	}
    	if(month ==2 && day == 29 && !(year%400 ==0 ||(year % 4 == 0 && year % 100 !=0))){
    		throw new	IllegalArgumentException("day (" + day + ") out of range for the specified month and year");

    	}
    	this.month = month;
    	this.day = day;
    	this.year = year;

    	System.out.printf("Date object constructor for day %s%n", this);// why does this implicitly call ? the toString() method is one that comes from a certain java package. The toString method is automatically called whenever a print command is used. Hence, in this case, the toString command is called on once we arrive at system.out.printf. From there, the JVM sees that there is a toString() method specified, and it initiates that method. 

    }
    public String toString(){
    	return String.format("%d/%d/%d", month, day, year);
    }
}
