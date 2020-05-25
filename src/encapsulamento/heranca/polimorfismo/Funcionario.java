package encapsulamento.heranca.polimorfismo;

public class Funcionario {

// valor base para pagamento de impostos
    private double valorPadrao;

    public double getValorPadrao() {
        return valorPadrao;
    }
    public void setValorPadrao(double valorPadrao) {
        this.valorPadrao = valorPadrao;
    }
    public double calculaImposto() {
        return this.valorPadrao * 0.06;
    }
}
