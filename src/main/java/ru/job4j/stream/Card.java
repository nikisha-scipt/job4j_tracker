package ru.job4j.stream;

import java.util.stream.Stream;

enum Suit {
    Diamonds, Hearts, Spades, Clubs
}

enum Value {
    V_6, V_7, V_8
}

public class Card {
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card{"
                + "suit=" + suit
                + ", value=" + value
                + '}';
    }

    public static void main(String[] args) {
        Suit[] suits = {Suit.Diamonds, Suit.Hearts, Suit.Spades, Suit.Clubs};
        Value[] values = {Value.V_6, Value.V_7, Value.V_8, Value.V_6};
        Stream.of(suits)
                .flatMap(s -> Stream.of(values)
                        .map(value -> new Card(s, value)))
                .forEach(System.out::println);

    }
}
