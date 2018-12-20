//URI1097 IJ3

public class Main {
    public static void main(String[] args) {
	for (int i = 1,j = 7; i <= 9; i += 2, j += 2) {
	    for (int I = i, J = j; J >= (j - 2); J--){
        System.out.print("I=" + I +" J=" + J + "\n");
    }
	}
    }
}
