/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dal.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Users;

/**
 *
 * @author admin
 */
public class UsersDao extends DBContext {

    PreparedStatement ps = null; //=> preparedStament => de thuc thi thi du lieu
    ResultSet rs = null; //=> ket qua de hung lay du lieu

    public Users getUserByUserNameAndPassword(String userName, String password) {
        String query = "SELECT *\n"
                + "  FROM [PRJ302].[dbo].[Users]\n"
                + " WHERE Users.user_name = ? and Users.password = ?";
        
        try {

            ps = connection.prepareStatement(query);
            ps.setString(1, userName);
            ps.setString(2, password);

            rs = ps.executeQuery();

            if (rs.next()) {
                return new Users(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6),
                        rs.getString(7), rs.getInt(8), rs.getInt(9), rs.getInt(10));
            }

        } catch (SQLException exception) {
            System.out.println(exception);
        }
        return null;
    }

    public List<Users> getAll() {
        String query = "SELECT *\n"
                + "  FROM [PRJ302].[dbo].[Users]\n";

        List<Users> list = new ArrayList<>();
        try {

            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Users(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6),
                        rs.getString(7), rs.getInt(8), rs.getInt(9), rs.getInt(10)));
            }

        } catch (SQLException exception) {
            System.out.println(exception);
        }
        return list;
    }

    public static void main(String[] args) {
        UsersDao usersDao = new UsersDao();
        for (Users users : usersDao.getAll()) {
            System.out.println(users.toString());
        }
    }
}
