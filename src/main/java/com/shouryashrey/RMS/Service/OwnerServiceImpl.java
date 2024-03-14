package com.shouryashrey.RMS.Service;


import com.shouryashrey.RMS.Modal.Dao.AddressRepository;
import com.shouryashrey.RMS.Modal.Dao.OwnerRepository;
import com.shouryashrey.RMS.Modal.Owner;
import com.shouryashrey.RMS.Service.Interface.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OwnerServiceImpl implements OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public void save(Owner owner) {
        ownerRepository.save(owner);
        addressRepository.save(owner.getAddress());
    }

}
