package com.shouryashrey.RMS.Modal.Dao;

import com.shouryashrey.RMS.Modal.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
    Owner findOwnerById(long ownerId);
}
