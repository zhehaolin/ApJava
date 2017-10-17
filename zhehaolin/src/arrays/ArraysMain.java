package arrays;

import java.util.Arrays;

public class ArraysMain {
	
	private String[] testArray;
	private int[] intRay;
	private int rolls;
	
	
	public ArraysMain() {
		intRay = new int[100];
		int[] randomrolls = new int[1000];
		populate(randomrolls);
		
		int[] result=longestconsecsqeandpos(randomrolls);
		System.out.println("The longest sequence of dice rolls is " + result[0] + " it happened on the " + (result[1]+1)+"th roll. Starting with a roll of " +randomrolls[result[1]]+".");
		
		//populate(intRay);
		//checkOccurences(intRay,3,18);
		//populate1toN(intRay);
		//swap(intRay,0,1);
		//reverseArray(intRay);
		//fronttoback(intRay);
		//arrays is a utility calls included in java for formatting
		//System.out.println(Arrays.toString(intRay));
		
	}
	public int[] longestconsecsqeandpos(int[] arr)
	{
		int[] data = new int[2];
		data[0]=longestconsecutivesequence(arr);
		data[1]=rolls;
		return data;
	}
	private void shuffle(int[] arr) {
		for(int i=0; i<arr.length;i++)
		{
			swap(arr,(int) (Math.random()*arr.length),(int) (Math.random()*arr.length));
		}
		
	}
	private int[] reverseArray(int[] arr)
	{
		int[] reverseArray = new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			reverseArray[i]=arr[arr.length-(i+1)];
		}
		return reverseArray;
		
	}
	public void fronttoback(int[] arr)
	{
		int temp=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(i==0)
			{
				arr[arr.length-1]=temp;
			}else
			{
				arr[i-1]=arr[i];
			}
			
		}
		
	}
	public void cycleThrough(int[] arr, int n)
	{
		for(int i=0;i<n;i++)
		{
			fronttoback(arr);
		}
	}
	//return the length of the longest sequence of consecutive intergers 
	//for example lcs({1,2,3,7,8,9,10,})
	public int longestconsecutivesequence(int[] arr)
	{
		int count=1;
		int currentmax=1;
		for(int i=0;i<arr.length-1;i++)
		{
			if(isconsecutive(arr,i))
			{
				count+=1;
				
			}else {
				if(count>currentmax)
				{
					currentmax=count;
					rolls=i-currentmax;
					count=1;
				}
				count=1;
				
			}
			
			
		}
		return currentmax;
	}
	
	public boolean isconsecutive(int[] arr,int n)
	{
		if(arr[n]+1==arr[n+1])
		{
			return true;
		}
		return false;
	}
	public int countlessthan(int[] arr,int n)
	{
		int count=0;
		for(int value: arr)
		{
			if(value<n)count++;
		}
		return count;
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
			intRay[i] = diceRoll(2);
			
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
