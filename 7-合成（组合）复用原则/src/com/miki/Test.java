package com.miki;

public class Test {
    public static void main(String[] args) {
        ProductDao dao = new ProductDao();
        dao.setDbConnection(new MySQLConnection());
        dao.addProduct();
    }
}
