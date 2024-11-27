/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloInscripcion;

import Conexion.Conexion;
import Modelo.DAO.DAO;
import Modelo.Dao.Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
public class InscripcionDAO extends DAO<InscripcionDTO> {

    public InscripcionDAO(Conexion connection) {
        super(connection);
    }

    @Override
    public boolean Agregar(Object dto) throws SQLException {
        String sql = "INSERT INTO inscripcion (id, nombre, Taller, participante,fecha,asistencia) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, dto.getId());
            statement.setString(2, dto.getNombre());
            statement.setString(3, dto.getTaller());
            statement.setString(4, dto.getparticipante));
             statement.setString(4, dto.getfecha));
              statement.setString(4, dto.getasistencia));
             
            return statement.executeUpdate() > 0; 
        }
    }

    @Override
    public boolean Eliminar(Object dto) throws SQLException {
     String sql = "DELETE FROM inscripcion WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, (String) id);
            return statement.executeUpdate() > 0;
        }
   
    }
    
}
