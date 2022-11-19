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
public class TestType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long TestTypeId;
    private String name;
    private String code;
    private String description;
    private String createdAt;
    private String modifiedAt;
    private boolean isDeleted;

    @OneToMany(mappedBy = "testType")
    private List<LabTest> labTests;
}