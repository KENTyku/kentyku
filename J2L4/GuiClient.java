/**
 * Java. Level 2. Lesson 4
 * GUI for client chat
 *
 * @author Tveritin Yuri
 * @version 2 dated 18.07.2017
 */
//import java.io.*;
//import java.net.*;
//import java.util.*;
import javax.swing.*;
import java.awt.*;

public class GuiClient{
	
	public static void main(String[] args) {
		MyForm1 w= new MyForm1();
	}
}

class MyForm1 extends JFrame {
	MyForm1() {
		//создаем окно 
		setTitle("KENTyku Chat");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(976, 0, 400, 700);
		
		setLayout(new BorderLayout());  //применяем компоновщик BorderLayout для располжения 2х панелей
		JPanel[] jp = new JPanel[2];
		for (int i = 0; i < jp.length; i++) {
			jp[i] = new JPanel();
			jp[i].setBackground(new Color(10 + i * 40, 130 + i * 40, 130 + i * 40));// Color(int r, int g, int b)
		}
		add(jp[0], BorderLayout.CENTER); //add panel on form
		add(jp[1], BorderLayout.SOUTH); //add panel on form
		//на первую панель кладем 
		jp[0].setLayout(new BorderLayout()); //применяя компоновщик BorderLayout к первой панели
		JTextArea jtacenter = new JTextArea(); //создаем многострочное текстовое поле JTextArea
		JScrollPane jspcenter = new JScrollPane(jtacenter);//создаем объект прокрутки текста JScrollPane куда помещаем созданное поле
		JTextArea jtaright = new JTextArea(" Users "); //создаем многострочное текстовое поле JTextArea
		JScrollPane jspright = new JScrollPane(jtaright);//создаем объект прокрутки текста JScrollPane куда помещаем созданное поле
		jp[0].add(jspcenter, BorderLayout.CENTER);//размещаем объект jsp на панель
		jp[0].add(jspright, BorderLayout.EAST);//размещаем объект jsp на панель
		//на вторую панель
		jp[1].setLayout(new BorderLayout());//применяем компоновщик BorderLayout на второй панели
		JTextArea writecenter = new JTextArea(); //создаем многострочное текстовое поле JTextArea
		JScrollPane writecenterscroll = new JScrollPane(writecenter);//создаем объект прокрутки текста JScrollPane куда помещаем созданное поле
		JButton buttonSend = new JButton("Send ");
		jp[1].add(writecenterscroll, BorderLayout.CENTER);//размещаем объект jsp на панель
		jp[1].add(buttonSend, BorderLayout.EAST);//размещаем объект jsp на панель
		
		
		//создание верхнего меню
		
		JMenuBar mainMenu = new JMenuBar();//создание меню
		JMenu mFile = new JMenu("File");//создание пункта меню
		JMenu mEdit = new JMenu("Edit");//создание пункта меню
		JMenuItem miFileNew = new JMenuItem("New");//создание подпункта меню
		JMenuItem miFileExit = new JMenuItem("Exit");//создание подпункта меню
		JMenuItem miEditCut = new JMenuItem("Cut");//создание подпункта меню
		setJMenuBar(mainMenu);//установка меню mainMenu
		mainMenu.add(mFile);//добавление пункта в меню mainMenu
		mainMenu.add(mEdit);//добавление пункта в меню mainMenu
		mFile.add(miFileNew);//добавление подпункта в пункт mFile меню mainMenu
		mFile.addSeparator(); // разделительная линия
		mFile.add(miFileExit);//добавление подпункта в пункт mFile меню mainMenu
		mEdit.add(miEditCut);//добавление подпункта в пункт mEdit меню mainMenu
		//miFileExit.addActionListener(new ActionListener() {
		//	@Override
		//	public void actionPerformed(ActionEvent e) {
		//		System.exit(0);
		//	}
		//});
		//addWindowListener(new WindowAdapter() {
		//	@Override
		//	public void windowClosing(WindowEvent e) {
		//		System.out.println("BYE");
		//	}
		//});
		setVisible(true);




	}
}
