import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        String a, b, c;
        a = scan.nextLine();
        b = scan.nextLine();
        c = scan.nextLine();


        if (a.equals("vertebrado")) if (b.equals("mamifero")) if (c.equals("onivoro")) System.out.println("homem");
        else System.out.println("vaca");  else if (c.equals("carnivoro"))  System.out.println("aguia");
        else System.out.println("pomba");

        if (a.equals("invertebrado"))  if (b.equals("inseto")) if (c.equals("hematofago")) System.out.println("pulga");
        else System.out.println("lagarta"); else if (c.equals("hematofago")) System.out.println("sanguessuga");
        else System.out.println("minhoca");
    }

}
