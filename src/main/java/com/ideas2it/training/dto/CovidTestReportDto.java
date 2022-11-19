package com.ideas2it.training.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CovidTestReportDto {
    private String specimenType;
    private String testPrinciples;
    private boolean testPositive;
}
