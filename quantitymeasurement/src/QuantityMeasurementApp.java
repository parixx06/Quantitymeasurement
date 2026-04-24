package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {

    // Inner class to represent feet measurement
    public static class Feet {
        private final double value;

        // Constructor
        public Feet(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }

        @Override
        public boolean equals(Object obj) {
            // 1. Same reference check (reflexive)
            if (this == obj) return true;

            // 2. Null and type check
            if (obj == null || getClass() != obj.getClass()) return false;

            // 3. Cast safely
            Feet other = (Feet) obj;

            // 4. Compare values using Double.compare
            return Double.compare(this.value, other.value) == 0;
        }

        @Override
        public int hashCode() {
            return Double.hashCode(value);
        }
    }

    // Main method for manual testing
    public static void main(String[] args) {
        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(1.0);

        System.out.println("Are equal? " + f1.equals(f2)); // true
    }
}