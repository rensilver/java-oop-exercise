package encapsulamento.heranca.polimorfismo;

public class Atendente extends Funcionario {

    public double calculaImposto() {
        return this.getValorPadrao() * 0.01;
    }
}
