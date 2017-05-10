package Dados;

import java.util.Random;

public class BancoDePalavras {
	
	private String[] palavras = {"GATO","CACHORRO","PATO","GAIVOTA","LEAO","BALEIA","ZEBRA","PEIXE","TUCANO"};
	
	public String getNext()
	{
		Random r = new Random(System.currentTimeMillis());
		int referencia = r.nextInt();
		int indice = referencia %  palavras.length-1;
		return palavras[Math.abs(indice)];
	}
}
