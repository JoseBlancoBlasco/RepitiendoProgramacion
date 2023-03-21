
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Test1 {

    public static void main(String[] args) throws SQLException {
        String uname = "root";
        String password = "@MySQL085569";
        String url = "jdbc:mysql://localhost:3306/University";
        String query = "select Student_ID, Department, First_Name, Last_Name, PassOutYear, UniversityRank from EngineeringStudents where Student_Id = 10211;";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        try{
            Connection con = DriverManager.getConnection(url, uname, password);
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery(query);
            ResultSetMetaData metaData = result.getMetaData();
            int columnCount = metaData.getColumnCount();
            
            while(result.next()){
                String UniversityData = "";
                for (int i = 1; i <=columnCount; i++) {
                    UniversityData += result.getString(i) + ":";                    
                }
                System.out.println("------------------------------------------------");
                System.out.println(UniversityData);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
