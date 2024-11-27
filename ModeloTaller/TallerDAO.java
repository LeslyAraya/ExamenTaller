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
public class TallerDAO extends DAO<TallerDTO> {

    public TallerDAO(Conexion connection) {
        super(connection);
    }

    @Override
    public boolean Agregar(Object dto) throws SQLException {
        if (dto == null & !ValidatePK)
          }

    @Override
    public boolean Eliminar(Object dto) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean ValidatePK(TallerDAO id) throws SQLException {
        return Agregar(id) == null;
    }
}
