package view;

import java.util.Scanner;

/**
 * Clase encargada de la entrada y salida de información por la consola
 *
 * @author Helio Ramirez
 * @author Jhon Erick Santos G46
 * @version 2.0
 */
public class View {

    /**Atributo que permite la lectura por consola*/
    private Scanner read;

    /**constructor*/
    public View(){
        read = new Scanner(System.in);
    }

    /**
     * Método para leer un dato String
     *
     * @param mensaje Mensaje para mostrar por consola
     * @return Dato String leído
     */
    public String readDataString(String mensaje) {
        System.out.println(mensaje);
        String dato = read.nextLine();
        return dato;
    }

    /**
     * Método para leer un dato Long
     *
     * @param mensaje Mensaje para mostrar por consola
     * @return Dato Long leído
     */
    public long readDataLong(String mensaje) {
        long dato = 0;
        System.out.println(mensaje);
        try {
            dato = read.nextLong();
            read.nextLine();

        } catch (Exception e) {
            System.out.println("Ingreso un dato no valido");
            dato = 0;
        }
        return dato;
    }

    /**
     * Método para leer un dato int
     *
     * @param mensaje Mensaje para mostrar por consola
     * @return Dato entero leído
     */
    public int readDataInt(String mensaje) {
        int dato = 0;
        System.out.println(mensaje);
        try {
            dato = read.nextInt();
            read.nextLine();

        } catch (Exception e) {
            System.out.println("Ingreso un dato no valido");
            dato = 0;
        }
        return dato;
    }

    /**
     * Método para mostar un mensaje por consola
     *
     * @param mensaje El texto a mostrar
     */
    public void showInformation(String mensaje) {
        System.out.println(mensaje);
    }


}
