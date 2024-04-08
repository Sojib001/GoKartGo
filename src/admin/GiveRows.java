
package admin;
import Connection.myconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Connection.myconnection;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Timestamp;


public class GiveRows {


    public int countRows() {
    int rowCount = 0;
    Connection con = myconnection.getConnection();
    try {
            Statement st;
            ResultSet rs;
            st = con.createStatement();
            rs = st.executeQuery("SELECT COUNT(*) FROM kart");
            if (rs.next()) {
            rowCount = rs.getInt(1); // The count will be in the first column of the result set.
    }
    } catch (SQLException ex) {
    Logger.getLogger(GiveRows.class.getName()).log(Level.SEVERE, null, ex);
    }
    return rowCount;
    }
}
