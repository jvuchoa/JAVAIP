//CALCULAR A MEDIA DO ALUNO 
public class ex1 {
    public static void main(String[]args) {
        double a=9;
        double b=10;
        double c=11;

        double media =(a+b+c)/3;
        if(media>=7){
            System.out.println("o aluno foi aprovado com a media: "+media);
        }else{
            System.out.println("o aluno foi reprovado com a media de "+media);
        }
    }
}