package com.oopexercise;

public class ChamandoMetodos {
    public static void main(String[] args) {
        Carro popular = new Carro();
        Carro minivan = new Carro();

        System.out.println(popular.lugaresDisponiveisPopular());
        System.out.println(minivan.lugaresDisponiveisMinivan());
    }
}
