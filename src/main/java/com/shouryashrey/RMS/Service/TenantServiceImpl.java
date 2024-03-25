package com.shouryashrey.RMS.Service;

import com.shouryashrey.RMS.Modal.Dao.AddressRepository;
import com.shouryashrey.RMS.Modal.Dao.TenantRepository;
import com.shouryashrey.RMS.Modal.Dao.UserRepository;
import com.shouryashrey.RMS.Modal.Owner;
import com.shouryashrey.RMS.Modal.Tenant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TenantServiceImpl {

    @Autowired
    private TenantRepository tenantRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AddressRepository addressRepository;

    public void save(Long ownerId, Tenant tenant) throws RuntimeException {
        Owner owner = (Owner) userRepository.findById(ownerId).orElseThrow(() -> new RuntimeException("Owner not found"));
        tenant.setOwner(owner);
        tenantRepository.save(tenant);
        addressRepository.save(tenant.getAddress());
    }
}
