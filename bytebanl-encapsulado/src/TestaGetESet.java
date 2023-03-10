public class TestaGetESet {

    public static void main(String[] args) {

        Conta conta = new Conta(12, 32);
        conta.setNumero(1337);
        System.out.println(conta.getNumero());
        conta.setAgencia(146);
        System.out.println(conta.getAgencia());

        Cliente paulo = new Cliente();
        conta.setTitular(paulo);
        System.out.println(conta.getTitular());
        paulo.setNome("Paulo Silveira");
        paulo.setCpf("375.064.008-47");
        System.out.println(conta.getTitular().getNome());
        conta.getTitular().setProfissao("Programador");
        System.out.println(conta.getTitular().getProfissao());
    }
}
