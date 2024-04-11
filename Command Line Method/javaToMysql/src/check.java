//Setting up a connection between java and mysql database to get all data from a table
import java.sql.*;

public class check {
	public static void main(String arg[])
	{
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			//change "japaneseDB" in the url with your database name
			//change "sqluser" with your mysql username
			//change "password" with your mysql password
			connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/japaneseDB",
				"sqluser", "password");

			Statement statement;
			statement = connection.createStatement();
			ResultSet resultSet;

			//change "hirawords" with your table name
			resultSet = statement.executeQuery(
				"select * from hirawords");

			//change any of "english", "romaji", "hiragana", "paths", "hint" with your columns names
			String english;
			String romaji;
			String hiragana;
			String paths;
			String hint;

			while (resultSet.next()) {
				english = resultSet.getString("english").trim();
				romaji = resultSet.getString("romaji").trim();
				hiragana = resultSet.getString("hiragana").trim();
				paths = resultSet.getString("paths").trim();
				hint = resultSet.getString("hint").trim();
			

				System.out.println("english : " + english
								+ " romaji : " + romaji
								+ " hiragana : " + hiragana
								+ " paths : " + paths
								+ " hint : " + hint);
			}
			resultSet.close();
			statement.close();
			connection.close();
		}
		catch (Exception exception) {
			System.out.println(exception);
		}
	} 
}