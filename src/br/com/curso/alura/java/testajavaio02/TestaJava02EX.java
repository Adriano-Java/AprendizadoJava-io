package br.com.curso.alura.java.testajavaio02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestaJava02EX {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader(
                                    new FileInputStream("arquivo.txt")));

        String linha = br.readLine();

        while (linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }
        br.close();
    }

}
