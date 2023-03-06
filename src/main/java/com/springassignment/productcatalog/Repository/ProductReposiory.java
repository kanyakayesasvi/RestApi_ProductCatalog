package com.springassignment.productcatalog.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springassignment.productcatalog.Model.ProductCatalog;

public interface ProductReposiory extends JpaRepository<ProductCatalog, Long> {

}
