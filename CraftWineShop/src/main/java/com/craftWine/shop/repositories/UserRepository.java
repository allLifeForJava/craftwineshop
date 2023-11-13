package com.craftWine.shop.repositories;

import com.craftWine.shop.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


    boolean existsUserByEmail(String email);

    boolean existsUserById(Long id);

    User findUserByEmail(String email);


}
