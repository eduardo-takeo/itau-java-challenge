package com.itau.itau.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Statistics {
    private Integer count;
    private Float avg;
    private Float min;
    private Float max;
}
