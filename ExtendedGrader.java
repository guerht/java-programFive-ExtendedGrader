/*
 * Project: ExtendedGrader.java
 * Description: A program that reports letter grades (and other things)
 * Author: Seunghoon Park
 * Date: 31 August, 2015
 */
import java.util.Scanner;
public class ExtendedGrader {
	public static void main(String args[]) {
		int grade;
		int skip;
		Scanner scan = new Scanner(System.in);

		System.out.println("Do you want the \n1.Grader \nor \n2.Strings?");
		skip = scan.nextInt();
		if (skip == 1) {
			System.out.println("\nEnter your grade percentage (disregard the percent sign): ");
			grade = scan.nextInt();
			if (grade >= 90) {
				System.out.println("You got an A!");
			}
			else if(grade >= 80) {
				System.out.println("You got a B~");
			}
			else if(grade >= 70) {
				System.out.println("You got a C.");
			}
			else if(grade >= 60) {
				System.out.println("You got a D...");
			}
			else {
				System.out.println("YOU FAIL! huv a nice dey");
			}
			
			//Challenge: Create an if-else that tells the user "Congrats!" if their grade is greater than 100 (bonus points)
			//OR "You're an normal student." if under 100.
			if (grade == 100) {
				System.out.println("You got exactly 100!");
			}
			else if (grade >=100) {
				System.out.println("Congrats!");
			}
			else {
				System.out.println("You're an normal student.");
			}
			//Challenge: using an if-elseif-else, tell the user whether their grade is "positive" or "negative" or "zero".
			if (grade == 0) {
				System.out.println("Your grade is zero.");
			}
			else if (grade > 0) {
				System.out.println("Your grade is positive.");
			}
			else {
				System.out.println("Your grade is negative.");
			}
			
			//Challenge: make the computer print exactly the following (cut)
			System.out.println("\nFrom: Bill Smith\nAddress: Dell Computer, Bldg 13\nDate: April 12, 2005\n\nTo: Jack Jones\n\nMessage: Help! I'm trapped inside a computer!");
			//Showing new commits
			System.out.println("Modifying this program for GitHub.com");
		}
		else {
			System.out.println("\nWelcome to the String program 1!\n");
			// program 1
			String s = "The number of rabbits is ";
			int argh = 129;
			String report = s + argh;
			System.out.println(report + ".");
			// number 2
			String p = "Groovy Dude";
			System.out.println(p.toUpperCase());
			// number 3
			String g = "Computer Science is for NERDS!";
			System.out.println(g.toLowerCase());
			// number 4
			String c;
			String m = "The Gettysburg Address";
			c = m.substring(4);
			System.out.println(c);
			// number 5
			String b = "Four score and seven years ago,";
			String c1 = b.substring(7, 12);
			System.out.println(c1);
			// number 6
			int count2;
			String s2 = "Surface Tension";
			count2 = s2.length();
			System.out.println(count2);
		}
	}	
}