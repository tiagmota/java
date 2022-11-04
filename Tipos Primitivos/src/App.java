import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
 
        //System.out.println("A nota é " + nota);
        System.out.printf("A nota de %s é %.2f", nome, nota); //com formatação. depois do % é quantas casas decimais
    }
}
