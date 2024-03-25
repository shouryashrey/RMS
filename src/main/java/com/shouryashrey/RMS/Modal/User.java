package com.shouryashrey.RMS.Modal;

import com.shouryashrey.RMS.Modal.Constants.UserStatus;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Builder
@Table(name = "rms_users")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "user_type", discriminatorType = DiscriminatorType.STRING)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;
    private String identityProofType;
    private String identityProofRegistrationNumber;

    @Enumerated(EnumType.STRING)
    private UserStatus status;

    public User(String firstName, String lastName, String phoneNumber, String email, Address address, String identityProofType, String identityProofRegistrationNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.identityProofType = identityProofType;
        this.identityProofRegistrationNumber = identityProofRegistrationNumber;
        this.status = UserStatus.ACTIVE;
    }

    public User(Long id, String firstName, String lastName, String phoneNumber, String email, Address address, String identityProofType, String identityProofRegistrationNumber, UserStatus status) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.identityProofType = identityProofType;
        this.identityProofRegistrationNumber = identityProofRegistrationNumber;
        this.status = UserStatus.ACTIVE;
    }
}
