import java.util.Locale;

public class CriaConta {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200.0;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100.0;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50.0;

        System.out.println("primeira conta tem " + primeiraConta.saldo);
        System.out.println("segunda conta tem " + segundaConta.saldo);
    }
}