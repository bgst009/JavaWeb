package cd.itcast.jdbc;

import cd.itcast.jdbc.domain.person;
import cd.itcast.jdbc.util.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCDemo02 {
    public static void main(String[] args) {
        List<person> personList = new JDBCDemo02().FindAll();
        List<person> personList1 = new JDBCDemo02().FindAll();
        System.out.println(personList);
        System.out.println(personList1);

    }

    /**
     * 查询所有emp对象
     *
     * @return
     */
    public List<person> FindAll() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        List<person> personList = null;

        //1
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "sx1499135121.");
            String sql = "SELECT * FROM `person` WHERE 1";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            person p = null;
            personList = new ArrayList<person>();

            while (resultSet.next()) {
                String name = resultSet.getNString("name");
                String nk_name = resultSet.getNString("nick_name");
                int age = resultSet.getInt("age");
                String birthday = resultSet.getString("brithday");

//                System.out.println("name"+name);
//                System.out.println("nk_name"+nk_name);
//                System.out.println("age"+age);
//                System.out.println("birthday"+birthday);

                p = new person();
                p.setAge(age);
                p.setBirthday(birthday);
                p.setName(name);
                p.setNick_name(nk_name);
//p.toString();
                personList.add(p);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return personList;
    }


    /**
     * 演示JDBC工具类
     *
     * @return
     */
    public List<person> FindAll2() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        List<person> personList = null;

        //1
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            //connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "sx1499135121.");
            connection = JDBCUtils.getConnection();
            String sql = "SELECT * FROM `person` WHERE 1";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            person p = null;
            personList = new ArrayList<person>();

            while (resultSet.next()) {
                String name = resultSet.getNString("name");
                String nk_name = resultSet.getNString("nick_name");
                int age = resultSet.getInt("age");
                String birthday = resultSet.getString("brithday");

//                System.out.println("name"+name);
//                System.out.println("nk_name"+nk_name);
//                System.out.println("age"+age);
//                System.out.println("birthday"+birthday);

                p = new person();
                p.setAge(age);
                p.setBirthday(birthday);
                p.setName(name);
                p.setNick_name(nk_name);
//p.toString();
                personList.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
//            if(resultSet!=null){
//                try {
//                    resultSet.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (statement!=null){
//                try {
//                    statement.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//            if(connection!=null){
//                try {
//                    connection.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
            JDBCUtils.close(resultSet, statement, connection);
        }
        return personList;
    }
}