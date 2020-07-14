package com.zb.dao;

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
        User door = new User();
        List<Door> list = new ArrayList<>();
        while (rs.next()){
            door = new Door();
            door.setId(rs.getInt("id"));
            door.setName(rs.getString("name"));
            door.setTel(rs.getString("tel"));
            door.setAddr(rs.getString("addr"));
            list.add(door);
        }
        System.out.println(list);
        DBUtils.close(conn);
        return list;
    }
}
