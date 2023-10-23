import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        Pessoa p = new Pessoa();
        CadastroPessoas cp = new CadastroPessoas();

        System.out.println("Digite o nome do usuario: ");
        p.setNome(scanner.next());

        System.out.println("Digite a idade do usuário: ");
        p.setIdade(scanner.nextInt());

        cp.cadastrarPessoas(p);

        cp.listar();
    }


}
