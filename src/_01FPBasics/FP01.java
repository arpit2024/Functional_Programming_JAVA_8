package _01FPBasics;
import java.util.*;

public class FP01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printAllNumbersInListStructured(List.of(1,2,3,4,5,6,7,8));
	}
	
	public static void print(int number) {
		System.out.println(number);
	}
	
	public static void printAllNumbersInListStructured(List<Integer> numbers) {
		//how to loop all the numbers
//		for(int i:numbers) {
//			System.out.println(i);
//		}
		
		
		//we are converting the numbers list into a stream
		numbers.stream()	
		.forEach(FP01::print);//This is the syntax of something called a Method Reference.

		//	the syntax which we are using in here is, colon.
		//	This is the syntax of something called a Method Reference.
		//	What we are saying in here is, for each element, this method needs to be called.
		//	So, for each of the numbers coming up
	}

}
