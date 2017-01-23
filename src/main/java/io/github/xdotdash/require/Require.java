package io.github.xdotdash.require;

public class Require {
    private Require() {
    }

    public static boolean requireTrue(boolean b) {
        if (!b)
            throw new IllegalStateException("boolean cannot be false!");
        return true;
    }

    public static boolean requireFalse(boolean b) {
        if (b)
            throw new IllegalStateException("boolean cannot be true!");
        return false;
    }

    public static <T> T requireNotNull(T value) {
        if (value == null)
            throw new NullPointerException("value cannot be null!");
        return value;
    }

    public static <T extends Comparable<T>> void requireEqual(T value1, T value2) {
        if (value1.compareTo(value2) != 0)
            throw new IllegalStateException("values must be equal!");
    }

    public static <T extends Comparable<T>> void requireNotEqual(T value1, T value2) {
        if (value1.compareTo(value2) == 0)
            throw new IllegalStateException("values must not be equal!");
    }

    public static <T extends Comparable<T>> void requireMoreThan(T value1, T value2) {
        if (value1.compareTo(value2) <= 0)
            throw new IllegalStateException("value1 must be more than value2!");
    }

    public static <T extends Comparable<T>> void requireLessThan(T value1, T value2) {
        if (value1.compareTo(value2) >= 0)
            throw new IllegalStateException("value1 must be less than value2!");
    }

}
