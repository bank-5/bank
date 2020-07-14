package com.zb.dao;

import com.zb.pojo.User;
import com.zb.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    public List<User> findAll() throws Exception{
        Connection conn = DBUtils.getConnectionByDatasource();
        String sql = "select * from users";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        User user = new User();
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
        System.out.println(list);
        DBUtils.close(conn);
        return list;
    }
}
