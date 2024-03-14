package com.shouryashrey.RMS.Modal;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("TENANT")
public class Tenant extends User {

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;
    private Long rentAmount;
    private String moveInTimestamp;
    private String endOfContractTimestamp;
}
