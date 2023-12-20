package org.lesson.creational.builder;

public class Pizza {
    private final String toppings;
    private final String sauce;
    private final int size;
    private final String additionalTopping;
    private final boolean cheese;
    private final boolean oregano;

    public String getToppings() {
        return toppings;
    }

    public String getSauce() {
        return sauce;
    }

    public int getSize() {
        return size;
    }

    public String getAdditionalTopping() {
        return additionalTopping;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isOregano() {
        return oregano;
    }

    private Pizza(String toppings, String sauce, int size, String additionalTopping, boolean cheese, boolean oregano) {
        this.toppings = toppings;
        this.sauce = sauce;
        this.size = size;
        this.additionalTopping = additionalTopping;
        this.cheese = cheese;
        this.oregano = oregano;
    }


    public static class Builder {
        private String toppings;
        private String sauce;
        private int size;
        private String additionalTopping;
        private boolean cheese;
        private boolean oregano;

        public Builder toppings(String toppings) {
            this.toppings = toppings;
            return this;
        }


        public Builder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }


        public Builder size(int size) {
            this.size = size;
            return this;
        }


        public Builder additionalTopping(String additionalTopping) {
            this.additionalTopping = additionalTopping;
            return this;
        }


        public Builder cheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }


        public Builder oregano(boolean oregano) {
            this.oregano = oregano;
            return this;
        }

        public Pizza build() {
            return new Pizza(toppings, sauce, size, additionalTopping, cheese, oregano);
        }
    }
}
