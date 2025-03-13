package class7;

public class Dowhilerevmul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int a=3;int i=30;int b=0;
		
		do {
			b=a*i;
			System.out.println(a+"x"+ i + "=" +b);
			/*if(i%2 == 0) {
				System.out.println(i + "is an even number");
			}else {
				System.out.println(i + " is an odd  number");
			}*/
			i--;
		}while(i>=1);
		

	}

}
