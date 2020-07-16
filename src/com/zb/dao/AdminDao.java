package com.zb.dao;

import com.zb.pojo.User;
import com.zb.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.*;

public class AdminDao {
    public List<User> findAll() {
        //丁海杨编写
        Connection conn= DBUtils.getConnectionByDatasource();
        try {
            String sql ="select  * from users";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            User user = null;
            List<User> list =new ArrayList<User>();
            while (rs.next()) {
                user = new User();
                user.setIDnumber(rs.getString("IDnumber"));
                user.setMoney(rs.getInt("money"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setPhone(rs.getString("phone"));
                user.setAddress(rs.getString("address"));
                list.add(user);
            }
            return list;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            DBUtils.close(conn);
        }
        return null;
    }

    public void deleteById(Integer IDnumber){
        Connection conn=DBUtils.getConnectionByDatasource();
        try{
            String sql="delete from users where IDnumber=?";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setInt(1,IDnumber);
            ps.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            DBUtils.close(conn);
        }
    }

}
