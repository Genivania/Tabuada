package br.senai.sp.jandira;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.event.InternalFrameAdapter;

import br.senai.sp.jandira.gui.FrameTabuada;
import br.senai.sp.jandira.model.EstruturaTabuada;

public class AppTabuada {

	public static void main(String[] args) {
		
		FrameTabuada tela = new FrameTabuada();
		tela.titulo = " TABUADA ";
		tela.altura = 800 ;
		tela.largura = 600 ;
		tela.corFundoDaTabuada = new Color(239, 228, 176);
		tela.corDaLetraDaTabuada = new Color(0, 106, 0);
		tela.fonteConteudo= new Font("Arial", 0, 20);
		tela.corDoCalcular = new Color(0, 179, 0);
		tela.fontDoCalcular = new Font("Arial", Font.BOLD, 20);
		tela.corDaFonteCalcular = new Color(255, 255, 255);
		

		tela.criarTela();
		
		
	
//	EstruturaTabuada tabuada = new EstruturaTabuada();
//	tabuada.multiplicador = 20;
//	tabuada.minimoMult = 5;
//	tabuada.maximoMult = 10;
//	
//	String[] resultado = tabuada.getTabuada();
//	
//		int contador = 0;
//	
//		while(contador < resultado.length) {
//			System.out.println(resultado[contador]);
//			contador++;
//			
//		}
	}	
}
