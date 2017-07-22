/**
 * Java. Level 2. Lesson 4
 * GUI for client chat
 *
 * @author Tveritin Yuri
 * @version 2 dated 18.07.2017
 */
import java.io.*; //для ввода вывода информации
//import java.net.*;
//import java.util.*;
import javax.swing.*;//для создания объектов gui
import java.awt.*;//для создания gui и графики
import java.awt.event.*;//обработка событий при реакции на объекты gui

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
		final JTextArea jtacenter = new JTextArea(); /*создаем многострочное текстовое поле 
			JTextArea*/
		JScrollPane jspcenter = new JScrollPane(jtacenter);//создаем объект прокрутки текста JScrollPane куда помещаем созданное поле
		JTextArea jtaright = new JTextArea(" Users "); //создаем многострочное текстовое поле JTextArea
		JScrollPane jspright = new JScrollPane(jtaright);//создаем объект прокрутки текста JScrollPane куда помещаем созданное поле
		jp[0].add(jspcenter, BorderLayout.CENTER);//размещаем объект jsp на панель
		jp[0].add(jspright, BorderLayout.EAST);//размещаем объект jsp на панель
		//на вторую панель
		jp[1].setLayout(new BorderLayout());//применяем компоновщик BorderLayout на второй панели
		final JTextArea writecenter = new JTextArea(); //создаем многострочное текстовое поле JTextArea
		JScrollPane writecenterscroll = new JScrollPane(writecenter);//создаем объект прокрутки текста JScrollPane куда помещаем созданное поле
		JButton buttonSend = new JButton("Send ");
		jp[1].add(writecenterscroll, BorderLayout.CENTER);//размещаем объект jsp на панель
		jp[1].add(buttonSend, BorderLayout.EAST);//размещаем объект jsp на панель
		
		
		//обработка события кнопки Send
		buttonSend.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jtacenter.append(writecenter.getText()+"\n");//добавление в главное поле чата текста из поля ввода
//ниже используется оператор try с ресурсами для автоматического закрытия файла на случай его неиспользования, чтобы предотвратить утечку ОЗУ компьютера			
				try (BufferedWriter buffer=new BufferedWriter(new FileWriter("1.txt", true))) {//создание объекта 1.txt с именем и возможностью дозаписи (true)
					buffer.write(writecenter.getText());//вывод информации в файл
					buffer.newLine();//запись со следующей строки в файл					
				}
				catch (Exception er){
					System.out.println ("Error");
				}
				writecenter.setText(null);//очистка поля ввода
			}
		});
		
		
		//создание верхнего меню
		
		JMenuBar mainMenu = new JMenuBar();//создание меню
		JMenu mFile = new JMenu("File");//создание пункта меню
		JMenu mEdit = new JMenu("Edit");//создание пункта меню
		JMenuItem miFileNew = new JMenuItem("New");//создание подпункта меню
		JMenuItem miFileExit = new JMenuItem("Exit");//создание подпункта меню
		JMenuItem miEditCut = new JMenuItem("Add");//создание подпункта меню
		setJMenuBar(mainMenu);//установка меню mainMenu
		mainMenu.add(mFile);//добавление пункта в меню mainMenu
		mainMenu.add(mEdit);//добавление пункта в меню mainMenu
		mFile.add(miFileNew);//добавление подпункта в пункт mFile меню mainMenu
		mFile.addSeparator(); // разделительная линия
		mFile.add(miFileExit);//добавление подпункта в пункт mFile меню mainMenu
		mEdit.add(miEditCut);//добавление подпункта в пункт mEdit меню mainMenu
		
		//обработка событий в меню
		miFileExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});	
		miEditCut.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jtacenter.append("Hello \n");//добавляет в основное поле чата строку Hello в конце.
			}
		});			
		setVisible(true);




	}
}
