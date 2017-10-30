package Advanture;

public class TwoDArrayPractice {

	public static void main(String[] args){
		String[][] pic= new String[6][10];
		 for(int row=0;row<pic.length;row++) {
			 for(int col=0;col<pic[row].length;col++) {
				 pic[row][col]= " ";
			 }
			 
		 }
		// drawHorizontalLine(pic,1);
		// drawVerticalLine(pic,2);
		// drawSlot(pic,4,5);
		 drawBox(pic,0,0);
		 print(pic);
		 
	
	}
	/**
	 * Box looks like this 
	 * 	_
	 * |*|
	 * |_|
	 * 		
	 * @param pic
	 * @param i
	 * @param j
	 */
	private static void drawBox(String[][] pic, int i, int j) {
		drawSlot(pic,i,j);
		drawSlot(pic,i+1,j);
		drawIfInBounds("_",pic,i+1,j);
		for(int col =j-1;col<=j+1;col++)
		{
			drawIfInBounds("_",pic,i-1,col);
		}
		
		
			
		
		
		
		
	}
	private static void drawIfInBounds(String string, String[][] pic, int i, int j) {
		// always check row before column
		if(i>= 0 && i<pic.length && j>=0 && j<pic[i].length) {
			pic[i][j]= string;
		}
		
	}
	//a slot looks like this 
	//    | |
	//two vertical lines with a space between them
	// the coordinates, i,j are the coordinates of the space
	private static void drawSlot(String[][] pic, int i, int j) {
		if(i>=0 && i<pic.length) {
			if(j>0) 
			{
				pic[i][j-1]= "|";
			}
			if(j<pic.length-1)
			{
				pic[i][j+1]= "|";
			}
		}
			
		
	}
	private static void drawVerticalLine(String[][] pic, int col) {
		for(int row=0;row<pic.length;row++)
		{
			pic[row][col]= "|";
		}
		
	}
	private static void drawHorizontalLine(String[][] pic, int row) {
		for(int col=0;col<pic[row].length;col++) {
			pic[row][col]= "-";
		}
		
	}
	// prints contents of pic, row by row
	private static void print(String[][] pic) {
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
