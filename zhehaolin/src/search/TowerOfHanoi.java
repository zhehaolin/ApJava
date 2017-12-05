package search;

public class TowerOfHanoi {
	public static void main(String[] args) {
		TowerOfHanoi towerOfHanoi= new TowerOfHanoi();
		towerOfHanoi.towersolution(3,"A","B","C");
		//reverseString("suny");
	}

	private void towersolution(int n, String start, String helper, String end) {
		if(n==1) {
			System.out.println(start+" --> "+end);
		}else {
			towersolution(n-1,start,end,helper);
			System.out.println(start+" --> "+end);
			towersolution(n-1,helper,start,end);
		}
	}
	//public static String reverseString(String x) {
	//	if(x.length()==1) {
	//		System.out.println(x);
	//		return x;
	//	}else {
	//		System.out.println(x.substring(x.length()-1));
	//		return reverseString(x.substring(0,x.length()-1));
	//	}
	
	//}
}
