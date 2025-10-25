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

    // Berechnet Gewinn oder Verlust absolut
    public double getProfit() {
        return currentValue - amountInvested;
    }

    // Berechnet Performance in %
    public double getProfitPercent() {
        if (amountInvested == 0) return 0;
        return (getProfit() / amountInvested) * 100;
    }

}
