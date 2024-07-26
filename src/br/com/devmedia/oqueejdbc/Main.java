package br.com.devmedia.oqueejdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String args[]) {

        try {
            //Class.forName("com.mysql.jdbc.Driver");
            //Connection connection = DriverManager.getConnection(
            // As configuracoes abaixo podem ser diferentes no seu computador
            //        "jdbc:mysql://localhost:3306/primeiraappjdbc",
            //        "root",
            //        "");

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            Connection connection = DriverManager.getConnection(
                    // As configuracoes abaixo podem ser diferentes no seu computador
                    "jdbc:sqlserver://localhost:49754;databaseName=primeiraappjdbc;user=sa;password=;");
            Statement statement = connection.createStatement();
            statement.executeQuery("SELECT * FROM usuarios");
            ResultSet set = statement.getResultSet();

            while (set.next()) {
                System.out.printf("%d: %15s - %10s\n",
                        set.getInt("id"),
                        set.getString("nome"),
                        set.getString("email"));
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
