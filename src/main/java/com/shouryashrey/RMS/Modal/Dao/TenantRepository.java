package com.shouryashrey.RMS.Modal.Dao;

import com.shouryashrey.RMS.Modal.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TenantRepository extends JpaRepository<Tenant, Long> {
}
