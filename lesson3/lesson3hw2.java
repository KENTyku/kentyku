/*	Java Lesson 3
*	avtor: Tveritin Yuri
*	version: 15.05.2017
*/
import java.util.Random;
import java.util.Scanner;
public class lesson3hw2 {
/* 	������� 2. * ������� ���ᨢ �� ᫮� String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}; 
�� ����᪥ �ணࠬ�� �������� �����뢠�� ᫮��, ����訢��� �⢥� � ���짮��⥫�, �ࠢ������ ��� � ��������� ᫮���
 � ᮮ�頥� �ࠢ��쭮 �� �⢥⨫ ���짮��⥫�. �᫨ ᫮�� �� 㣠����, �������� �����뢠�� �㪢� ����� ���� �� ᢮�� �����.
 apple - ���������� apricot - �⢥� ��ப� ap############# (15 ᨬ�����, �⮡� ���짮��⥫� �� ��� 㧭��� ����� ᫮��) 
 ��� �ࠢ����� ���� ᫮� ��ᨬ���쭮, ����� ���짮������: String str = "apple"; str.charAt(0); - ��⮤, ��୥� char,
 ����� �⮨� � ᫮�� str �� ��ࢮ� ����樨 ��ࠥ� �� �� ���, ���� ��ப �� �⣠���� ᫮�� �ᯮ��㥬 ⮫쪮 �����쪨� �㪢�
*/
	public static void main(String [] args) { 
		System.out.println(startProcesGame());//����� ��஢��� ����� 
		while(startProcesMenu()==true){// ���� ���짮��⥫� �롨ࠥ� �த������ ����, �㤥� ����᪠���� ��� �ᥣ��  ������
			System.out.println(startProcesGame());			
		}
		System.out.println("End");//�᫨ false, � �ணࠬ�� ��⠭����������.
	}
	public static String startProcesGame() {//��஢�� �����
	//����� ����� ᫮� (����� � ����)
		String[] words={"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
		Random rand=new Random();
		String word=words[rand.nextInt(words.length)]; //� ��६����� word ����᫨ ���祭�� ��砩�� ��ࡠ����� ����� ���ᨢ�		
		System.out.println(word);//��� �⫠���
		System.out.println();		
		
		System.out.println("������ �������� ���� ��� ���� �����쪨�� �㪢���");			
		Scanner sc=new Scanner(System.in);//ᮧ����� ��ꥪ� ᪠��� ��� ����� ���祭�� �� ���짮��⥫�
		String userword=sc.next();//��᢮���� ���祭��, ���������� ���짮��⥫��
		
/*
��横������� ���� �� �㤥� ���祭�� userword ࠢ�� ���祭�� word. ������ � 横�� ����� �����⪨: 1 ���᪠��� ����� ࠧ ��१����뢠���� ᮣ��᭮ ������ ���������� ᫮��,�.�. ������
ᨬ���� ����� � ��� ᭮�� ��������� �᫨ �㪢� ���� �� 㣠����. 2. ���� ����� ��������, ���� �� �⣠����� ᫮��.
*/		
		while (!userword.equals(word)){ 
			String str="";	//��६����� ��� ���᪠���					
			String wordlong;//�ᯮ����⥫�� ��६���� ��� �ନ஢���� ���᪠���
			wordlong=word;	
			String userwordlong;//�ᯮ����⥫�� ��६���� ��� �ନ஢���� ���᪠���
			userwordlong=userword;	
			
			for (int w=0; w<15-word.length();w++){	//ᮧ����� ��ப� �� 15 ᨬ����� ��� ��砫�� ᨬ���� ����� ���祭��� wordlong � ��⠫�� #	(��室�� �᪫�祭��, ����� �ࠢ�������� ��ப��� ��६���� ࠧ��� �����)		
				wordlong=wordlong.concat("#");	//��ᮥ������� ��ப� # � ��ப� wordlong						
			}
			for (int w=0; w<15-userword.length();w++){ //ᮧ����� ��ப� �� 15 ᨬ����� ��� ��砫�� ᨬ���� ����� ���祭��� userwordlong � ��⠫�� #
				userwordlong=userwordlong.concat("#");	//��ᮥ������� ��ப� # � ��ப� wordlong
			}		
			for (int i=0; i<15;i++){ //��ᨬ���쭮� �ࠢ����� ���� ��� �� 15 ᨬ����  � �ନ஢���� ���᪠��� 				
				if (wordlong.charAt(i)==userwordlong.charAt(i))	str=str+wordlong.charAt(i);
				else str=str+'#';				
			}
			System.out.println(wordlong+"-wordlong");
			System.out.println(userwordlong+"-userwordlong");
			System.out.println("���᪠���:");
			System.out.println(str);			
			System.out.println("������ �������� ���� ��� ���� �����쪨�� �㪢���");	
			userword=sc.next();//��᢮���� ���祭��, ���������� ���짮��⥫��							
		}					
		System.out.println();		
		return "You win!";//����� �� ��横������� �� �᫮��� ��室�� � ��⮤ startProcesGame �����頥� १���� You win!
	}
	public static boolean startProcesMenu() {
		System.out.println("Want more?(Yes-1,No-0)");
		Scanner sc=new Scanner(System.in);//ᮧ����� ��ꥪ� ᪠��� ��� ����� ���祭�� �� ���짮��⥫�
		int n=sc.nextInt();				
		if (n==1) return true;
		else return false;
	}	
}