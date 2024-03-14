package com.shouryashrey.RMS.Modal.Dao;

import com.shouryashrey.RMS.Modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
