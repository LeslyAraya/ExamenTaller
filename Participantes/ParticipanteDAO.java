/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Participantes;

import Modelo.DAO.DAO;
<<<<<<< HEAD
=======

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
>>>>>>> 9db4f79 (Se agregan cambios)
import java.sql.SQLException;


/**
 *
 * @author Student
 */
public class ParticipanteDAO extends DAO<ParticipanteDTO> {

    @Override
    public boolean Agregar(Object dto) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
<<<<<<< HEAD
    public boolean Eliminar(Object dto) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

}
=======

    public boolean Agregar(Object dto) throws SQLException {
        String sql = "INSERT INTO participantes (id, nombre, telefono, correo) VALUES (?, ?, ?, ?)";

        try ( PreparedStatement statement = connection.preparedStatement(sql)) {
            statement.setString(1, sql);
            statement.setString(1, sql);
            statement.setString(1, sql);
            statement.setString(1, sql);

        }
    }

    @Override

    public boolean Eliminar(Object dto) throws SQLException {
        String sql = "DELETE FROM participante WHERE id = ?";
        try ( PreparedStatement statement = connection.preparedStatement(sql)) {
            statement.setString(1, (String) id);
            return statement.executeUpdate() > 0;
        }
    }
}
>>>>>>> 9db4f79 (Se agregan cambios)
