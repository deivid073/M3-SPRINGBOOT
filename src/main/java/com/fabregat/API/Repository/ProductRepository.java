/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fabregat.API.Repository;

import com.fabregat.API.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author davidfabfer
 */
public interface ProductRepository extends JpaRepository<Product, Integer> {
    
}
