package Advanture;

public class NPCRoom extends CaveRoom {
	private NPC presentNPC;
	
	
	public NPCRoom(String description) {
		super(description);
		presentNPC= null;
	}
	/*
	 * NPCs can enter a room if no other npc is in that room
	 * 
	 */
	public boolean CanEnter() {
		return presentNPC == null;
	}
	public void enterNPC(NPC m)
	{
		presentNPC = m;
	}
	public void leaveNPC()
	{
		presentNPC= null;
	}
	public boolean containsNPC()
	{
		return presentNPC !=null;
	}
	
	//the above methods are new features to a caveroom,
	//the methods below replace caveroom methods(override)
	
	
	public String validKeys()
	{
		return "wdsae";
	}
	public void printAllowedEntry()
	{
		System.out.print("Only enter w a s d to move or" +" you can type e to interact. ");
	}
	public void performAction(int direction) {
		if(direction ==4) {
			if(containsNPC() && presentNPC.isActive()) {
				presentNPC.interact();
			}else {
				CaveExplorer.print("there is nothing to interact with.");
			}
		}else
		{
			CaveExplorer.print("That key does nothing.");
		}
	}
	public String getContents()
	{
		if(containsNPC() && presentNPC.isActive())
		{
			return "M";
		}else {
			//return what would be return otherwise
			return super.getContents();
		}
	}
	public String getDescription()
	{
		if(containsNPC() && !presentNPC.isActive()) {
			return super.getDescription() +"\n" + presentNPC.getInactiveDescription();
		}else
		{
			String npcDesc=" ";
			if(presentNPC != null)
			{
				npcDesc = presentNPC.getActiveDescription();
			}
			return super.getDescription() + "\n"+npcDesc;
		}
	}
	
	
	
	
}
