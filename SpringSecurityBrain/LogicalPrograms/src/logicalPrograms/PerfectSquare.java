package logicalPrograms;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new  Scanner(System.in);
		System.out.println("enter a  num");
		int num= sc.nextInt();
		for(int i=1;i<num;i++) {
			if(i*i==num) {
				System.out.println("given nuber is square "+i);
			return;
			}		
		}
	}

}
