package _02StreamOperations;

import java.util.List;
import java.util.stream.Collectors;

//Program to add odd numbers and return their sum-> using streams and lambda
public class FP03ReducefnExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> list=List.of(5,2,4,9,5,21,7,9);
		
		int sum=list.stream()
		.filter(x-> x%2!=0)
		.reduce(0,Integer::sum);
		
		
		System.out.println(sum);
	
}
	

/*
//Square each number, add them and return the sum 
public class ReducefnExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> list=List.of(5,2,4,9,5,21,7,9);
		
		int result=printSquareaddelements(list);
		System.out.println(result);
	
	}
	public static int printSquareaddelements(List<Integer> list) {
		
		return list.stream()
		.map(x->x*x)
		.reduce(0,Integer::sum);
		
		
	}
*/
}
