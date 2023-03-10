public class TesteMetodo {

    public static void main(String[] args) {

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 100.00;
        contaDoPaulo.deposita(50.00);
        System.out.println(contaDoPaulo.saldo);

        boolean conseguiRetirar = contaDoPaulo.saca(20.00);
        System.out.println(contaDoPaulo.saldo);
        System.out.println(conseguiRetirar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000.00);
        if (contaDaMarcela.transfere(300.00, contaDoPaulo)) {
            System.out.println("Tranferência feita com sucesso");
        } else {
            System.out.println("Faltou dinheiro");
        }
        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoPaulo.saldo);

        contaDoPaulo.titular = "paulo silveira";
        System.out.println(contaDoPaulo.titular);
    }
}
