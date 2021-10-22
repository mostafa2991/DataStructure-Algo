package recursion;

public class Recursion {
//  logicBehindRecursive
	static void recursiveCall(int n) {
		if(n<1) {
			System.out.println("we are less than one");
			
		}else {
			recursiveCall(n-1);
//			if this don't exist won't save it in stack memory
			System.out.println(n);
		}
	}
//	2 * 2
	static int powerOfTwo(int n) {
		if(n==0) {
			return 1;
		}else {
			int power = 2*powerOfTwo(n-1);
			return power;
		}
	}
//	the same like N! = n * (n-1) * (n-1 -1) * (n-1 -1-1)
	static int factorial(int n) {
		if(n==0 ) {
			return 1;
		}else {
			int power = n*fibonacci(n-1);
			return power;
		}
	}
//	base case means that its stooping in this step as
//	the method solve the logic for this step
	static int fibonacci(int n) {
		 if(n<0) return -1 ;
	        if(n==0) return 0 ;
	        if(n==1) return 1;
	        int res = fibonacci(n-1)+fibonacci(n-2);
	            return res;
	}
//	for 383 => 3+sum(38) ---> 3 + 8 +sum(3)
	static int sumofDigits(int n) {
		if(n<0) return 0 ;
		if(n==0) return 0 ;
		return n/10 + sumofDigits(n%10);
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		/*
		 * when to use recursion -- good candidate for recursion 
		 * 1- Design an algo to compute 
		 * 2- write code to list the 3- implement a method to compute all
		 * 3- trees or graph
		 * 4- used in divide and conquer , greedy and dynamic programming
		 * 5- don't use for things that need so fast action like airbags in cars
		 * or devices with low memory like phones
		 * 6- u can memories the result of call (advance topic)
		 * 7- don't us when u need space or so fast time
		 */
		/*
		 * recursion -- using 1- flow  2- base case when to stop the recursion
		 * 
		 */
//		recursiveCall(5);
		System.out.println(powerOfTwo(3)); 
		System.out.println("factorial(4)  " +factorial(4)); 
		System.out.println("factorial(10)  "+factorial(10)); 
	}

}
