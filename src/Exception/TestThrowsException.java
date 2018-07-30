package Exception;

import java.io.*;

class Parent {
	void msg() throws ArithmeticException {		
		System.out.println("parent" );
	}
}

class TestThrowsException extends Parent {
	void msg() throws ArithmeticException {
		int i =10/0;
		System.out.println("TestExceptionChild");
	}

	public static void main(String args[]) {
		Parent p = new TestThrowsException();
		p.msg();
	}
}