package br.com.k19.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection createConnection() {

		String stringDeConexao = "jdbc:mysql://localhost:3306/livraria";

		String usuario = "root";
		String senha = "root";

		Connection conexao = null;

		try {

			conexao = DriverManager.getConnection(stringDeConexao, usuario, senha);

		} catch (SQLException e) {

			e.printStackTrace();

		}

		return conexao;

	}
}
