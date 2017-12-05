package search;

public class fibanbciNumber {
	private int count=0;
	public static void main(String[] args) {
		
		System.out.println(FNumber(3));
		System.out.println(FNumber(4));
	}
	public static int FNumber(int n) {
		if(n<=1) {
			return 1;
		}else {
			return FNumber(n-1)+FNumber(n-2);
		}
	}
}
