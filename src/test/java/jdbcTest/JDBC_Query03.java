package jdbcTest;

import reusableMethodJDBC.ReusableMethod;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Query03 {

    public static void main(String[] args) throws SQLException {

        Statement statement = ReusableMethod.setUpStatement(ReusableMethod.setUpConnection());

        String query = "SELECT * FROM wonderworld_qa2.staff";
        ResultSet resultSet = statement.executeQuery(query);

        resultSet.next();
        System.out.println(resultSet.getString("name"));

        resultSet.absolute(7);
        System.out.println(resultSet.getString("surname"));

    }
}
