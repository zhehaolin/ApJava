package Advanture;

public class CaveRoom {
	
	private String description;//tells wat the room looks like
	private String directions;//tell what you can do
	private String contents;//a symbol representing what's in the room
	private String defaultContents;
	//the rooms are organized by direction, null signifies no room/door in that direction
	private CaveRoom[] borderingRooms;
	private Door[] doors;
	
	//constants
	public static final int NORTH =0;
	public static final int EAST =1;
	public static final int SOUTH =2;
	public static final int WEST =3;

	public CaveRoom(String description) {
		this.description = description;
		setDefaultContents(" ");
		contents = defaultContents;
		//difference between defaultcontents and content is content becomes an x
		//When you are inside the room, when you leave, it goes back to default
		
		//note by default arrys will populate with null means no connection
		borderingRooms= new CaveRoom[4];
		doors= new Door[4];
		setDirection();
		
	}
	// for every door in doors[] appends a String to "directions" describing the access
	// example there is a door to the north
	// if there are no doors at all, direction should say: There are no doors, you are trapped in here.
	public void setDirection() {
		
		directions ="";
		boolean doorFound=false;
		for(int i=0;i<doors.length;i++)
		{
			if(doors[i] !=null)
			{
				doorFound = true;
				directions += "\n  There is a "+doors[i].getDescription() +" to "+toDirection(i)+"."+doors[i].getDetails();
			}
			
		}
		if(!doorFound)
		{
			System.out.println("There are no doors, you are trapped in here");
		}
			
		
		
		
	}
	//converts an int to a direction 
	public static String toDirection(int dir)
	{
		String[] directions = {"the North","the East","the South","the West"};
		return directions[dir];
	}

	public String getDescription() {
		return description;
	}

	public void setDescriptiom(String description) {
		this.description = description;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public void setDefaultContents(String defaultContents) {
		this.defaultContents = defaultContents;
	}
	
	

}
