package application;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;

import dataBase.DB;
import dataBase.DBIntegrityException;

//setAutoCommit(false) se true, cada operacao isolada vai ser confirmada automaticamente, se false somente se for confirmada
//commit() confirma a transacao
//rollback() desfaz o que ja foi feito at'e o momento

public class TransationDB {
    public static void main(String[] args) {

        DB db = new DB();

        Statement st = null;

        try {
            db.connectDB();
            db.getConn().setAutoCommit(false);
            st = db.getConn().createStatement();
            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");
            int x = 1;
            if (x < 2) {
                throw new SQLException("Fake error");
            }
            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

            db.getConn().commit();

            System.out.println("Rows1" + rows1);
            System.out.println("Rows2" + rows2);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                db.getConn().rollback();
                throw new DBIntegrityException("Transation rolled back! Caused by " + e.getMessage());
            } catch (SQLException e1) {
                e1.getMessage();
            }
        } finally {
            db.closeDatabase();
        }

    }
}
