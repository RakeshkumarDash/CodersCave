package Phase2;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			Random r=new Random();
			int maxChance=10;
			int score=0;
		int randomNo=r.nextInt(1,100);
			boolean play=true;
			System.out.println("NUMBER GUESSING GAME");
			System.out.println("Guess a number between 1 to 100 with in 10 attempts");

			while(play) {
				int chance=0;
				while(chance<maxChance) {
					System.out.println("guess no: ");
					int guess=sc.nextInt();
					chance=chance+1;	

					if(guess==randomNo) {
						System.out.println("Congratulations! currect guess.");
						score=score+10;
						break;
					}
					else if(guess<randomNo) {
						System.out.println("Too low");
					}
					else {
						System.out.println("Too high ");
					}
				
				if(chance==maxChance) {
					System.out.println("Sorry you lost all your chance");
					
					}
				}
				System.out.println("want to play again(type y(yes) / n(no) )");
				String p=sc.next();
				play=p.equalsIgnoreCase("y");
				sc.close();
				}
					
			System.out.println("your score is: "+score);
		}
	}


