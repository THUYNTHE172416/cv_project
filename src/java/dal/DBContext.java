package dal;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBContext {
    protected Connection connection;
    public DBContext()
    {
        try {
            String user = "root";
            String pass = "knLasXPcWEGKMyDaljZOnjoCgbvhDNhO";
            String url = "jdbc:mysql://kodama.proxy.rlwy.net:23261/railway?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args) {
        System.out.println(new DBContext().connection);
        }
    }
