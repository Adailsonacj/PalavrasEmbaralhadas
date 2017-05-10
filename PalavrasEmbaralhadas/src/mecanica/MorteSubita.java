package mecanica;

import Dados.BancoDePalavras;
import mecanica.MecanicaDoJogo;

public class MorteSubita implements MecanicaDoJogo
{

	private int palavrasCertas = 0;
	private boolean errou = true;	
	private BancoDePalavras banco = new BancoDePalavras();
	
	@Override
	public String getNome()
	{
		
		return "MORTE SUBITA";
	}

	@Override
	public String getDescricao() 
	{
		return "TENTE ADVINHAR ATÉ ERRAR..";
	}

	@Override
	public boolean jogoAcabou() 
	{
		return errou;
	}

	@Override
	public String getPalavraDaRodada()
	{
		return banco.getNext();
	}

	@Override
	public String tentativa(String palavra, String resposta)
	{
		if(palavra.equals(resposta))
			{	
				palavrasCertas ++;
				return "Acertou!!";
			}else
			{
				errou = false;
				return "Errou!!";
			}
	}

	@Override
	public String resultadoFinal() 
	{
		return "Voce conseguiu acertar "+palavrasCertas+ " palavras.";
	}

}
