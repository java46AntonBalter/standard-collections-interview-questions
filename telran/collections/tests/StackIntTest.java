package telran.collections.tests;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import telran.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StackIntTest {
	private static StackInt stack;

	@BeforeEach
	void setUp() {
		stack = new StackInt();
	}

	@Test
	void testPop() throws Exception {
		assertThrows(NoSuchElementException.class, () -> stack.pop());
		stack.push(15);
		assertEquals(15, stack.pop());
		assertTrue(stack.isEmpty());
	}

	@Test
	void testPush() throws Exception {
		assertTrue(stack.isEmpty());
		stack.push(-1);
		assertFalse(stack.isEmpty());
		assertEquals(-1, stack.pop());
	}

	@Test
	void testIsEmpty() {
		assertTrue(stack.isEmpty());
		stack.push(-1535);
		assertFalse(stack.isEmpty());
	}

	@Test
	void testGetMaxNumber() throws Exception {
		assertThrows(NoSuchElementException.class, () -> stack.getMaxNumber());
		stack.push(20);
		assertEquals(20, stack.getMaxNumber());
		stack.push(2);
		assertEquals(20, stack.getMaxNumber());
		stack.push(-10);
		assertEquals(20, stack.getMaxNumber());
		stack.push(-10000);
		assertEquals(20, stack.getMaxNumber());
		stack.push(10000);
		assertEquals(10000, stack.getMaxNumber());
		stack.pop();
		assertEquals(20, stack.getMaxNumber());

	}

}
