// beecrowd | 1022

package src;

import java.util.Scanner;

public class TdaRacional {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int casosTeste = sc.nextInt();
        sc.nextLine();
        while (casosTeste > 0) {
            String[] entrada = sc.nextLine().split(" ");

            int N1 = Integer.parseInt(entrada[0]);
            int D1 = Integer.parseInt(entrada[2]);

            char operacao = entrada[3].charAt(0);

            int N2 = Integer.parseInt(entrada[4]);
            int D2 = Integer.parseInt(entrada[6]);

            int numerador, denominador;
            switch (operacao) {
                case '+':
                    numerador = N1 * D2 + N2 * D1;
                    denominador = D1 * D2;
                    break;
                case '-':
                    numerador = N1 * D2 - N2 * D1;
                    denominador = D1 * D2;
                    break;
                case '*':
                    numerador = N1 * N2;
                    denominador = D1 * D2;
                    break;
                case '/':
                    numerador = N1 * D2;
                    denominador = N2 * D1;
                    break;
                default:
                    throw new IllegalArgumentException("Operação desconhecida: " + operacao);
            }

            int gcd = gcd(numerador, denominador);

            System.out.println(numerador + "/" + denominador + " = " + (numerador/gcd) + "/" + (denominador/gcd));

            casosTeste--;
        }
        sc.close();
    }

    // Método que calcula o maior divisor comum (gcd)
    private static int gcd(int a, int b) {
        if(b == 0){
            return a;
        } else{
            return gcd(b, a % b);
        }
    }
}
