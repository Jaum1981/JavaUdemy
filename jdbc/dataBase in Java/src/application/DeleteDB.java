package application;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dataBase.DB;
import dataBase.DBIntegrityException;

public class DeleteDB {
    public static void main(String[] args) {

        DB db = new DB();
        PreparedStatement st = null;

        try {
            db.connectDB();
            st = db.getConn().prepareStatement(
                    "DELETE FROM department "
                            + "WHERE "
                            + "Id = ?");

            st.setInt(1, 2);

            int rowsAffected = st.executeUpdate();
            System.out.println("Rows Affected: " + rowsAffected);

        } catch (SQLException e) {
            e.printStackTrace();
            throw new DBIntegrityException(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            db.closeStatement(st);
            db.closeDatabase();
        }

    }
}
