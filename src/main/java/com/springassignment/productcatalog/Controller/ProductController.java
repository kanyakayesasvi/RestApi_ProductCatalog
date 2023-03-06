package com.springassignment.productcatalog.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springassignment.productcatalog.Model.ProductCatalog;
import com.springassignment.productcatalog.Service.ProductService;

@RestController
public class ProductController {
    @Autowired
    private ProductService service;
    @GetMapping("/product")
    public ResponseEntity<List<ProductCatalog>> getAllProducts()
    {
        return ResponseEntity.ok().body(service.getProducts());
    }
    @GetMapping("/product/{id}")
    private ProductCatalog getProductById(@PathVariable long id)
    {
        return this.service.getProdById(id);
    }
    @PostMapping("/addproducts")
    private ResponseEntity<ProductCatalog> saveProduct(@RequestBody ProductCatalog p)
    {
        return ResponseEntity.ok().body(this.service.CreatProd(p));
    }
    @PutMapping("/updateproduct/{id}")
    private ResponseEntity<ProductCatalog> updateProduct(@RequestBody ProductCatalog p)
    {
        return ResponseEntity.ok().body(this.service.updateProd(p));
    }
    @DeleteMapping("/deleteproduct/{id}")
    private void deleteProduct(@PathVariable Long id)
    {
        service.deleteProd(id);
    }
}






