/*	Java Lesson 3
*	avtor: Tveritin Yuri
*	version: 13.05.2017
*/
import java.util.Random;
import java.util.Scanner;
public class lesson3 {
/* 	Задание 1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3
попытки угадать это число. При каждой попытке компьютер должен сообщить больше ли
указанное пользователем число чем загаданное, или меньше. После победы или проигрыша
выводится запрос - <Повторить игру еще раз? 1 - да / 0 - нет>(1 - повторить, 0 - нет).
*/
	public static void main(String [] args) { 
		System.out.println(startProcesGame());//запуск игрового процесса 
		while(startProcesMenu()==true){// пока пользователь выбирает продолжать игру, будет запускаться всегда игра заново
			System.out.println(startProcesGame());			
		}
		System.out.println("Game over");//если false, то программа останавливается.
	}
	public static String startProcesGame() {//игровой процесс
		Random rand=new Random();
		int num=rand.nextInt(10);//загадывание случайного числа от 0 до 9	
		for (int i=0;i<3;i++){// цикл 3 попыток угадывания числа
			System.out.println();
			System.out.println("Guess the number(from 0 to 9)");			
			Scanner sc=new Scanner(System.in);//создание объекта сканера для взятия значения от пользователя
			int n=sc.nextInt();//присвоение значения, введенного пользователем
			if (n==num) {
				System.out.println();
				System.out.println();
				return "You win!";// выход из игрового процесса с возвращаемым значением Выиграл
			}
			else {
				if (n<num) System.out.println("Your number is little");//подсказки
				else System.out.println("Your number is great");//подсказки
			}	
		}
		System.out.println();
		System.out.println();
		return "You no win.";//выход из игрового процесса после 3х неудачных попыток
	}
	public static boolean startProcesMenu() {
		System.out.println("Want more?(Yes-1,No-0)");
		Scanner sc=new Scanner(System.in);//создание объекта сканера для взятия значения от пользователя
		int n=sc.nextInt();				
		if (n==1) return true;
		else return false;
	}
	
}