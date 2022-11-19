package com.ideas2it.training.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.LifecycleState;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Lab {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long labId;
    private String name;
    private String location;
    private String phoneNo;
    private String email;
    private String createdAt;
    private String modifiedAt;
    private boolean isDeleted;

    @OneToMany(mappedBy = "lab")
    private List<Staff> staffs;

    @OneToMany(mappedBy = "lab")
    private List<LabTest> labTests;
}
