package com.nah.newandhand.service;

import com.nah.newandhand.model.Product;

import java.util.List;

public interface ProductService {

    Product saveProduct(Product pro);

    Product updateProduct(Product pro);

    void deleteProduct(Long id);

    Product getProduct(Long id);

    List<Product> listProduct();
}
