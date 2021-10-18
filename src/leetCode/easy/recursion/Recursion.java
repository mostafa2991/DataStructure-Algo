package leetCode.easy.recursion;

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
	static int powerOfTwo(int n) {
		if(n==0) {
			return 1;
		}else {
			int power = 2*powerOfTwo(n-1);
			return power;
		}
	}
	public static void main(String[] args) {
		/*
		 * when to use recursion -- good candidate for recursion 
		 * 1- Design an algo to compute 
		 * 2- write code to list the 3- implement a method to compute all
		 * 3- tress or graph
		 * 4- used in divide and conquer , greedy and dynamic programming
		 */
//		recursiveCall(5);
		System.out.println(powerOfTwo(3)); 
	}

}
