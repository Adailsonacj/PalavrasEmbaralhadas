package Joguinho;

import java.util.Random;

public class Embaralhador2 implements Embaralhador 
{

	@Override
	public String embaralhar(String palavra) 
	{
		Random r = new Random();
    	StringBuilder org = new StringBuilder(palavra);
    	StringBuilder fim = new StringBuilder();    	
    	int tamanho = org.length();
    	for (int i=0;i<tamanho;i++)
    	{
    		int rch = r.nextInt(org.length());
    		fim.append(org.charAt(rch));
    		org = org.deleteCharAt(rch);
    	}    	
    	return fim.toString();    	 
    }
}
