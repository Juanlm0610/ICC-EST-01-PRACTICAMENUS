import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion, n;

        do {
            System.out.println("Menu Principal");
            System.out.println("1. Ingrese un arreglo");
            System.out.println("2. Ordenar Arreglo");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("Ingrese el tamaño de su arreglo:");
                n = scanner.nextInt();
                int[] arregloOriginal = new int[n];

                for (int i = 0; i < n; i++) {
                    System.out.println("Ingrese el valor para " + (i + 1) + ":");
                    arregloOriginal[i] = scanner.nextInt();
                }

                while (opcion != 0) {
                    System.out.println("\nEscoja un método de ordenamiento:");
                    System.out.println("1. Metodo Burbuja");
                    System.out.println("2. Metodo Seleccion");
                    System.out.println("3. Metodo Insercion");
                    System.out.println("4. Metodo Burbuja Mejorado");
                    System.out.println("0. Regresar al menu principal");
                    opcion = scanner.nextInt();

                    if (opcion != 0) {
                        
                        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

                        System.out.println("Escoja ascendente o descendente:");
                        System.out.println("1. Ascendente");
                        System.out.println("2. Descendente");
                        boolean ascendente = scanner.nextInt() == 1;

                        System.out.println("¿Quiere ver cada paso?");
                        System.out.println("1. Sí");
                        System.out.println("2. No");
                        boolean mostrarLogs = scanner.nextInt() == 1;

                        switch (opcion) {
                            case 1:
                                MetodosOrdenamiento.burbuja(arreglo, ascendente, mostrarLogs);
                                break;
                            case 2:
                                MetodosOrdenamiento.seleccion(arreglo, ascendente, mostrarLogs);
                                break;
                            case 3:
                                MetodosOrdenamiento.insercion(arreglo, ascendente, mostrarLogs);
                                break;
                            case 4:
                                MetodosOrdenamiento.burbujaMejorado(arreglo, ascendente, mostrarLogs);
                                break;
                        }

                        System.out.println("Arreglo ordenado:");
                        MetodosOrdenamiento.imprimirArray(arreglo);
                    }
                }
            }

        } while (opcion != 0);
        scanner.close();
    }
}
