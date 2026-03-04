package org.lfgelo.generics;
import java.util.Arrays;
import java.util.List;
import org.lfgelo.poointerfaces.Cliente;

public class EjemploGenerics {

    public static void main(String[] args) {
         //List<Cliente> clientes = new ArrayList<>();
        // clientes.add(new Cliente("Juan", "Pérez"));
        // clientes.add(new Cliente("María", "Gómez"));
        
        //Cliente juan = clientes.iterator().next();
        Cliente[] clientesArr = {new Cliente("Ana", "López"), 
                                 new Cliente("Luis", "Martínez")};
        Integer[] enterosArr = {1, 2, 3, 4, 5};
        List<Cliente> clientesList = fromArrList(clientesArr);
        List<Integer> enterosList = fromArrList(enterosArr);

        clientesList.forEach(System.out::println);
        enterosList.forEach(System.out::println);
    }
    public static <T> List<T> fromArrList(T[] c) {
        return Arrays.asList(c);
    }

}
