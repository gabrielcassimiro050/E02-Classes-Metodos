

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.dono = "Jão";
        conta1.nConta = 1;
        conta1.saldo = 100000000;
        conta1.limite = 500;
        conta1.imprimir();


        Cliente cliente1 = new Cliente();
        cliente1.nome = "Jão";
        cliente1.cpf = "12380-239";
        cliente1.adress = "Rua dos Palmares";
        cliente1.idade = 50;
        cliente1.sexo = 'f';
        cliente1.imprimir();

    }
}