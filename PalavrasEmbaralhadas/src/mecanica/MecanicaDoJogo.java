package mecanica;

public interface MecanicaDoJogo {

	String getNome = null;

	String getNome();

	String getDescricao();

	boolean jogoAcabou();

	String getPalavraDaRodada();

	String tentativa(String palavra, String resposta);

	String resultadoFinal();

}
