package gerenciador;

import java.io.*;

public class TestFuncionalidades {

	public static void main(String[] args) {
		
		ExtrairDados dados = new ExtrairDados();
		
		
		dados.criaAlunos("Alfredo");
		dados.criaAlunos("Leonardo");
		dados.criaAlunos("Daniel");
		dados.criaAlunos("Alberto");
		
		
		dados.criarTopico("programador","Algoritmos e Programa��o",4,"Ci�ncias do Ambiente",5);
		dados.criarTopico("eletr�nica","Sistemas Digitais I", 3,"Matem�tica B�sica", 4);
		//dados.imprimirTudo("Algoritmos e Programa��o","programador");
		dados.imprimirTudo("Sistemas Digitais I","eletr�nica");
	}

}
