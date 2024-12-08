package _01FPBasics;
import java.util.ArrayList;
import java.util.List;
//number of character in each course name
public class MapFunExercise {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> courses= List.of("Spring","SpringBoot","MicroService","API","Sql","kube");
		
		
		courses.stream()
		.map(course -> course+ "-> "+course.length())
		.forEach(System.out::println);

	}
	
	
/*	//cubes of odd number
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
		.filter(number->number%2!=0)
		.map(number->number*number*number)
		.forEach(System.out::println);
	}
*/
}