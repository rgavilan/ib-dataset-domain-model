package es.um.asio.domain.goliat;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class NoLaborables extends DataSetDataBase {  
    private long id;
    private long idPersona;
    private String fecha;
    private String motivo;
    private String auto;
}
