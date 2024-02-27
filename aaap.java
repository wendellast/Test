import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner t = new Scanner(System.in);

/*EXE 1
 * 
 *  System.out.print("Digite um numero aqui: ");        
        float num1 = t.nextFloat();
        System.out.print("Digite mais um numero aqui: ");        
        float num2 = t.nextFloat();
        System.out.print("Digite outro um numero aqui: ");        
        float num3 = t.nextFloat();
        double media = (num1+num2+num3) / 3;
        System.out.printf("A media do numero %.2f mais %.2f mais %.2f : é %.2f ", num1, num2, num3, media);  
 */

        /** EXE 2 
         * 
         * System.out.print("Digite um numero aqui: ");        
        float num1 = t.nextFloat();
        System.out.print("Digite mais um numero aqui: ");        
        float num2 = t.nextFloat();
        System.out.print("Digite outro um numero aqui: ");        
        float num3 = t.nextFloat();
        double media = (num1*3+num2*5+num3*8) / 16;
        System.out.printf("A media do numero %.2f mais %.2f mais %.2f : é %.2f ", num1, num2, num3, media);  


         * 
         * 
         * 
         */

         /** EXER3
          * System.out.print("Digite um numero aqui: ");        
        float num1 = t.nextFloat();
        System.out.print("Digite mais um numero aqui: ");        
        float num2 = t.nextFloat();
        double area = num1*num2;
        System.out.printf("A area do quadrado é %f", area);  

          */
        
        /**
         * double pi = Math.PI;
          System.out.print("Digite o raio aqui: ");        
          float num1 = t.nextFloat();
          double area = pi * (num1*num1);
          System.out.printf("O raio é de %f ", area);  
  
         * 
         */

          System.out.print("Digite o seu peso aqui: ");
          float peso  =  t.nextFloat();
          System.out.print("Digite sua altura aqui  ");
          float altura = t.nextFloat();
          float imc = peso / (altura * altura);
          System.out.printf("O imc é  %f ", imc);  
  

    }
}
