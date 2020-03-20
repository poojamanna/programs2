package functions;

import java.util.function.Consumer;

public class ConsumerExample {
	static void printMessage(String name) {
		System.out.println("hello " + name);
	}

	static void printValue(int val) {
		System.out.println(val);
	}

	static void printNumber(float val1) {
		System.out.println(val1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> con1 = ConsumerExample::printMessage;
		con1.accept("pooja");
		Consumer<Integer> con2 = ConsumerExample::printValue;
		con2.accept(22);
		Consumer<Integer> con3 = ConsumerExample::printNumber;
		con3.accept(500);

	}

}
