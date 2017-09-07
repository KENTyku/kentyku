/*	HW Java2 Lesson 5
*	avtor: Tveritin Yuri
*	version:23.06.2017
*/

public class Hwj2l5{
	static final int size = 10000000;
	static final int h = size / 2;
	static float[] arr = new float[size];
	public static void main(String[] args){    //основной поток
		nopotok();
		potok();
	}
	
	public static void nopotok() {
		//final int size = 100000;
		//final int h = size / 2;
		//float[] arr = new float[size];		
		for (int i=1;i<size;i++){
			arr[i]=1;
		}
		long a = System.currentTimeMillis();
		for (int i=1;i<size;i++){
		arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
		}
		long b=System.currentTimeMillis();
		System.out.println(b-a);
			
	}
	
	public static void potok(){
		//final int size = 100000;
		//final int h = size / 2;
		//float[] arr = new float[size];
		float[] a1=new float[h];
		float[] a2=new float[h];
		for (int i=1;i<size;i++){
			arr[i]=1;
		}
		long a = System.currentTimeMillis();
		System.arraycopy(arr, 0, a1, 0, h);
		System.arraycopy(arr, h, a2, 0, h);
		MyThread mt1 = new MyThread("Child");
		for (int i=1;i<h;i++){
		a1[i] = (float)(a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
		}
		
		try {
            mt1.join();   //ожидает завершение потока   mt1   
        } catch (InterruptedException ex) {
            System.out.println("Мain thread is interrupted.");
        }
		System.arraycopy(a1, 0, arr, 0, h);
		System.arraycopy(a2, 0, arr, h, h);
		long b=System.currentTimeMillis();
		System.out.println(b-a);
	}	
		
	
	
}

class MyThread extends Thread {

    // creating new thread
    MyThread(String name) {
        super(name);
        start();//сразу стартуем поток из конструктора
    }

    // starting new thread
    public void run() {
        System.out.println(getName() + " is starting...");
		final int size = 10000000;
		final int h = size / 2;
		float[] a2=new float[h];
        for (int i = 1; i < h; i++) {
             a2[i] = (float)(a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}