
public class LoudGreeter extends Greeter {
	// instance variables
		private String extra = "!";
		
		//default constructor
		public LoudGreeter() {
			super();
		}

		public LoudGreeter(String greeting) {
			super(greeting);
		
		}
		//Additional Methods
		public void addVolume() {
			extra = extra + "!";
		}
		
		@Override
		public String greet(String name) {
			return getGreeting() + " , " + name +  "!" + extra;
		}
		
		
		@Override
		public String toString() {
			return super.toString() + getGreeting();
		}
}
