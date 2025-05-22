package com.itau.itau.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Statistic {
    private long count;
    private double sum;
    private double avg;
    private double min;
    private double max;
}
