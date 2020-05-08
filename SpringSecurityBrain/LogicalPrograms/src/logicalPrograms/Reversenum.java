package logicalPrograms;

import java.util.Scanner;

public class Reversenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new  Scanner(System.in);
		System.out.println("enter a  num");
		int num= sc.nextInt();
		int rev=0;
		int digit=0;
		while(num>0) {
			digit= num%10;
			rev=(rev*10)+digit;
			num=num/10;
			
		}
		System.out.println(rev);
	}

}
