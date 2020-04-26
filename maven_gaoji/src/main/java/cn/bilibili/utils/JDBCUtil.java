package cn.bilibili.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.mysql.jdbc.Connection;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtil {

    private static DataSource ds;

    static {
        try {
            //1.读取配置文件
            Properties pro = new Properties();
            InputStream is = JDBCUtil.class.getClassLoader().getResourceAsStream("druid.properties");
            pro.load(is);
            //2.获取数据源
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //获取数据源
    public static DataSource getDataSource(){
        return ds;
    }

    //获取数据库连接
    public static Connection getConnection() throws SQLException {
        return (Connection) ds.getConnection();
    }

}
