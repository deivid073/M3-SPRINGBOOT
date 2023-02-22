package com.fabregat.API.controller;


import com.fabregat.API.model.Productos;
import com.fabregat.API.service.ProductosService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequiredArgsConstructor

public class ProductosController {
    private final ProductosService productosService;
    
    
    @GetMapping("/productos")
    public List<Productos> listProductoss(){
        return productosService.listProductoss();
    }
    
    @GetMapping("/productos/{id}")
    public ResponseEntity<Productos> getProductos(@PathVariable Integer id){
        try{
            Productos productos = productosService.getProductosById(id);
            return ResponseEntity.ok(productos);
        } catch(Exception e){
            return ResponseEntity.notFound().build();
        }
    }
    
    @PostMapping("/productos")
    public void newProductos(@RequestBody Productos productos){
        productosService.saveProductos(productos);
    }
    
    @PutMapping("/productos/{id}")
    public ResponseEntity<?> editProductos(@RequestBody Productos productos, @PathVariable Integer id){
        try{
            Productos productosExist = productosService.getProductosById(id);
            productosExist.setNombre(productos.getNombre());
            productosExist.setPrecio(productos.getPrecio());
            productosService.saveProductos(productosExist);
            return new ResponseEntity<Productos>(productos, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<Productos>(HttpStatus.NOT_FOUND);
        }
    }
    
    @DeleteMapping("/productos/{id}")
    public void deleteProductos(@PathVariable Integer id){
        productosService.deleteProductosById(id);
    }
}

