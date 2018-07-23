package br.com.curso.alura.java.testajavaio03;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class EntradaDeUmArquivo {
	
        public static void main(String[] args) throws IOException {
        	InputStream is = System.in;
            Scanner entrada = new Scanner(is);

            System.out.println("Digite sua mensagem:");
            while (entrada.hasNextLine()) {
                System.out.println(entrada.nextLine());
            }
            entrada.close();
        }

}
