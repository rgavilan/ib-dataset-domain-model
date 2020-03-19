package es.um.asio.domain.recursosHumanos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class IdiomaSolicitudRecursosHumanos extends DataSetDataBase {  
    private String idDocumento;
    private String codigo;
    private String nivel;
}
