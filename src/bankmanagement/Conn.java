package bankmanagement;

import java.sql.*;


public class Conn {
    Connection conn;
    Statement s;

    public Conn(){
        try{  
            Class.forName("com.mysql.jdbc.driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking", "system", ""); 
            s =conn.createStatement(); 
            ResultSet rs = s.executeQuery("SHOW TABLES");
            while (rs.next()) {
                String tableName = rs.getString(1);
                System.out.println(tableName);
            }
            
        }catch(Exception e){ 
            System.out.println(e);
        }  

    }
   
}
