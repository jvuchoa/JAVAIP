
public class main {

   private double altura;
   private double peso;

   public main(double altura, double peso) {
    this.altura= altura;
    this.peso = peso;
    }

    public double getPeso () {
        return peso;
    }

    public void setpeso(double peso){
        this.peso = peso;
    }

    public double getaltura () {
        return altura;

    }
    public void setaltura(double altura) {
        this.altura = altura;
    }
    public void IMC() {
        double imc = peso/(altura*altura);
        System.out.print("IMC do individuo: " +imc);
    }
}
