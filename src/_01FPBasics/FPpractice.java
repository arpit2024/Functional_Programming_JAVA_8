package _01FPBasics;
import java.util.ArrayList;


//print odd numbers
public class FPpractice {

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
		
		printoddnumbers(list);
	}
	
//	public static boolean IsOdd(int number) {
//		return number%2!=0;
//	}
	
	public static void printoddnumbers(ArrayList<Integer> list) {
		
		list.stream()
		//.filter(FPpractice::IsOdd)
		.filter(number->number%2!=0)
		.forEach(System.out::println);
		
	}

}
