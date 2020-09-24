package com.miki;

public class MySQLConnection extends DBConnection{
    @Override
    public String getConnection() {
        return "mysql数据库连接";
    }
}
