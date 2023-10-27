/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.web.mvc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author yorlysoropeza <yorlysoro@gmail.com>
 */
public class ProductsModel {
    private DataSource sourceData;
    
    public ProductsModel(DataSource sourceData){
        this.sourceData = sourceData;
    }
    
    public List<Products> getProducts() throws Exception{
        List<Products> products = new ArrayList<>();
        Connection myConn = null;
        Statement myStatement = null;
        ResultSet myResult = null;
        
        myConn = sourceData.getConnection();
        
        String querySql = "SELECT * FROM products";
        myStatement = myConn.createStatement();
        
        myResult = myStatement.executeQuery(querySql);
        
        while(myResult.next()){
            Integer id = myResult.getInt("id");
            String name = myResult.getString("name");
            String code = myResult.getString("code");
            Double price = myResult.getDouble("price");
            Date date = myResult.getDate("date");
            String section = myResult.getString("section");
            Boolean is_imported = myResult.getBoolean("is_imported");
            String country = myResult.getString("country");
            Products product = new Products(id, name, code, price, date, section, is_imported, country);
            products.add(product);
        }
        
        return products;
    }
}
