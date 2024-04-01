public class Conta {
    String dono;
    int nConta;
    double saldo;
    double limite;
    void imprimir(){
        System.out.println("Dono: "+this.dono);
        System.out.println("Número da Conta: "+this.nConta);
        System.out.println("Saldo: "+this.saldo);
        System.out.println("Limite: "+this.limite);
        System.out.println();
    }
}
