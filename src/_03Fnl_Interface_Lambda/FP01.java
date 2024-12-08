package _03Fnl_Interface_Lambda;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=List.of(3,2,4,9,5,8,7,9);
		
		Predicate<Integer> isEvenPredicate = x->x%2==0;/*  So, when we are creating a lambda expression of this kind,
		an instance of a predicate class was being created.*/
		Function<Integer,Integer> squareFunction = x->x*x;//an instance of a function class was being created.
		Consumer<Integer> sysoutConsumer = System.out::println;//an instance of the consumer class is being created.
		
		numbers.stream()
		.filter(isEvenPredicate)// these actually map to real methods.So, what we have in here is real logic.
		.map(squareFunction)
		.forEach(sysoutConsumer);//System.out.println is also a method reference and it's actually a 
		//simplification for a lambda, forEach(x -> System.out.println(x)); 
		//a method preference is nothing but a simplified version of your lambda.
		
	}

}
