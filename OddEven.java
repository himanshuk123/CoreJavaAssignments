//1. A number is given as input. Find the odd digits in the number, add them and find
//if the sum is odd or not.if even return -1, if odd return 1

import java.util.ArrayList;
import java.util.Scanner;
public class OddEven {
	public static int oddEvenSum(int num) {
	
	int digit; 
	double sum=0; 
	while(num>0) {
		 digit= num % 10;
		 
		 if(digit%2!=0) {
			 ArrayList<Integer> odd =new ArrayList<Integer>();
			 odd.add(digit);
			 for(int i=0; i<odd.size();i++) {
				 sum+= odd.get(i);
			 }
		 }	 		
		num = num / 10;	
	}
	if(sum%2==0) {
		return -1;
	}
	else {
		return 1;
	}

}
	
	public static void main(String[] args) {
		//System.out.println("hello world");
		System.out.println("Please enter the number : ");//45672
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		System.out.println(oddEvenSum(num));
		
		
		
	}

}
