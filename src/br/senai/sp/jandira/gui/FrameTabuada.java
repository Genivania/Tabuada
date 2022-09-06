package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

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
		labelTabuada.setText("tabuada");
		labelTabuada.setBounds(230, 15, 300, 30);
		labelTabuada.setForeground(new Color(0, 230, 230));
		
		
		
		//adicionar componentes
		painel.add(labelTabuada);
		
		
		tela.setVisible(true);
		
		
	}
	
	
	
}
