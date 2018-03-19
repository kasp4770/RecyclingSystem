package Database;

import java.io.*;
import java.sql.*;

public class DB_Statements {

    private static Statement stmt = null;
    private static Connection con = DB_Connector.connect();
    private static ResultSet rs = null;
    private static PreparedStatement pst = null;

    public void retrieveData(char type) {

        String query = "select refund_price from recycling_types where LOWER(recycling_char) = LOWER('" + type + "');";

        try{
            //  Create a Statement
            stmt = con.createStatement();

            //  Execute the ResultSet
            rs = stmt.executeQuery(query);

            //  Return all rows from the table  //COPY/PASTE FRA ANDET PROJEKT. SKAL RETTES HERFRA.
            while(rs.next()) {
                byte[] st = (byte[]) rs.getObject(2);
                ByteArrayInputStream baip = new ByteArrayInputStream(st);
                ObjectInputStream ois = new ObjectInputStream(baip);
                Employee emp = (Employee) ois.readObject();
                System.out.println("\n" + emp.toString());

            }

            System.out.println("\n--Retrieve executed--");
        }
        //  Handle all possible exceptions
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("\n--Retrieve did not execute--");
        }
    }
}
