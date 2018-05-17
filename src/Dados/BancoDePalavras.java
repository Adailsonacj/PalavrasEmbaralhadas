package Dados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
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
	/*
    public String getNext() {
        ArrayList cidades = new ArrayList();

        try {
            FileReader Reader = new FileReader("/Dados/cidadesTocantins.txt");
            BufferedReader buffer = new BufferedReader(Reader);
            String linha = null;

            while((linha = buffer.readLine()) != null) {
                cidades.add(linha);
                System.out.println(linha);
            }
        } catch (Exception var5) {
            ;
        }

        Random r = new Random(System.currentTimeMillis());
        int referencia = r.nextInt();
        return ((String)cidades.get(1)).toString();
    }
    */
}
