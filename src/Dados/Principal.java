package Dados;

import java.util.Scanner;
import Joguinho.Embaralhador;
import Joguinho.FabricaEmbaralhador;
import mecanica.FabricaMecanicaDoJogo;
import mecanica.MecanicaDoJogo;

public class Principal 
{

	private static Scanner s;

	public static void main(String...args) 
	{
		MecanicaDoJogo mecanica = FabricaMecanicaDoJogo.get();
		s = new Scanner(System.in);
		
		System.out.println("Embaralhador de Palavras");
		System.out.println("Modo de Jogo: "+mecanica.getNome()+ "\n");
		System.out.println("Descrição: "+mecanica.getDescricao()+ "\n"+ "\n");
	
		while(mecanica.jogoAcabou())
		{
			String palavra = mecanica.getPalavraDaRodada();
			Embaralhador emb = FabricaEmbaralhador.getRandom();
			String embaralhada = emb.embaralhar(palavra);
			System.out.println("Advinhe a palavra: "+embaralhada);
			String resposta = s.nextLine();
			String resultado = mecanica.tentativa(palavra , resposta);
			System.out.println(resultado);
		}
		System.out.println(mecanica.resultadoFinal());
	}
}