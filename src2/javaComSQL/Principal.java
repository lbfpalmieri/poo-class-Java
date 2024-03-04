package javaComSQL;
import java.sql.Connection;
import java.sql.DriverManager;

public class Principal {

	public static void main(String[] args) {
		
		final String usuario = "postgres";
		final String senha = "12345";
		final String url = "jdbc:postgresql://localhost:5432/postgres";
		final String driverBanco = "org.postgresql.Driver";
		
		try {
			Class.forName(driverBanco);
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			System.out.println("Conexao ok");
		}catch(Exception exception) {
			System.out.println("Erro na conexao com o Banco de dados");
		}

	}

}
