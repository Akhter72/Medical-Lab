package com.ideas2it.training.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffDto {
    private String fullname;
    private String address;
    private String phoneNo;
    private String email;
}
