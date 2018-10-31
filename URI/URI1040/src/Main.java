import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float average, a5, recalaverage;
        Scanner scan = new Scanner(System.in);
        float a1 = scan.nextFloat();
        float a2 = scan.nextFloat();
        float a3 = scan.nextFloat();
        float a4 = scan.nextFloat();

        average = ((a1 * 2)+(a2 * 3)+( a3 * 4)+(a4 * 1))/10;

        if (average >= 7.0) {

            System.out.printf("Media: %.1f\n",average);
            System.out.print("Aluno aprovado.\n");
        }
        else if (average >= 5.0 && average <= 6.9) {

            System.out.printf("Media: %.1f\n",average);
            System.out.print("Aluno em exame.\n");
            a5 =scan.nextFloat();
            System.out.printf("Nota do exame: %.1f\n",a5);
            recalaverage =(average + a5) / 2;

            if (recalaverage >= 5.0) {
                System.out.print("Aluno aprovado.\n");

            }else {
                System.out.print("Aluno reprovado.\n");

            }

            System.out.printf("Media final: %.1f\n",recalaverage);

        }

        else if (average < 5.0) {

            System.out.printf("Media: %.1f\n",average);
            System.out.print("Aluno reprovado.\n");

        }

    }

}