package search;

public class LionsPuzzle {

	public static void main(String[] args) {
		int lions = 11;
		System.out.println(lions + " lions decide to eat the sheep? "+ eatSheepOrNot(lions));

	}

	private static boolean eatSheepOrNot(int lions) {
		if(lions ==1) {
			//there are no lions to eat you if u eat a sheep
			return true;
		}else {
			// you would eat the sheep knowing tha other lions dont eat the sheep
			return !eatSheepOrNot(lions-1);
		}
	}

}
