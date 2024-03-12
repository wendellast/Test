import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.print("Digite a sua senha: ");
        String senha = t.nextLine();

        System.out.println(senha);

        if (senha.equals("movidoACafe")) {
            System.out.println("ACESSO PERMITIDO!");
        } else {
            System.out.println("ACESSO NEGADO!");
        }

    }
}
