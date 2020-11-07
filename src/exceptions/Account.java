package exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Jay
 */
public class Account {

    public Connection getConn() throws SQLException {
        String url = "jdbc:msql://localhost:3306/";
        String user = "abc";
        String password = "code";
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            connection.close();
        }

        return connection;
    }

    public void withdraw(int amount)  {
        try {
            getConn();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println("Withdraw " + amount);
    }
    public void deposit(int amount){
        withdraw(amount);
    }

}
