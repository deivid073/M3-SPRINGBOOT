
package com.fabregat.API.service;

import com.fabregat.API.Repository.ProductRepository;
import com.fabregat.API.model.Product;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;


public List<Product>listProducts(){
    return repository.findAll();
} 

public void saveProduct (Product product){
    repository.save(product);
}

public Product getProductById(Integer id){
    return repository.findById(id).get();
}

public void deleteProductById(Integer id){
    repository.deleteById(id);
}

public void editProduct(Product product, Integer id){
    repository.existsById(id);
}








}