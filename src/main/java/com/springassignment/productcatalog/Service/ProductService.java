package com.springassignment.productcatalog.Service;

import java.util.List;

import com.springassignment.productcatalog.Model.ProductCatalog;

public interface ProductService {
	
	ProductCatalog CreatProd(ProductCatalog p);
	ProductCatalog updateProd(ProductCatalog p);
	List<ProductCatalog> getProducts();
	ProductCatalog getProdById(long id);
	void deleteProd(long id);
	
	
	
	
	

}
