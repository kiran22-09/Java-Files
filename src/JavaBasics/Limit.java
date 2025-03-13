package JavaBasics;

public class Limit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int maths = 100;
		int physics = 90;
		int chemistry = 36;
 		int biology = 75;
		int english = 36;
		int social= 83;
		int total_marks;
		
		final int MAX_MARKS = 100;
		
		final int MIN_MARKS = 0;
		
		if(maths > MAX_MARKS || maths < MIN_MARKS || physics > MAX_MARKS || physics < MIN_MARKS || chemistry > MAX_MARKS || chemistry < MIN_MARKS || biology > MAX_MARKS || biology < MIN_MARKS || english > MAX_MARKS || english < MIN_MARKS || social > MAX_MARKS || social < MIN_MARKS)
		{
			System.out.println("Invalid marks");
		}
		else {
			boolean maths_passed_or_fail = false;
			boolean physics_passed_or_fail = false;
			boolean chemistry_passed_or_fail = false;
			boolean biology_passed_or_fail = false;
			boolean english_passed_or_fail = false;
			boolean social_passed_or_fail = false;
			//boolean allSubjectsPassed = true;
			
			
			if(maths < 35){
				System.err.println("Student 1 Failed in maths ");
				maths_passed_or_fail = false;
			}else { 
				System.out.println("Student 1 Passed in maths ");
				maths_passed_or_fail = true;
			}
			if(physics < 35)
			{
				System.err.println("Student 1 Failed in physics ");
				physics_passed_or_fail = false;
			}else { 
				System.out.println("Student 1 Passed in physics ");
				physics_passed_or_fail = true;
			}
			if(chemistry < 35)
			{
				System.err.println("Student 1 Failed in chemistry ");
				chemistry_passed_or_fail = false;
			}else { 
				System.out.println("Student 1 Passed in chemistry ");
				chemistry_passed_or_fail = true;
			}
			if(biology < 35)
			{
				System.err.println("Student 1 Failed in biology ");
				biology_passed_or_fail = false;
			}else { 
				System.out.println("Student 1 Passed in biology ");
				biology_passed_or_fail = true;
			}
			if(english < 35)
			{
				System.err.println("Student 1 Failed in english ");
				english_passed_or_fail = false;
			}else { 
				System.out.println("Student 1 Passed in english ");
				english_passed_or_fail = true;
			}
			if(social < 35)
			{
				System.err.println("Student 1 Failed in social ");
				social_passed_or_fail = false;
			}else { 
				System.out.println("Student 1 Passed in social ");
				social_passed_or_fail = true;
				}
		total_marks = maths + physics + chemistry + biology + english + social;
		System.out.println("total marks of  student l:" +total_marks);
		
		char grade = 'X';
		
		if(maths_passed_or_fail == true & physics_passed_or_fail ==true & chemistry_passed_or_fail ==true & english_passed_or_fail == true & biology_passed_or_fail ==true & social_passed_or_fail == true)
		{
			//allSubjects_passed_or_fail = true;
		if(total_marks >= 480 && total_marks <=600) {
				grade = 'A';
		}else if(total_marks >= 420 && total_marks <=479) {
				grade = 'B';
		}else if(total_marks >= 360 && total_marks <=419) {
				grade = 'C';
		}else if(total_marks >= 300 && total_marks <=359) {
				grade = 'D';
		}else if(total_marks >= 240 && total_marks <=299) {
				grade = 'E';
		}else if(total_marks >= 210 && total_marks <=239) {
				grade = 'F';
		}else {
			System.out.println("NO grade");
		}
		System.out.println("Student 1 grade :"+grade);
		}
	else {
			System.out.println("----STUDENT 1 IS ALREADY FAILED - NO GRADE----- ");
		}
		
		} 
		System.out.println("------------------------");
		//FOR STUDENT 2
		maths = 100;
		physics = 99;
		chemistry = 38;
 		biology = 72;
	    english = 86;
		social= 88;
		
		if(maths > MAX_MARKS || maths < MIN_MARKS || physics > MAX_MARKS || physics < MIN_MARKS || chemistry > MAX_MARKS || chemistry < MIN_MARKS || biology > MAX_MARKS || biology < MIN_MARKS || english > MAX_MARKS || english < MIN_MARKS || social > MAX_MARKS || social < MIN_MARKS)
		{
			System.out.println("Invalid marks of studernt 2");
		}
		else {
			boolean allSubjectsPassed = true;
			
			if(maths < 35){
				System.err.println("Student 2 Failed in maths ");
				allSubjectsPassed = false;
				
			}else { 
				System.out.println("Student 2 Passed in maths ");
				allSubjectsPassed = true;				
			}
			if(physics < 35)
			{
				System.err.println("Student 2 Failed in physics ");
				allSubjectsPassed = false;
				
			}else { 
				System.out.println("Student 2 Passed in physics ");
				allSubjectsPassed = true;
				
			}
			if(chemistry < 35)
			{
				System.err.println("Student 2 Failed in chemistry ");
				allSubjectsPassed = false;
				
			}else { 
				System.out.println("Student 2 Passed in chemistry ");
				allSubjectsPassed = true;
				
			}
			if(biology < 35)
			{
				System.err.println("Student 2 Failed in biology ");
				allSubjectsPassed = false;
			
			}else { 
				System.out.println("Student 2 Passed in biology ");
				allSubjectsPassed = true;
				
			}
			if(english < 35)
			{
				System.err.println("Student 2 Failed in english ");
				allSubjectsPassed = false;
				
			}else { 
				System.out.println("Student 2 Passed in english ");
				allSubjectsPassed = true;
				
			}
			if(social < 35)
			{
				System.err.println("Student 2 Failed in social ");
				allSubjectsPassed = false;
				
			}else { 
				System.out.println("Student 2 Passed in social ");
				allSubjectsPassed = true;
				}
			total_marks = maths + physics + chemistry + biology + english + social;
			System.out.println("total marks of  student 2:" +total_marks);
			
			if(allSubjectsPassed) {
				char grade = 'X';
				if(total_marks >= 480 && total_marks <=600) {
					grade = 'A';
			}else if(total_marks >= 420 && total_marks <=479) {
					grade = 'B';
			}else if(total_marks >= 360 && total_marks <=419) {
					grade = 'C';
			}else if(total_marks >= 300 && total_marks <=359) {
					grade = 'D';
			}else if(total_marks >= 240 && total_marks <=299) {
					grade = 'E';
			}else if(total_marks >= 210 && total_marks <=239) {
					grade = 'F';
			}else {
				System.out.println("NO grade");
			}
			System.out.println("Student 2 grade :"+grade);
			}
		else {
				System.out.println("----STUDENT 2 IS ALREADY FAILED - NO GRADE----- ");
			}
				
			}
				
		
		}
	}


	

