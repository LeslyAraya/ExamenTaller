/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloInscripcion;

import Conexion.Conexion;
import Modelo.DAO.DAO;

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
public class InscripcionDAO extends DAO<Inscripcion> {

    private Object id;

    public InscripcionDAO(Conexion connection) {
        super(connection);
    }

    @Override
    public boolean Agregar(Object dto) throws SQLException {
        String sql = "INSERT INTO inscripcion (id, nombre, Taller, participante,fecha,asistencia) VALUES (?, ?, ?, ?, ?, ?)";
        try ( PreparedStatement stmt = connection.preparedStatement(sql)) {
            stmt.setString(1, sql);
            stmt.setString(2, sql);
            stmt.setString(3, sql);
            stmt.setString(4, sql);
            stmt.setString(5, sql);
            stmt.setString(6, sql);

            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public boolean Eliminar(Object dto) throws SQLException {
        String sql = "DELETE FROM inscripcion WHERE id = ?";
        try ( PreparedStatement statement = connection.preparedStatement(sql)) {
            statement.setString(1, (String) id);
            return statement.executeUpdate() > 0;
        }

    }

}
