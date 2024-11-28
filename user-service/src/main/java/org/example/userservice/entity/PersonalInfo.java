package org.example.userservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Embeddable
public class PersonalInfo implements Serializable {

    @Serial
    private static final long serialVersionUID = -7986084507475156622L;

    @Column(name = "firstname", nullable = false)
    private String firstName;

    @Column(name = "lastname", nullable = false)
    private String lastName;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column(name = "birthday", nullable = false)
    private LocalDate dateOfBirth;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Transient
    @Column(nullable = false)
    private String password;

}