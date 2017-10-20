package arrays;

public class Person {

	public static final String[] FIRST_START = {"Chr","M","L","Gr","Ph","B","Z","C"};
	public static final String[] FIRST_MIDDLE= {"isti","icha","era","eta","cal","man"};
	public static final String[] FIRST_END= {"","na","eu","n","r","in","s","o","rs"};
	
	public static final String[] LAST_START = {"L","F","Br","Gr","J","Sh","Z","B"};
	public static final String[] LAST_MIDDLE= {"a","i","e","o","u","is"};
	public static final String[] LAST_END= {"","son","n","i","r","in","s","o","rs"};
	
	//JAVA is pass-by-value
	//meaning the parameters of a method are just values,not references
	//so if  you change those values,the original object is not affected
	//In this case,'name' will not be changed.Nothing can change it
	//this.firstName via name
	public static String CreatNickName(String name)
	{
		String nickname="";
		int secondvowel= findSecond(name);
		nickname=name.substring(0, secondvowel);
		return nickname;
		
	}
	public static int findSecond(String word)
	{
		boolean foundvowel =false;
		word=word.toLowerCase();
		int index=word.length();
		for(int i =0;i<word.length();i++)
		{
			if(word.substring(i,i+1).equals("a")||
				word.substring(i,i+1).equals("e")||
				word.substring(i,i+1).equals("i")||
				word.substring(i,i+1).equals("o")||
				word.substring(i,i+1).equals("u")){
										
				if(!foundvowel)
				{
					foundvowel=true;
				}else {
					return i;
				}
			
			}
		}
		return index;
	}
			
	private String firstName;
	private String lastName;
	private Borough home;
	private Hobby hobby;
	private Person[] friends;
	private String nickname;
	
	public Person(String firstName,String lastName,Borough home) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.home= home;
		this.hobby=Hobby.randomHobby();
		this.nickname=CreatNickName(firstName);
		friends = new Person[3];
	}
	//
	public void mingle(Person[] people)
	{
		for(Person p:people)
		{
			if(p !=this) {
				p = betterFriend(p, friends[0]);
				addFriendToFirstPlace(p);
			}
		}
	}
	private Person betterFriend(Person p, Person q) {
		//having a friends is better than no friend at all
		if(p==null)
		{
			return q;
		}
		if(q==null)
		{
			return p;
		}
		if(p.getClass()==this.getClass() &&q.getClass()==this.getClass())
		{
			if(p.hobby==this.hobby)
			{
				return p;
			}else if(q.hobby==this.hobby)
			{
				return q;
			}
			
		}
		if(p.getClass() ==this.getClass())
		{
			return p;
		}
		if(q.getClass() ==this.getClass())
		{
			return q;
		}
		//if none these are true, just take p
		return p;
	}
	//moves all person in friends back one index and puts p at index 0
	public void addFriendToFirstPlace(Person p)
	{
		for(int i=friends.length-1;i>0;i--)
		{
			friends[i]=friends[i-1];
		}
		friends[0]=p;
	}
	public void printFriends()
	{
		System.out.println("My name is " + firstName+" " + lastName+ "and these are my friends:");
		for(Person f: friends)
		{
			if(f !=null)
				System.out.println(f);
		}
	}
	public String toString()
	{
		return "My name is " +firstName+" "+lastName+" and I live in "+home+".call me "+nickname+".";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		nickname=CreatNickName(firstName);
	}
}
