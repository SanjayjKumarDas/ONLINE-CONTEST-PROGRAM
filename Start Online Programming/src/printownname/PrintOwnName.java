package printownname;

import java.util.Scanner;

/**
 * Date-15/07/2019
 * 
 * @author SANJAY
 *
 */
public class PrintOwnName {
	String name = null;

	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your Name");
		name = input.nextLine();
		input.close();
	}

	public void display() {
		System.out.println(name);
	}

	public static void main(String[] args) {
		PrintOwnName object = new PrintOwnName();
		object.input();
		object.display();
	}
}
