package mecanica;

import Dados.BancoDePalavras;
import mecanica.MecanicaDoJogo;

public class MorteSubita implements MecanicaDoJogo
{
    private int palavrasCertas = 0;
    private int pontos = 0;
    private boolean errou = true;
    private BancoDePalavras banco = new BancoDePalavras();

    public MorteSubita() {
    }

    public String getNome() {
        return "MORTE SUBITA";
    }

    public String getDescricao() {
        return "Você só tem uma vida, cuide bem dela!.. \n Cada palavra acertada você ganha 100 pontos! \n Se errar, são tirados 25 pontos!";
    }

    public boolean jogoAcabou() {
        return this.errou;
    }

    public String getPalavraDaRodada() {
        return this.banco.getNext();
    }

    public String tentativa(String palavra, String resposta) {
        if (palavra.toUpperCase().equals(resposta.toUpperCase())) {
            ++this.palavrasCertas;
            this.pontos += 100;
            return "Acertou!!";
        } else {
            this.pontos -= 25;
            this.errou = false;
            return "Errou!!";
        }
    }

    public String resultadoFinal() {
        if (this.pontos < 0) {
            this.pontos = 0;
        }

        return "\n ########FIM DE JOGO####### \n Você conseguiu " + this.pontos + " pontos! \n Acertou " + this.palavrasCertas + " palavras";
    }
}