package com.ideas2it.training.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LiverTestReportDto {
    private double prothrombinTime;
    private double billrubin;
    private double albubin;
    private double totalProtien;
}
