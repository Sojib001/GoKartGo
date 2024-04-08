/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admin;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Dell
 */
public class productinfo {
    
    
    public int pid;
    public String pname;
    public String pcatagory;
    public int pquantity;
    public float pprice;
    public String sup;
    public byte[] pp;
    
    public productinfo(){}
    
    private void initialize_data(int pid, String pname, String pcatagory, int pquantity, float pprice, String sup,byte[] pp){
        this.pid= pid;
        this.pname = pname;
        this.pcatagory= pcatagory;
        this.pquantity = pquantity;
        this.pprice = pprice;
        this.pp=(pp); 
        this.sup=sup;
;
    }
    public productinfo(int pid, String pname, String pcatagory, int pquantity, float pprice,String sup, byte[] pp) {
        initialize_data(  pid, pname, pcatagory, pquantity, pprice,sup, pp);
    }

    
    public productinfo(ResultSet rs) throws SQLException {
        try {
            int sid = rs.getInt("product_id");
            String sname = rs.getString("product_name");
            String scata = rs.getString("product_catagory");
            int squa = rs.getInt("product_quantity");
            float price = rs.getFloat("product_price");
            String kk=rs.getString("product_supplier");
            byte[] ppi=rs.getBytes("picture");
            initialize_data(  sid, sname, scata, squa, price,kk, ppi);
        } catch (SQLException e) {
            throw e;
        }

    }
}
