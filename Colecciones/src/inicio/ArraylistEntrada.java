package inicio;

import java.util.ArrayList;

public class ArraylistEntrada {

    static ArrayList<String> listaPalabras;

    public static void main(String[] args) {
        int tamanio;
        boolean completado;
        //comentario 
        // comentario desde casa
        // otro comentario
        // comentario nuevo desde casa
        listaPalabras = new ArrayList<String>();
        agregarElemento("palabra uno");
        agregarElemento("palabra dos");
        agregarElemento("palabra tres");
        agregarElemento("palabra cuatro");
        agregarElemento("palabra cinco");

       // recorrerArray();
        //recorrerCualquierArray(listaPalabras);
      //  listaPalabras.remove(0 );
       // listaPalabras.remove("palabra dos");
        recorrerArray();
        //borrarElemento("palabra uno");
        //listaPalabras.clear(); //para limpiar y poner el size a 0
       // boolean esta = listaPalabras.contains("palabra seis");
       // System.out.println(esta);
        //listaPalabras.set(0, "nueva palabra"); //sustituye la palabra
       // System.out.println(listaPalabras.indexOf("palabra dos")); // me da la posicion de la palabra  dentro del indexof
       // System.out.println(listaPalabras.isEmpty());//para ver si esta vacia o no la lista

       /* listaPalabras.add("palabra uno");
        listaPalabras.add("palabra dos");
        listaPalabras.add("palabra tres");
        listaPalabras.add("palabra cuatro");
        listaPalabras.add("palabra cinco");*/

        //tamanio = listaPalabras.size();

      //  System.out.println(tamanio);
      //  System.out.println(completado);
      //  String palabraRecuperada = listaPalabras.get(0);
      //  System.out.println(palabraRecuperada);

        for (int i = 0; i < listaPalabras.size(); i++) {
            String palabraRecuperada = listaPalabras.get(i);
            System.out.println(palabraRecuperada);

        }
        /*for(String palabra:listaPalabras){
        if(palabra.equals("palabra tres")){
            System.out.println(palabra);
        }

    }*/

    }

    public static void agregarElemento(String palabra) {
        listaPalabras.add(palabra);

    }

    public static void recorrerArray() {


        for(String palabra:listaPalabras){
            System.out.println(palabra);
        }

    }

        public static void recorrerCualquierArray(ArrayList lista) {
        for(Object dato:lista){
            System.out.println(dato);
        }

    }

    public static void borrarElemento(String elemento) {

        for(int i=0;i <listaPalabras.size();i++){
            if(elemento.equals(listaPalabras.get(i))){
                listaPalabras.remove(i);
                break;
            }
        }

    }

}
