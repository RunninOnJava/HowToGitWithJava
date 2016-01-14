package example;

public class HelloWorld {
	static String secondName = "jordan";

	public static void main(String[] args) {
		String builder = buildGreeting();
		String otherMessage = "goodbye "+secondName;

		if(!builder.equals("Hello ben")) {
			displayMessage(builder);
		}
		else {
			displayMessage(otherMessage);
		}
		int i = 0;

		while( i <= 10) {
			System.out.println("looping... at iteration "+ i);
			i++;
		}

		for(int x =0; x<=10;x++){
			System.out.println("for iteration = "+x);
		}


	}

	private static String buildGreeting() {
		String name = "ben";
		String greeting = "Hello ";
		String ret = greeting + name;

		return ret;
	}

	private static void displayMessage(String message){
		System.out.println(message);

	}


}
