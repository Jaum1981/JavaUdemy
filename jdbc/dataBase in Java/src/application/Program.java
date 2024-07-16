package application;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import dataBase.DB;

public class Program {
    public static void main(String[] args) {

        PreparedStatement st = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        DB db = new DB();
        try {
            db.connectDB();
            st = db.getConn().prepareStatement(
                    "INSERT INTO seller "
                            + "(Name, Email, BirthDate, BaseSalary, Departmentid) "
                            + "VALUES"
                            + "(?, ?, ?, ?, ?)" // placeholder
            );
            st.setString(1, "Jaum das Neves");
            st.setString(2, "jaumdasneves@gmail.com");
            st.setDate(3, new java.sql.Date(sdf.parse("28/09/2002").getTime()));
            st.setDouble(4, 13463.0);
            st.setInt(5, 2);

            int rowsAffected = st.executeUpdate();
            System.err.println("Done! Rows affected: " + rowsAffected);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException pe) {
            pe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            db.closeStatement(st);
            db.closeDatabase();
        }
    }
}
