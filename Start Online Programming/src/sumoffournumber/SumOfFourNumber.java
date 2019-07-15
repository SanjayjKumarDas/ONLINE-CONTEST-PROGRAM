package sumoffournumber;

import java.util.Scanner;

/**
 * Date-15/07/2019
 * 
 * @author SANJAY
 *
 */
public class SumOfFourNumber {
	Scanner input = new Scanner(System.in);
	int a[] = new int[4];
	int sum = 0;

	public void input() {
		System.out.println("Enter The Number");
		for (int i = 0; i < 4; i++) {
			a[i] = input.nextInt();
		}
	}

	public void operation() {
		for (int i = 0; i < 4; i++) {
			sum = sum + a[i];
		}
	}

	public void display() {
		System.out.println(sum);
	}

	public static void main(String[] args) {
		SumOfFourNumber ob = new SumOfFourNumber();
		ob.input();
		ob.operation();
		ob.display();
	}
}
