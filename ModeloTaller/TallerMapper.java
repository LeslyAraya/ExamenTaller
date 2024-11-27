package ModeloTaller;



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
                 ent.getNombre(),
                 ent.getFecha(),
                 ent.getLugar(),
                 ent.getCapacidad()
         );
    }

    @Override
    public Taller toENT(TallerDTO dto) throws SQLException {
       return new Taller(
               dto.getId(),
               dto.getNombre(),
               dto.getFecha(),
               dto.getLugar(),
               dto.getCapacidad()
       );
    }
    
}
