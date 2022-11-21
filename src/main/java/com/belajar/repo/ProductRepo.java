package com.belajar.repo;
import com.belajar.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Long>{

}