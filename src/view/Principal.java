package view;

import controller.OpController;

public class Principal {

	public static void main(String[] args) {

		OpController op = new OpController();
//		op.preencheBuffer();
//		op.preencheString();
		String frase = "Est� chovendo";
		op.quebraFrase(frase);
	}
}
