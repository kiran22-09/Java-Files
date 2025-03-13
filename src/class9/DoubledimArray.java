package class9;

public class DoubledimArray {
	
	public int[][] data(){
		
		int[][] marksArray = new int[2][5];
		
		marksArray[0][0] = 111; 
		marksArray[0][1] = 55; 
		marksArray[0][2] = 66;
		marksArray[0][3] = 77; 
		marksArray[0][4] = marksArray[0][1] + marksArray[0][2]+ marksArray[0][3];
		
		
		
		marksArray[1][0] = 222;
		marksArray[1][1] = 55; 
		marksArray[1][2] = 66; 
		marksArray[1][3] = 77; 
		marksArray[1][4] = marksArray[1][1] + marksArray[1][2]+ marksArray[1][3];
		
		return marksArray;
	}
	
	public void arrayIs(int[][] marksArray) {
		System.out.println("no of rows = " +marksArray.length );
		for(int i=0;i<marksArray.length;i++) {
			for(int j=0;j<marksArray[0].length;j++) {
				System.out.println("elements are ..............."+marksArray[i][j]);
				}
			}
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoubledimArray obj = new DoubledimArray();
		int[][] kiran = obj.data();
		obj.arrayIs(kiran);
	
		
	}

}