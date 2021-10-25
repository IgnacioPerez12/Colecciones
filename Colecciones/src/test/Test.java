package test;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        
        //Fomra 1 para imprimir una lista
        for (Object elem : miLista) {
            System.out.println("elem: " + elem);
        }
        
        System.out.println("\n");
        
        //Fomra 2 para imprimir una lista (Expresion Lambda)
        miLista.forEach(elem -> {
            System.out.println("elem: " + elem);
        });
        
        System.out.println("\n");
        
        //Map
        Map miMap = new HashMap();
        miMap.put("Valor 1", "Ignacio");
        miMap.put("Valor 2", "Santiago");
        miMap.put("Valor 3", "Alejandro");
        
        String nombre = (String) miMap.get("Valor 2");
        
        System.out.println("Nombre del valor 2: " + nombre);

        System.out.println("\n");
        
        //Imprimimos una lista mediante el metodo imprimir()
        imprimir(miLista);
        
        System.out.println("\n");
        
        //Imprimimos un map mediante el metodo imprimir()
        imprimir(miMap.keySet()); //Devuelve todas las claves
        imprimir(miMap.values()); //Devulve todos los valores de mi map
        
    }
    
    public static void imprimir(Collection coleccion){
        coleccion.forEach(elem -> {
            System.out.println("elem: " + elem);
        });     
    }
}
