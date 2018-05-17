package Joguinho;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FabricaEmbaralhador 
{
	private static List<Embaralhador> retornaEmbaralhador = new ArrayList<Embaralhador>();
	
	static
	{
		retornaEmbaralhador.add(new Embaralhador1());
		retornaEmbaralhador.add(new Embaralhador2());
	}
	
	public static Embaralhador getRandom()
	{
		Random r = new Random(System.currentTimeMillis());
		int referencia = r.nextInt();
		int indice = referencia %  retornaEmbaralhador.size();
		return retornaEmbaralhador.get(Math.abs(indice));
	}
}
