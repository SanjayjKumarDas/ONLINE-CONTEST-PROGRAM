package sumofnnumber;

import java.util.Scanner;

/**
 * Date-15/07/2019
 * 
 * @author SANJAY
 *
 */
public class SumOfNNumber {
	Scanner input = new Scanner(System.in);
	int number = input.nextInt();
	int a[] = new int[number];
	int sum = 0;

	public void operation() {
		for (int i = 0; i < number; i++) {
			a[i] = input.nextInt();
		}
	}

	public void sum() {
		for (int i = 0; i < number; i++) {
			sum = sum + a[i];
		}
	}

	public void displaySum() {
		System.out.println(sum);
	}

	public static void main(String[] args) {
		SumOfNNumber obj = new SumOfNNumber();
		obj.operation();
		obj.sum();
		obj.displaySum();
	}
}
