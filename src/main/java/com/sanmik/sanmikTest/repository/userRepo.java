package com.sanmik.sanmikTest.repository;

import com.sanmik.sanmikTest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepo extends JpaRepository<User, Integer> {
}
