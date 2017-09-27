package attendance;

public class Student implements Attendee{
	private String firstname="";
	private String lastname="";
	private boolean present=false;
	public String report="";
	
	public Student()
	{
		
	}
	public boolean isPresent()
	{
		return present;
		
	}
	public void setPresent(boolean present)
	{
		present = true;
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
		if(first == firstname && last == lastname)
		{
			return true;
		}
		return false;
	}
	public boolean match(String last)
	{
		if(last == lastname)
		{
			return true;
		}
		return false;
		
	}
	public String getReportString()
	{
		if(lastname.length() > 20)
		{
			report += lastname.substring(0,17)+"...";
			if(firstname.length()>20)
			{
				 report += firstname.substring(0,17)+"..." + isPresent();
				 return report;
			}else
			{
				while(firstname.length()<20)
				{
					firstname +=" ";
				}
				report += firstname + isPresent();
				return report;
				
			}
			
		}else {
			while(lastname.length()<20)
			{
				lastname+= " ";
			}
			report +=lastname;
			if(firstname.length()>20)
			{
				 report += firstname.substring(0,17)+"..." + isPresent();
				 return report;
			}else
			{
				while(firstname.length()<20)
				{
					firstname +=" ";
				}
				report += firstname + isPresent();
				return report;
				
			}
			
			
		}
		
		
		
	}
}
