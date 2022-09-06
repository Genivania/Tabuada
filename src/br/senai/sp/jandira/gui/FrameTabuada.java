package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameTabuada {

	public String titulo;
	public int largura;
	public int altura;
	public Color corDeFundoDeTela;
	public Font FontDosLabels;
	public Color corDoBotao;
	
	
	
	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		
		//obter a instancia do painel de conteúdo.
		Container painel = tela.getContentPane();   
		
		
		// Criar os componentes da tela e colocar no painel (container)
		JLabel labelTabuada = new JLabel();
		labelTabuada.setText(" Tabuada 1.0");
		labelTabuada.setBounds(200, 15, 700, 30);
		labelTabuada.setForeground(new Color(237, 28, 36));
		labelTabuada.setFont(new Font("Arial", Font.BOLD, 30)); 
		
		
//		JLabel labelExplicacao = new JLabel();
//		labelExplicacao.setText("Com a tabuada 1.0 os seus problemas acabaram. Calcule a tabuada que desejar em segundos!");
//		labelExplicacao.setBounds(30, 40, 700, 30);
//		labelExplicacao.setForeground(new Color(128, 128, 128));
//		labelExplicacao.setFont(new Font("Arial", Font.BOLD, 15)); 
		
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando: ");
		labelMultiplicando.setBounds(50, 110, 300, 30);
		JTextField textFildMultiplicando = new JTextField();
		textFildMultiplicando.setBounds(25, 300, 15, 0);
		
		
		
		//adicionar componentes
		painel.add(labelTabuada);
		//painel.add(labelExplicacao);
		painel.add(labelMultiplicando);
		

		
		tela.setVisible(true);
		
		
	}
	
	
	
}
