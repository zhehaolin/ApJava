package search;

public class RECURSIONEXERCISES {
	static int count=0;
	 public static void main(String[] args){
		 int value = 12;
		// System.out.println(value+"! is equal to "+factorial(value));
		 System.out.println(value+ " has "+countPrimeFactors(value, 2)+" prime factors.");
		 }

		 public static int countPrimeFactors(int value, int testPrime) {
			 
			 if(value == 1) {
				 return count;
			 }else if(value%testPrime==0) {
				 count++;
				 return countPrimeFactors(value/testPrime,testPrime);

			 }else {
				 return countPrimeFactors(value/testPrime,testPrime++);
			 }
		 }

		 //public static int factorial(int value) {
		//	 if(value ==1) {
		//		 return 1;
		//	 }else {
		//		 return value*factorial(value-1);
		//	 }
		// }
}
