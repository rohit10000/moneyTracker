package com.hertever.moneytracker.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "budget")
public class Budget {
    @Id private String id;
    @Version Integer version;
    private double income;
    private double carFuel;
    private double subscriptions;
    private double shopping;
    private double travelExpenses;
    private double loans;
    private double grocery;
    private double rent;
    private double books;
    private double bills;
    private double misc;
}
