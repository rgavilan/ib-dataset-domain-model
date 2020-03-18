package es.um.asio.domain.actividades;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FacturaEmitidaActividad extends DataSetDataBase {  
    private long idActividad;
    private long numero;  
    private String idFacturaEmitida;
}
