import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float x;
        int note100, note50, note20, note10, note5, note2;
        int moeda1, moeda5, moeda25, moeda10, moeda05, moeda01;
            int reminder100;
            Scanner input = new Scanner(System.in);
            x = input.nextFloat();
            note100 = (int) x / 100;
            reminder100 = (int) (x % 100);
            note50 = (reminder100) / 50;
            note20 = (reminder100 % 50) / 20;
            note10 = ((reminder100 % 50) % 20) / 10;
            note5 = (((reminder100 % 50) % 20) % 10) / 5;
            note2 = (((reminder100 % 50) % 20) % 5) / 2;


            moeda1 = (((((reminder100 % 50) % 20) % 5) % 2) / 1);
            float reminderMoeda = (float) (((((reminder100 % 50) % 20) % 5) % 2));

           moeda5 = (int) (((((((reminder100 % 50) % 20) % 5) % 2) % 1) % .5) / .25);

            moeda25 = (int) (((((((reminder100 % 50) % 20) % 5) % 2) % 1) % .5) / .25);
            moeda10 = (int) ((((((((reminder100 % 50) % 20) % 5) % 2) % 1) % .5) % .25) / .1);
            moeda05 = (int) (((((((((reminder100 % 50) % 20) % 5) % 2) % 1) % .5) % .25) % .1) / .05);
            moeda01 = (int) ((((((((((reminder100 % 50) % 20) % 5) % 2) % 1) % .5) % .25) % .1) % .05) / .01);


            System.out.print("NOTAS:\n");
            System.out.print(note100 + " nota(s) de R$ 100.00\n");
            System.out.print(note50 + " nota(s) de R$ 50.00\n");
            System.out.print(note20 + " nota(s) de R$ 20.00\n");
            System.out.print(note10 + " nota(s) de R$ 10.00\n");
            System.out.print(note5 + " nota(s) de R$ 5.00\n");
            System.out.print(note2 + " nota(s) de R$ 2.00\n\n");

            System.out.print("MOEDAS:\n");
            System.out.print(moeda1 + " moeda(s) de R$ 1.00\n");
            System.out.print(moeda5 + " moeda(s) de R$ 0.50\n");
            System.out.print(moeda25 + " moeda(s) de R$ 0.25\n");
            System.out.print(moeda10 + " moeda(s) de R$ 0.10\n");
            System.out.print(moeda05 + " moeda(s) de R$ 0.05\n");
            System.out.print(moeda01 + " moeda(s) de R$ 0.01\n");
        }
    }