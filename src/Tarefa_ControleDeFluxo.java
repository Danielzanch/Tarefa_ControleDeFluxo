import java.util.Scanner;

public class Tarefa_ControleDeFluxo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String alternativa = "";
        do {
            System.out.println("Digite a Primeira Nota: ");
            Float nota1 = s.nextFloat();
            System.out.println("Digite a Segunda Nota: ");
            Float nota2 = s.nextFloat();
            System.out.println("Digite a Terceira Nota: ");
            Float nota3 = s.nextFloat();
            System.out.println("Digite a Quarta Nota: ");
            Float nota4 = s.nextFloat();

            Float media = (nota1 + nota2 + nota3 + nota4)/4;
            System.out.println("");

            System.out.println("");
            System.out.println("****************************************");
            System.out.println("");

            System.out.println("       A média do aluno foi: " + media);

            if (media >= 7) {
                System.out.println("         Aluno foi APROVADO!");
            } else if (media >= 5) {
                System.out.println("       Aluno esta de RECUPERAÇÂO!");
            } else {
                System.out.println("         Aluno esta REPROVADO!");
            }

            System.out.println("");
            System.out.println("****************************************");
            System.out.println("");

            System.out.println("Deseja fazer um novo calculo de media: ");
            alternativa = s.next();
        } while (alternativa.equals("Sim"));

        System.out.println("Obrigado por utilizar nossa calculadora de medias!");
    }
}
