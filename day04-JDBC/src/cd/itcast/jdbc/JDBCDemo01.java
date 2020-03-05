package cd.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo01 {
    public static void main(String[] args) throws Exception {
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获取数据库的连接对象
        Connection root = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "sx1499135121.");
        //定义sql语句
        String sql = "INSERT INTO `person`(`name`, `age`, `nick_name`, `brithday`) VALUES ('ha',22,'ah',2019)";
        //5.获取执行sql的对象 Statement
        Statement stmt = root.createStatement();
        //6.执行sql
        int count = stmt.executeUpdate(sql);
        //7.处理结果
        System.out.println(count);
        //8.释放资源
        stmt.close();
        root.close();

    }
}
