package com.Test.javac;

class FindRadius {
    public float Length ;
    public float Width ;
    FindRadius() {

    }
    FindRadius(float Length, float Width) {
        this.Length = Length;
        this.Width = Width;
    }

    public double getLength() {
        return Length;
    }

    public void SetLength(float l) {
        Length = l;
    }

    public double getWidth() {
        return Length;
    }

    public void setWidth(float w) {
        Width = w;
    }

    public double getArea() {
        return (Width * Length);
    }
}
    public class Rectangle {
        public static void main(String[] args) {
            FindRadius rectangle = new FindRadius();
            System.out.println(rectangle.getLength());
            rectangle.SetLength(4.0f);
            rectangle.setWidth(6.0f);
            System.out.println(rectangle.getWidth());
            System.out.println(rectangle.getArea());
        }
    }
