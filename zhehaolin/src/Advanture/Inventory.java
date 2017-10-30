package Advanture;

public class Inventory {

	private String map;
	public Inventory() {
		updateMap();
	}

	public void updateMap() {
		map= " ";
		//create line across top
		for(int i=0;i<CaveExplorer.caves[0].length;i++) {
			map += "____"; //4 underscore
		}
		map+="___\n";
		for(CaveRoom[] row :CaveExplorer.caves) {
			for(int i=0; i<3;i++) {
				String text="";
				for(CaveRoom cr:row)
				{
					//if door is open, leave open 
					if(cr.getDoor(CaveRoom.WEST)!= null && cr.getDoor(CaveRoom.WEST).isOpen() )
					{
						text += " ";
					}else
					{
						text+= "|";
					}
					//contents of room depend on what row this is 
					if(i==0) {
						text+="   ";
					}else if(i==1)
					{
						text+=" "+cr.getContents()+" ";
					}else if(i==2)
					{
						//draw space if door to south is open
						if(cr.getDoor(CaveRoom.SOUTH)!= null && cr.getDoor(CaveRoom.SOUTH).isOpen()) {
							text+="   ";
						}else
						{
							text +="___";
						}
					}
				}//last caveroom in row
				text+="|";
				map+= text+"\n";
			}
			
		}
	}

	public String getDescription() {
		//return "you have nothing in your inventory";
		return map;
	}
	

}
