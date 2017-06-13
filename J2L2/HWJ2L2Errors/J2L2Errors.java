/*	HW Java2 Lesson 2
*	avtor: Tveritin Yuri
*	version: 13.06.2017
*/
public class J2L2Errors{
	
	public static void main(String[] args){
		new J2L2Errors().doErrors();
	}
	String st="1 k a 2\n2 3 2 2";//для проверки
	//String st="1 3 1 2\n2 3 2 2\n5 6 7 1\n3 3 1 0";
	String [][] arr= new String[4][4];
	int sum=0;	
		
	void doErrors(){
		System.out.println(st);
		System.out.println(doArray(st));
		
	}
	float doArray(String s){		
		
		for (int i=0; i<4;i++){
			for (int j=0; j<4;j++){
				try{
					arr[i][j]=s.substring(0,1);//вырезает из строки подстроку с нач по конечный элемент
					s=s.substring(1);//вырезает из строки подстроку с нач элемента и до конца
					s=s.trim();//вырезает из строки подстроку без пробелов в начале и конце строки
				}
				catch(IndexOutOfBoundsException ex1){
					arr[i][j]="0";//присваиваем элементам массива (которым не передалось значение из строки) значение 0
				}
			}					
		}
		
		for (int i=0; i<4;i++){
			for (int j=0; j<4;j++){
				try {
					sum=sum+Integer.parseInt(arr[i][j]);//преобразование строки в целый тип			
				} 
				catch(NumberFormatException ex2) {
					arr[i][j]="0";
				}
			}			
		}
		return (sum/2);			
	}
}