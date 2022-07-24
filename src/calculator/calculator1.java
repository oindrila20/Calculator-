package calculator;

import java.awt.Color;
import java.awt.Font;  

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Format;

import javax.swing.ActionMap;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.text.AttributeSet.ColorAttribute;

public class calculator1 {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextArea textarea = new JTextArea(2,10);
	
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JButton button7 = new JButton();
	JButton button8 = new JButton();
	JButton button9 = new JButton();
	JButton button0 = new JButton();
	
	JButton buttonadd = new JButton();
	JButton buttonsub = new JButton();
	JButton buttonmul = new JButton();
	JButton buttondiv = new JButton();
	JButton buttonclear = new JButton();
	JButton buttonequal = new JButton();
	JButton buttondot = new JButton();
	
	double number1, number2, result;
	int addc=0, mulc=0, divc=0, subc=0;
	
	public  calculator1() {
		frame.setSize(340, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Tech Talk Tricks");
		
		//frame.setResizable(false);
		
		frame.add(panel);
		panel.setBackground(Color.LIGHT_GRAY);
		Border border = BorderFactory.createLineBorder(Color.RED, 4);
		
		
		panel.add(textarea);
		
		textarea.setBackground(Color.BLACK);
		Border tborder = BorderFactory.createLineBorder(Color.BLUE,3);
		textarea.setBorder(tborder);
		Font font = new Font("arial", Font.BOLD , 33);
		textarea.setFont((java.awt.Font) font);
		textarea.setForeground(Color.WHITE);
		
		textarea.setPreferredSize(new Dimension(2,10));
		textarea.setLineWrap(true); 
		
		
		button1.setPreferredSize(new Dimension(100,40));
		button1.setIcon(new ImageIcon("C:\\Users\\user\\OneDrive\\Desktop\\calculator\\button1.png"));
		
		button2.setPreferredSize(new Dimension(100,40));
		button2.setIcon(new ImageIcon("C:\\Users\\user\\OneDrive\\Desktop\\calculator\\button2.png"));
		
		button3.setPreferredSize(new Dimension(100,40));
		button3.setIcon(new ImageIcon("C:\\Users\\user\\OneDrive\\Desktop\\calculator\\button3.png"));
		
		button4.setPreferredSize(new Dimension(100,40));
		button4.setIcon(new ImageIcon("C:\\Users\\user\\OneDrive\\Desktop\\calculator\\button4.png"));
		
		button5.setPreferredSize(new Dimension(100,40));
		button5.setIcon(new ImageIcon("C:\\Users\\user\\OneDrive\\Desktop\\calculator\\button5.png"));
		
		button6.setPreferredSize(new Dimension(100,40));
		button6.setIcon(new ImageIcon("C:\\Users\\user\\OneDrive\\Desktop\\calculator\\button6.png"));
		
		button7.setPreferredSize(new Dimension(100,40));
		button7.setIcon(new ImageIcon("C:\\Users\\user\\OneDrive\\Desktop\\calculator\\button7.png"));
		
		button8.setPreferredSize(new Dimension(100,40));
		button8.setIcon(new ImageIcon("C:\\Users\\user\\OneDrive\\Desktop\\calculator\\button8.png"));
		
		button9.setPreferredSize(new Dimension(100,40));
		button9.setIcon(new ImageIcon("C:\\Users\\user\\OneDrive\\Desktop\\calculator\\button9.png"));
		
		button0.setPreferredSize(new Dimension(100,40));
		button0.setIcon(new ImageIcon("C:\\Users\\user\\OneDrive\\Desktop\\calculator\\button0.png"));
		
		buttondot.setPreferredSize(new Dimension(100,40));
		buttondot.setIcon(new ImageIcon("C:\\Users\\user\\OneDrive\\Desktop\\calculator\\buttondot.png"));
		
		buttonsub.setPreferredSize(new Dimension(100,40));
		buttonsub.setIcon(new ImageIcon("C:\\Users\\user\\OneDrive\\Desktop\\calculator\\buttonsub.png"));
		
		buttonmul.setPreferredSize(new Dimension(100,40));
		buttonmul.setIcon(new ImageIcon("C:\\Users\\user\\OneDrive\\Desktop\\calculator\\buttonmul.png"));
		
		buttondiv.setPreferredSize(new Dimension(100,40));
		buttondiv.setIcon(new ImageIcon("C:\\Users\\user\\OneDrive\\Desktop\\calculator\\buttondiv.png"));
		
		buttonclear.setPreferredSize(new Dimension(100,40));
		buttonclear.setIcon(new ImageIcon("C:\\Users\\user\\OneDrive\\Desktop\\calculator\\buttonclear.png"));
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button0);
		panel.add(buttondot);
		panel.add(buttonsub);
		panel.add(buttonmul);
		panel.add(buttondiv);
		panel.add(buttonequal);
		panel.add(buttonclear);
		
		button1.addActionListener((ActionListener) this);
		button2.addActionListener ((ActionListener) this);
		button3.addActionListener((ActionListener) this);
		button4.addActionListener((ActionListener) this);
		button5.addActionListener((ActionListener) this);
		button6.addActionListener((ActionListener) this);
		button7.addActionListener((ActionListener) this);
		button8.addActionListener((ActionListener) this);
		button9.addActionListener((ActionListener) this);
		button0.addActionListener((ActionListener) this);
		buttondot.addActionListener((ActionListener) this);
		buttonsub.addActionListener((ActionListener) this);
		buttonmul.addActionListener((ActionListener) this);
		buttondiv.addActionListener((ActionListener) this);
		buttonequal.addActionListener((ActionListener) this);
		buttonclear.addActionListener((ActionListener) this);
		
	}
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source== buttonclear) {
			number1=0.0;
			number2= 0.0;
			textarea.setText("");
		}
           if (source == button1) {
        	   textarea.append("1");
        	   
           }
           
        	   
        	 if (source == button2) {
            	   textarea.append("2");
        	 }
        	 
             if (source == button3) {
              textarea.append("3");
             }
             
             if (source == button4) {
          	   textarea.append("4");
          	   
             }
             if (source == button5) {
          	   textarea.append("5");
             }
             if (source == button6) {
          	   textarea.append("6");
             }
             if (source == button7) {
          	   textarea.append("7");
        	   
           }
             if (source == button8) {
          	   textarea.append("8");

             }
             
             if (source == button9) {
          	   textarea.append("9");
             }
             
             if (source == button0) {
          	   textarea.append("0");
             }
             
             if (source == buttondot) {
          	   textarea.append(".");
             }
             if (source == buttonadd) {
            	 number1= number_reader() ;
            	 textarea.setText("+");
            	 addc=1;
            	 divc=0;
            	 subc=0;
            	 mulc=0;
             }
             
             if (source == buttondiv) {
            	 number1= number_reader() ;
            	 textarea.setText("/");
            	 addc=0;
            	 divc=1;
            	 subc=0;
            	 mulc=0;
             }
             
             if (source == buttonsub) {
            	 number1= number_reader() ;
            	 textarea.setText("-");
            	 addc=0;
            	 divc=0;
            	 subc=1;
            	 mulc=0;
             }
             
             if (source == buttonmul) {
            	 number1= number_reader() ;
            	 textarea.setText("*");
            	 addc=0;
            	 divc=0;
            	 subc=0;
            	 mulc=1;
             }
              
             if (source == buttonequal) {
            	 number2 = number_reader();
            	 if(addc>0) {
            		 result= number1+ number2;
            		 textarea.setText(Double.toString(result));
            	 }
            	 
            	 if(subc>0) {
            		 result = number1-number2;
            		 textarea.setText(Double.toString(result));
            	 }
            	 
            	 if(mulc>0) {
            		 result = number1*number2;
            		 textarea.setText(Double.toString(result));
            	 }
            	 if(divc>0) {
            		 result = number1/number2;
            		 textarea.setText(Double.toString(result));
            	 }
            	 
             }
	}
	
	public double number_reader() {
		double num1;
		String s ;
		s = textarea.getText();
		num1 = Double.valueOf(s);
		return num1;
		
	}
	
}