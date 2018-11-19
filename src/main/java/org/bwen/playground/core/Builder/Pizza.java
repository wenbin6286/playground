package org.bwen.playground.core.Builder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public class Pizza {
    public enum  Topping {HAM, MUSHROOM,SAUSAGE,OION,PEPPER};
    private final Set<Topping> toppings;
    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }
        protected abstract T self();
        abstract Pizza build();
    }
    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }
}
