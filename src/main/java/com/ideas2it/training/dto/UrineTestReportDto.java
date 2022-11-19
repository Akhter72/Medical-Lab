package com.ideas2it.training.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UrineTestReportDto {
    private double rbcCount;
    private double wbcCount;
    private double phLevel;
    private boolean nitriteNegative;
    private boolean leukocyteEsteraseNegative;
}
