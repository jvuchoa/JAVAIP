import java.util.Scanner;
public class atvLOJA {
    public static void main(String[]args){
        
        Scanner sc =new Scanner(System.in); 
        int x;
        do{
            System.out.println("BEM-VINDO A NOSSA LOJA");
            System.out.println("OPÇÃO 1: COMPRAR ITEM \n" 
                            + "OPÇÃO 2: CONSULTAR O PREÇO \n"
                            +"OPÇÃO 3: FALAR COM ATENDENTE");
            System.out.println("OPÇÃO DESEJADA: ");
            x = sc.nextInt();
            switch(x){
            case 1:
            System.out.println("TENIS NIKE \n TENIS ADIDAS \n TENIS VANS");
            break;
            case 2:
            System.out.println("TENIS NIKE \n VALOR:799,99 \n TENIS ADIDAS \n VALOR: 498,99 \n TENIS VANS \n VALOR: 494,00");
            break;
            case 3:
            System.out.println("OLÁ, SOU O ASSISTENTE VIRTUAL DA LOJA COMO POSSO AJUDAR?");
            break;
        
            }
        }while(x==0);
    }

}