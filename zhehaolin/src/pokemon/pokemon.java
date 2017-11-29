package pokemon;

public class pokemon {
	private int level;
	private int hp;
	private String name;
	private boolean posioned;

	public static void main(String[] args) {
		pokemon squirtle = new pokemon("Squirtle",26);
		 pokemon bulbasaur = new pokemon("Bulbasaur",26);
		 squirtle.ichooseYou();
		 bulbasaur.ichooseYou();
		 System.out.println("Squirtle is preparing to attack with water blast");
		 squirtle.attack(bulbasaur, new Attack() {
		 public void attack(pokemon target) {
				int hp=target.getHP();
				target.setHP(hp/2);
			}
		 });
		 System.out.println("Bulbasaur is preparing to attack with poison.");
		 bulbasaur.attack(squirtle, new Attack() {
		 
		 public void attack(pokemon target) {
			 target.setPoisoned(true);
		 }
		 });
		 	squirtle.lapse();
		 	bulbasaur.lapse();
		 	printScore(squirtle, bulbasaur);
		 	System.out.println("squirtle is attacking again!");
		 	squirtle.attack(bulbasaur,new Attack() {
		 		public void attack(pokemon target) {
		 			int oldhp=target.getHP();
		 			target.setHP(oldhp -1);
		 		}
		 	});
		 	printScore(squirtle, bulbasaur);
		 	squirtle.levelup(new Effect() {
		 		public void happens() {
		 			squirtle.name = "hoho";
		 		}
		 	
			} );
		 }
	private static void printScore(pokemon p1, pokemon p2) {
		System.out.println(p1.getName()+", HP= "+p1.getHP());
		System.out.println(p2.getName()+", HP= "+p2.getHP());
	}
	
	public pokemon(String name,int level) {
		this.hp=100;
		this.posioned=false;
		this.name= name;
		this.level = level;
	}
	public void levelup(Effect e) {
		this.level+=1;
		e.happens();
		
	}
	
	private void ichooseYou() {
		for(int i=0;i<2;i++) {
			System.out.println(this.name);
		}
	}
	private int getHP() {
		return this.hp;
	}
	private void setHP(int newHP) {
		this.hp=newHP;
	}
	private String getName() {
		return this.name;
	}
	private void setPoisoned(boolean b) {
		this.posioned=b;
	}
	private void lapse() {
		if(this.posioned=true) {
			this.hp-=15;
		}
	}
	public void attack(pokemon target, Attack attack){
		if(Math.random() < .9){
			attack.attack(target);
			System.out.println("The attack hit");
		 }else{
			 System.out.println("The attack missed");
		 }
	 }

}
