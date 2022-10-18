package Lab1;

import java.util.Scanner;

public class Ex8 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		
		Ex8 a=new Ex8();
		System.out.println(a.isTrue(n));
		
	}
	boolean isTrue(int n) {
		if(n%2==0) {
			return true;
		}else {
			return false;
		}
	}

}
