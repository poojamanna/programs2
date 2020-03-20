package lambda1;

public class TestWithoutLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width =10;
		Drawable d= new Drawable()
				{
			public void draw()
			{
				System.out.println("Drawing "+ width);
			}
				};
				d.draw();
 //with lambda
		/*Drawable d2 =()->{
			System.out.println("drawing "+width);
		};
		d2.draw();
	}
*/
	}
}
