/*	Java Lesson 4
*	avtor: Tveritin Yuri
*	version: 15.05.2017
*/
//import java.util.Random;
//import java.util.Scanner;
class lesson5 {
		
	public static void main(String [] args) { 
		Person p=new Person ("Tony Roman", "student","student@mail.ru","+7(909)999-88-77",50000,33);
		p.printInfo();			
		/*Cat c1=new Cat("Murzik","black", 5);
		System.out.println(c1.meow());
		//c1.name="Murzik";
		//c1.color="black";
		//c1.age=5;
		System.out.println(c1.name);
		System.out.println(c1.color);
		System.out.println(c1.age);
		*/
		
	}
}
/*class Cat{	
	String name;
	String color;
	int age;
	
	Cat(String name, String color, int age){//это Конструктор
		System.out.println("This is constructor!");
		this.name=name;
		this.color=color;
		this.age=age;
	}
	
	String meow(){
		return "meow!";
	}
}*/
class Person {
	String fio;
	String work;
	String email;
	String fone;
	int money;
	int age;
	
	Person ( String fio, String work, String email, String fone, int money, int age){
		this.fio=fio;
		this.work=work;
		this.email=email;
		this.fone=fone;
		this.money=money;
		this.age=age;		
	}
	public void printInfo(){
		System.out.println(fio);
		System.out.println(email);
		System.out.println(fone);
		System.out.println(money);
	}		
	
}