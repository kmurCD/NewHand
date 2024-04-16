package com.nah.newandhand.service.impl;

import com.nah.newandhand.model.Product;
import com.nah.newandhand.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements com.nah.newandhand.service.ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product pro) {
        return productRepository.save(pro);
    }

    @Override
    public Product updateProduct(Product pro) {
        if (!productRepository.existsById(pro.getIdPro())) {
            throw new IllegalArgumentException("El Producto con el ID especificado no existe.");
        }
        return productRepository.save(pro);
    }

    @Override
    public void deleteProduct(Long id) {
        if (!productRepository.existsById(id)) {
            throw new IllegalArgumentException("El Producto con el ID especificado no existe.");
        }
        productRepository.deleteById(id);
    }

    @Override
    public Product getProduct(Long id) {
        Optional<Product> product = productRepository.findById(id);
        if(product.isEmpty()){
            throw new IllegalArgumentException("El Producto con el ID especificado no existe.");
        }

         return product.get();
    }
    @Override
    public List<Product> listProduct() {
        return (List<Product>) productRepository.findAll();
    }

    private void validation(Product pro){
        if (pro.getNomPro() == null || pro.getNomPro().trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre de la prenda no puede estar vacía.");
        }
        if (pro.getDes() == null || pro.getDes().trim().isEmpty()) {
            throw new IllegalArgumentException("La Descripcion no debe estar vacia.");
        }
        if (pro.getColor() == null || pro.getColor().trim().isEmpty()) {
            throw new IllegalArgumentException("El color no debe estar vacio.");
        }
        if (pro.getCategory() == null) {
            throw new IllegalArgumentException("Debe seleccionar una categoria para el prenda.");
        }
        if (pro.getTall() == null || pro.getTall().trim().isEmpty()) {
            throw new IllegalArgumentException("La talla del prenda no debe estar vacia.");
        }
        if (pro.getStock()< 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo.");
        }
        if (pro.getPre() < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
//        if (pro.getImg() == null) {
//            throw new IllegalArgumentException("La imagen no puede ser nula.");
//        }
    }
}
