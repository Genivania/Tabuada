package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.EstruturaTabuada;



public class FrameTabuada {

	public String titulo;
	public int largura;
	public int altura;
	public Color corFundoDaTabuada;
	public Color corDaLetraDaTabuada;
	public Font fonteConteudo;
	public Color corDoCalcular;
	public Font fontDoCalcular;
	public Color corDaFonteCalcular;


	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		
		//obter a instancia do painel de conteúdo.
		Container painel = tela.getContentPane();   
		
		
		// Criar os componentes da tela e colocar no painel (container)
		
		ImageIcon imagem = new ImageIcon(getClass().getResource("calculadora.png"));
		JLabel labelImagem = new JLabel(imagem);
		
		//labelImagem.setBounds(25, 20, 50, 30);
		
		
		JLabel labelTabuada = new JLabel();
		labelTabuada.setText(" Tabuada 1.0");
		labelTabuada.setBounds(100, 15, 700, 30);
		labelTabuada.setForeground(new Color(237, 28, 36));
		labelTabuada.setFont(new Font("Arial", Font.BOLD, 30)); 
		
		
		JLabel labelExplicacao = new JLabel();
		labelExplicacao.setText("Com a tabuada 1.0 os seus problemas acabaram. Calcule ");
		labelExplicacao.setBounds(120, 40, 700, 30);
		labelExplicacao.setForeground(new Color(128, 128, 128));
		labelExplicacao.setFont(new Font("Arial", 0, 15)); 
		
		JLabel labelExplicacao1 = new JLabel();
		labelExplicacao1.setText("a tabuada que desejar em segundos!");
		labelExplicacao1.setBounds(120, 60, 700, 30);
		labelExplicacao1.setForeground(new Color(128, 128, 128));
		labelExplicacao1.setFont(new Font("Arial", 0, 15)); 
		
		
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando: ");
		labelMultiplicando.setFont(fonteConteudo);
		labelMultiplicando.setBounds(140, 110, 300, 30);
		
		JTextField textFildMultiplicando = new JTextField();
		textFildMultiplicando.setBounds(330, 110, 200, 40);
		textFildMultiplicando.setFont(new Font("Arial", 0 , 20)); 
		
		
		
		JLabel labelMinimoMulti = new JLabel();
		labelMinimoMulti.setText("Mínimo Multiplicador: ");
		labelMinimoMulti.setBounds(55, 170, 300, 30);
		labelMinimoMulti.setFont(fonteConteudo);

		JTextField textFildMinimoMulti = new JTextField();
		textFildMinimoMulti.setBounds(330, 170, 200, 40);
		textFildMinimoMulti.setFont(new Font("Arial", 0 , 20)); 
		
		
		
		JLabel labelMaximoMulti = new JLabel();
		labelMaximoMulti.setText("Máximo Multiplicador: ");
		labelMaximoMulti.setBounds(53, 230, 300, 30);
		labelMaximoMulti.setFont(fonteConteudo);
		
		JTextField textFildMaximoMulti = new JTextField();
		textFildMaximoMulti.setBounds(330, 230, 200, 40);
		textFildMaximoMulti.setFont(new Font("Arial", 0 , 20)); 
		
		
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(35, 300, 290, 50);
		buttonCalcular.setBackground(corDoCalcular);
		buttonCalcular.setFont(fontDoCalcular);
		buttonCalcular.setForeground(corDaFonteCalcular);
		
		
		//lista
		JList<String> lista = new JList<String>();
		JScrollPane scroll = new JScrollPane(lista);

		scroll.setBounds(30, 420, 365, 250);
		lista.setBackground(corFundoDaTabuada);
		lista.setForeground(corDaLetraDaTabuada);
		
		
		//botões
		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar ");
		buttonLimpar.setBounds(330, 300, 200, 50);
		buttonLimpar.setFont(new Font("Arial", Font.BOLD, 20)); 
		buttonLimpar.setBackground(new Color(251, 181, 51));
		buttonLimpar.setForeground(new Color(255, 255, 255));
		
		
		JLabel labelResultado = new JLabel();
		labelResultado.setText(" Resultado:");
		labelResultado.setBounds(28, 380, 700, 30);
		labelResultado.setFont(new Font("Arial", Font.BOLD, 20)); 

	buttonCalcular.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (textFildMultiplicando.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Multiplicando é obrigatório");
					textFildMultiplicando.requestFocus();	
				}
				else if(textFildMinimoMulti.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Mínino multiplicador é obrigatório");
					textFildMinimoMulti.requestFocus();
				}
				else if(textFildMaximoMulti.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Máximo multiplicador é obrigatório");
					textFildMaximoMulti.requestFocus();
				}
				
				else {
					EstruturaTabuada tabuada = new EstruturaTabuada();
					tabuada.multiplicador = Integer.parseInt(textFildMultiplicando.getText());
					tabuada.minimoMult = Integer.parseInt(textFildMinimoMulti.getText());
					
					if (tabuada.maximoMult < tabuada.minimoMult) {
						JOptionPane.showMessageDialog(null, "Máximo multiplicador tem que ser maior que o mínimo", "ERRO", JOptionPane.ERROR_MESSAGE);
					}
					
					lista.setListData(tabuada.getTabuada());
				}
			}
	});
	
	
	buttonLimpar.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			textFildMultiplicando.setText("");
			textFildMinimoMulti.setText("");
			textFildMaximoMulti.setText("");
			lista.setVisible(false);
		}
	});
	
	textFildMultiplicando.addKeyListener(new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent e) {	
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			textFildMultiplicando.setText(textFildMultiplicando.getText().replaceAll("[^0-9]",""));
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
	
		}
	});

	textFildMinimoMulti.addKeyListener(new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent e) {
	
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			textFildMinimoMulti.setText(textFildMinimoMulti.getText().replaceAll("[^0-9]",""));
		}
		@Override
		public void keyPressed(KeyEvent e) {
		}
	});
	
	textFildMaximoMulti.addKeyListener(new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent e) {
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			textFildMaximoMulti.setText(textFildMaximoMulti.getText().replaceAll("[^0-9", ""));
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
		}
	});

		
		//adicionar componentes
		painel.add(labelTabuada);
		painel.add(labelExplicacao);
		painel.add(labelExplicacao1);
		painel.add(labelMultiplicando);
		painel.add(textFildMultiplicando);
		painel.add(textFildMinimoMulti);
		painel.add(labelMinimoMulti);
		painel.add(textFildMaximoMulti);
		painel.add(labelMaximoMulti);
		painel.add(buttonCalcular);
		painel.add(buttonLimpar);
		painel.add(labelResultado);
		painel.add(scroll);
		painel.add(labelImagem);
		

		tela.setVisible(true);
		
		
	}
	
	
	
}
		
