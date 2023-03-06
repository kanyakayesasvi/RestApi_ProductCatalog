package com.springassignment.productcatalog.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springassignment.productcatalog.Exception.ProductException;
import com.springassignment.productcatalog.Model.ProductCatalog;
import com.springassignment.productcatalog.Repository.ProductReposiory;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductServiceimp implements ProductService {
	@Autowired
	private ProductReposiory repo;
	@Override
	public ProductCatalog CreatProd(ProductCatalog p) {
	
		return repo.save(p);
	}

	@Override
	public ProductCatalog updateProd(ProductCatalog p) {
	
		Optional<ProductCatalog> pobj=this.repo.findById(p.getId());
		if(pobj.isPresent())
		{
			ProductCatalog update=pobj.get();
			update.setName(p.getName());
			update.setPrice(p.getPrice());
			return this.repo.save(update);
		}
		else {
			throw new ProductException("product with id: "+p.getId()+"not found");
		}
		
	}

	@Override
	public List<ProductCatalog> getProducts() {
		return this.repo.findAll();
	}

	@Override
	public ProductCatalog getProdById(long id) {
		// TODO Auto-generated method stub
		Optional<ProductCatalog> byId=this.repo.findById(id);
		if(byId.isPresent()) {
			return byId.get();
		}
		else {
			throw new ProductException("product with id: \"+ p.getId()+\"not found");
			
		}
		
	}

	@Override
	public void deleteProd(long id) {
		// TODO Auto-generated method stub
		Optional<ProductCatalog> delete =this.repo.findById(id);
		if(delete.isPresent()) {
			this.repo.deleteById(id);
		}
		else {
			throw new ProductException("product not found");
			
		}
		
	}

}
