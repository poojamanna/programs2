package functions;

import java.util.function.BiFunction;

public class BiFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<String, String,String> bi = (x,y)-> {
			return x+y;
		};
		System.out.println(bi.apply("hello ", "java"));

	}

}
