package com.homework.model;

import java.util.Objects;

/**
 * The Glasses class creates an object which has a color, shape, and size.
 * In its turn the size is consisted of the length and width of the glass.
 * This class is used in the current application for testing the implemented TreeSet,
 * where they'll be sorted by their colors in ascending order.
 *
 * @author Zakoyan Gayane
 * @since 2020-02-07
 */
public class Glasses implements Comparable<Glasses> {
    private String shape;
    private String color;
    private Size size;

    static class Size implements Comparable<Size> {
        int length;
        int width;

        public Size(int length, int width) {
            setLength(length);
            setWidth(width);
        }

        public void setLength(int length) {
            if (length <= 0) {
                throw new IllegalArgumentException("Length cannot be negative or null");
            }
            this.length = length;
        }

        public void setWidth(int width) {
            if (width <= 0) {
                throw new IllegalArgumentException("Width cannot be negative or null");
            }
            this.width = width;
        }

        public int getLength() {
            return length;
        }

        public int getWidth() {
            return width;
        }

        @Override
        public int compareTo(Size o) {
            return 0;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Size size = (Size) o;
            return length == size.length &&
                    width == size.width;
        }

        @Override
        public int hashCode() {
            return Objects.hash(length, width);
        }

        @Override
        public String toString() {
            return "Size{" +
                    "length=" + length +
                    ", width=" + width +
                    '}';
        }
    }

    public Glasses(String shape, String color, int length, int width) {
        this.shape = shape;
        this.color = color;
        setSize(length, width);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(int length, int width) {
        size = new Size(length, width);
    }

    @Override
    public int compareTo(Glasses g) {
        return this.getColor().compareTo(g.getColor());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Glasses glasses = (Glasses) o;
        return Objects.equals(shape, glasses.shape) &&
                Objects.equals(size, glasses.size) &&
                Objects.equals(color, glasses.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shape, size, color);
    }

    @Override
    public String toString() {
        return "Glasses{" +
                "shape='" + shape + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
