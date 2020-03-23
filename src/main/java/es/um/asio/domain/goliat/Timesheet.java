package es.um.asio.domain.goliat;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Timesheet extends DataSetDataBase {  
    private long id;
    private long idPersona;
    private String inicio;
    private String fin;
    private String fecha;
    private String firmado;
    private String uuid;
    private String binario;
}
