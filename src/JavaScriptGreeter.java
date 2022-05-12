
public class JavaScriptGreeter extends Greeter {
	//default constructor
		public JavaScriptGreeter() {
			super();
		}

		public JavaScriptGreeter(String greeting) {
			super(greeting);
			
		}
		@Override
		public String greet(String name) {
			return "Simon says,"+ getGreeting() + " , " + name + "!";
		}
		
		@Override
		public String toString() {
			return super.toString() + "Simon says,"+ getGreeting();
		}
		
}
