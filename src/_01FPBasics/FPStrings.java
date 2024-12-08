package _01FPBasics;
import java.util.List;
//code to print string that contains at least 4 characters
public class FPStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> courses= List.of("Spring","SpringBoot","MicroService","API","Sql","kube");
		
		
		courses.stream()
		.filter(course -> course.length()>=4)
		.forEach(System.out::println);

	}
	
}

/*

 //code to print only string that contains spring
public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> courses= List.of("Spring","SpringBoot","MicroService","API","Sql");
		
		
		courses.stream()
		.filter(course -> course.contains("Spring"))
		.forEach(System.out::println);

	}
 
 import java.util.List;
//code to print all the strings present in list
public class FPStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> courses= List.of("Spring","SpringBoot","MicroService","API","Sql");
		
		
		courses.stream()
		.forEach(System.out::println);

	}
	
}

 */