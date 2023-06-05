package org.example.customer;

import java.util.Objects;

public class Cook {

    private final String menu;
    private final int price;

    public Cook(String menu, int price) {
        this.menu = menu;
        this.price = price;
    }

    public Cook(MenuItem menuItem) {
        this.menu = menuItem.getName();
        this.price = menuItem.getPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cook cook)) return false;
        return price == cook.price && Objects.equals(menu, cook.menu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menu, price);
    }
}
