package es.um.asio.domain.actividades;

import javax.persistence.Entity;

import es.um.asio.domain.DataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Facturas emitidas actividades.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class FacturaEmitidaActividad extends DataSetDataBase {  

    /**
     * Mapping of field IDACTIVIDAD.
     */
    private long idActividad;
    
    /**
     * Mapping of field NUMERO.
     */
    private long numero;  
    
    /**
     * Mapping of field IDFACTURAEMITIDA.
     */
    private String idFacturaEmitida;
}
