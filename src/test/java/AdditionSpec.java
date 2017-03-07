import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionSpec {

	@Test
	public void test() {
		Calculator calculator = new Calculator();
		assertEquals(4, calculator.add(2,2));
	}

}
