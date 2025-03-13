package class1;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaration of variables
		int maths = 100;
		int physics = 90;
		int chemistry = 80;
 		int biology = 75;
		int english = 95;
		int social = 83;
		int total_marks = maths + physics + chemistry + biology + english + social;
		System.out.println("total marks of  student l:" +total_marks);
		
		maths = 30;
		physics = 90;
		chemistry = 30;
		biology = 87;
		english = 98;
		social = 76;
		total_marks = maths + physics + chemistry + biology + english + social;
		System.out.println("total marks of  student 2:" +total_marks);

	
	}
}
