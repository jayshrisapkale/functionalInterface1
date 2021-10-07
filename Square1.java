package jprogram;

import java.util.Scanner;

public class Square1 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter side of square");
		int n = sc.nextInt();
Square s = (num) -> (num*num);
int f= s.Area(n);
System.out.println("area of square is " +f);
	}

}
