package encapsulamento.heranca.polimorfismo;

public class Gerente extends Funcionario {

    public double calculaImposto() {
        return this.getValorPadrao() * 0.1;
    }
}
