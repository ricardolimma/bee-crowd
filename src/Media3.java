package src;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Media3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1 =  sc.nextFloat();
        float n2 =  sc.nextFloat();
        float n3 =  sc.nextFloat();
        float n4 =  sc.nextFloat();

        DecimalFormat df = new DecimalFormat("0.0");

        float media = ((n1*2/10) + (n2*3/10) + (n3*4/10) + (n4*1/10));


        System.out.printf("Media: %.1f\n", Math.nextDown(media));

        if (media >= 7) {
            System.out.println("Aluno aprovado.");
            sc.close();
        }

        else if(media >= 5.0 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            float notaExame = sc.nextFloat();
            float mediaFinal = (notaExame + media) / 2;

            System.out.println("Nota do exame: "+ df.format(notaExame));

            if (mediaFinal >= 5.0) {
                System.out.println("Aluno aprovado.");
                System.out.println("Media final: "+ df.format(mediaFinal));
            }
            else {
                System.out.println("Aluno reprovado.");
                System.out.println("Media final: "+ df.format(mediaFinal));
            }

        }

        else {
            System.out.println("Aluno reprovado.");
        }


        sc.close();
    }
}
