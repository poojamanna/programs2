package functions;

public class MethodReferenceExample {
	public void saySomething()
	{
		System.out.println("hello,this is non-static method.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodReferenceExample method1 = new MethodReferenceExample();
		 sayable s= method1::saySomething;
		 s.say();
		 sayable s2 = new MethodReferenceExample()::saySomething;
		 s2.say();

	}

}
