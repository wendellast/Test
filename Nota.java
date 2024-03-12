import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite a nota do aluno: ");
        float nota = t.nextFloat();

        if (nota >= 7) {
            System.out.print("Aluno Aprovado sua nota foi de " + nota);
        }

        else if (nota >= 6) && (nota < 7) {
            System.out.print("Aluno Aprovado sua nota foi de final de  " + nota);
        }

        else if (nota < 6) {
            System.out.print("Aluno Reprovado sua nota foi de final de  " + nota);
        }

        else {
            System.out.print("Digite uma nota valida");
        }

    }
}
