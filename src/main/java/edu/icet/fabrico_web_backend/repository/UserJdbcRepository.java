package edu.icet.fabrico_web_backend.repository;

import edu.icet.fabrico_web_backend.entity.UserEntity;

public interface UserJdbcRepository {
    boolean userExistsByEmail(String email);
    UserEntity login(String email);
}
