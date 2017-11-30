package search;

public class ArtificalForLoop {
	
	public static void main(String[] args) {
		forloop(10,new Action() {
			
			int count =1;
			@Override
			public void act() {
				System.out.println(count+ " bye ");
				count++;
				
				
			}
		});
	}
	
	public static void forloop(int n, Action a) {
		if(n>0) {
			forloop(n-1,a);
			a.act();
		}
	}
}
