package br.edu.univas.Prova1_TP4.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Frame extends JFrame {
	
	private static final long serialVersionUID = 6765449197444249113L;
	private JPanel contentPanel = null;
	
	public Frame(){
		this.setSize(500,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Prova");
		this.setLocationRelativeTo(null);
		addComponents();
	}
	
	public void addComponents(){
		contentPanel = new JPanel();
		contentPanel.setLayout(new BorderLayout());
		this.setContentPane(contentPanel);
		
		JPanel panelleft = new JPanel();
		panelleft.setBackground(Color.GRAY);
		panelleft.setPreferredSize(new Dimension(120, 0));
		contentPanel.add(panelleft, BorderLayout.WEST);
		
		JButton button1 = new JButton();
		button1.setText("Botão 1");
		panelleft.add(button1);
		
		JButton button2 = new JButton();
		button2.setText("Botão 2");
		panelleft.add(button2);
		
		JButton button3 = new JButton();
		button3.setText("Botão 3");
		panelleft.add(button3);
		
		JButton button4 = new JButton();
		button4.setText("Botão 4");
		panelleft.add(button4);
		
		JButton button5 = new JButton();
		button5.setText("Botão 5");
		panelleft.add(button5);
		
		JButton button6 = new JButton();
		button6.setText("Botão 6");
		panelleft.add(button6);
		
		JButton button7 = new JButton();
		button7.setText("Botão 7");
		panelleft.add(button7);
		
		JButton button8 = new JButton();
		button8.setText("Botão 8");
		panelleft.add(button8);
		
		JButton button9 = new JButton();
		button9.setText("Botão 9");
		panelleft.add(button9);
		
		JButton button10 = new JButton();
		button10.setText("Botão 10");
		panelleft.add(button10);
		
		
		JPanel centerPanel = new JPanel();
		centerPanel.setPreferredSize(new Dimension(200,0));
		contentPanel.add(centerPanel,BorderLayout.CENTER);
		
		
		JLabel labelnome = new JLabel();
		labelnome.setText("Nome: ");
		centerPanel.add(labelnome);
		
		JTextField textFieldnome = new JTextField();
		textFieldnome.setColumns(25);
		centerPanel.add(textFieldnome);
		
		JLabel labelemail = new JLabel();
		labelemail.setText("E-mail: ");
		centerPanel.add(labelemail);
		
		JTextField textFieldemail = new JTextField();
		textFieldemail.setColumns(25);
		centerPanel.add(textFieldemail);
		
		JButton buttonSalvar = new JButton();
		buttonSalvar.setText("Salvar");
		centerPanel.add(buttonSalvar);
		
		
		
		
	}

}
