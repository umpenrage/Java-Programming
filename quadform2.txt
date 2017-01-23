
import java.util.*;

public class quadForm
{

    public static void main(String[] args)
    {
        Boolean contYorN= true;
        Scanner input = new Scanner(System.in);
        while (contYorN)
        {

            System.out.println("This program will calculate the roots for a quadratic equation");
            System.out.print("Please input the constants in the following order(without the commas)' a, b, c ' .\nUse the following as a reference : ax^2 +bx+c = 0 ");
            System.out.print(":");
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
            double discrim = Math.pow(b, 2) - (4 * a * c);
            double rt1 = (int) ((-b + Math.pow(discrim, .5)) * 1000) / (1000.0 * 2 * a);
            double rt2 = (int) ((-b - Math.pow(discrim, .5)) * 1000) / (1000.0 * 2 * a);
            if (discrim < 0)
            {
                System.out.println("There are not any real roots");

            }
            else if(discrim == 0)
            {
                System.out.println("There is only one root. The root is " + rt1);
            }
            else
            {
                System.out.println("The real roots are " + rt1 + " " + rt2);
            }

            System.out.println("Would you like to reuse this program? Please type 'y' or 'n' : ");

            String yesOrno = input.next();
                                                    /* I fixed this issue by using .next() instead of nextLine()
                                                    I'm still unsure as to why this change fixed the problem of the program
                                                    ending after the print statement.
                                                    */


                if (!(yesOrno.equalsIgnoreCase("y") || yesOrno.equalsIgnoreCase("n") || yesOrno.equalsIgnoreCase("no") || yesOrno.equalsIgnoreCase("yes")))
                {
                 System.out.println("You have not entered a correct answer, and the program will close.");
                 contYorN = false;
                }
                else if (yesOrno.equalsIgnoreCase("n") || yesOrno.equalsIgnoreCase("no"))
                {
                    contYorN= false;
                }
        }
        System.out.println("Thank for using my program, and have a NICE day :D ");
    }
}
