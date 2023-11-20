import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Model2 {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(9,4,5,63,2);
		
//		for(int n: nums) {
//			System.out.println(n*2);
//		}
		
		Stream<Integer> s1 = nums.stream();
		Stream<Integer> s2 = s1.filter(n -> n%2==1);
		Stream<Integer> s3 = s2.sorted();
		Stream<Integer> s4 = s3.map(n -> n*2);
		s4.forEach(n -> System.out.println(n));
		
//		Stream<Integer> s1 = nums.stream();
		
//		long count = s1.count();
//		System.out.println(count);
		
//		s1.forEach(n -> System.out.println(n));
		
		
//		for(int i = 0;i<nums.size();i++) {
//			System.out.println(nums.get(i));
//		}
		
//		for(int n : nums) {
//			System.out.println(n);
//		}
		
//		nums.forEach(n -> System.out.println(n));

	}

}
