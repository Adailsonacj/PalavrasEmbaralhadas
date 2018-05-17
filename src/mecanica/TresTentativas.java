package mecanica;

import Dados.BancoDePalavras;

public class TresTentativas implements MecanicaDoJogo {
    private int qtdPalavrasAcertadas = 0;
    private int qtdErros = 0;
    private BancoDePalavras banco = new BancoDePalavras();
    private String palavraCorrente;
    private int pontos;

    public TresTentativas() {
        this.palavraCorrente = this.banco.getNext();
        this.pontos = 0;
    }

    public String getNome() {
        return "Tente a vontade com tres palavras";
    }

    public String getDescricao() {
        return "VOCÊ POSSUI TRÊS VIDAS.. <3 \n OS ESPAÇOS SÃO \"-\", PRESTE BASTANTE ATENÇÃO.";
    }

    public boolean jogoAcabou() {
        return this.qtdErros != 3;
    }

    public String getPalavraDaRodada() {
        return this.palavraCorrente;
    }

    public String tentativa(String palavra, String resposta) {
        if (palavra.equals(resposta)) {
            this.pontos += 100;
            this.palavraCorrente = this.banco.getNext();
            ++this.qtdPalavrasAcertadas;
            return "Acertou!! + 100 Pontos";
        } else {
            this.pontos -= 50;
            ++this.qtdErros;
            return "Tente Novamente!!";
        }
    }

    public String resultadoFinal() {
        if (this.pontos < 0) {
            this.pontos = 0;
        }

        return "\n ########FIM DE JOGO####### \n Você conseguiu " + this.pontos + " pontos! \n Acertou " + this.qtdPalavrasAcertadas + " palavras";
    }
}