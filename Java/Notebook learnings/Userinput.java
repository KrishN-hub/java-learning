import java.util.Scanner;

public class Userinput {
	public static void main (String args []){
		Scanner scan = new Scanner(System.in);
		System.out.println ("Enter Your Name ? ");
		String name = scan.next();
		System.out.println("Your Name is " + name);
	}
}
