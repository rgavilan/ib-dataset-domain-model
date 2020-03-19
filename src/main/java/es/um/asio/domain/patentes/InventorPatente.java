package es.um.asio.domain.patentes;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class InventorPatente extends DataSetDataBase {  
    private long idPatente;
    private long numero;
    private long idPersona;    
    private String inventorPrincipal;
    private String personalPropio;
    private Long numeroOrden;    
    private Float participacion;
}
