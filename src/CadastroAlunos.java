import java.util.Scanner;

public class CadastroAlunos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();

        System.out.println("Nota 1:");
        double nota1 = scanner.nextInt();

        System.out.println("Nota 2:");
        double nota2 = scanner.nextInt();

        System.out.println("Nota 3:");
        double nota3 = scanner.nextInt();

        double media = calcularMedia(nota1, nota2, nota3);

        String situacao = verificarSituacao(media);

        System.out.println("=============================");
        System.out.println("     CADASTRO DE ALUNOS      ");
        System.out.println("=============================");
        System.out.println();
        System.out.printf("Aluno........: %s%n", nome);
        System.out.printf("Nota 1.......: %.0f%n", nota1);
        System.out.printf("Nota 2.......: %.0f%n", nota2);
        System.out.printf("Nota 3.......: %.0f%n", nota3);
        System.out.println("-----------------------------");
        System.out.printf("Média Final..: %.2f%n", media);
        System.out.printf("Situação.....: %s%n", situacao);

        scanner.close();
    }

    public static double calcularMedia(double nota1,double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3.0;
    }

    public static String verificarSituacao(double media) {

        if (media >= 9) {
            return "Aprovado com Excelência";
        } else if (media >= 7) {
            return "Aprovado";
        } else if (media >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }
}
