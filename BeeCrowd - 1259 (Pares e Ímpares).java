import java.util.*;

public class ParesImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();
        List<Integer> impar = new ArrayList<>();
        List<Integer> par = new ArrayList<>();

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            numeros.add(sc.nextInt());
        }
        for(Integer x: numeros) {
            if(x%2 == 0) {
                par.add(x);
            }
            else {
                impar.add(x);
            }

        }
        Collections.sort(par);
        Collections.sort(impar);
        Collections.reverse(impar);

        for(Integer pares: par) {
            System.out.println(pares);
        }
        for(Integer impares: impar) {
            System.out.println(impares);

            sc.close();

        }

    }
}
