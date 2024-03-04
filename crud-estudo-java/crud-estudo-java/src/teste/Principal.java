package teste;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Principal {

	public static void main(String[] args) {
		
		final String usuario = "postgres";
		final String senha = "12345";
		final String url = "jdbc:postgresql://localhost:5432/dbAulaJavaComSql";
		final String instrucaoSelect = "SELECT id, nome\r\n"
				+ "	FROM public.\"Aluno\";";
		final String insertDados = "INSERT INTO public.\"Aluno\"(\r\n"
				+ "	id, nome)\r\n"
				+ "	VALUES (?, ?);";
		final String updateDados = "UPDATE public.\"Aluno\"\r\n"
				+ "	SET nome=?\r\n"
				+ "	WHERE id=?;";
		final String deleteDados = "DELETE FROM public.\"Aluno\"\r\n"
				+ "	WHERE id=?;";
		final String driverBanco = "org.postgresql.Driver";
		
		try {
			Class.forName(driverBanco);
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement preparedStatement = conexao.prepareStatement(insertDados);
			preparedStatement.setInt(1, 17);
			preparedStatement.setString(2, "Fredson");
			preparedStatement.executeUpdate();
			System.out.println("Insert SUCESSO");
			
			PreparedStatement preparedStatement2 = conexao.prepareStatement(updateDados);
			preparedStatement2.setString(1, "Clobervaldo Robert");
			preparedStatement2.setInt(2, 24);	
			preparedStatement2.executeUpdate();
			System.out.println("Update SUCESSO");
			
			PreparedStatement preparedStatement3 = conexao.prepareStatement(deleteDados);
			preparedStatement3.setInt(1, 12);	
			preparedStatement3.executeUpdate();
			System.out.println("Delete");

			
			Statement sentenca = conexao.createStatement();
			ResultSet rs = sentenca.executeQuery(instrucaoSelect);
			

			
			while (rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				System.out.println("Id: " + id + " - Nome: " + nome);
				
			}
			
			System.out.println("Consulta ok");
		}catch(Exception exception) {
			System.out.println(exception);
		}

	}

}