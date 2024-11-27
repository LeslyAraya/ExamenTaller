/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Participantes;

/**
 *
 * @author Student
 */
public class ParticipanteDTO {
    private final int id; 
    private final String nombre;
    private final int telefono;
    private final String correo;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public ParticipanteDTO(int id, String nombre, int telefono, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }
    
    
}
