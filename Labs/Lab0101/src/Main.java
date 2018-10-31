import javax.swing.*;


public class Main {


    public static void main(String[] args) {


        String name = JOptionPane.showInputDialog(null, "What is your name?");
        String message =
                String.format("Welcome %s to your first game ", name);


       //JOptionPane.showConfirmDialog(null, "Do you wont to play");
        JOptionPane.showMessageDialog(null, message);



    }
}

