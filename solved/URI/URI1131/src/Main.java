import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ver, grem, inter, gremGaho, interGaho,empate,grenais;
        gremGaho = interGaho = empate = grenais = 0;
        ver = 1;

        while (ver == 1) {
            inter = sc.nextInt();
            grem = sc.nextInt();

            if (grem == inter)
                empate++;
            else if (grem >inter)
                gremGaho++;
            else if (grem < inter)
                interGaho++;
            System.out.println("Novo grenal (1-sim 2-nao)");
            ver = sc.nextInt();
            grenais++;
            }
        System.out.println(grenais +" grenais\nInter:"+interGaho+"\nGremio:"+gremGaho+"\nEmpates:"+empate);

        if (gremGaho > interGaho)
            System.out.println("Gremio venceu mais");
        else if (gremGaho < interGaho)
            System.out.println("Inter venceu mais");
        else if (gremGaho == interGaho)
            System.out.println("Nao houve vencedor");


        }

    }

