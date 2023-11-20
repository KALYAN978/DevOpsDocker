
public class Array1 {

	
	public void arr(String a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array1 ar = new Array1();
		String a[] = {"int","byte","short","double","float"};
		ar.arr(a);
		
		int a1[] = {1,2,3,4,5,6};
		for(int x:a1) {
			System.out.println(x);
		}
		
		int a2[] = new int[12121];
		System.out.println(a2.length);
		
		int a3[] = {1,2,3,4,5,6};
		for(int x:a3) {
			System.out.println(a3);
		}
		
		
	}

}
