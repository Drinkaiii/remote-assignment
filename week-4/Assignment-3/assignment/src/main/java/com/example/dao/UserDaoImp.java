package com.example.dao;

import com.example.proj.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.*;

@Repository
public class UserDaoImp implements UserDao {

    @Value("${spring.datasource.url}")
    String urlSQL;
    @Value("${spring.datasource.username}")
    String usernameSQL;
    @Value("${spring.datasource.password}")
    String passwordSQL;

    @Override
    public User getUserById(int id)  {

        User user = null;
        try(
            //connect to MySQL server
            Connection conn = DriverManager.getConnection(urlSQL,usernameSQL,passwordSQL);
            //create PreparedStatment object
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM `user` WHERE `id` = ?")
        ){
            //query data from object
            pstmt.setInt(1,id);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                user = new User();
                user.setId(rs.getInt(1));
                user.setEmail(rs.getString(2));
                user.setPassword(rs.getString(3));
            }
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
        return user;
    }

    @Override
    public User getUserByEmail(String email)  {

        User user = null;
        try(
                //connect to MySQL server
                Connection conn = DriverManager.getConnection(urlSQL,usernameSQL,passwordSQL);
                //create PreparedStatment object
                PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM `user` WHERE `email` = ?")

        ){
            //query data from object
            pstmt.setString(1,email);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                user = new User();
                user.setId(rs.getInt(1));
                user.setEmail(rs.getString(2));
                user.setPassword(rs.getString(3));
            }
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
        return user;
    }

    @Override
    public String setUser(String email, String password){
        try(
                Connection conn = DriverManager.getConnection(urlSQL,usernameSQL,passwordSQL);
                PreparedStatement pstmt = conn.prepareStatement("INSERT INTO `user` (`email`,`password`) VALUE (?,?)")
        ){
            pstmt.setString(1,email);
            pstmt.setString(2,password);
            pstmt.executeUpdate();

        }catch (SQLException e){
            return "Something went wrong: "+ new RuntimeException(e);
        }
        return "Success to set the user.";
    }
}
