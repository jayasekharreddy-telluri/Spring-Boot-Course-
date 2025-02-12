package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import com.example.entity.*;

public interface UserRepository extends JpaRepository<User, Long>  {

}
