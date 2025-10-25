package com.yunes.dashboard.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Investment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String assetName;
    private double amountInvested;
    private double currentValue;

}
