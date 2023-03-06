package com.springassignment.productcatalog.Model;


import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.*;


@Entity
@Table(name="productcatalogtable")

public class ProductCatalog {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private String name;
	private Double Price;
	
	@CreationTimestamp
	private Date Created_time;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

	public Date getCreated_time() {
		return Created_time;
	}

	public void setCreated_time(Date created_time) {
		Created_time = created_time;
	}

	public ProductCatalog(Long id, String name, Double price, Date created_time) {
		super();
		Id = id;
		this.name = name;
		Price = price;
		Created_time = created_time;
	}

	public ProductCatalog() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ProductCatalog [Id=" + Id + ", name=" + name + ", Price=" + Price + ", Created_time=" + Created_time
				+ "]";
	}

	
	
}
