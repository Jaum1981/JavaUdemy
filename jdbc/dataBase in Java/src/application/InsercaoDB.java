package application;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import dataBase.DB;

public class InsercaoDB {
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
                    , Statement.RETURN_GENERATED_KEYS);
            st.setString(1, "Jaum das Neves");
            st.setString(2, "jaumdasneves@gmail.com");
            st.setDate(3, new java.sql.Date(sdf.parse("28/09/2002").getTime()));
            st.setDouble(4, 13463.0);
            st.setInt(5, 2);

            int rowsAffected = st.executeUpdate();
            if (rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys(); // gera um resultset que atribu'i em rs
                while (rs.next()) {
                    int id = rs.getInt(1); // posicao pois 'e uma tabela
                    System.out.println("Done! Id: " + id);
                }
            } else {
                System.out.println("No rows affected");
            }

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
