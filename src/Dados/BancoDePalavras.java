package Dados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

public class BancoDePalavras {

    private String[] palavras = {"GATO", "CACHORRO", "PATO", "GAIVOTA", "LEAO", "BALEIA", "ZEBRA", "PEIXE", "TUCANO"};

    /*
        public String getNext()
        {
            Random r = new Random(System.currentTimeMillis());
            int referencia = r.nextInt();
            int indice = referencia %  palavras.length-1;
            return palavras[Math.abs(indice)];
        }
        /*/
    public String getNext() {
        ArrayList cidades = new ArrayList();
        int numeroSelecionado = 0;

        try {
            FileReader reader = new FileReader("src/cidadesTocantins.txt");
            BufferedReader buffer = new BufferedReader(reader);
            String linha = null;
            while((linha = buffer.readLine())!=null){
                cidades.add(linha);
            }
        } catch (Exception e) {
            System.out.println("Deu pau");
        }
        Random ran = new Random();
        numeroSelecionado = ran.nextInt(cidades.size());

        return cidades.get(numeroSelecionado).toString().toUpperCase();
    }
}
