/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloTaller;

import Conexion.Conexion;
import Modelo.DAO.DAO;
import java.sql.SQLException;
import java.sql.PreparedStatement;




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

       

        String sql = "INSERT INTO Taller (nombre, fecha, lugar, capacidad) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, sql);
              statement.setString(1, sql);
              statement.setString(1, sql);
              statement.setString(1, sql);
            return statement.executeUpdate() > 0;
        }

    }

    @Override
    public boolean Eliminar(Object dto) throws SQLException {



        String sql = "DELETE FROM Taller WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setNString(1,  sql);
            return statement.executeUpdate() > 0;
        }
    }
}

