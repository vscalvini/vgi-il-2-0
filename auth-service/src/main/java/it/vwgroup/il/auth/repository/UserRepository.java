package it.vwgroup.il.auth.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.vwgroup.il.auth.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

}