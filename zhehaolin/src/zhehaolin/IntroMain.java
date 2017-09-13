package zhehaolin;

public class IntroMain {
	
	public static final String[] DESCRIPTIONS = {"is a teacher","this is a student","this is human being","this is imaginary"}; 
	
	public static void main(String[] args) {
		//declaration of a local variable
		//notice the use of the word 'new'
		//new must be used to call a constructor
		CodingConvention conventionsInstance = new CodingConvention("Mr. Nockles", 0);
		
		//instance method call
		conventionsInstance.dostuff();
	}
}
