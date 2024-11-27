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
public class InscripcionDTO {
    private final int id;
    private final String Nombre;
    private final String Taller;
    private final Participante participante;
    private final Date fecha;
    private final String asistencia;

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

    public InscripcionDTO(int id, String Nombre, String Taller, Participante participante, Date fecha, String asistencia) {
        this.id = id;
        this.Nombre = Nombre;
        this.Taller = Taller;
        this.participante = participante;
        this.fecha = fecha;
        this.asistencia = asistencia;
    }
    
    
}
