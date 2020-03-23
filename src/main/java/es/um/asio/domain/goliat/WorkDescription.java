package es.um.asio.domain.goliat;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WorkDescription extends DataSetDataBase {  
    private long id;
    private long idProyecto;
    private String id_Persona;
    private long idPersona;
    private String descripcion;
    private String inicio;
    private String fin;
}
