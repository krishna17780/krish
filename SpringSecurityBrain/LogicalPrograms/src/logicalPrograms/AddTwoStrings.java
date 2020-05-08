package logicalPrograms;

import java.util.Scanner;

public class AddTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
        String  str1= sc.nextLine();
		System.out.println("enter a string");
        String  str2= sc.nextLine();
        
        int sum= Integer.parseInt(str1)+Integer.parseInt(str2);
        System.out.println(sum);
        System.out.println(String.valueOf(sum));
	}

}
