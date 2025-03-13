package claa6;

public class Evennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count_even=0, count_odd=0;
		int sum_even=0, sum_odd=0;
		for(int i=1;i<=11;i++) {
			if(i%2==0) {
				System.out.println("Even number......" +i);
				count_even++;
				sum_even = sum_even + i;
			}else {
				System.out.println("Odd number......." +i);
				count_odd++;
				sum_odd = sum_odd + i;
				
		}
		}
		System.out.println("No of even number are     "+count_even);
		System.out.println("No of odd number are     "+count_odd);
		System.out.println("sum of even numbers     " +sum_even);
		System.out.println("sum of odd numbers     " +sum_odd);

	

}
}