package Arrays2D;

public class Main {

	public Main() {
		
	}
	public static void changeNeighbors(int[] arr,int psn)
	{
		arr[psn]++;
		if(psn>0)
		{
			arr[psn-1]--;
		}
		if(psn<arr.length-1)
		{
			arr[psn+1]--;
		}
		
	}

}
