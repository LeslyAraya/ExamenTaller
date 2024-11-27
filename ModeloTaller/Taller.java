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
public class Taller {
    private int id;
    private String nombre;
    private Date fecha;
    private String lugar;
    private String Capacidad;

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

    public Taller(int id, String nombre, Date fecha, String lugar, String Capacidad) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.Capacidad = Capacidad;
    }
    
             
}
