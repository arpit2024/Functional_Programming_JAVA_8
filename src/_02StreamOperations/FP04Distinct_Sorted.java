package _02StreamOperations;

import java.util.List;

public class FP04Distinct_Sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=List.of(5,2,4,9,5,21,7,9);
		
		List<String> courses= List.of("Spring","SpringBoot","MicroService","API","Sql","kube","AWS");

		//distinct
//		list.stream()
//		.distinct()
//		.forEach(System.out::println);
		
			
		//sorted
//		list.stream()
//		.sorted()
//		.forEach(System.out::println);
		
		courses.stream().
		sorted()
		.forEach(System.out::println);
		
		
	}

}
