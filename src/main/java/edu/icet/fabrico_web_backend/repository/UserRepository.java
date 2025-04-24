package edu.icet.fabrico_web_backend.repository;

import edu.icet.fabrico_web_backend.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity,Integer> {

}
