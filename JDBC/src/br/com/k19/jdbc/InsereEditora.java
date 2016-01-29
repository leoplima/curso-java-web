package br.com.k19.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsereEditora {

	public static void main(String[] args) {

		System.out.println(" Abrindo conexão ... ");
		// iciando a conexao com a base

		try {
			Connection conexao = ConnectionFactory.createConnection();

			// lendo as entradas do usuario no console
			Scanner entrada = new Scanner(System.in);

			System.out.println(" Digite o nome da editora : ");
			String nome = entrada.nextLine();

			System.out.println(" Digite o email da editora : ");
			String email = entrada.nextLine();

			// fim das entradas pelo usuário
			entrada.close();

			// comando sql a ser executado
			String sql = "INSERT INTO Editora ( nome , email ) " +

			" VALUES (?, ?) ";
			// praparando o comando para ser executado
			PreparedStatement comando = conexao.prepareStatement(sql);

			// tratando as entradas do usuario
			comando.setString(1, nome);
			comando.setString(2, email);

			System.out.println(" Executando comando ... ");

			// ordenando a execucao do comando
			comando.execute();

			System.out.println(" Fechando conexão ... ");

			// finalizando a execucao
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
