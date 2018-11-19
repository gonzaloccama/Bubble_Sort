package BubbleSort;

import java.util.Random;

/**
 * Created by Ccama on 9/05/2017.
 */
public class BubbleSort {
    public static void main(String[] args) {

        long inicio = System.nanoTime();

        int numeros[] = new int[100];

        Random numberRandom = new Random();

        for (int i = 0; i < 100 ; i++) {
            numeros[i] = numberRandom.nextInt(100) + 1;
        }


        System.out.println("----------------------------------------------------------------------------");
        System.out.println("\t\t\t\tGENERANDO 100 NUMEROS ALEATORIOS DE 1 - 100");
        System.out.println("----------------------------------------------------------------------------");
        int c=1;

        for (int i = 0; i < 100; i++) {
            if(numeros[i] < 10)
                System.out.print("[0" + numeros[i] + "]\t");
            else
                System.out.print("[" + numeros[i] + "]\t");

            if(i == 10*c-1){
                System.out.println();
                c++;
            }
        }
        System.out.println("----------------------------------------------------------------------------");
        System.out.println();

        OrdenaBuble n = new OrdenaBuble();
        n.ordenaBubble(numeros);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\tORDENADO POR METODO BURBUJA");
        System.out.println("----------------------------------------------------------------------------");
        c=1;

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] < 10)
                System.out.print("[0" + numeros[i] + "]\t");
            else
                System.out.print("[" + numeros[i] + "]\t");

            if(i == 10*c-1){
                System.out.println();
                c++;
            }
        }
        System.out.println("----------------------------------------------------------------------------");

        long fin = System.nanoTime();
        double dif = (double)(fin - inicio)*1.0e-9;
        System.out.println("tiempo de ejecucion: " + dif);


    }
}
