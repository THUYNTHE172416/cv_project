package dal.userdao;

import dal.DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.User;
import utils.PasswordUtils;

public class LoginDao extends DAO {

    /**
     * Login method to check if the username and password are correct
     * @param username 
     * @param password
     * @return Object of User if login successful
     */
    public User login(String username, String password) {
        User u = findUserByUserNameOrEmail(username);
        // if user not found return null
        if (u == null) return u;
        // if finding then check password and password not match then return null
        if (!PasswordUtils.checkPassword(password, u.getPassword())) return null;
        return u;
    }
    
    /**
     * find an user by username or email
     * 
     * @param value value to check
     * @return user after finding || null
     */
    public User findUserByUserNameOrEmail (String value) {
        User u = null;
        String sql = "";
        int index = 1;
        try {
            PreparedStatement ps = this.connection.prepareStatement(sql);
            ps.setString(index++, value);
            ps.setString(index++, value);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                u = new User();
                
            }
        } catch (SQLException e) {
            this.status = e.getMessage();
        }
        return u;
    }
    
    public int register (User u) {
        int col = 0;
        String sql = "";

        try {
            PreparedStatement ps = this.connection.prepareStatement(sql);
        } catch (SQLException e) {
            this.status = e.getMessage();
        }
        return col;
    }

    public int changePassword(String userId, String newPassword) {
        int col = 0;
        String sql = "";
        try {
            PreparedStatement ps = this.connection.prepareStatement(sql);
            
        } catch (SQLException e) {
            System.out.println("Error change password: " + e.getMessage());
            this.status = e.getMessage();
        }
        return col;
    }
}
