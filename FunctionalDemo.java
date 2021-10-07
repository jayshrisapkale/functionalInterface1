package jprogram;

import java.util.function.Consumer;

public class FunctionalDemo {

	public static void main(String[] args) {

		Consumer<String> print = X -> System.out.println(X);
		Consumer<Integer>p = X -> System.out.println(X);
		print.accept("jayshri");
		p.accept(23404);
			}

	}


