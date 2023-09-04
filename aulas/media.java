import java.util.Scanner;
public class media {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        String nome=sc2.nextLine();
        
        System.out.println("Digite sua nota: ");
        double nota = sc.nextDouble();

        
        System.out.println("Digite sua nota: ");
        double nota2 = sc.nextDouble();

        
        System.out.println("Digite sua nota: ");
        double nota3 = sc.nextDouble();
        

        double Media = (nota + nota2 + nota3)/3;

        System.out.printf("A media do aluno foi de %.2f ",nome, Media);

    }

}