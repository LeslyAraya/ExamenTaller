/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloInscripcion;

import Mapper.Mapper;
import java.sql.SQLException;

/**
 *
 * @author Student
 */
public class InscripcionMapper implements Mapper<Inscripcion,InscripcionDTO>{

    @Override
    public InscripcionDTO toDTO(Inscripcion ent) {
        return new InscripcionDTO(
                ent.getId(),
                ent.getNombre(),
                ent.getTaller(),
                ent.getParticipante(),
                ent.getFecha(),
                ent.getAsistencia()
        );
    }

    @Override
    public Inscripcion toENT(InscripcionDTO dto) throws SQLException {
        return new Inscripcion(
                dto.getId(),
                dto.getNombre(),
                dto.getTaller(),
                dto.getParticipante(),
                dto.getFecha(),
                dto.getAsistencia()
        );
    }
    
}
