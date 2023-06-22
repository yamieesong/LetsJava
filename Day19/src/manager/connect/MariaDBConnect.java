package manager.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MariaDBConnect {

    private static Connection conn = null;

    public static Connection getConnection() throws SQLException, ClassNotFoundException {	//커넥션 가져오는 부분

        if(conn == null) {
            Class.forName("org.mariadb.jdbc.Driver");
            conn =  DriverManager.getConnection(
                    "jdbc:mariadb://javalec.cjimpzwx6dik.ap-northeast-2.rds.amazonaws.com:3306/javaProject",
                    "admin",
                    "Qhdial1!"
            );
        }
        return conn;
    }


    public static void closeConnection() throws SQLException {
        if(!conn.isClosed()) conn.close();
    }
}
