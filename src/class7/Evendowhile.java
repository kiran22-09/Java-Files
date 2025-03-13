package class7;

public class Evendowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=1,count_even=0,count_odd=0,sum_even=0,sum_odd=0;
		do {
			if(x%2==0) {
				System.out.println(x + " is an even number");
				count_even++;
				sum_even = sum_even+x;
			}else {
				System.out.println(x + " is an odd number");
				count_odd++;
				sum_odd = sum_odd+x;
			}
			x++;
			//System.out.println("\nNo of even numbers are" + count_even);
			//System.out.println("No of odd numbers are" + count_odd);
		} while(x<=100);
		System.out.println("\nNo of even numbers are " + count_even);
		System.out.println("No of odd numbers are " + count_odd);
		System.out.println("\nSum of even numbers are " + sum_even);
		System.out.println("Sum of odd numbers are " + sum_odd);

	}

}
