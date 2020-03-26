package es.um.asio.domain.goliat;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class NoLaborables.
 */
@Getter
@Setter
@ToString
public class NoLaborables extends DataSetDataBase {  
    
    /**
     * Mapping of field ID.
     */
    private long id;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
    
    /**
     * Mapping of field FECHA.
     */
    private String fecha;
    
    /**
     * Mapping of field MOTIVO.
     */
    private String motivo;
    
    /**
     * Mapping of field AUTO.
     */
    private String auto;
}
