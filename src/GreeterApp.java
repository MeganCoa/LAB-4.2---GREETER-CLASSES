import java.util.Scanner;

public class GreeterApp {

	public static void main(String[] args) {
		
		Scanner scrn = new Scanner(System.in);
		
		System.out.println("Choose a greeting:");
		String greeting = scrn.nextLine();
		System.out.println("Enter your name:");
		String name = scrn.nextLine();
		System.out.println("How much volume to add? (0 to 10):");
		int loud = scrn.nextInt();
		
		Greeter greeter = new Greeter(greeting);
		System.out.println(greeter.greet(name));
		
		LoudGreeter greeterLoud = new LoudGreeter(greeting);
		for(int i =0; i > loud; i++) {
			greeterLoud.addVolume();
		}
		System.out.println(greeterLoud.greet(name));
		
		HtmlGreeter greeterHtml = new HtmlGreeter(greeting);
		System.out.println(greeterHtml.greet(name));
		

	}

}
