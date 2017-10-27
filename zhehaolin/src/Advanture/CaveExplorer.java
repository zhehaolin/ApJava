package Advanture;

import java.util.Scanner;

public class CaveExplorer {
	public static CaveRoom[][] caves;//every room in the cave
	public static Scanner in;//for user input
	public static CaveRoom currentRoom;//changes based on user input
	public static Inventory inventory;//where all object found in cave are stored
	public static boolean playing=true;
	
	
	public static void main(String[] args)
	{
		in = new Scanner(System.in);
		CaveRoom.setUpCaves();
		
		inventory = new Inventory();
		startExploring();
	}


	private static void startExploring() {
		while(playing)
		{
			print(inventory.getDescription());
			print(currentRoom.getDescription());
			print("What would you like to do?");
			String input= in.nextLine();
			currentRoom.interpretInput(input);
		}
		
	}
	public static void print(String s)
	{
		//NOTE: later you can replace this line with more sophistocated "multiLinePrint" from chatbot
		System.out.println(s);
	}
	
}

