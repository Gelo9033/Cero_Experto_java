package org.lfgelo.intefaces;

import org.lfgelo.intefaces.modelo.Curriculo;
import org.lfgelo.intefaces.modelo.Hoja;

public class PruebaImprenta {
    public static void main(String[] args) {
        Curriculo curriculo = new Curriculo( "Contenido del curriculo", new org.lfgelo.intefaces.modelo.Persona("Luis", "F. Gelo"), "Ingeniería de Software")
                .agregarHabilidad("Java")
                .agregarHabilidad("Spring Boot")
                .agregarHabilidad("SQL");
        imprimir(curriculo);
    }
    public static void imprimir(Hoja hoja){
        System.out.println(hoja.imprimir());
    }
}
