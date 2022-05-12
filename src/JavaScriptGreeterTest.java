import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JavaScriptGreeterTest {

	@Test
	void testJavaScriptGreeter1() {
		JavaScriptGreeter greeter = new JavaScriptGreeter(); //Arrange, Act
		greeter.setGreeting("Hello");
		assertEquals("Simon says,Hello , Margo!", greeter.greet("Margo"));
	}
	
	@Test
	void testJavaScriptGreeter2() {
		JavaScriptGreeter greeter = new JavaScriptGreeter("Yo"); //Arrange, Act	
		assertEquals("Simon says,Yo , Ethan!", greeter.greet("Ethan"));
	}
}
