/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloTaller;

import Conexion.Conexion;
import Modelo.DAO.DAO;
<<<<<<< HEAD
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
=======
import java.sql.SQLException;
import java.sql.PreparedStatement;


>>>>>>> origin/Desarrollo


/**
 *
 * @author Student
 */
public class TallerDAO extends DAO<Taller> {

    public TallerDAO(Conexion connection) {
        super(connection);
    }

    @Override
    public boolean Agregar(Object dto) throws SQLException {
<<<<<<< HEAD
        String sql = "INSERT INTO Taller (nombre, fecha, lugar, capacidad) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.preparedStatement(sql)) {
            statement.setString(1, dto.getNombre());
            statement.setString(2, dto.getFecha());
            statement.setString(3, dto.getLugar());
            statement.setInt(4, dto.getCapacidad());
            return statement.executeUpdate() > 0;
        }
=======

       

        String sql = "INSERT INTO Taller (nombre, fecha, lugar, capacidad) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, sql);
              statement.setString(1, sql);
              statement.setString(1, sql);
              statement.setString(1, sql);
            return statement.executeUpdate() > 0;
        }

>>>>>>> origin/Desarrollo
    }

    @Override
    public boolean Eliminar(Object dto) throws SQLException {
<<<<<<< HEAD
        String sql = "DELETE FROM Taller WHERE id = ?";
        try (PreparedStatement statement = connection.preparedStatement(sql)) {
            statement.setInt(1, (int) id);
=======



        String sql = "DELETE FROM Taller WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setNString(1,  sql);
>>>>>>> origin/Desarrollo
            return statement.executeUpdate() > 0;
        }
    }
}

