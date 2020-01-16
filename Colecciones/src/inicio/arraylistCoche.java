package inicio;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylistCoche {

    static ArrayList<Object[]> coches;
    static Scanner teclado = new Scanner(System.in);
    static int opcion = 0;

    public static void main(String[] args) {

        coches = new ArrayList<>();
        do {
            System.out.println("1-Agregar coche");
            System.out.println("2-Listar coche");
            System.out.println("3-Buscar coche");
            System.out.println("4-Eliminar coches");
            System.out.println("5-Calcular costes");
            System.out.println("6-vaciar coches");
            System.out.println("7-Salir");


            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    agregarCoche();
                    break;

                case 2:
                    listarCoches();
                    break;

                case 3:
                    System.out.println("Qué matricula quieres buscar");
                    String matriculaBuscar=teclado.next();
                    buscarCoche(matriculaBuscar);
                    break;

                case 4:
                    System.out.println("Introduce la matricula del coche que quieres eliminar");
                    String matriculaBorrar=teclado.next();
                    eliminarCoche(matriculaBorrar);
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    break;

                default:
                    System.out.println("la opcion no es correcta");
            }

        } while (opcion != 7);


    }

    public static void agregarCoche() {
        System.out.println("intro modelo");
        String modelo = teclado.next();

        System.out.println("intro cv");
        int cv = teclado.nextInt();

        System.out.println("intro coste");
        double coste = teclado.nextDouble();

        System.out.println("intro matricula");
        String matricula = teclado.next();

        Object[] unCoche = {modelo, cv, coste, matricula};

        boolean existe = false;                             // con esto  evaluamos si hay alguno, poniendo un false como menos restrictivo

        for (Object[] elemento : coches) {                  //con el for recorremos toda la lista hasta que encontremo
            if (elemento[3].equals(matricula)) {            //una matricula igual en ese caso se rompe con un break
                existe = true;
                break;
            }
        }

        //hay alguno?
        if (existe) {
            System.out.println("El coche no se puede agregar");

        } else {
            coches.add(unCoche);
        }


    }

    public static void listarCoches() {

        for (Object[] elemento : coches) {
            for (Object item : elemento) {
                System.out.printf(item + " ");
            }
            System.out.println();
        }

    }

    public static void buscarCoche(String matriculaBuscar) {
        for(Object[] elemento:coches){
            if(elemento[3].equals(matriculaBuscar)){
                for (Object item:elemento) {
                    System.out.printf(item+" ");
                }
                System.out.println();
                break;
            }
        }




    }

    public static void eliminarCoche(String matriculaBorrar) {
        Object[]borrado=null;
        for (int i=0; i<coches.size();i++){
            Object[]elemento=coches.get(i);


            if(elemento[3].equals(matriculaBorrar)){
                coches.remove(i);
                break;
            }

        }
        if(borrado!=null){
            System.out.println("coche borrado correctamente");
        }else {
            System.out.println("coche no encontrado");
        }



    }

    public static void calcularCostes(){

    }
}