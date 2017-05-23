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
		
		Person[] persArray=new Person[5];//создали массив для хранения ссылок
		 //на 5 объектов типа Person
		persArray[0]= new Person("Ivanov Ivan", "Engineer", 
		 "ivivan@mailbox.com", "192312312", 10000, 30);
		persArray[1]= new Person("Bivanov Bivan", "Engineer", 
		 "bivivan@mailbox.com", "292312312", 20000, 41);
		persArray[2]= new Person("Ivanov Ivan", "Engineer", 
		 "ivivan@mailbox.com", "392312312", 30000, 28);
		persArray[3]= new Person("Ivanov Ivan", "Engineer", 
		 "ivivan@mailbox.com", "492312312", 40000, 42);
		persArray[4]= new Person("Ivanov Ivan", "Engineer", 
		 "ivivan@mailbox.com", "592312312", 50000, 36);
		 //вывод информации о сотрудниках старше 40 лет
		for (int i=0;i<5;i++){
			if (persArray[i].age>40) persArray[i].printInfo();
		}
	}	
}
//Создание класса "Сотрудник":
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
		System.out.println(age);
	}		
	
}