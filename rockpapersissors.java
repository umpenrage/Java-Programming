import java.util.Scanner;

public class Main{


	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int computer;


		System.out.println("This program is rock paper scissors");

		computer = 1+(int)(Math.random()*3);

		System.out.println("Please use 1 (Paper), 2 (Rock), or 3 (Scissors)");

		int answer = input.nextInt();

		switch(answer)	{

			case 1:	if(answer == computer){
						System.out.print("Draw game");
						break;
						}
					else if(computer == 2){
						 System.out.println("You win, Paper covers Rock");
						 break;
						}
					else{
						System.out.println("You lose Scissors cuts Paper");
						break;

					}

			case 2: if(answer == computer){
						System.out.print("Draw game");
						break;
						}
					else if(computer==1){
						System.out.println("You lose, Paper Covers Rock");
						break;
					}

					else{
						System.out.println("You win, Rock smashes Scissors");
						break;

					}		
			case 3:	if(answer == computer){
						System.out.print("Draw game");
					}
					else if(computer==2){
						System.out.println("You lose, Rock smashes Scissors");
						break;
					}
					else{
						System.out.println("You win, Scissors cuts Paper");
						break;
					}
		}
	}
}