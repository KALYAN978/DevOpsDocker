import java.util.Arrays;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 8;
		int b = 0;
		int result = 4;
		
		try {
		result = a/b;
		}
		catch(ArithmeticException e) {
			System.out.println(Arrays.toString(e.getStackTrace()));
			throw e;
			//System.out.println("o");
		}
		finally {
			System.out.println("finally always execute the statement");
		}
		
		System.out.println(result);

	}

}
