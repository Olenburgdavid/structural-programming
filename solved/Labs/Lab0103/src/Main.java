import java.util.*;

public class Main {

    public static void main(String[] args) {
        String username;
        String format;
        try (Scanner david = new Scanner(System.in)) {
            System.out.print("what is your name!");
            username = david.next();
            System.out.print("where do you live");
            format = david.next();
            System.out.print("you are stuped");
            String egor = david.next();
        }
        System.out.print("Hello, " + username  +  format);




    }


    }

