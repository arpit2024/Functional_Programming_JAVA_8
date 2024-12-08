package _01FPBasics;
import java.util.*;

public class FP02 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//printAllNumbersInListStructured(List.of(1,2,3,4,5,6,7,8));
			printEvenNumbersInListStructured(List.of(1,2,3,4,5,6,7,8));
		}
		
//		public static void print(int number) {
//			System.out.println(number);
//		}
		
//		public static void printAllNumbersInListStructured(List<Integer> numbers) {
//			
//			numbers.stream()	
//			.forEach(System.out::println);
//		}
		public static boolean isEven(int number) {
			return number%2==0;
		}
		
		public static void printEvenNumbersInListStructured(List<Integer> numbers) {
			
			numbers.stream()
			//.filter(FP02::isEven)
			.filter(number->number%2==0)//using lambda expression
			.forEach(System.out::println);
		}
	/*   with functional programming,we focus on what to do.
		 We convert the numbers into a stream and for each element in that stream,we specify what needs to be done.
		 A stream is nothing but a sequence of elements.
		 For each element, we would want to call the isEven method in here
		 and we use a method reference to define that in here.
		 
		 The other approach to defining what needs to be done
		 with each number, is something called a Lambda Expression.
		 With a Lambda Expression,you can define the entire code directly in here. 
		 With a method reference, we are actually referring to a method which is defined somewhere else.
		 However, with the Lambda Expression, we are actually defining the complete logic of the method right here.  */
	}
