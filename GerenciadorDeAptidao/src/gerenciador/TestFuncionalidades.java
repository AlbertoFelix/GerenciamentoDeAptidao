package gerenciador;

import java.io.*;

public class TestFuncionalidades {

	public static void main(String[] args) {
		
		ExtrairDados dados = new ExtrairDados();
		
		
		dados.criaAlunos("Alfredo");
		dados.criaAlunos("Leonardo");
		dados.criaAlunos("Daniel");
		dados.criaAlunos("Alberto");
		
		
		dados.criarTopico("programador","Algoritmos e Programação",4,"Ciências do Ambiente",4);
		dados.criarTopico("eletrônica","Sistemas Digitais I", 3,"Inglês Instrumental", 5);
		dados.imprimirTudo("Algoritmos e Programação","programador");
		dados.imprimirTudo("Sistemas Digitais I","eletrônica");
	}

}
