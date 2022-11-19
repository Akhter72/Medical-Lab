package com.ideas2it.training.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    private String firstname;
    private String lastname;
    private String dob;
    private String email;
    private String gender;
    private String phoneNo;
    private String location;
    private String createdAt;
    private String modifiedAt;
    private String isDeleted;

    @OneToMany(mappedBy = "user")
    private List<Booking> bookings;
}
