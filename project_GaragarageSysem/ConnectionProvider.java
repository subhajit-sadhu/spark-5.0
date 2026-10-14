package Main_course.project_GaragarageSysem;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

    public static Connection getConnection() {

        try {

            Connection con = DriverManager.getConnection(
                    "jdbc:mariadb://localhost:3306/Garage_db",
                    "root",
                    "12345"
            );

            return con;

        } catch (Exception e) {

            e.printStackTrace();
            return null;
        }
    }
}
