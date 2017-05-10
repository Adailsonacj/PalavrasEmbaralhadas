package mecanica;

import Dados.BancoDePalavras;

public class TresTentativas implements MecanicaDoJogo
{

	private int qtdPalavrasAcertadas = 0;
	private BancoDePalavras banco = new BancoDePalavras();
	private String palavraCorrente = banco.getNext();
	private int pontos = 0;
	
	@Override
	public String getNome() 
	{
		return "Tente a vontade com tres palavras";
	}

	@Override
	public String getDescricao()
	{
		return "Faça o máximo de pontos..";
	}

	@Override
	public boolean jogoAcabou() 
	{
		if(qtdPalavrasAcertadas == 3)
		{
			return false;
		}else
			return true;
	}

	@Override
	public String getPalavraDaRodada() 
	{
		return palavraCorrente;
	}

	@Override
	public String tentativa(String palavra, String resposta) 
	{
		if(palavra.equals(resposta))
		{	
			pontos +=100;
			palavraCorrente = banco.getNext();
			qtdPalavrasAcertadas++;
			return "Acertou!! + 100 Pontos";
		}else
		{
			pontos -=50;
			return "Tente Novamente!!";
		}
	}

	@Override
	public String resultadoFinal()
	{
		return "Voce conseguiu "+pontos+" pontos!";
	}

}
