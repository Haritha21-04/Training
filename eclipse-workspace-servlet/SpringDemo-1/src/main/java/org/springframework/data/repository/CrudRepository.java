package org.springframework.data.repository;

package org.springframework.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
 
import com.example.demo.model.Product;
 
@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{
 
}