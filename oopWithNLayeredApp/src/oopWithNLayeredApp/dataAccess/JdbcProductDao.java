package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

// DAO  ---> Data Access Object -->  Veri tabani nesnesi
public class JdbcProductDao {

    public void add(Product product) {
        // sadece db erişim kodlaı buraya yazılır... SQL
        System.out.println("JDBC ile veri tabanina eklendi.");
    }

}

// Hibernate

