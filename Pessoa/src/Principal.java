
public class Principal {
    public static void main(String[] args) throws Exception {

        Pessoa pessoa = new Pessoa();

        pessoa.setid(1);
        pessoa.setnome("Lucas");
        pessoa.setcpf("000.000.00-00");
        pessoa.setrg("1111111111-1");
        pessoa.setcidade("São Paulo");
        pessoa.setestadoCivil("Solteiro");
        pessoa.setdata("17/07/2001");

        System.out.println("Meu nome é: " + pessoa.getnome());
        System.out.println("CPF: " + pessoa.getcpf());
        System.out.println("rg: " + pessoa.getrg());
        System.out.println("Cidade em que nasci " + pessoa.getcidade());
        System.out.println("estado " + pessoa.getestadoCivil());
        System.out.println("data de nascimento " + pessoa.getdata());

        System.out.println("------------------------------------------");
        System.out.println("depois de usar setter para mudar os valores");

        pessoa.setnome("luan");
        pessoa.setdata("25/12/2001");
        System.out.println("Meu nome é: " + pessoa.getnome());
        System.out.println("CPF: " + pessoa.getcpf());
        System.out.println("rg: " + pessoa.getrg());
        System.out.println("Cidade em que nasci " + pessoa.getcidade());
        System.out.println("estado " + pessoa.getestadoCivil());
        System.out.println("data de nascimento " + pessoa.getdata());
    }
}