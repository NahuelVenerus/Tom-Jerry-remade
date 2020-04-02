package com.company;

public class Main {

    public static void main(String[] args) {

        Gato tom = new Gato(10);
        Raton jerry = new Raton(5);
        System.out.println(tom);
        tom.comer(jerry);
        System.out.println(tom);
        tom.correr(jerry, 100);
        System.out.println(tom);

    }
}
