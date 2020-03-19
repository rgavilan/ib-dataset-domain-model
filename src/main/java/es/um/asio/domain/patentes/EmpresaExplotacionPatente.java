package es.um.asio.domain.patentes;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EmpresaExplotacionPatente extends DataSetDataBase {  
    private long idPatente;
    private long numero;
    private long idTercero;    
    private String observaciones;
    private String fechaInicioPeriodo;
    private String fechaFinPeriodo;
}
