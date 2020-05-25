package encapsulamento.heranca.polimorfismo;

public class Main {

    public static void main(String[] args) {

        Funcionario gerente = new Gerente();
        gerente.setValorPadrao(3000.0);
        System.out.println(gerente.calculaImposto());

        Funcionario supervisor = new Supervisor();
        supervisor.setValorPadrao(2000.0);
        System.out.println(supervisor.calculaImposto());

        Funcionario atendente = new Atendente();
        atendente.setValorPadrao(1000.0);
        System.out.println(atendente.calculaImposto());
    }
}
