package logicalPrograms;

import java.util.Arrays;
import java.util.List;

public class EvenpositionsEx {
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,4,7,8,9};
		
		for (int i = 0; i <arr.length ; i=i+2) {
			System.out.println(arr[i]);
		}
	}

}
