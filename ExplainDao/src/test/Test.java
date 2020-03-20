package test;

import daoimpl.PersonDaoImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonDaoImpl Person = new PersonDaoImpl();
		(Person.getAllPerson()).stream()
		.forEach(p->
		System.out.println("***"+p.id+" "+p.name+" "+p.email+" "+p.dob+" "+p.phone+" "+p.address+"***"));
		
		

	}

}
