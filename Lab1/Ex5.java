package Lab1;

import java.util.Scanner;

public class Ex5{
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		for(int i=0;i<=n;i++) {
			if(i%3==0 || i%5==0) {
				
				sum=sum+i;
				
			}
			
		}
		System.out.println("sum of n natural numbers which are divisible by 3 or 5: "+sum);
		
	}

}
