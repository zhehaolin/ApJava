package arrays;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		ObjectArrays oA = new ObjectArrays();
		Person s=new Person("BEN","Nockles",Borough.NY_BOROUGHS[0]);
		int x=10;
		int [] a= {5,6,7};
		test(s,x,a);
		System.out.println(s +"," +x+","+ Arrays.toString(a));
	}
	//pass by value examples
	//this does change the name;
	//this also changes the array
	// NO VOID METHOD CAN PERMANENTLY CHANGE AN INT
	//YOU CAN IF YOU SET IT AS A RETURN TYPE
	public static void test(Person s,int x,int[] arr) {
		s.setFirstName("firstNamez");
		
		x=5;
		//arr=new int[3]; AS LONG AS YOU DONT MAKE A NEW ARR
		//THE REFERENCES THEMSELVES WILL CHANGE;
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
	}
}
