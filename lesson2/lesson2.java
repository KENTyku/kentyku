/*	Java Lesson 2
*	avtor: Tveritin Yuri
*	version: 11.05.2017
*/
public class lesson2 {
/* 	������� 1. ������ ������������� ������, ��������� �� ��������� 0 � 1. ��������: [ 1, 1, 0, 0, 1, 0, 1, 1,
0, 0 ]. � ������� ����� � ������� �������� 0 �� 1, 1 �� 0
*/	
		public static void main(String [] args) { // ������� ����� main � �������� java ��������� ���������
			int [] arr={0,0,1,1,0,0,1,1,0,0};// ������������� �������
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
			int [] arr6={10,1,1,1,0,4,-3,1,6,5};// ������������� �������
			System.out.println ("checkBalance="+checkBalance( arr6));
			int nn=-4;
			makeArray(arr6,nn);
		}		
/*	������� 2. ������ ������ ������������� ������ �������� 8. � ������� ����� ��������� ���
���������� 0 3 6 9 12 15 18 21;
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
/*	������� 3. ������ ������ [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] ������ �� ���� ������, � ����� ������� 6
�������� �� 2;
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
/*	������� 4. ������� ���������� ��������� ������������� ������ (���������� ����� � ��������
����������), � � ������� �����(-��) ��������� ��� ������������ �������� ���������;
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
/*	������� 5. ������ ���������� ������ � ����� � ��� ����������� � ������������ �������� (���
������ ���������);
*/		
		public static void createArray5() {
			int [] array={-3,1,-6,3,7,0,1,1,-6,15};			
			int max=0;// ������������ �������� � �������
			int indexmax=0; //������ �������� ������� �������� ������������ ��������
			int min=0;// ����������� �������� � �������
			int indexmin=0;//������ �������� ������� �������� ����������� ��������
			
			System.out.println (array.length);//���������� ������� �������
			/*
			������� ��������� ������� ����� ������� � ��������� �� � min � max. ����� ���������� �������, ��� ��������� ��� ������� (��� min) ��� ��� ������� (��� max) ��������,
			�� ���������� ������ ������� ��������
			*/
			for (int i=0;i<array.length;i++){
				System.out.print (array[i]+"  ");// ��� ����������� ��������		
				if (array[i]>=max) {
					max=array[i];
					indexmax=i;
					System.out.print(max+" ");// ��� ����������� ��������
					System.out.println (min);// ��� ����������� ��������
				}
				else {
					if (array[i]<=min){ 
						min=array[i];
						indexmin=i;
						System.out.print(max+" ");// ��� ����������� ��������
						System.out.println (min);// ��� ����������� ��������
					}
					else System.out.println(max+" "+min);// ��� ����������� ��������
						
				}
					
			}
			System.out.println ();			
			System.out.print ("max="+max+" indexes:"); //����� ������������� ��������
			/*
			����� ���� ��������� �������, ������� ������������ �������� (�������� ������� ���������� ���������)
			*/
			for (int i=0;i<array.length;i++){
				if (max==array[i]) System.out.print (" array["+i+"]");				
			}
			System.out.println ();			
			System.out.print ("min="+min+" indexes:"); //����� ������������ ��������
			/*
			����� ���� ��������� �������, ������� ����������� �������� (�������� ������� ���������� ���������)
			*/
			for (int i=0;i<array.length;i++){
				if (min==array[i]) System.out.print (" array["+i+"]");
			}	
		}
/*	������� 6. �������� �����, � ������� ���������� �� ������ ���������� ������������� ������,
����� ������ ������� true ���� � ������� ���� �����, � ������� ����� ����� � ������ �����
������� �����. �������: checkBalance([1, 1, 1, || 2, 1]) > true, checkBalance ([2, 1, 1, 2, 1]) >
false, checkBalance ([10, || 10]) > true, ������� �������� ��������� ||, ��� ������� � ������
�� ������.
*/		
		public static boolean checkBalance( int[] array){
			int sumleft=0;//����� ����� ����� ��������� �������			
			System.out.println (array.length);
			for (int i=0; i<array.length-1;i++) {
				int sumright=0;//����� ������ ����� ��������� �������
				sumleft=array[i]+sumleft;
				System.out.print (sumleft+" ");//������� �������� ��� ��������
				for (int j=i+1;j<array.length;j++) {//���� �������������� ����� ��������� ������ ����� �������
					System.out.print(array[j]+" ");
					sumright=array[j]+sumright;
				}
				System.out.println (":"+sumright);
				if (sumleft==sumright)return true;//�������� �� ��������� ������ � ����� ����� �������				
			}
			return false;
		}
/*	������� 7. �������� �����, �������� �� ���� �������� ���������� ������ � ����� n (����� ����
�������������, ��� �������������), ��� ���� ����� ������ �������� ��� ��������
������� �� n �������. ��� ���������� ������ ������ ������������ ����������������
���������.

*/		
		public static void makeArray (int[] array, int n){
			if (n>0) {	//����� ������	
				for (int i=0;i<array.length;i++)System.out.print (array[i]+" ");//����� ��������� ������� �� ������ ��� ����������� 
				System.out.println ();
				for (int j=0;j<n;j++){//���������� ������������ �������
					int fin=array[array.length-1];//�������� ������ �������� ���������� �������� ������� �� ����� ������
					for (int i=0; i<array.length-1;i++){//���� ������������� ������ ������
						array[array.length-1-i]=array[array.length-i-2];				
					}
					array[0]=fin;//�������� �������� �� ���������� ��������
				}
				for (int i=0;i<array.length;i++)System.out.print (array[i]+" ");//����� ��������� ����� ������ ��� �����������.
				System.out.println ();
			}
			else {//����� ����� ���������� ������ ������
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