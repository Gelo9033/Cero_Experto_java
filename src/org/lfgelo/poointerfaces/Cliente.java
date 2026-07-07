
package org.lfgelo.poointerfaces;
public class Cliente {
     private Integer id;
    private String nombre;
    private String apellido;
     private static int ultimoId;

    public Cliente() {
        this.id = ++ultimoId;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Cliente(String nombre, String apellido) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // public String getNombre() {
    //     return nombre;
    // }

    // public String getApellido() {
    //     return apellido;
    // }
    @Override
    public String toString() {
        return "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'';
    }


}
