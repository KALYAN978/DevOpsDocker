import java.util.Scanner;

public class Class {
	
	int x = 11;
	int y = 33;
	
	public void method(int x) {
		Class c = new Class();
		this.x = 22;
		y = 44;
	}

	public static void main(String[] args) {
		
		Class c = new Class();
		c.method(5);
		

	}

}
