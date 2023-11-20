
public class Array {

	
	static void printArray(String a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int []a = new int [] {1,2,3,4};
		
		int age[] = {1,2,3,4,5,6,7};
		for(int i=0;i<age.length;i++) {
		System.out.println(age[i]);
		}
		
		int intArray[] = new int[1110];
		System.out.println(intArray.length);
		
		int data[] = {1,2,3,4,5,6};
		for(int x:data) {
			System.out.println(x);
		}
		
		int array[] = new int[11111];
		System.out.println(array.length);
		
		String a[] = {"qweq","uasjdh","jhzsjd","uyasdg","kuagsd"};
		printArray(a);

	}
	
	

}
