package rangeofinteger;

import java.util.Scanner;

/**
 * Date-15/07/2019
 * 
 * @author SANJAY
 *
 */
public class RangeOfInteger {
	int L, R;

	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The Number ");
		L = input.nextInt();
		R = input.nextInt();
		input.close();
	}

	public void rangeOfInteger() {
		System.out.println("Range of The Integer");
		for (int i = L; i <= R; i++) {
			System.out.println();
			System.out.print(i);
		}
	}

	public static void main(String[] args) {
		RangeOfInteger obj = new RangeOfInteger();
		obj.input();
		obj.rangeOfInteger();
	}
}
