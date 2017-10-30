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
		
		//note by default arrays will populate with null means no connection
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
		
			
		
		
		
	}
	//converts an int to a direction 
	public static String toDirection(int dir)
	{
		String[] directions = {"the North","the East","the South","the West"};
		return directions[dir];
	}
	public void enter()
	{
		contents="x";
	}
	public void leave()
	{
		contents= defaultContents;
	}
	// give this room access to another room vice versa
	//sets door between them, updating the directions
	public void setConnection(int direction, CaveRoom anotherRoom,Door door)
	{
		addRoom(direction,anotherRoom,door);
		anotherRoom.addRoom(oppositeDirection(direction), this, door);
		
	}

	public static int oppositeDirection(int direction) {
		int[] output={2,3,0,1};
		
		return output[direction];
		
		
	}
	public void interpretInput(String input)
	{
		while(!isValid(input)) {
			System.out.print("Only enter w a s d");
			input= CaveExplorer.in.nextLine();
		}
		//task: convert user input into a direction
		String dirs = "wdsa";
		goToRoom(dirs.indexOf(input));
	}
	private boolean isValid(String input) {
		String validEntries = "wdsa";
		return validEntries.indexOf(input) > -1 && input.length() ==1;
	}
	private void goToRoom(int direction) {
		//first, protect against null pinter exception
		//user cannot go through non-existent door
		if(borderingRooms[direction]!=null && doors[direction] !=null)
		{
			CaveExplorer.currentRoom.leave();
			CaveExplorer.currentRoom = borderingRooms[direction];
			CaveExplorer.currentRoom.enter();
			CaveExplorer.inventory.updateMap();
		}
		
	}
	// this will be where your group sets up all caves and all the connections
	public static void setUpCaves()
	{
		//ALL OF THIS CODE CAN BE CHANGED
		//1 decide how big you caves should be
		CaveExplorer.caves = new CaveRoom[5][5];
		//2. populate with caves and a default description: hint when starting, use coordinates(help debugging)
		for(int row=0;row<CaveExplorer.caves.length;row++)
		{
			//PAY ATTENTION  TO THE DIFFERENCE
			for(int col=0;col<CaveExplorer.caves[row].length;col++)
			{
				//Create a cave
				CaveExplorer.caves[row][col] = new CaveRoom("This cave has coords("+row+","+col+")");
			}
		}
		//3 replace default room with custom rooms
		
		//4 set starting room
		CaveExplorer.currentRoom = CaveExplorer.caves[0][1];
		CaveExplorer.currentRoom.enter();
		//5 set up doors
		CaveRoom[][] c = CaveExplorer.caves;
		c[0][1].setConnection(SOUTH,c[1][1],new Door());
	}
	public void addRoom(int direction, CaveRoom cave, Door door) {
		borderingRooms[direction] =cave;
		doors[direction] = door;
		setDirection();
		
	}
	public String getDescription() {
		return description + "\n"+directions;
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
	public Door getDoor(int direction) {
		return doors[direction];
	}
	
	

}
