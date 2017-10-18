package arrays;

public class Student extends Person {
	
	public static final String[] grades = {"Freshman","Sophomore","Junior","Senior","Super Senior"};

	private String grade;
	public Student(String firstName, String lastName, Borough home, int gradelevel) {
		super(firstName, lastName, home);//super constructor is the first because a person must exit before a student can.
		int index = gradelevel-9;
		this.grade= grades[index];
	}
	
	public String toString()
	{
		//NOTE: if you want to call the parent method, use super.
		return super.toString()+" I am also a "+grade+".";
	}

}
