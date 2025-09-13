package com.employee.springbootbackend.repository;

import com.employee.springbootbackend.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepo extends JpaRepository<Users, String> {
}
