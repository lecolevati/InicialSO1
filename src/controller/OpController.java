package controller;

public class OpController {

	public void preencheString() {
		String palavra = "";
		double tempoInicial = System.nanoTime();
		for (int i = 0; i <= 32768; i++) {
			palavra = palavra + "a";
		}
		double tempoFinal = System.nanoTime();
		double tempoGasto = tempoFinal - tempoInicial;
		tempoGasto = tempoGasto / Math.pow(10, 9);
		System.out.println("String ==> "+tempoGasto+" s.");
	}

	public void preencheBuffer(){
		StringBuffer buffer = new StringBuffer();
		double tempoInicial = System.nanoTime();
		for (int i = 0 ; i <= 32768 ; i++){
			buffer.append("a");
		}
		double tempoFinal = System.nanoTime();
		double tempoGasto = tempoFinal - tempoInicial;
		tempoGasto = tempoGasto / Math.pow(10, 9);
		System.out.println("Buffer ==> "+tempoGasto+" s.");
	}
	
	public void quebraFrase(String frase){
		String[] vetFrase = frase.split(" ");
		for (String palavra : vetFrase){
			System.out.println(palavra);
		}
	}
	
}











