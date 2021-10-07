package jprogram;

import java.util.Scanner;
import java.util.function.Function;

public class Circle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter radius");
		int r= sc.nextInt();
		 Function<Integer,Double> f = a -> 3.14*r*r;
		System.out.println(f.apply(r));
	}

}
