package Lol;

import java.util.Scanner;

public class Calc {


    public void logic() {

        System.out.println("Введите математический знак операции");
        Scanner scanner = new Scanner(System.in); // сканер для считывания заданной операции или числа
        String sig = scanner.nextLine(); // переменная для считывания мат. операции или числа



        System.out.println("Введите число a");
        int a = scanner.nextInt(); // считывание числа a

        System.out.println("Введите число b");
        int b = scanner.nextInt(); // считывание числа b

        Arifmetic arifmetic = new Arifmetic();

        switch (sig) { //проверка на ввод правильной мат. операции


            case "+": {
                int c = arifmetic.summa(a,b); // вводим переменную метода summa
                System.out.println("Результат " + c);
                break;
            }


            case "-": {
                int c = arifmetic.minus(a,b); // вводим переменную метода minus
                System.out.println("Результат " + c);
                break;
            }

            case "*": {
                int c = arifmetic.umnog(a,b); // вводим переменную метода umnog
                System.out.println("Результат " + c);
                break;
            }

            case "/": {
                int c = arifmetic.delen(a,b); // вводим переменную метода delen
                System.out.println("Результат " + c);
                break;
            }

            default:
                System.out.println("Введите правильный математический знак операции ( + , - , * , /)"); // если ввели неправильный знак операции

                break;
        }
    }
}