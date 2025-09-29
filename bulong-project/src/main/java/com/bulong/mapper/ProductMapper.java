package main.java.com.bulong.mapper;

import java.util.List;

import com.bulong.model.Product;

public interface ProductMapper {

    void createTable();

    int insertProduct(Product product);

    Product selectById(Long id);

    List<Product> selectAll;

    int updateProduct(Long id);
    
}
