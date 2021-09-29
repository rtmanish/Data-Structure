package Recursion;

// fibbonacci series::=== 0,1,1,2,3,5,8,13.........

public class Nth_fibbonacci_number {

	public static int fib(int n) {
		if (n==0 || n==1) {
			return n;
		}
		return fib(n-1)+fib(n-2);
	}
	
	public static void main(String[] args) {
		int n=3;
		System.out.println(fib(n));
	}

}
