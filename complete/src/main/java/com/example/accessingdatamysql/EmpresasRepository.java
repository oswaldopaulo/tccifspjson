package com.example.accessingdatamysql;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.accessingdatamysql.Empresas;



// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface EmpresasRepository extends CrudRepository<Empresas, Long> {

	

    public List<Empresas> findByToken(String token);


}
