package src;

import java.util.Random;
import java.util.Scanner;

public class FormulaDeBhaskara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        if ((a == 0) | (b * b - 4 * a * c < 0)) {
            System.out.println("Impossivel calcular");
        }
        else {
        float R1 = (float) ((-b) + Math.sqrt(b*b - (4*a*c)))/(2*a);
        float R2 = (float) ((-b) - Math.sqrt(b*b - (4*a*c)))/(2*a);

        System.out.printf("R1 = %.5f\n", R1);
        System.out.printf("R2 = %.5f\n", R2);

        }

        sc.close();
    }
}
