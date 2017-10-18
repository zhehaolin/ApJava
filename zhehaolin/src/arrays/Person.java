package arrays;

public class Person {

	public static final String[] FIRST_START = {"Chr","M","L","Gr","Ph","B","Z","C"};
	public static final String[] FIRST_MIDDLE= {"isti","icha","era","eta","cal","man"};
	public static final String[] FIRST_END= {"","na","eu","n","r","in","s","o","rs"};
	
	public static final String[] LAST_START = {"L","F","Br","Gr","J","Sh","Z","B"};
	public static final String[] LAST_MIDDLE= {"a","i","e","o","u","is"};
	public static final String[] LAST_END= {"","son","n","i","r","in","s","o","rs"};
			
	private String firstName;
	private String lastName;
	private Borough home;
	
	public Person(String firstName,String lastName,Borough home) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.home= home;
	}
	
	public String toString()
	{
		return "My name is " +firstName+" "+lastName+" and I live in "+home+".";
	}
}
