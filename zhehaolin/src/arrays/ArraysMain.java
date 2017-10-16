package arrays;

import java.util.Arrays;

public class ArraysMain {
	
	private String[] testArray;
	private int[] intRay;
	
	
	public ArraysMain() {
		intRay = new int[100];
		//populate(intRay);
		//checkOccurences(intRay,3,18);
		populate1toN(intRay);
		swap(intRay,0,1);
		shuffle(intRay);
		//arrays is a utility calls included in java for formatting
		System.out.println(Arrays.toString(intRay));
	}
	private void shuffle(int[] arr) {
		for(int i=0; i<arr.length;i++)
		{
			swap(arr,(int) (Math.random()*arr.length),(int) (Math.random()*arr.length));
		}
		
	}
	private void swap(int[] arr, int s, int e) {
		int temp=arr[s];
		arr[s]=arr[e];
		arr[e]=temp;
		
	}
	private void populate1toN(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=i+1;
		}
		
	}
	private void checkOccurences(int[] arr, int s, int e) {
		int[] counter = new int[e-s+1];
		for(int value: arr)
		{
			counter[value-s]++;
		}
		for(int i=0;i<counter.length;i++)
		{
			System.out.println("A " +(s+i)+ " was rolled " + counter[i] + " times.");
		}
		
	}
	private void populate(int[] intRay) {
		
		for(int i=0; i<intRay.length;i++)
		{
			intRay[i] = diceRoll(3);
			
		}
	}
	public void notes()
	{
		// collection of primitives or objects 
				//special note: this is the only collection of primitives
				//size cannot be modified
				//elements of an array are references to objects
				// in other words, changing an element of an array changes the reference, not the object
			    // there is two type of constructors, the first we've seen already:
				
				int[] firstype= {3,14,-9,-10};
				//this constructor can only be used at the declaration.
				
				// 2nd type:
				testArray = new String[50];
				// special note for primitive arrays, when they are instantiated, they are automactically populated with 0s.
				// this is not the case with object arrays, which are populated with null
				
				for(int i=0;i<testArray.length;i++) {
					System.out.println(testArray[i]);
				}
				
				//for each loop(useful only when you dont need to keep track of an index)
				for(String value:testArray) {
					//"for each int in testArray...
					System.out.println(value);
				}
	}
	

	public static void main(String[] args) {
		ArraysMain arrayPractice = new ArraysMain();

	}
	
	/** returns the result from rolling "numberOfDice" dice.
	 * 
	 * @param numberOfDice
	 * @return
	 */
	public int diceRoll(int numberOfDice)
	{
		int dicecount = 0;
		for(int i=0; i<numberOfDice;i++)
		{
			dicecount += (int) (Math.random()*6+1);
		}
		return dicecount;
	}

}
