package arrays;

import java.util.Arrays;

public class ObjectArrays {

	public ObjectArrays() {
		Person[] people= new Person[50];
		populate(people);
		//people[0]= new Thing("coffee maker");
		for(Person p: people)
		{
			p.mingle(people);
			p.printFriends();
			System.out.println(" ");
		}
		
	}
	public Person[] selectGroup(Person[] population,int length)
	{
		Person[] selePerson=new Person[length];
		selePerson[0]= selectAPerson(population);

		for(int i =1;i<length;i++)
		{
			Person nextPerson = selectAPerson(population);
			while(personInGroup(selePerson, nextPerson)) {
				nextPerson = selectAPerson(population);
			}
			selePerson[i]= nextPerson;
		}
		return selePerson;
		
		
	}
	//return the number of difference between the two array
	//a difference means they dont have the same element at the same position
	public double countDifferences(Person[] arr1,Person[] arr2)
	{
		int count=0;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]!=arr2[2])
			{
				count++;
			}
		}
		return count;
			
		
	}
	//calls count differences on two person arrays, each array must contain the same elements, but randomly ordered
	//print the number of differences betweeen the two arrays
	// do this 100 times, print the average
	public void testshuffling()
	{
		
	}
	public boolean personInGroup(Person[] selePerson, Person nextPerson) {
		for(int i =0;i<selePerson.length;i++)
		{
			if(selePerson[i]==nextPerson)
			{
				return true;
			}
		}
		return false;
	}
	private Person selectAPerson(Person[] population) {
		return population[(int) (Math.random()*population.length)-1];
	}
	private void populate(Object[] people) {
		for(int i=0;i<people.length;i++) {
			String firstName = randomNameFrom(Person.FIRST_START,Person.FIRST_MIDDLE,Person.FIRST_END);
			String lastName = randomNameFrom(Person.LAST_START,Person.LAST_MIDDLE,Person.LAST_END);
			Borough b = randomBorough();
			//BIG IDEA
			//in object[] (but not primitive arrays like int[] or double[])
			//you can have multiple data types (Sub-class of the declared type)
			if(Math.random() < .6)
			{
				//60% of the time i want to be a student
				int grade= (int)(Math.random()*5)+9;
				people[i] = new Student(firstName,lastName,b,grade);
			}else {
				people[i]= new Person(firstName,lastName,b);
			}
			
	}

	}

	private Borough randomBorough() {
		return Borough.NY_BOROUGHS[(int)(Math.random()*Borough.NY_BOROUGHS.length)];
	}

	private String randomNameFrom(String[] a, String[] b, String[] c) {
		
		return get(a)+get(b)+get(c);
	}

	private String get(String[] a) {
		
		return a[(int) (Math.random()*a.length)];
	}
}
