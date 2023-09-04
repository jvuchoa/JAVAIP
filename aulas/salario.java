import java.util.Scanner;
public class atv2 {

    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Digite seu número de matrícula: ");
        int matricula =sc.nextInt();

        System.out.println("Digite seu nome completo: ");
        String nome =sc.nextLine();

        System.out.println("Digite seu salario bruto: ");
        double salarioB= sc.nextDouble();
        
        double salarioF=salarioB -(salarioB*15)/100;

        double diferenca = salarioB-salarioF;

           
        
        System.out.printf("MATRICULA %s \n" + 
        "NOME COMPLETO: %s \n "+
        "SALARIO BRUTO: R$%.2f \n"+
        "SALARIO FINAL: R$%.2f \n"+
        "DIFERENÇA SALARIAL PELO INSS: R$.2f",matricula,nome,salarioB,salarioF,diferenca);





    }


}
