package attendance;

public class Student implements Attendee{
	private String firstname="";
	private String lastname="";
	private boolean present;
	public String myreport="";
	
	public Student(String first,String last)
	{
		this.firstname=first;
		this.lastname=last;
		present = false;
	}
	public boolean isPresent()
	{
		return present;
		
	}
	public void setPresent(boolean present)
	{
		this.present = present;
	}
	public String getFirstName()
	{
		return firstname;
		
	}
	public String getLastName()
	{
		return lastname;
	}
	public boolean matches(String first, String last)
	{
		return first.toLowerCase().equals(firstname.toLowerCase()) &&last.toLowerCase().equals(lastname.toLowerCase());
	}
	public boolean match(String last)
	{
		return last.toLowerCase().equals(lastname.toLowerCase());
	}
	public String getReportString()
	{
		if(lastname.length()>20)
		{
			myreport=lastname.substring(0,17) + "...";
		}else {
			
			while(lastname.length() <20)
			{
				lastname+=" ";
			}
			myreport = lastname;
		}
		if(firstname.length()>20)
		{
			myreport+=firstname.substring(0, 17) + "...";
		}else {
			while(firstname.length()<20)
			{
				firstname+=" ";
			}
			myreport+=firstname;
		}
		if(present == true)
		{
			return myreport += "PRESENT \n";
		}else {
			return myreport += "ABSENT \n";
		}
			
			
		
		
		
	}
}
