package com.company;

public class Main {

    public static void main(String[] args) {
        Box<Double, Integer> box1 = new Box<>(5.0, 4);
        Box<Float, Float> box2 = new Box<>(9.1f, 5.3f);

        addition(box1, box2);
        multiplication(box1, box2);
    }


    public static  void  addition(Box<? extends Number, ? extends Number> box1, Box<? extends Number, ? extends Number> box2) {
        System.out.println(box1.getNumber1().doubleValue() + box1.getNumber2().doubleValue() + box2.getNumber1().doubleValue()
                + box2.getNumber2().doubleValue());

    }
    public static  void  multiplication(Box<? extends Number, ? extends Number> box1, Box<? extends Number, ? extends Number> box2) {
        System.out.println(box1.getNumber1().doubleValue() * box1.getNumber2().doubleValue() * box2.getNumber1().doubleValue()
                * box2.getNumber2().doubleValue());

    }
}