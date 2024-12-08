package _01FPBasics;
import java.util.ArrayList;

//implementing mapping in FP
public class MappingFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		
		list.stream()
		.map(number-> number*number )
		.forEach(System.out::println);
		
	}

}
