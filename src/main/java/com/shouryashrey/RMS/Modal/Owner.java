package com.shouryashrey.RMS.Modal;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("OWNER")
public class Owner extends User{
}
