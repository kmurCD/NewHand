package com.nah.newandhand.controller;

import com.nah.newandhand.model.Product;
import com.nah.newandhand.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductoController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> listAllProducts(){
        List<Product> product = productService.listProduct();
            return new ResponseEntity<>(product, HttpStatus.OK);

    }
    @GetMapping("/{id}")
    public  ResponseEntity<Product> getOneProduct(@PathVariable("id")Long id){
        Product product = productService.getProduct(id);
        return new ResponseEntity<>(product,HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Product> saveProducts(@RequestBody Product Product){
        Product product = productService.saveProduct(Product);
        return new ResponseEntity<>(product,HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Product>updateProduct(@PathVariable("id") Long id, @RequestBody Product product){
        product.setIdPro(id);
        Product proUpd = productService.updateProduct(product);
        return new ResponseEntity<>(proUpd,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable("id") Long id) {
        productService.deleteProduct(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
