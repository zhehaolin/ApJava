package arrays;

public class Hobby extends Thing {

	public Hobby(String description) {
		super(description);
		
	}

	public static Hobby randomHobby() {
		Hobby[] someHobbies= {new Hobby("Programming"), new Hobby("Dancing"),new Hobby("Playing video games")};
		return someHobbies[(int)(Math.random()*someHobbies.length)];
	}
	public String toString()
	{
		return super.toString()+"hobby";
	}

}
