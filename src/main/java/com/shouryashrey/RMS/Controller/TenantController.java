package com.shouryashrey.RMS.Controller;

import com.shouryashrey.RMS.Modal.Tenant;
import com.shouryashrey.RMS.Service.Response.ResponseHandler;
import com.shouryashrey.RMS.Service.TenantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ve1")
public class TenantController {

    @Autowired
    private TenantServiceImpl tenantService;

    @PostMapping("/createTenant/{ownerId}")
    public ResponseEntity<Object> createTenant(@PathVariable Long ownerId, @RequestBody Tenant tenant) {
        tenantService.save(ownerId, tenant);
        return new ResponseEntity<>(
            new ResponseHandler(
                "Tenant created with tenantId: " + tenant.getId().toString(),
                HttpStatus.OK.value()
            ),
            HttpStatus.OK
        );
    }
}
