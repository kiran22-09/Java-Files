package class7;

public class Dowhilemul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
						final int a =3;
						int b = 0;
						int i =1;
						int count_even=0,count_odd = 0;
						int sum_even=0,sum_odd=0;
						
						do {      	
							b = a*i;
							System.out.println( a + "x" + i + "=" +b);
							if(b%2 == 0) {
								//System.out.println(b + " is an even number");
								count_even++;
								sum_even = sum_even +b ;
							}else {
								//System.out.println(b + " is an odd number");
								count_odd++;
								sum_odd = sum_odd + b;
								}
							i++;
						}
						while(i <=30);
						System.out.println("no of even numbers are " +count_even);
						System.out.println("no of odd numbers are " +count_odd);
						
						System.out.println("\nsum of even numbers are " +sum_even);
						System.out.println("sum of odd numbers are " +sum_odd);
					}
	}


