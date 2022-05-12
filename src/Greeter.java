
public class Greeter {
	// instance variables
	private String greeting;
	
	//Getters and Setters
	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	//default constructor
	public Greeter() {
		super();
	}

	public Greeter(String greeting) {
		super();
		this.greeting = greeting;
	
	}
	//Additional Methods
	public String greet(String name) {
		return getGreeting() + " , " + name + "!";
	}
	
	@Override
	public String toString() {
		return getGreeting();
	}
	
	
}
