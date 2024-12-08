package _02StreamOperations;

import java.util.List;

public class FP01Structured {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=List.of(1,2,3,4,5,6,7,8);
		
		int sum=addListFunctional(list);
		System.out.println(sum);
	}
	public static int addListFunctional(List<Integer> list){
		int sum=0;
		
		for(int number:list) {
			sum+=number;
		}
		
		return sum;
	}
	

}

	
