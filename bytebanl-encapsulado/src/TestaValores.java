public class TestaValores {

    public static void main(String[] args) {

        Conta conta = new Conta(146, 8441);

        System.out.println(conta);

        Conta conta2 = new Conta(146, 89555);

        System.out.println(conta2);

        Conta conta3 = new Conta(566, 9984);

        System.out.println(conta3);

        System.out.println(Conta.getTotal());
    }
}
