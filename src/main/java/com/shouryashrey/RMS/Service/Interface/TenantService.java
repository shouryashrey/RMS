package com.shouryashrey.RMS.Service.Interface;

import com.shouryashrey.RMS.Modal.Tenant;

public interface TenantService {
    void save(Long ownerId, Tenant tenant);
}
