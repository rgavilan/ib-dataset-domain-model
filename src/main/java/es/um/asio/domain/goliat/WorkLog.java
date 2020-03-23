package es.um.asio.domain.goliat;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WorkLog extends DataSetDataBase {  
    private long id;
    private Long idWorkPackage;
    private long idPersona;
    private String fecha;
    private float numeroHoras;
    private String auto;
}
