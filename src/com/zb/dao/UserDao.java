package com.zb.dao;

import com.zb.pojo.User;
import com.zb.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    //  刘子贤编写
    public List<User> findUser(User user) throws Exception{
        Connection conn = DBUtils.getConnectionByDatasource();
        String sql = "select * from users where username=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,user.getUsername());
        ResultSet rs = ps.executeQuery();
        List<User> list = new ArrayList<>();
        while (rs.next()){
            user = new User();
            user.setIDnumber(rs.getString("IDnumber"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setMoney(rs.getInt("money"));
            user.setAddress(rs.getString("address"));
            user.setPhone(rs.getString("phone"));
            list.add(user);
        }
        DBUtils.close(conn);
        return list;
    }

    //  刘子贤编写
    public void saveMoney(User user) throws SQLException{
        Connection conn = DBUtils.getConnectionByDatasource();
        String sql = "update users set money = money+? where IDnumber=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,user.getMoney());
        ps.setString(2,user.getIDnumber());
        ps.executeUpdate();
        DBUtils.close(conn);
    }

    //  刘子贤编写
    public void takeMoney(User user) throws SQLException{
        Connection conn = DBUtils.getConnectionByDatasource();
        String sql = "update users set money = money-? where IDnumber=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,user.getMoney());
        ps.setString(2,user.getIDnumber());
        ps.executeUpdate();
        DBUtils.close(conn);
    }

    //  刘子贤编写
    public void deleteByUsername(String username){
        Connection conn = null;
        try {
            conn = DBUtils.getConnectionByDatasource();
            String sql = "delete from users where username=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,username);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtils.close(conn);
        }
    }

    public User findByIDnumber(String IDnumber){
        User user=null;
        Connection conn = null;
        try {
            conn = DBUtils.getConnectionByDatasource();
            String sql = "select * from users where IDnumber=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,IDnumber);
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                user=new User();
                user.setIDnumber(rs.getString("IDnumber"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setMoney(rs.getInt("money"));
                user.setAddress(rs.getString("address"));
                user.setPhone(rs.getString("phone"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtils.close(conn);
        }
        return user;
    }

    public void updateByIDnumber(User user){
        Connection conn = null;
        try {
            conn = DBUtils.getConnectionByDatasource();
            String sql = "update users set username=?,password=?,money=?,address=?,phone=? where IDnumber=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,user.getUsername());
            ps.setString(2,user.getPassword());
            ps.setInt(3,user.getMoney());
            ps.setString(4,user.getAddress());
            ps.setString(5,user.getPhone());
            ps.setString(6,user.getIDnumber());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtils.close(conn);
        }
    }

}
