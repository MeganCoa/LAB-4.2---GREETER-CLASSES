
public class HtmlGreeter extends Greeter  {
	// instance variables
			private String tagName;
			
			//Getters and Setters
			public String getTagName() {
				return tagName;
			}

			public void setTagName(String tagName) {
				this.tagName = tagName;
			}
			
			//default constructor
			public HtmlGreeter() {
				tagName = "h1";
			}
			public HtmlGreeter(String greeting) {
				super(greeting);
				tagName = "h1";
			}

			public HtmlGreeter(String greeting, String tagName) {
				super(greeting);
				this.tagName = tagName;
			
			}
			//Additional Methods
			@Override
			public String greet(String name) {
				return "<"+ tagName + "> " + getGreeting() + " , " + name + "!" +" </"+ tagName +">";
			}
			
			@Override
			public String toString() {
				return super.toString() + getGreeting();
			}
}
