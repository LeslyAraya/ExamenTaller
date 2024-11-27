/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloInscripcion;

import Participantes.Participante;
import java.util.Date;

/**
 *
 * @author Student
 */
public class Inscripcion {
    private int id;
    private String Nombre;
    private String Taller;
    private Participante participante;
    private Date fecha;
    private String asistencia;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getTaller() {
        return Taller;
    }

    public Participante getParticipante() {
        return participante;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getAsistencia() {
        return asistencia;
    }

    public Inscripcion(int id, String Nombre, String Taller, Participante participante, Date fecha, String asistencia) {
        this.id = id;
        this.Nombre = Nombre;
        this.Taller = Taller;
        this.participante = participante;
        this.fecha = fecha;
        this.asistencia = asistencia;
    }
    
    
}
