package pe.gob.sunat.conexion;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import pe.gob.sunat.bean.Programa;

public class ProgramaRowMapper implements RowMapper<Programa> {

    public Programa mapRow(ResultSet rs, int rowNum) throws SQLException {

        Programa programa = new Programa();
        programa.setId(rs.getLong(1));
        programa.setNombre(rs.getString(2));
        programa.setDescripcion(rs.getString(3));

        return programa;
    }

}
