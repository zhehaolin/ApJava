package Advanture;

public class TwoDArrayPractice {

	public TwoDArrayPractice() {
		String[][] pic= new String[6][10];
		 for(int row=0;row<pic.length;row++) {
			 for(int col=0;col<pic[row].length;col++) {
				 pic[row][col]= " ";
			 }
			 
		 }
		 print(pic);
	
	}
	// prints contents of pic, row by row
	private void print(String[][] pic) {
		String line="";
		for(int row=0;row<pic.length;row++) {
			for(int col=0;col<pic[row].length;col++) {
				line+= pic[row][col];
			}
			line+="\n";
		}
		System.out.println(line);
	}
}
