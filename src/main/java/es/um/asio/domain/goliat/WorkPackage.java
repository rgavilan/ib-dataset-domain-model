package es.um.asio.domain.goliat;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WorkPackage extends DataSetDataBase {  
    private long id;
    private long idProyecto;
    private long orden;
    private String nombre;
    private String descripcion;
    private float personMonths;
    private String inicio;
    private String fin;
}
