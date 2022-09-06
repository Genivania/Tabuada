package br.senai.sp.jandira.model;

public class EstruturaTabuada {

	public int multiplicador;
	public int minimoMult;
	public int maximoMult;

	public String[] getTabuada() {

		int tamanho = maximoMult - minimoMult + 1;
		String tabuada[] = new String[tamanho];

		int contador = 0;

		while (contador < tamanho) {

			int produto = multiplicador * minimoMult;
			String resultado = multiplicador + " X " + minimoMult + " = " + produto;
			tabuada[contador] = resultado;

			contador++; // faz aumentar um número a cada volta
			minimoMult++;
		}
		return tabuada;

	}
}
