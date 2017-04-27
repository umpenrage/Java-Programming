import java.util.Scanner;

public class Main{
  
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    final int RADIUS = 10;
    double x1;
    double y1;
    System.out.println("Please input a point so the program can calculate whether or not the point is within a circle centered at the origin:");
    x1 = input.nextDouble();
    y1 = input.nextDouble();
    if(Main.getdistance(x1,y1)<=RADIUS){
      //↑ tests to see if the point is within the circle
		if(Main.getdistance(x1,y1)==RADIUS){
			System.out.print("Point (" + x1+ " , "+ y1+") is on the border of the circle");
		}
		else{
			System.out.println("Point (" +x1+","+y1+") is in the circle");
		}
     
    }else{
      System.out.println("Point (" +x1+","+y1+") is not within the circle");
    }
    
    
  }
  
  public static double getdistance(double x1, double y1){
    // this method will use the distance formula to obtain the distance between the point inputted and the origin.
    //The distance formula is sqrt((x1-x2)^2+(y1-y2)^2)
    //x2 and y2 are 0 because the circle is centered at the origin
    
    double sqrx = Math.pow((x1-0),2);
    double sqry = Math.pow((y1-0),2);
    double distance = Math.pow((sqrx + sqry), .5);
    return distance;
  }
  
}
