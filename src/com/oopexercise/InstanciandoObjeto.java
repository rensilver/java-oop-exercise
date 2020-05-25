package com.oopexercise;

public class InstanciandoObjeto {

    public static void main(String[] args) {
        Carro popular = new Carro();
        Carro minivan = new Carro();

        System.out.println(popular.popularTodosOcupados());
        System.out.println(minivan.minivanTodosOcupados());

    }
}
