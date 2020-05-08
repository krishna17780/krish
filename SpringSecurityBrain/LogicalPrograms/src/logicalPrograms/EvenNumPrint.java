package logicalPrograms;

import java.util.Scanner;

public class EvenNumPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num1 = sc.nextInt();
		for (int i = 0; i <=num1; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
			
		}
	}

}
