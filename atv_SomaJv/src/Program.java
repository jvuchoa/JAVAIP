import java.util.Scanner;
public class Program {
    public static void main(String[] args){
        Calculadora s = new Calculadora();
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite um número: ");
        s.n1 = sc.nextInt();
        System.out.print("Digite um número: ");
        s.n2 = sc.nextInt();
        s.soma();
    }
}
