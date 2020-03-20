package Application;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		Login l = new Login();
		AddData ad = new AddData();
		Insert i = new Insert();
		Dob d = new Dob();
		UpdateData u = new UpdateData();
		Sum1 s = new Sum1();
		System.out.println("sum is");
		s.sum();

		System.out.println("enter user name");
		String uname = sc.next();
		l.uLogin(uname);
		

		System.out.println("enter your choice");
		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			System.out.println("1.List of records");

			ad.listRecord();
			break;
		case 2:
			System.out.println("2.Add a new record");
			i.insert1();
			break;
		case 3:
			System.out.println("3.Update an exsisting reocrd");
			u.Update(uname);
			break;
		case 4:
			System.out.println("4.Show date of birth");
			d.dob1(uname);
			break;
		default:
			System.out.println(" you are out of the system");
			break;
		}

	}

}
