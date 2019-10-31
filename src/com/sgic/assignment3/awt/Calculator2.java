package com.sgic.assignment3.awt;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Calculator2 extends JFrame implements ActionListener{
	JLabel l1 = new JLabel("First Number");
	JLabel l2 = new JLabel("Secound Number");
	JButton b1 = new JButton("ADD");
	JButton b2 = new JButton("SUBTRACT");
	JButton b3 = new JButton("MULTIPLY");
	JButton b4 = new JButton("DIVIDE");
	JTextField t1 = new JTextField();
	JTextField t2 = new JTextField();
	JTextField t3 = new JTextField();
	public Calculator2(){
		l1.setBounds(30,60,80,30);
		t1.setBounds(120,60,80,30);
		l2.setBounds(240,60,80,30);
		t2.setBounds(340,60,80,30);
		b1.setBounds(30,120,80,30);
		b2.setBounds(120,120,80,30);
		b3.setBounds(240,120,80,30);
		b4.setBounds(340,120,80,30);
		t3.setBounds(120,180,180,30);
		
		add(l1);add(t1);add(l2);add(t2);add(b1);add(b2);add(b3);add(b4);add(t3);
		setBackground(Color.gray);
		setLayout(null);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		setSize(500,300);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		double n1 =Double.parseDouble( t1.getText());
		double n2 =Double.parseDouble( t2.getText());
		double num=0;
		if(e.getSource()==b1) {		
			num= n1+n2;		
		}
		if(e.getSource()==b2) {
			num = n1-n2;
		}
		if(e.getSource()==b3) {
			num = n1*n2;
		}
		if(e.getSource()==b4) {
			num = n1/n2;
		}
		String result = num +"";
		t3.setText(result);
	}
	
	public static void main(String[] args) {
		new Calculator2();
	}

}

