package gerenciador;

import java.io.*;

public class TestFuncionalidades {

	public static void main(String[] args) {
		
		ExtrairDados dados= new ExtrairDados();
		
		
		dados.criaAlunos("Alfredo");
		dados.criaAlunos("Leonardo");
		dados.criaAlunos("Daniel");
		dados.criaAlunos("Alberto");
		dados.imprimirTudo("Algoritmos e Programa��o");
		
	}

}