package br.senai.sp.jandira;

import java.awt.Font;

import javax.swing.event.InternalFrameAdapter;

import br.senai.sp.jandira.gui.FrameTabuada;
import br.senai.sp.jandira.model.EstruturaTabuada;

public class AppTabuada {

	public static void main(String[] args) {
		
		FrameTabuada tela = new FrameTabuada();
		tela.titulo = " TABUADA ";
		tela.altura = 800 ;
		tela.largura = 600 ;
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
