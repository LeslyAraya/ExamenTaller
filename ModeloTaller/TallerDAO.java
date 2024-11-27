/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloTaller;

import Conexion.Conexion;
import Modelo.DAO.DAO;
<<<<<<< HEAD
import Modelo.Dao.Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.PreparedStatement;

import java.util.ArrayList;
import java.util.List;
=======
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
>>>>>>> cc3a0f0 (Arreglos)


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
<<<<<<< HEAD
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
=======
        String sql = "INSERT INTO Taller (nombre, fecha, lugar, capacidad) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, dto.getNombre());
            statement.setString(2, dto.getFecha());
            statement.setString(3, dto.getLugar());
            statement.setInt(4, dto.getCapacidad());
            return statement.executeUpdate() > 0;
        }
>>>>>>> cc3a0f0 (Arreglos)
    }

    @Override
    public boolean Eliminar(Object dto) throws SQLException {
<<<<<<< HEAD
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
=======
        String sql = "DELETE FROM Taller WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, (int) id);
            return statement.executeUpdate() > 0;
        }
    }
}

>>>>>>> cc3a0f0 (Arreglos)
