/*	Java Lesson 2
*	avtor: Tveritin Yuri
*	version: 11.05.2017
*/
public class lesson2 {
/* 	Задание 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1,
0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0
*/	
		public static void main(String [] args) { // главный метод main с которого java выполняет программу
			int [] arr={0,0,1,1,0,0,1,1,0,0};// инициализация массива
			for (int i=0; i<10; i++) System.out.print (arr[i]+"  ");			
			System.out.println();
			for (int i=0; i<10; i++) {
				if (arr[i]==0) arr[i]=1;
				else arr[i]=0;
				System.out.print (arr[i]+"  ");
			}
			System.out.println ();
			createArray2();
			System.out.println ();
			createArray3();
			System.out.println ();
			createArray4();
			System.out.println ();
			createArray5();
			System.out.println ();
			int [] arr6={10,1,1,1,0,4,-3,1,6,5};// инициализация массива
			System.out.println ("checkBalance="+checkBalance( arr6));
			int nn=-4;
			makeArray(arr6,nn);
		}		
/*	Задание 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его
значениями 0 3 6 9 12 15 18 21;
*/
		public static void createArray2() {
			int [] arr2=new int[8];
			
			for (int i=0;i<8;i++)System.out.print (arr2[i]+" ");
			System.out.println ();	
			for (int i=0;i<8;i++){
				arr2[i]=3*i;
				System.out.print (arr2[i]+" ");
			}
		}
/*	Задание 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
умножить на 2;
*/		
		public static void createArray3() {
			int [] arr3={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
			System.out.println(arr3.length);
			for (int i=0;i<arr3.length;i++)System.out.print (arr3[i]+"  ");
			System.out.println ();	
			for (int i=0;i<arr3.length;i++){
				if (arr3[i]<6) arr3[i]=arr3[i]*2;
				System.out.print (arr3[i]+"  ");
			}
		}
/*	Задание 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов
одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
*/		
		public static void createArray4() {
			int [][] arr5on5=new int [5][5];			
			for (int i=0;i<5;i++){
				for (int j=0;j<5;j++){
					if ((i==j)||(i+j==4)) arr5on5[i][j]=1;
					System.out.print (arr5on5[i][j]+"  ");
				}
				System.out.println ();
			}			
		}
/*	Задание 5. Задать одномерный массив и найти в нем минимальный и максимальный элементы (без
помощи интернета);
*/		
		public static void createArray5() {
			int [] array={-3,1,-6,3,7,0,1,1,-6,15};			
			int max=0;// максимальное значение в массиве
			int indexmax=0; //индекс элемента массива имеющего максимальное значение
			int min=0;// минимальное значение в массиве
			int indexmin=0;//индекс элемента массива имеющего минимальное значение
			
			System.out.println (array.length);//вычисление размера массива
			/*
			Перебор элементов массива слева направо и сравнение их с min и max. Когда происходит событие, что находится еще меньшее (чем min) или еще большее (чем max) значение,
			мы запоминаем индекс данного элемента
			*/
			for (int i=0;i<array.length;i++){
				System.out.print (array[i]+"  ");// для визуального контроля		
				if (array[i]>=max) {
					max=array[i];
					indexmax=i;
					System.out.print(max+" ");// для визуального контроля
					System.out.println (min);// для визуального контроля
				}
				else {
					if (array[i]<=min){ 
						min=array[i];
						indexmin=i;
						System.out.print(max+" ");// для визуального контроля
						System.out.println (min);// для визуального контроля
					}
					else System.out.println(max+" "+min);// для визуального контроля
						
				}
					
			}
			System.out.println ();			
			System.out.print ("max="+max+" indexes:"); //вывод максимального значения
			/*
			Поиск всех элементов массива, имеющих максимальное значение (возможно наличие одинаковых элементов)
			*/
			for (int i=0;i<array.length;i++){
				if (max==array[i]) System.out.print (" array["+i+"]");				
			}
			System.out.println ();			
			System.out.print ("min="+min+" indexes:"); //вывод минимального значения
			/*
			Поиск всех элементов массива, имеющих минимальное значение (возможно наличие одинаковых элементов)
			*/
			for (int i=0;i<array.length;i++){
				if (min==array[i]) System.out.print (" array["+i+"]");
			}	
		}
/*	Задание 6. Написать метод, в который передается не пустой одномерный целочисленный массив,
метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части
массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1]) > true, checkBalance ([2, 1, 1, 2, 1]) >
false, checkBalance ([10, || 10]) > true, граница показана символами ||, эти символы в массив
не входят.
*/		
		public static boolean checkBalance( int[] array){
			int sumleft=0;//сумма левой части элементов массива			
			System.out.println (array.length);
			for (int i=0; i<array.length-1;i++) {
				int sumright=0;//сумма правой части элементов массива
				sumleft=array[i]+sumleft;
				System.out.print (sumleft+" ");//текущее значение для контроля
				for (int j=i+1;j<array.length;j++) {//цикл подсчитывающий сумму элементов правой части массива
					System.out.print(array[j]+" ");
					sumright=array[j]+sumright;
				}
				System.out.println (":"+sumright);
				if (sumleft==sumright)return true;//проверка на равенство правой и левой части массива				
			}
			return false;
		}
/*	Задание 7. Написать метод, которому на вход подается одномерный массив и число n (может быть
положительным, или отрицательным), при этом метод должен сместить все элементы
массива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными
массивами.

*/		
		public static void makeArray (int[] array, int n){
			if (n>0) {	//сдвиг вправо	
				for (int i=0;i<array.length;i++)System.out.print (array[i]+" ");//вывод элементов массива до сдвига для наглядности 
				System.out.println ();
				for (int j=0;j<n;j++){//количество элементарных сдвигов
					int fin=array[array.length-1];//временно храним значение последнего элемента массива во время сдвига
					for (int i=0; i<array.length-1;i++){//цикл элементарного сдвига вправо
						array[array.length-1-i]=array[array.length-i-2];				
					}
					array[0]=fin;//передаем значение из последнего элемента
				}
				for (int i=0;i<array.length;i++)System.out.print (array[i]+" ");//вывод элементов после сдвига для наглядности.
				System.out.println ();
			}
			else {//сдвиг влево аналогично сдвигу вправо
				for (int i=0;i<array.length;i++)System.out.print (array[i]+" ");
				System.out.println ();
				for (int j=0;j<-n;j++){
					int first=array[0];
					for (int i=0; i<array.length-1;i++){
						array[i]=array[i+1];				
					}
					array[array.length-1]=first;
				}
				for (int i=0;i<array.length;i++)System.out.print (array[i]+" ");
				System.out.println ();
			}
		}
}