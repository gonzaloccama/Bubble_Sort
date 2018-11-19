package BubbleSort;

/**
 * Created by Ccama on 9/05/2017.
 */
public class OrdenaBuble {
    public void ordenaBubble(int[] array){
        int aux;
        boolean cambios;
        while (true){

            cambios = false;

            for (int i = 1; i < array.length; i++) {
                if(array[i] < array[i-1]){
                    aux = array[i];
                    array[i] = array[i-1];
                    array[i-1] = aux;
                    cambios = true;
                }
            }
            if (cambios == false){
                break;
            }
        }
    }
}
