package jprogram;

public class Test {

	public static void main(String[] args) {
Runnable a = new Runnable() {

	@Override
	public void run() {
		System.out.println("using class");
	}
	
	
};
Runnable t = ()-> {
	System.out.println("using lambda expression");
	
};

	new Thread(a).start();
	new Thread(t).start();
	
	}

}
