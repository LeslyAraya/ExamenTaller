/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloTaller;

import java.util.Date;

/**
 *
 * @author Student
 */
public class TallerDTO {
    private final int id;
    private final String nombre;
    private final Date fecha;
    private final String lugar;
    private final String Capacidad;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public String getCapacidad() {
        return Capacidad;
    }

    public TallerDTO(int id, String nombre, Date fecha, String lugar, String Capacidad) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.Capacidad = Capacidad;
    }
    
  
}
