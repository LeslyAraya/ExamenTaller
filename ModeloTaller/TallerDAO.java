/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloTaller;

import Conexion.Conexion;
import Modelo.DAO.DAO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;


/**
 *
 * @author Student
 */
public class TallerDAO extends DAO<TallerDTO> {

    public TallerDAO(Conexion connection) {
        super(connection);
    }

    @Override
    public boolean Agregar(Object dto) throws SQLException {
        String sql = "INSERT INTO Taller (nombre, fecha, lugar, capacidad) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.preparedStatement(sql)) {
            statement.setString(1, dto.getNombre());
            statement.setString(2, dto.getFecha());
            statement.setString(3, dto.getLugar());
            statement.setInt(4, dto.getCapacidad());
            return statement.executeUpdate() > 0;
        }
    }

    @Override
    public boolean Eliminar(Object dto) throws SQLException {
        String sql = "DELETE FROM Taller WHERE id = ?";
        try (PreparedStatement statement = connection.preparedStatement(sql)) {
            statement.setInt(1, (int) id);
            return statement.executeUpdate() > 0;
        }
    }
}

