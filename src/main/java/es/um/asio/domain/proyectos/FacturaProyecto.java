package es.um.asio.domain.proyectos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class FacturaProyecto.
 */
@Getter
@Setter
@ToString
public class FacturaProyecto extends DataSetDataBase {  
    
    /**
     * Mapping of field IDPROYECTO.
     */
    private long idProyecto;
    
    /**
     * Mapping of field NUMERO.
     */
    private long numero;
    
    /**
     * Mapping of field NUMEROANUALIDAD.
     */
    private String numeroAnualidad;
    
    /**
     * Mapping of field IDFACTURAEMITIDA.
     */
    private String idFacturaEmitida;
    
    /**
     * Mapping of field NUMEROFACTURAPREVISTA.
     */
    private Long numeroFacturaPrevista;
}
