/*	Java Lesson 4
*	avtor: Tveritin Yuri
*	version: 15.05.2017
*/
import java.util.Random;
import java.util.Scanner;


class TicTacToe {
	
	final int SIZE=3;
	final char DOT_X='x';
	final char DOT_O='o';
	final char DOT_EMPTY='.';
	char[][] map=new char[SIZE][SIZE];
	Scanner sc=new Scanner(System.in);
	Random rand=new Random();
	
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
				System.out.println("Sorry,Draw!");
				break;				
			}
			aiTurn();
			System.out.println();
			printMap();
			if (checkWin(DOT_O)){
				System.out.println("You won!");
				break;
			}
			/*if (isMapFull()){
				System.out.println("Sorry,Draw!");
				break;
			}*/
		}
		System.out.println("GAME OVER.");
	}
	void initMap(){
		for (int i=0;i<SIZE;i++){
			for (int j=0;j<SIZE;j++){
				map[i][j]=DOT_EMPTY;
			}
		}
			
	}
	void humanTurn(){
		int x,y;
		do {
			System.out.println("Enter X and Y (1-3)");
			x = sc.nextInt() - 1;
			y = sc.nextInt() - 1;
		}while (!isCellValid(x, y));
		map[y][x] = DOT_X;
	}
	void aiTurn(){
		int x,y;
		do {			
			x = rand.nextInt(SIZE);
			y = rand.nextInt(SIZE);
		}while (!isCellValid(x, y));
		map[y][x] = DOT_O;
	}
	void printMap(){
		for (int i=0;i<SIZE;i++){
			for (int j=0;j<SIZE;j++){
				System.out.print(map[i][j]+" ");
			}
			System.out.println();			
		}
	}
	boolean checkWin(char ch){
		for (int i=0; i<SIZE;i++) {//горизонтали (смысл:найти неодинаковый символ)
			for (int j=0; j<SIZE;j++) {
				if (map[i][j]!=ch) break;
				else {
					if (j==SIZE-1) return true;
				}
			}					
		}
		
		
		for (int j=0;j<SIZE;j++){//вертикали
			for (int i=0; i<SIZE;i++) {
				if (map[i][j]!=ch) break;
				else {
					if (i==SIZE-1) return true;
				}
			}
		}
		
		
		for (int i=0; i<SIZE;i++) {//1я диагональ
			if (map[i][i]!=ch) break;
			else {
				if (i==SIZE-1) return true;
			}
		}	

		
		for (int i=0; i<SIZE;i++) {//2я диагональ
			if (map[SIZE-1-i][i]!=ch)break;
			else {
				if (i==SIZE-1) return true;
			}
		}
		return false;			
		
		/*if(map[0][0] == ch && map[0][1] == ch && map[0][2] == ch) return true;
		if(map[1][0] == ch && map[1][1] == ch && map[1][2] == ch) return true;
		if(map[2][0] == ch && map[2][1] == ch && map[2][2] == ch) return true;
		
		if(map[0][0] == ch && map[1][0] == ch && map[2][0] == ch) return true;
		if(map[0][1] == ch && map[1][1] == ch && map[2][1] == ch) return true;
		if(map[0][2] == ch && map[1][2] == ch && map[2][2] == ch) return true;
		
		if(map[0][0] == ch && map[1][1] == ch && map[2][2] == ch) return true;
		if(map[2][0] == ch && map[1][1] == ch && map[0][2] == ch) return true;*/
				
	}
	boolean isMapFull(){
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
			if (map[i][j] == DOT_EMPTY) return false;
			}
		}
		return true;		
	}
	boolean isCellValid(int x, int y){
		if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
		if (map[y][x] == DOT_EMPTY) return true;
		return false;
	}
}

class Map {
	final int SIZE=3;	
	
	char[][] map=new char[SIZE][SIZE];
	Map( char dot,) {
		this.char[0][0]=dot;
	}
}

class Player {	
	turn()
	
}

class human extends Player {
	
}

class AI extends Player {
	
}