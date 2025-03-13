package class11;

import java.util.Scanner;

public class AvgArrayUserinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the size of an array ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] array = new int[n];
		
		System.out.println("Enter the " +n+ " elements of an array ");
		
		for (int i =0;i<array.length;i++) {
			
			array[i] = sc.nextInt();
				
		}
		System.out.println("Array elements are");
		
		for (int i =0;i<array.length;i++) {
			System.out.println(array[i]);
		} 
		double sum=0;
		for(int i =0;i<array.length;i++) {
			sum = sum+ array[i];
		}
		double avg = sum/n;
		System.out.println("Average of array elements are " +avg);
			
	}

}
