package br.com.curso.alura.java.testajavaio02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class testaIO02 {public static void main(String[] args) throws IOException {
	InputStream is = new FileInputStream("arquivo.txt");
	InputStreamReader isr = new InputStreamReader(is);
	BufferedReader br = new BufferedReader(isr);
	System.out.println("Digite sua mensagem:");
    String linha = br.readLine(); // primeira linha

    while (linha != null) {
        System.out.println(linha);
        linha = br.readLine();
    	}

    br.close();
    }

}
