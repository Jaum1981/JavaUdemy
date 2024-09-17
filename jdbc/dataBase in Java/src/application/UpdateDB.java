package application;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dataBase.DB;

public class UpdateDB {
    public static void main(String[] args) {

        PreparedStatement st = null;
        DB db = new DB();

        try {
            db.connectDB();
            st = db.getConn().prepareStatement(
                    "UPDATE seller "
                            + "SET BaseSalary = BaseSalary + ? "
                            + "WHERE "
                            + "(DepartmentId = 2)",
                    Statement.RETURN_GENERATED_KEYS);

            st.setDouble(1, 200.0);

            int rowsAffected = st.executeUpdate();
            System.out.println(rowsAffected);

            if (rowsAffected > 0) { // n~ao ta entrando???
                ResultSet rs = st.getGeneratedKeys();
                while (rs.next()) {
                    String name = rs.getString("Name");
                    Double newSalary = rs.getDouble("BaseSalary");
                    System.out.println("Name: " + name + " New Salary: " + newSalary);
                }
            } else {
                System.out.println("No rows affected");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.closeStatement(st);
            db.closeDatabase();
        }
    }
}
