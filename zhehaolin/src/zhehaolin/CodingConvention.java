package zhehaolin;//this is a package declaration

//this is a class header (class declaration)
public class CodingConvention {
	
	
	//fields
		private String name;
		private String description;
		
		/*
		//this is a special method, a "constructor"
		//notice it does not have a return type,
		//that is because the thing it returns is an instance of the class
		 * therefore the name of a constructor must always
		 *  match the name of the class
		 */
		public CodingConvention(String name, int index){
			//In Java, fields are instantiated in a constructor
			
			//there is a local variable called ' name' and a field call 'name'
			//the field persists, but the local variable data is destroyed at the end of this method
			//distinguish the field by using the reserverd word
			this.name = "Mr. Nockles";
			description = IntroMain.DESCRIPTIONS[index];
		}
		
		public void dostuff() {
			//static method call
			System.out.println(name + description);//use a space between your operations
			System.out.print("The square root of 12 is" + Math.sqrt(12));
		}
}
