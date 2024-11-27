/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloTaller;

import Conexion.Conexion;
import Modelo.DAO.DAO;
import Modelo.Dao.Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
<<<<<<< Updated upstream
import java.sql.PreparedStatement;
=======
import java.util.ArrayList;
import java.util.List;
>>>>>>> Stashed changes

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
<<<<<<< Updated upstream
        if (dto == null & !ValidatePK)
          }
=======
        String sql = "INSERT INTO taller (id, nombre, fecha, lugar, capacidad) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, dto.getId());
            statement.setString(2, dto.getNombre());
            statement.setString(3, dto.getFecha());
            statement.setString(4, dto.getLugar());
            statement.setString(5, dto.getCapacidad());
            return statement.executeUpdate() > 0;
    }
    }
>>>>>>> Stashed changes

    @Override
    public boolean Eliminar(Object dto) throws SQLException {
        String sql = "DELETE FROM taller WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, (String) id);
            return statement.executeUpdate() > 0;
    }
    }
    
    public boolean ValidatePK(TallerDAO id) throws SQLException {
        return Agregar(id) == null;
    }
}
