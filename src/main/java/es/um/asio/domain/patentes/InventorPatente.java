package es.um.asio.domain.patentes;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class InventorPatente.
 */
@Getter
@Setter
@ToString
public class InventorPatente extends DataSetDataBase {  
    
    /**
     * Mapping of field IDPATENTE.
     */
    private long idPatente;
    
    /**
     * Mapping of field NUMERO.
     */
    private long numero;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;    
    
    /**
     * Mapping of field INVENTORPRINCIPAL.
     */
    private String inventorPrincipal;
    
    /**
     * Mapping of field PERSONALPROPIO.
     */
    private String personalPropio;
    
    /**
     * Mapping of field NUMEROORDEN.
     */
    private Long numeroOrden;    
    
    /**
     * Mapping of field PARTICIPACION.
     */
    private Float participacion;
}
