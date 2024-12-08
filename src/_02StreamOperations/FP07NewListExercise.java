package _02StreamOperations;

import java.util.List;
import java.util.stream.Collectors;

public class FP07NewListExercise {

	//2)program to create a list with length of all course titles
	
	public static void main(String[] args) {
		
		List<String> courses= List.of("Spring","SpringBoot","MicroService","API","Sql","kube","AWS");
		
		List<Integer> courseLength=findCourseLength(courses);
		
		System.out.println(courseLength);
		
	}

	private static List<Integer> findCourseLength(List<String> courses) {
		// TODO Auto-generated method stub
		return courses
				.stream()
				.map(x -> x.length())
				.collect(Collectors.toList());
	}
	

	
/*	//1) program to create a list with even numbers filtered from the number list
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=List.of(3,2,4,9,5,8,7,9);
		
		List<Integer> evenList=addEvenNumber(numbers);
		
		System.out.println(evenList);
	}

	private static List<Integer> addEvenNumber(List<Integer> numbers) {
		// TODO Auto-generated method stub
		return numbers.stream()
		.filter(x -> x%2!=0)
		.collect(Collectors.toList());
	}	*/

}
