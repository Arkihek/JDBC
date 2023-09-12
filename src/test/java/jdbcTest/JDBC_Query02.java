package jdbcTest;

import java.sql.*;

public class JDBC_Query02 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Bir JDBC sorgusu yapilmak istendiginde yapilacak ilk is
        // Database yoneticisi ile iletisime gecerek ilgili Database'in Access'lerini almak olacaktir.

          /*
        Wonder World College Database Access Information
        type : jdbc:mysql
        host/ip : 194.140.198.209
        port : 3306
        database_name : wonderworld_qa2
        username : wonderworld_qawcollegeuser
        password :1gvyfx6#Q

        URL: "jdbc:mysql://194.140.198.209/wonderworld_qa2";
        USERNAME= "wonderworld_qawcollegeuser";
        PASSWORD="1gvyfx6#Q";
         */

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://194.140.198.209/wonderworld_qa2", "wonderworld_qawcollegeuser", "1gvyfx6#Q");

        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        String query = "SELECT * FROM wonderworld_qa2.staff";
        ResultSet resultSet = statement.executeQuery(query);

        resultSet.next();
        System.out.println(resultSet.getString("name"));

        resultSet.absolute(5);
        System.out.println(resultSet.getString("name"));

        resultSet.absolute(6);
        System.out.println(resultSet.getString("surname"));

        resultSet.first();
        System.out.println(resultSet.getString("surname"));


    }
}
