/*	Java Lesson 4
*	avtor: Tveritin Yuri
*	version: 15.05.2017
*/
/*import java.util.Random;
import java.util.Scanner;*/

class TicTacToe {
	
	final int SIZE=3;
	final char DOT_X='x';
	final char DOT_O='o';
	final char DOT_EMPTY='.';
	char[][] map=new char[SIZE][SIZE];
	//Scanner sc=new Scanner(System.in);
	//Random rand=new Random();
	
	public static void main(String [] args) { 
		new TicTacToe().go();
	}
	
	void go(){
		initMap();
		while (true){
			humanTurn();
			printMap();
			if (checkWin(DOT_X)){
				System.out.println("You won!");
				break;
			}
			if (isMapFull()){
				System.out.println(Sorry,Draw!);
				break;				
			}
			humanTurn();
			printMap();
			if (checkWin(DOT_X)){
				System.out.println("You won!");
				break;
			}
			if (isMapFull()){
				System.out.println(Sorry,Draw!);
				break;
			}
		}
	}
	void initMap(){
		for (int i=0;i<SIZE;i++){
			for (int j=0;j<SIZE;j++){
				map[i][j]=DOT_EMPTY;
			}
		}
			
	}
}