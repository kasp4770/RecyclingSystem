package Database;

import Model.Item;

import java.io.*;
import java.sql.*;

public class DB_Statements {

    private static Statement stmt = null;
    public static Connection con = DB_Connector.connect();
    private static ResultSet rs = null;
    private static PreparedStatement pst = null;
    private Item item;

    public void setPrice(char type) {
        double price = 0;
        String query = "select refund_price from recycling_types where LOWER(recycling_char) = LOWER('" + type + "');";
        try{
            //  Create a Statement
            stmt = con.createStatement();

            //  Execute the ResultSet
            rs = stmt.executeQuery(query);

            //  Return all rows from the table
            while(rs.next()) {
                price = rs.getDouble(1);

            }

            System.out.println("\n--Retrieve executed--");

        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("\n--Retrieve did not execute--");
        }
    }

    public double retrievePrice(char type){

        double price = 0;
        String query = "select refund_price from recycling_types where LOWER(recycling_char) = LOWER('" + type + "');";

        try{
            //  Create a Statement
            stmt = con.createStatement();

            //  Execute the ResultSet
            rs = stmt.executeQuery(query);

            //  Return all rows from the table
            while(rs.next()) {
                price = rs.getDouble(1);
            }
            System.out.println("\n--Retrieve executed--");
            return price;
        }

        //  Handle all possible exceptions
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("\n--Retrieve did not execute--");
        }
        return price;
    }
}
