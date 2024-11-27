package ModeloTaller;


import .*;
import Mapper.Mapper;
import ModeloTaller.Taller;
import ModeloTaller.TallerDTO;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class TallerMapper implements Mapper<Taller,TallerDTO> {

    @Override
    public TallerDTO toDTO(Taller ent) {
         return new  TallerDTO(
                 ent.getId(),
                 ent.
         )
    }

    @Override
    public Taller toENT(TallerDTO dto) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
