/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admin;



import java.sql.ResultSet;
import java.sql.SQLException;


public class donationinfo {

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the loc
     */
    public String getLoc() {
        return loc;
    }

    /**
     * @param loc the loc to set
     */
    public void setLoc(String loc) {
        this.loc = loc;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the pp
     */
    public byte[] getPp() {
        return pp;
    }

    /**
     * @param pp the pp to set
     */
    public void setPp(byte[] pp) {
        this.pp = pp;
    }

    public int id;
    public String name;
    public String loc;
    public String email;
    public String type;
    public String phone;
    
    public byte[] pp;

    public donationinfo() {
    }

    private void initialize_data(int id, String name, String type, String loc, String email, String phone, byte[] pp){
        this.id= id;
        this.name = name;
        this.loc=(loc);
        this.type = type;
        this.phone = phone;
        this.pp=(pp);        this.email = email;
;
    }
    public donationinfo(int id, String name, String type, String loc, String email, String phone, byte[] pp) {
        initialize_data( id, name, type,  loc,  email,  phone,  pp);
    }

    
    public donationinfo(ResultSet rs) throws SQLException {
        try {
            int comp = rs.getInt("Donator_Company_ID");
            String jobti = rs.getString("Donator_Company_Name");
            String loca = rs.getString("Location");
            String jobde = rs.getString("Email");
            String quali = rs.getString("Phone");
            String dln = rs.getString("Type");
            byte[] ppi=rs.getBytes("LOGO");
            initialize_data(comp, jobti, loca, jobde, quali, dln, ppi);
        } catch (SQLException e) {
            throw e;
        }

    }
    

    

  

  

  
   
}