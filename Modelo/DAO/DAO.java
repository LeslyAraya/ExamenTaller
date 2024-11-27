/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo.DAO;

import Conexion.Conexion;
import ModeloInscripcion.InscripcionDTO;
import java.sql.SQLException;


/**
 *
 * @author Student
 */
public abstract class DAO<dto> {
    protected Conexion connection;
    
    public DAO(Conexion connection){
        
    }
    public abstract boolean Agregar (Object dto) throws SQLException;
    public abstract boolean Eliminar (Object dto) throws SQLException;
}
