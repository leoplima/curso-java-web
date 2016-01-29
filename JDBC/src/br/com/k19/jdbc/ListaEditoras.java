package br.com.k19.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ListaEditoras {

	public static void main(String[] args) {

		Connection conexao = ConnectionFactory.createConnection();

		try {

			System.out.println(" Abrindo conexão ... ");

			// comando sql a ser executado
			String sql = "Select * from Editora";

			// praparando o comando para ser executado
			PreparedStatement comando = conexao.prepareStatement(sql);

			System.out.println(" Executando comando ... ");

			// executando o comando e salvando na variavel resultado
			ResultSet resultado = comando.executeQuery();

			System.out.println("Resultados encontrados :\n");

			// percorrendo todos os registros da tabela
			while (resultado.next()) {
				System.out.printf(" %d : %s - %s \n ", resultado.getInt("id"), resultado.getString("nome"),
						resultado.getString("email"));
			}

			System.out.println(" Fechando conexão ... ");

			// finalizando a execucao
			conexao.close();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
