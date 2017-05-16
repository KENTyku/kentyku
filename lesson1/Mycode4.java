// Программа показывает работу разных методов, содержащих арифметические и логические функции

public class Mycode4 {
	
		public static void main(String [] args) { // главный метод main с которого java выполняет программу
		// инициализация переменых и присвоением им значений
			int aa=10;
			int bb=5;
			int cc=2;
			int dd=1;
			int ee=-5;
			int myYear=2017;
			String name="Yuri";
			System.out.println ("aa="+aa+" bb="+bb+" cc="+cc+" dd="+dd);
			System.out.println	("resultat a*(b+(c/d)="+Mycode4.resultat(aa, bb, cc, dd)); //вызов метода resultat класса Mycode
			System.out.println	("logic="+Mycode4.logic(aa, bb)); //вызов метода logic класса Mycode
			Mycode4.znak (ee);
			System.out.println	("chislo otricatelnoe="+Mycode4.otricatelnoe(ee)); //вызов метода otricatelnoe класса Mycode
			Mycode4.helloName(name);
			Mycode4.visokGod(myYear);
		}
		public static int resultat( int a,int b,int c,int d) {
			return a*(b+(c/d));// (3 задание)оператор return возвращает из метода resultat значение получившееся в результате выполненных арифметических операций
		}
		public static boolean logic (int a, int b) { // (4 задание)метод, который возвращает результат истинно или ложно,того что сумма двух чисел попадает в диаппазон от 10 до 20 включительно 
			int sum=a+b;
			if (sum<=20&&sum>=10) {return true;}
			else {return false;}
		}
		public static void znak (int e) {			// (5 задание)метод определяющий знак числа, переданного в него и выводящий данную информацию в консоль
			if (e*(-1)<=0) {System.out.println ("polozhitelnoe chislo");}
			else {System.out.println ("otricatelnoe chislo");}
		}	
		public static boolean otricatelnoe (int e) { // (6 задание)метод, возвращающий истинно, если переданное в него число отрицательное
			if (e*(-1)>0) return true;
			else return false;
		}
		public static void helloName(String nameHello) { //(7 задание)вызов метода, получаюего имя и выводящего приветствие по имени
			System.out.println	("Hello,"+nameHello);
		}	
		public static void visokGod (int year) {	// (8 задание) метод определяет висакосный год, когда он является каждым 4-ым, но не 100-ым или каждым 400-ым
			if (((year%4==0)&&(year%100!=0))||(year%400==0)) {System.out.println ( year+" visokosnij god");} //выполняется операция остаток от деления и проверяется что он равен 0
			else {System.out.println (year+" ne visokosnij god");}
			
		}
		
}
			
