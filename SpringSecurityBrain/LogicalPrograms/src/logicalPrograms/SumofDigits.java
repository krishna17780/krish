package logicalPrograms;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the number: ");
     int num= sc.nextInt();
      int digit=0;
      int sum=0;
      while(num>0) {
    	  digit= num%10;
    	  sum=sum+digit;
    	  num=num/10;
    	  System.out.println(num);
      }System.out.println(sum);
	}

}
