package com.shouryashrey.RMS.Controller;

import com.shouryashrey.RMS.Modal.Owner;
import com.shouryashrey.RMS.Service.OwnerServiceImpl;
import com.shouryashrey.RMS.Service.Response.ResponseHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ve1")
public class OwnerController {

    @Autowired
    OwnerServiceImpl ownerService;

    @PostMapping("/createOwner")
    public ResponseEntity<Object> createOwner(@RequestBody Owner owner) {
        ownerService.save(owner);
        return new ResponseEntity<>(new ResponseHandler("Owner Created with id: " + owner.getId().toString(), HttpStatus.OK.value()), HttpStatus.OK);
    }
}
