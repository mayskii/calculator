package com.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum = calculator.add(5, 3);
        int diff = calculator.subtract(10, 4);

        System.out.println("5 + 3 = " + sum);
        System.out.println("10 - 4 = " + diff);
    }

}
