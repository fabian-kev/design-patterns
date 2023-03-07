package com.fabiankevin.designpatterns.behavioral.strategy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Value;

import java.math.BigDecimal;

@Value
@Builder
public class Item {
    private String name;
    private BigDecimal price;
}
