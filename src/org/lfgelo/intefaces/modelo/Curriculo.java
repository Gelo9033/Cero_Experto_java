package org.lfgelo.intefaces.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja {

    private Persona persona;
    private String carrera;
    private List<String> habilidades;

    public Curriculo(String contenido, Persona persona, String carrera) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.habilidades = new ArrayList<>();
    }

    public Curriculo agregarHabilidad(String habilidad) {
        habilidades.add(habilidad);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append(persona.getNombre() + " " + persona.getApellido())
          .append("\nCarrera: " + carrera)
                .append("\nHabilidades: ");
        for (String habilidad : habilidades) {
            sb.append(habilidad).append("\n ");
        }



        return sb.toString();
    }

}
