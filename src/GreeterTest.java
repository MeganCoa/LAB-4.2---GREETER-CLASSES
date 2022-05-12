import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreeterTest {

	@Test
	void testGreet1() {
		Greeter greeter = new Greeter(); //Arrange, Act
		greeter.setGreeting("Hello");
		assertEquals("Hello , Megan!", greeter.greet("Megan"));
	}
	
	@Test
	void testGreet2() {
		Greeter greeter = new Greeter("Yo"); //Arrange, Act	
		assertEquals("Yo , JOHN!", greeter.greet("JOHN"));
	}


}
