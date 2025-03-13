package class11;

import java.util.Scanner;

public class AvgUsingWhile {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			System.out.println("Enter the size of an array ");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();

			int[] array = new int[n];
			
			System.out.println("Enter the " +n+ " elements of an array ");
			
			
			int i =0;
			while(i<array.length) {
				
				array[i] = sc.nextInt();
				i++;		
			}
			
			System.out.println("Array elements are");
			i=0;
			while(i<array.length) {
				System.out.println(array[i]);
				i++;
			} 
			double sum=0;
			i=0;
			while(i<array.length) {
				sum = sum+ array[i];
				i++;
			}
			double avg = sum/n;
			System.out.println("Average of array elements are " +avg);
				
		}

	}

