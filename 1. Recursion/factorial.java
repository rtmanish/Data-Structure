package Recursion;

public class factorial {

	public static int fact(int n) {
		if(n==0) {
			return 1;            // Base Case-where you want your problem recursion to stop
		}
		int smallAns=fact(n-1);  //function calling itslef
		return n*smallAns;
		
	}
	public static void main(String[] args) {
		int n=3;
		int ans=fact(n);
		System.out.println(ans);

	}

}
