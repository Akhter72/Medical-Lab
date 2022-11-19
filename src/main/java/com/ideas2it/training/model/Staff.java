package com.ideas2it.training.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.ideas2it.training.model.Lab;
import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long staffId;
    private String fullname;
    private String address;
    private String phoneNo;
    private String email;
    private String createdAt;
    private String modifiedAt;
    private String isDeleted;

    @OneToOne(mappedBy = "staff")
    private Booking booking;

    @ManyToOne
    @JoinColumn(name = "lab_id")
    private Lab lab;

}
