import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Model3 {

	public static void main(String[] args) {
//		List<Integer> nums = Arrays.asList(9,4,7,5,3);
//		
//		Stream<Integer> s1 = nums.stream();
//		Stream<Integer> s2 =  s1.filter(n -> n%2==1);
//		Stream<Integer> s3 = s2.sorted();
//		Stream<Integer> s4 = s3.map(n -> n*2);
//		s4.forEach(n -> System.out.println(n));
//		
////		for(int n : nums) {
////			System.out.println(n);
////		}
//
//	}
		
//		List<Integer> nums = Arrays.asList(2,3,4,5,6,78);
////	for(int i = 0; i<nums.size();i++) {
////		System.out.println(nums.get(i));
////	}
//	
////	for(int n:nums) {
////		System.out.println(nums);
////	}
//	
//	Stream<Integer> s1 = nums.stream();	
////	nums.forEach(n -> System.out.println(n));
//	
//	//s1.forEach(n -> System.out.println(n));
//	Stream<Integer> s2 = s1.filter(n -> n%2==0);
//	//s2.forEach(n -> System.out.println(n));
//	
//	Stream<Integer> s3 = s2.map(n -> n*2);
//	s3.forEach(n -> System.out.println(n));
		
		List<Integer> nums = Arrays.asList(9,5,4,3,2);
		
		Stream<Integer> s1 = nums.stream();
		Stream<Integer> s2 = s1.filter(n -> n%2==1);
		Stream<Integer> s3 = s2.sorted();
		Stream<Integer> s4 = s3.map(n -> n*2);
		s4.forEach(n -> System.out.println(n));
		
		
//		for(int i=0;i<nums.size();i++) {
//			System.out.println(nums.get(i));
//		}
		
//		for(int n:nums) {
//			System.out.println(n);
//		}

}
}