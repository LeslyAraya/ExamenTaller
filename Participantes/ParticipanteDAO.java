/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Participantes;

import Conexion.Conexion;
import Modelo.DAO.DAO;
import java.sql.SQLException;

/**
 *
 * @author Student
 */
public class ParticipanteDAO extends DAO<ParticipanteDTO>{

    public ParticipanteDAO(Conexion connection) {
        super(connection);
    }

    @Override
    public boolean Agregar(Object dto) throws SQLException {
       
    }

    @Override
    public boolean Eliminar(Object dto) throws SQLException {
     
    }
    
}
