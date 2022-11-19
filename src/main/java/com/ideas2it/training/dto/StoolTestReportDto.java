package com.ideas2it.training.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StoolTestReportDto {
    private boolean starchNegative;
    private boolean yeastNegative;
    private boolean protozoaNegative;
    private boolean macrophagesNegative;
    private boolean fatBodiesNegative;
}
