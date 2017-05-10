package Joguinho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Embaralhador1 implements Embaralhador{

	@Override
	public String embaralhar(String palavra) {
			List<String> letters = new ArrayList<String>();
		    String temp = "";

		    for (int i = 0; i < palavra.length(); i++) {
		        letters.add(String.valueOf(palavra.charAt(i)));
		    }
		    System.out.println("");

		    Collections.shuffle(letters);

		    for (int i = 0; i <palavra.length(); i++) {
		        temp += letters.get(i);
		    }
		    return temp;
	}

}
