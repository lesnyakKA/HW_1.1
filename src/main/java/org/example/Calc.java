package org.example;

import java.util.Scanner;

public class Calc {
    private int a;
    private int b;
    private char operation;
    static Scanner scanner = new Scanner(System.in);

   private void getInt() {
        System.out.print("Введите первое число:   ");
        this.a = scanner.nextInt();
        System.out.print("Введите второе число:   ");
        this.b = scanner.nextInt();
    }

    private void getOperation() {
        System.out.println("Введите действие: ");
        this.operation = scanner.next().charAt(0);
    }

    public void action() {
        int result = 0;
        getInt();
        getOperation();
        switch (operation) {
            case '+':
                result = this.a + this.b;
                break;
            case '-':
                result = this.a - this.b;
                break;
            case '*':
                result = this.a * this.b;
                break;
            case '/':
                result = this.a / this.b;
                break;
            default:
                System.out.println("Вы ввели не правильное действие. Попробуйте ещё раз.");
        }
        System.out.print("Результат равен: " + result);
    }

    public void getRandom(int high) {
        System.out.println(Math.random() * high);
    }
}
