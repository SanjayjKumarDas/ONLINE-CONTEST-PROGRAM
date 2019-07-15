package sumoftwonumber;

import java.util.Scanner;

/**
 * Date-15/07/2019
 * 
 * @author SANJAY
 *
 */
public class SumOfTwoNumber {
	int num1, num2, sum;

	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Two Number");
		num1 = input.nextInt();
		num2 = input.nextInt();
		input.close();
	}

	public void operation() {
		sum = num1 + num2;
	}

	public void display() {
		System.out.println("Sum Of Two Number is:");
		System.out.println(sum);
	}

	public static void main(String[] args) {
		SumOfTwoNumber object = new SumOfTwoNumber();
		object.input();
		object.operation();
		object.display();
	}
}
