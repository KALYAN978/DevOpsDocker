import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;


public class Model1{  
	
	
	public static void printMyName(String name) {
		System.out.println(name);
		return;
	}
	
	public static int sum(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	public static void factorial(int n) {
		int fct = 1;
		for(int i=n;i>=n;i--) {
			fct = fct*i;
			
		}
		System.out.println(fct);
		return;
	}
	
	public static int mul(int a,int b) {
		return a*b;
	}

public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String name = sc.next();
	printMyName(name);
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	int Sum = sum(a,b);
	System.out.println(Sum);
	System.out.println(mul(a, b));
	int n = sc.nextInt();
	factorial(n);
	
	
	
	
	

}
}  






 
