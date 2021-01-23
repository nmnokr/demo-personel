package com.example.demo.personel.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.personel.model.personel;
@Repository
public interface PersonelRepository  extends  MongoRepository<personel,String>{
	   personel findCustomerById(String id);
}