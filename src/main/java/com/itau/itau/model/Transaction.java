package com.itau.itau.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    @NotNull
    private Float value;

    @NotNull
    private OffsetDateTime datetime;
}
