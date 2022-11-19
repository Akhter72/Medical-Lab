package com.ideas2it.training.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoneMarrowTestReportDto {
    private long id;
    private double blasts;
    private double lymphocytes;
    private double promyelocytes;
    private double plasmaCells;
    private double monocytes;
}
