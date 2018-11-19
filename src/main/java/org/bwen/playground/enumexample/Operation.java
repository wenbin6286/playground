package org.bwen.playground.enumexample;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public enum Operation {
    PLUS('+') {
        public double apply(double x, double y) {
            return x+y;
        }
    },
    MINUTS('-') {
        public double apply ( double x, double y){
            return x - y;
        }
    },
    TIMES('*') {
        public double apply (double x, double y) {
            return x*y;
        }
    },
    DIV('/') {
        public double apply(double x, double y) {
            return x/y;
        }
    };

    private final char symbol;
    Operation(char symbol) {
        this.symbol = symbol;
    }
    public String toString() {
        return String.valueOf(symbol);
    }
    public abstract double apply(double x, double y);

    public static void main(String args[]) {
        double x = 10;
        double y = 2;
        for(Operation op: values()) {
            System.out.printf("%f %s %f = %f%n",x,op,y,op.apply(x,y));
        }
        Stream.of(values()).forEach(p -> System.out.printf("%s ",fromString(p.toString()).get()));


    }
    private static final Map<String,Operation> stringToEnum = Stream.of(values()).collect(Collectors.toMap(Object::toString, e->e));
    public static Optional<Operation> fromString(String symbol) {
        return Optional.ofNullable(stringToEnum.get(symbol));
    }
}
