import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LoudGreeterTest {

	@Test
	void testGreet1() {
		LoudGreeter greeter = new LoudGreeter(); //Arrange, Act
		greeter.setGreeting("Hello");
		assertEquals("Hello , Megan!!", greeter.greet("Megan"));
	}
	
	@Test
	void testGreet2() {
		LoudGreeter greeter = new LoudGreeter("Yo"); //Arrange, Act	
		greeter.addVolume();
		greeter.addVolume();
		assertEquals("Yo , JOHN!!!!", greeter.greet("JOHN"));
	}


}
