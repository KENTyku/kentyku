class J2Lesson2 {
	
	public static void main(String[] args){
		justMethod();
	}
	static void justMethod(){
		int a=0;
		int[]	arr=new int[5];	
		try {
			//int b=10/a;	
			arr[5]=12;		
		} catch (ArithmeticException ex) {
			//a=1;
			System.out.println(ex);
			//return;
		} finally {
			//выполняется независимо от того была ошибка или нет
			System.out.println("Finally");
		}
		
		System.out.println("Done!");
	}
}