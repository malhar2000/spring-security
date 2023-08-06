package com.malhar.springsecuritybackend.repository;

import com.malhar.springsecuritybackend.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {
	
	
}
