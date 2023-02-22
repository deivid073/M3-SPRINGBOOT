
package com.fabregat.API.service;

import com.fabregat.API.Repository.ProductosRepository;
import com.fabregat.API.model.Productos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductosService {
    @Autowired
    private ProductosRepository repository;


public List<Productos>listProductoss(){
    return repository.findAll();
} 

public void saveProductos (Productos productos){
    repository.save(productos);
}

public Productos getProductosById(Integer id){
    return repository.findById(id).get();
}

public void deleteProductosById(Integer id){
    repository.deleteById(id);
}

public void editProductos(Productos productos, Integer id){
    repository.existsById(id);
}








}