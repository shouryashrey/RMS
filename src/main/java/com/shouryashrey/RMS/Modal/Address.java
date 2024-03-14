package com.shouryashrey.RMS.Modal;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
@Table(name = "rms_addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String flatNumber;
    private String streetName;
    private String city;
    private String state;
    private String pincode;

    @OneToOne(mappedBy = "address")
    private User user;
}
