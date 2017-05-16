/*	Java Lesson 3
*	avtor: Tveritin Yuri
*	version: 15.05.2017
*/
import java.util.Random;
import java.util.Scanner;
public class lesson3hw2 {
/* 	Задание 2. * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}; 
При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным словом
 и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
 apple - загаданное apricot - ответ игрока ap############# (15 символов, чтобы пользователь не мог узнать длину слова) 
 Для сравнения двух слов посимвольно, можно пользоваться: String str = "apple"; str.charAt(0); - метод, вернет char,
 который стоит в слове str на первой позиции Играем до тех пор, пока игрок не отгадает слово Используем только маленькие буквы
*/
	public static void main(String [] args) { 
		System.out.println(startProcesGame());//запуск игрового процесса 
		while(startProcesMenu()==true){// пока пользователь выбирает продолжать игру, будет запускаться игра всегда  заново
			System.out.println(startProcesGame());			
		}
		System.out.println("End");//если false, то программа останавливается.
	}
	public static String startProcesGame() {//игровой процесс
	//задан набор слов (фрукты и овощи)
		String[] words={"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
		Random rand=new Random();
		String word=words[rand.nextInt(words.length)]; //в переменную word занесли значение случайно вырбанного элемента массива		
		System.out.println(word);//для отладки
		System.out.println();		
		
		System.out.println("Введите название фрукта или овоща маленькими буквами");			
		Scanner sc=new Scanner(System.in);//создание объекта сканера для взятия значения от пользователя
		String userword=sc.next();//присвоение значения, введенного пользователем
		
/*
зацикливание пока не будет значение userword равно значению word. Алгоритм в цикле имеет недотатки: 1 подсказка каждый раз перезаписывается согласно новому введенному слову,т.е. открытые
символы могут в ней снова закрыться если буквы будут не угаданы. 2. Цикл нельзя завершить, пока не отгадаешь слово.
*/		
		while (!userword.equals(word)){ 
			String str="";	//переменная для подсказки					
			String wordlong;//вспомогательные переменные для формирования подсказки
			wordlong=word;	
			String userwordlong;//вспомогательные переменные для формирования подсказки
			userwordlong=userword;	
			
			for (int w=0; w<15-word.length();w++){	//создание строки из 15 символов где начальные символы являются значением wordlong а остальные #	(обходим исключение, когда сравниваются строковые переменные разной длины)		
				wordlong=wordlong.concat("#");	//присоединение строки # к строке wordlong						
			}
			for (int w=0; w<15-userword.length();w++){ //создание строки из 15 символов где начальные символы являются значением userwordlong а остальные #
				userwordlong=userwordlong.concat("#");	//присоединение строки # к строке wordlong
			}		
			for (int i=0; i<15;i++){ //посимвольное сравнение двух сторк из 15 симолов  и формирование подсказки 				
				if (wordlong.charAt(i)==userwordlong.charAt(i))	str=str+wordlong.charAt(i);
				else str=str+'#';				
			}
			System.out.println(wordlong+"-wordlong");
			System.out.println(userwordlong+"-userwordlong");
			System.out.println("Подсказка:");
			System.out.println(str);			
			System.out.println("Введите название фрукта или овоща маленькими буквами");	
			userword=sc.next();//присвоение значения, введенного пользователем							
		}					
		System.out.println();		
		return "You win!";//когда из зацикливания по условию выходим то метод startProcesGame возвращает результат You win!
	}
	public static boolean startProcesMenu() {
		System.out.println("Want more?(Yes-1,No-0)");
		Scanner sc=new Scanner(System.in);//создание объекта сканера для взятия значения от пользователя
		int n=sc.nextInt();				
		if (n==1) return true;
		else return false;
	}	
}