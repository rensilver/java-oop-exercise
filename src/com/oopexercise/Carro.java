package com.oopexercise;

public class Carro {

    private String normal = "Popular";
    private String grande = "Minivan";
    private Integer popularCheio = 5;
    private Integer popularVazio = 4;
    private Integer minivanCheia = 9;
    private Integer minivanVazia = 8;

    public String getPopular() {
        return normal;
    }

    public String getMinivan() {
        return grande;
    }

    public String popularTodosOcupados() {
        return "Seu carro é " + getPopular() + " e todos os " + popularCheio + " lugares estão ocupados.";
    }

    public String popularTodosVagos() {
        return "Seu carro é " + getPopular() + " e todos os " + popularVazio + " lugares estão disponíveis.";
    }

    public String minivanTodosOcupados() {
        return "Seu carro é uma " + getMinivan() + " e todos os " + minivanCheia + " lugares estão ocupados.";
    }

    public String minivanTodosVagos() {
        return "Seu carro é uma " + getMinivan() + " e todos os " + minivanVazia + " lugares estão disponíveis.";
    }

    public Integer retirarPessoaPopular() {
        return popularCheio - 1;
    }

    public String lugaresDisponiveisPopular() {
        return "Agora somente " + retirarPessoaPopular() + " estão ocupados, então há uma vaga disponível.";
    }

    public Integer retirarPessoaMinivan() {
        return minivanCheia - 1;
    }

    public String lugaresDisponiveisMinivan() {
        return "Agora somente " + retirarPessoaMinivan() + " estão ocupados, então há uma vaga disponível.";
    }
}