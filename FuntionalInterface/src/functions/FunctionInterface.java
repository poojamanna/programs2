package functions;
import java.util.function.Function;


public class FunctionInterface {
	static String show(String message)
	{
		return "Hello "+message;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, String> fun = FunctionInterface::show;
		System.out.println(fun.apply("Peter"));

	}

}
