package logicalPrograms;

import java.util.Scanner;

public class sumFirstandLastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new  Scanner(System.in);
		System.out.println("enter a  num");
		int num= sc.nextInt();
		
		int lastDigit= num%10;
		int firstDigit=num;
		while(firstDigit>=10) {
			firstDigit=firstDigit/10;
		}
		System.out.println(firstDigit+ lastDigit);
	}

}
