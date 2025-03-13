package class6.copy;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int a = 3; int x=0;
		
		int count_even=0, count_odd=0;
		int sum_even=0, sum_odd=0;
		
		for(int i=1; i<=30; i++) {
			x = a*i;
			System.out.println( a + "x" + i + "=" +x);
		
		if(x%2 == 0) {
			//System.out.println(x + " is an even number");
			count_even++;
			sum_even = sum_even + x;
		}else {
			//System.out.println(x + " is an odd number");
			count_odd++;
			sum_odd = sum_odd + x;
			}
		}
		System.out.println("No of even number are     "+count_even);
		System.out.println("No of odd number are     "+count_odd);
		System.out.println("sum of even numbers     " +sum_even);
		System.out.println("sum of odd numbers     " +sum_odd);
		
		
	}
}

	


