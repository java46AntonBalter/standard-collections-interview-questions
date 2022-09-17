package telran.util;

import java.util.NoSuchElementException;

public class StackInt {
	private static final int MAX_SIZE = 1000;
	private int top = -1;
	private int[] stackArr;
	private int[] maxNumberArr;

	public StackInt(int stackSize) {
		stackArr = new int[stackSize];
		maxNumberArr = new int[stackSize];
	}

	public StackInt() {
		this(MAX_SIZE);
	}

	public int pop() throws Exception {
		if (top < 0) {
			throw new NoSuchElementException();
		}
		int popped = stackArr[top--];
		return popped;
	}

	public void push(int number) throws Error {
		if (top >= (stackArr.length - 1)) {
			throw new StackOverflowError();
		}
		if (top < 0 || number > maxNumberArr[top]) {
			maxNumberArr[++top] = number;
			stackArr[top] = number;
		} else {
			stackArr[++top] = number;
			maxNumberArr[top] = maxNumberArr[top - 1];
		}
	}

	public boolean isEmpty() {
		return top < 0 ? true : false;
	}

	public int getMaxNumber() throws Exception{
		if (top < 0) {
			throw new NoSuchElementException();
		}
		return maxNumberArr[top];
	}
}
