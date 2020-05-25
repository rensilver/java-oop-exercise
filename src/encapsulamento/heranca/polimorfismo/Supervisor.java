package encapsulamento.heranca.polimorfismo;

public class Supervisor extends Funcionario {

    public double calculaImposto() {
        return this.getValorPadrao() * 0.05;
    }
}
