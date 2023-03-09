package org.example;

import java.time.LocalDate;

public class Order {

    Game game;
    LocalDate dateOfOrder;

    public Order(Game game, int year, int month, int dayOfMonth) {
        this.game = game;
        this.dateOfOrder = LocalDate.of(year, month, dayOfMonth);
    }

    @Override
    public String toString() {
        return "Order{" +
                "game=" + game +
                ", dateOfOrder=" + dateOfOrder +
                '}';
    }
}
