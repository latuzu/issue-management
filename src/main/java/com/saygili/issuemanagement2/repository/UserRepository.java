package com.saygili.issuemanagement2.repository;

import com.saygili.issuemanagement2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
