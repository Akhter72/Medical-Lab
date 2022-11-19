package com.ideas2it.training.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BloodTestReportDto {
    private double rbcCount;
    private double wbcCount;
    private double platelets;
    private double hemoglobin;
    private double hematocrit;
}
