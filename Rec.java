package jprogram;

import java.util.Scanner;
import java.util.function.Function;

public class Rec {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("enter length");
int l= sc.nextInt();
System.out.println("enter bredth");
int b = sc.nextInt();
Function<Integer, Integer> f = a -> l*b;
System.out.println(f.apply(l));
System.out.println(f.apply(b));
	}

}
