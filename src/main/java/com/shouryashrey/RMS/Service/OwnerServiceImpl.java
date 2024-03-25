package com.shouryashrey.RMS.Service;


import com.shouryashrey.RMS.Modal.Constants.UserStatus;
import com.shouryashrey.RMS.Modal.Dao.AddressRepository;
import com.shouryashrey.RMS.Modal.Dao.OwnerRepository;
import com.shouryashrey.RMS.Modal.Dao.UserRepository;
import com.shouryashrey.RMS.Modal.Owner;
import com.shouryashrey.RMS.Modal.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class OwnerServiceImpl {

    @Autowired
    private OwnerRepository ownerRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private UserRepository userRepository;

    public void save(Owner owner) {
        owner.setStatus(UserStatus.ACTIVE);
        ownerRepository.save(owner);
        addressRepository.save(owner.getAddress());
    }

    public Owner getOwnerById(long ownerId) {
        User user = userRepository.findById(ownerId).orElseThrow(() -> new RuntimeException("Owner not found"));
        return (Owner) user;
    }

}
