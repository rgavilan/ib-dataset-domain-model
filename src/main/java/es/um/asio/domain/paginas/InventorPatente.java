package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class InventorPatente extends DataSetDataBase {  
    private long invtPateNumero;
    private long idPersona;
    private long invtOrden;
}