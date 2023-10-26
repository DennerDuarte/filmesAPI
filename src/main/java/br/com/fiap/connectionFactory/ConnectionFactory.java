package br.com.fiap.connectionFactory;

import java.sql.*;

public class ConnectionFactory {
	
	private static String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
	private static String user = "rm551938";
	private static String senha = "080105";
	
	private static Connection conexao;

	public static Connection getConnection() throws SQLException {
		
		  if(conexao == null || conexao.isClosed()){
	            conexao = DriverManager.getConnection(url, user, senha);
	        }
	        return conexao;
	}

}