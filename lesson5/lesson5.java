/*	Java Lesson 5
*	avtor: Tveritin Yuri
*	version: 23.05.2017
*/
class lesson5 {		
	public static void main(String [] args) { 
		Person p=new Person ("Tony Roman", "student","student@mail.ru",
		  "+7(909)999-88-77",50000,33);//создание объекта типа Person
			//и присвоение ссылки на него переменной p
		p.printInfo();	//выполенение метода для созданного объекта p
	}
}

class Person {
	//объявление переменных экземпляра класса
	String fio;
	String work;
	String email;
	String fone;
	int money;
	int age;
	
	Person ( String fio, String work, String email,
	 String fone, int money, int age){//Конструктор с сигнатурой заданных   
	 //параметров

		this.fio=fio;
		this.work=work;
		this.email=email;
		this.fone=fone;
		this.money=money;
		this.age=age;		
	}
	void printInfo(){//метод выводящий значения экземпляров класса Person
		System.out.println(fio);
		System.out.println(email);
		System.out.println(fone);
		System.out.println(money);
	}		
	
}