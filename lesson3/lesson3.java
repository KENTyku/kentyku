/*	Java Lesson 3
*	avtor: Tveritin Yuri
*	version: 13.05.2017
*/
import java.util.Random;
import java.util.Scanner;
public class lesson3 {
/* 	������� 1. ������� �ணࠬ��, ����� �����뢠�� ��砩��� �᫮ �� 0 �� 9, � ���짮��⥫� ������ 3
����⪨ 㣠���� �� �᫮. �� ������ ����⪥ �������� ������ ᮮ���� ����� ��
㪠������ ���짮��⥫�� �᫮ 祬 ����������, ��� �����. ��᫥ ������ ��� �ந����
�뢮����� ����� - <������� ���� �� ࠧ? 1 - �� / 0 - ���>(1 - �������, 0 - ���).
*/
	public static void main(String [] args) { 
		System.out.println(startProcesGame());//����� ��஢��� ����� 
		while(startProcesMenu()==true){// ���� ���짮��⥫� �롨ࠥ� �த������ ����, �㤥� ����᪠���� �ᥣ�� ��� ������
			System.out.println(startProcesGame());			
		}
		System.out.println("Game over");//�᫨ false, � �ணࠬ�� ��⠭����������.
	}
	public static String startProcesGame() {//��஢�� �����
		Random rand=new Random();
		int num=rand.nextInt(10);//�����뢠��� ��砩���� �᫠ �� 0 �� 9	
		for (int i=0;i<3;i++){// 横� 3 ����⮪ 㣠�뢠��� �᫠
			System.out.println();
			System.out.println("Guess the number(from 0 to 9)");			
			Scanner sc=new Scanner(System.in);//ᮧ����� ��ꥪ� ᪠��� ��� ����� ���祭�� �� ���짮��⥫�
			int n=sc.nextInt();//��᢮���� ���祭��, ���������� ���짮��⥫��
			if (n==num) {
				System.out.println();
				System.out.println();
				return "You win!";// ��室 �� ��஢��� ����� � �����頥�� ���祭��� �먣ࠫ
			}
			else {
				if (n<num) System.out.println("Your number is little");//���᪠���
				else System.out.println("Your number is great");//���᪠���
			}	
		}
		System.out.println();
		System.out.println();
		return "You no win.";//��室 �� ��஢��� ����� ��᫥ 3� ��㤠��� ����⮪
	}
	public static boolean startProcesMenu() {
		System.out.println("Want more?(Yes-1,No-0)");
		Scanner sc=new Scanner(System.in);//ᮧ����� ��ꥪ� ᪠��� ��� ����� ���祭�� �� ���짮��⥫�
		int n=sc.nextInt();				
		if (n==1) return true;
		else return false;
	}
	
}