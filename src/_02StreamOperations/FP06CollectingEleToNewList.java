package _02StreamOperations;

import java.util.List;
import java.util.stream.Collectors;

public class FP06CollectingEleToNewList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers=List.of(3,2,4,9,5,8,7,9);
		
		List<Integer> doubleNumbers=doubleList(numbers);
		
		System.out.println(doubleNumbers);
	}

	private static List<Integer> doubleList(List<Integer> numbers) {
	/*	What do we want to do with the numbers?
	->	We'd want to square each one of them and add them to another list.
		So first, we'd need to calculate the squares. return numbers */
		
		return numbers.stream()
				.map(number ->number*number)//did square of each number here
				.collect(Collectors.toList());//collect all the results into a list 
				
	}

}
