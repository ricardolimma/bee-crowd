package src;

import java.util.Random;
import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int atual = N;

            int ced100 = N/100;
            atual -= ced100* 100;

            int ced50 = atual/50;
            atual -= ced50 *50;

            int ced20 = atual/20;
            atual -= ced20 * 20;

            int ced10 = atual/10;
            atual -= ced10 * 10;

            int ced5 = atual/5;
            atual -= ced5 * 5;

            int ced2 = atual/2;
            atual -= ced2 * 2;

            int ced1 = atual;

            System.out.println(N);
            System.out.println(ced100 + " nota(s) de R$ 100,00");
            System.out.println(ced50 + " nota(s) de R$ 50,00");
            System.out.println(ced20 + " nota(s) de R$ 20,00");
            System.out.println(ced10 + " nota(s) de R$ 10,00");
            System.out.println(ced5 + " nota(s) de R$ 5,00");
            System.out.println(ced2 + " nota(s) de R$ 2,00");
            System.out.println(ced1 + " nota(s) de R$ 1,00");

        }
    }
