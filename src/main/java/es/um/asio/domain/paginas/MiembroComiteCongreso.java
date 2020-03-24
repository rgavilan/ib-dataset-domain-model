package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MiembroComiteCongreso extends DataSetDataBase {  
    private long aucoCongNumero;
    private long idPersona;
    private long aucoOrden;
}