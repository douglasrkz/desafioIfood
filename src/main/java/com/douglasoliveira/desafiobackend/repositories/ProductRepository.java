package com.douglasoliveira.desafiobackend.repositories;

import com.douglasoliveira.desafiobackend.domain.product.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
}
