package com.shouryashrey.RMS.Modal;

import com.shouryashrey.RMS.Modal.Constants.UserType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("OWNER")
public class Owner extends User{
//    private String own
}
