package es.um.asio.domain.contratos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class AnualidadContratoProyecto.
 */
@Getter
@Setter
@ToString
public class AnualidadContratoProyecto extends DataSetDataBase {  
    
    /**
     * Mapping of field IDDOCUMENTO.
     */
    private String idDocumento;
    
    /**
     * Mapping of field NUMEROANUALIDAD.
     */
    private Long numeroAnualidad;
    
    /**
     * Mapping of field IMPORTE.
     */
    private Float importe;
}