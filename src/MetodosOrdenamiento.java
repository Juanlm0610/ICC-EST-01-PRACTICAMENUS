import java.util.Arrays;

public class MetodosOrdenamiento {

    // Método Burbuja
    public static void burbuja(int[] arr, boolean ascendente, boolean logs) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (logs) {
                    System.out.println("i=" + i + " j=" + j + " [i]=" + arr[i] + " [j]=" + arr[j]);
                }
                if ((ascendente && arr[j] > arr[j + 1]) || (!ascendente && arr[j] < arr[j + 1])) {
                    if (logs) {
                        System.out.println("\tIntercambiamos " + arr[j] + " con " + arr[j + 1]);
                    }
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    if (logs) {
                        System.out.println("\t--------" + Arrays.toString(arr));
                    }
                }
            }
        }
    }

    // Método Selección
    public static void seleccion(int[] arr, boolean ascendente, boolean logs) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minMax = i;
            for (int j = i + 1; j < n; j++) {
                if (logs) {
                    System.out.println("i=" + i + " j=" + j + " [minMax]=" + arr[minMax] + " [j]=" + arr[j]);
                }
                if ((ascendente && arr[j] < arr[minMax]) || (!ascendente && arr[j] > arr[minMax])) {
                    minMax = j;
                }
            }
            if (logs) {
                System.out.println("\tIntercambiamos " + arr[i] + " con " + arr[minMax]);
            }
            
            int temp = arr[minMax];
            arr[minMax] = arr[i];
            arr[i] = temp;
            if (logs) {
                System.out.println("\t--------" + Arrays.toString(arr));
            }
        }
    }

    // Método Inserción
    public static void insercion(int[] arr, boolean ascendente, boolean logs) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            if (logs) {
                System.out.println("i=" + i + " j=" + j + " [key]=" + key);
            }
            while (j >= 0 && ((ascendente && arr[j] > key) || (!ascendente && arr[j] < key))) {
                if (logs) {
                    System.out.println("\tComparando " + key + " con " + arr[j]);
                }
                arr[j + 1] = arr[j];
                j--;
                if (logs) {
                    System.out.println("\t--------" + Arrays.toString(arr));
                }
            }
            arr[j + 1] = key;
            if (logs) {
                System.out.println("\tInsertado " + key + " en la posición " + (j + 1));
                System.out.println("\t--------" + Arrays.toString(arr));
            }
        }
    }

    // Método Burbuja Mejorado
    public static void burbujaMejorado(int[] arr, boolean ascendente, boolean logs) {
        int n = arr.length;
        boolean cambio;
        for (int i = 0; i < n - 1; i++) {
         cambio = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (logs) {
                    System.out.println("i=" + i + " j=" + j + " [i]=" + arr[i] + " [j]=" + arr[j]);
                }
                if ((ascendente && arr[j] > arr[j + 1]) || (!ascendente && arr[j] < arr[j + 1])) {
                    if (logs) {
                        System.out.println("\tIntercambiamos " + arr[j] + " con " + arr[j + 1]);
                    }
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                 cambio = true;
                    if (logs) {
                        System.out.println("\t--------" + Arrays.toString(arr));
                    }
                }
            }
            if ( cambio) break;  
        }
    }

    
    public static void imprimirArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
