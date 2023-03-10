package com.dev.user.repository;

import com.dev.user.entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<MyUser,Long> {

    MyUser findByUserId(Long userId);
}
