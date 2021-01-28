package com.example.accessingdatamysql;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;



// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface Produtos_imagensRepository extends CrudRepository<Produtos_imagens, String> {

	//@Query("from Auction a join a.category c where c.name=:categoryName")
	//public Iterable<Auction> findByCategory(@Param("categoryName") String categoryName)
	
	List<Produtos_imagens> findByProduto(Integer produto);


}

