package _02StreamOperations;

import java.util.Comparator;
import java.util.List;

public class FP05SortingwithComparators {

	public static void main(String[] args) {
		
		List<String> courses= List.of("Spring","SpringBoot","MicroService","API","Sql","kube","AWS");
		
		//sorting in natural order using comparator
		courses.stream()
		.sorted(Comparator.naturalOrder())
		.forEach(System.out::println);
		
		System.out.println("\nPrinting in reverse Sorted\n");
		
		//sorting in reverse order using comparator
		courses.stream().sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
		
		
		System.out.println("\nPrinting by the length Sorted\n");
		
		//sorting by the length of the course name
		courses.stream()
		.sorted(Comparator.comparing(str-> str.length()))
		.forEach(System.out::println);
		
	}

}
