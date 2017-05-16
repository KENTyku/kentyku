// Программа делает подсчет результата выражения через отдельный метод и выводит его на экран

public class Mycode3 {
	
		public static void main(String [] args) { // главный метод main с которого java выполняет программу
		// инициализация переменых и присвоением им значений
			int aa=10;
			int bb=5;
			int cc=2;
			int dd=1;
			System.out.println ("aa="+aa+" bb="+bb+" cc="+cc+" dd="+dd);
			System.out.println	("resultat a*(b+(c/d)="+Mycode3.resultat(aa, bb, cc, dd)); //вызов метода resultat класса Mycode
		}
		public static int resultat( int a,int b,int c,int d) {
			return a*(b+(c/d));//оператор return возвращает из метода resultat значение получившееся в результате выполненных арифметических операций
		}
		
}
