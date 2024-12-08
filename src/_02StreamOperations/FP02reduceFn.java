package _02StreamOperations;

import java.util.List;

public class FP02reduceFn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=List.of(1,2,3,4,5,6,7,8);
		//List<Integer> list=List.of(5,2,4,9,5,21,7,9);
		int sum=addListFunctional(list);
		System.out.println(sum);
	}
	private static int sum( int a, int b) {
		return a+b;
	}
	private static int addListFunctional(List<Integer> list){
		//stream of number->combine them into one result->one Value called reduce 
		//start with 0 and specify how to combine-i.e sum them -> FP01reduceFn::sum(Method Reference)
		
		return list.stream()
		//.reduce(0,FP01reduceFn::sum);
		//.reduce(0,(x,y)-> x+y);//implementing reduce fn using lambda
		.reduce(0,Integer::sum);//method reference
				
		
		/* we'll take a list of numbers, a sequence of numbers, and we will want to reduce it to one result.

		we'd want to specify a initial value.So, we are saying the initial value is zero.

		So, typically we start with saying, int sum = 0, because we want an initial value. So, zero is the

		initial value. And then we would specify the method that can be used to reduce the list.
		
		We can specify that using the method reference.

		So, we would want to add all the values up and at the end, We'd want to return this value back. */
	}

}
