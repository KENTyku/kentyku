/**
 * Java. Level 2. Lesson 4
 * GUI for client chat
 *
 * @author Tveritin Yuri
 * @version 1 dated 05.07.2017
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
		setTitle("KENTyku Chat");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(976, 0, 400, 700);
		JButton[] jbs = new JButton[5];
        for (int i = 0; i < 5; i++) {
            jbs[i] = new JButton("button " + i);
        }
        setLayout(new BorderLayout());   
        add(jbs[0], BorderLayout.EAST); 
        //add(jbs[1], BorderLayout.WEST);
        add(jbs[2], BorderLayout.SOUTH);
        add(jbs[3], BorderLayout.NORTH);
        add(jbs[4], BorderLayout.CENTER);				
        setVisible(true);
	}
}
