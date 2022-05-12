import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HtmlGreeterTest {

	@Test
	void testHtmlGreeter1() {
		HtmlGreeter greeter = new HtmlGreeter(); //Arrange, Act
		greeter.setGreeting("Hello");
		assertEquals("<h1> Hello , Bobby! </h1>", greeter.greet("Bobby"));
	}
	
	@Test
	void testHtmlGreeter2() {
		HtmlGreeter greeter = new HtmlGreeter("Yo"); //Arrange, Act	
		greeter.setTagName("h2");
		assertEquals("<h2> Yo , Mike! </h2>", greeter.greet("Mike"));
	}

}
