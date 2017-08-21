/**
 * Java. Level 2. Lesson 4
 * GUI for client chat
 *
 * @author Tveritin Yuri
 * @version 2 dated 18.07.2017
 * Создание потока путем реализации интерфейса Runnable
 */
//import java.io.*; //для ввода вывода информации
//import java.net.*;
//import java.util.*;
//import javax.swing.*;//для создания объектов gui
//import java.awt.*;//для создания gui и графики
//import java.awt.event.*;//обработка событий при реакции на объекты gui

class MyThread implements Runnable{
	String thrdName;
	MyThread(String name) {
		thrdName=name;
	}
	//точка входа в поток.
	public void run() {
		System.out.println(thrdName+"-Start");
		try {
			for(int count=0; count<10; count++){
				Thread.sleep(400);
				System.out.println("In"+thrdName+",count:"+count);
				
			}
		}
		catch (InterruptedException exc) {
			System.out.println(thrdName+"-stop-error");
		}
		System.out.println(thrdName+"-stop");
		
	}
}

class ThreadUse {
	public static void main (String args[]) {
		System.out.println("Start main Thread");
		MyThread mt=new MyThread("Child #1");//создание объекта потока
		Thread newThrd=new Thread(mt);//формирование потока на основе объекта реализующего интерфейс Runnable
		newThrd.start();//запуск потока
		for(int i=0; i<50; i++){
			System.out.print(".");
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException exc){
				System.out.println("Stop main Thread-error");
			}
		}
		System.out.println("Stop main Thread");
	}
}
