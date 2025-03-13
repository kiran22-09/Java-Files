package class6.copy;

public class Evenusingwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count_even = 0, count_odd = 0;
		int sum_even = 0,sum_odd=0;
		int i=1;
		while(i<=100) {
			if(i%2 ==0) {
				System.out.println(i + " is an even number");
				count_even++;
				sum_even = sum_even+i;
			}else {
				System.out.println(i + " is an odd number");
				count_odd++;
				sum_odd = sum_odd+i;
			}
			i++;
		}
		System.out.println(" \n No of even numbers are " +count_even);
		System.out.println(" No of odd numbers are " +count_odd);
		
		System.out.println(" \n Sum of even numbers are " +sum_even);
		System.out.println(" Sum of odd numbers are " +sum_odd);
		
		
		

	}

}
