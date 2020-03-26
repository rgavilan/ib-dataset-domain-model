package es.um.asio.domain.contratos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Impuestos contratos proyectos.xml"
 */
@Getter
@Setter
@ToString
public class ImpuestoContratoProyecto extends DataSetDataBase {  
    
    /**
     * Mapping of field IDDOCUMENTO.
     */
    private String idDocumento;
    
    /**
     * Mapping of field TIPOIMPUESTO.
     */
    private String tipoImpuesto;
    
    /**
     * Mapping of field IMPORTEBASE.
     */
    private Float importeBase;
    
    /**
     * Mapping of field TIPOIMPOSITIVO.
     */
    private Long tipoImpositivo;
    
    /**
     * Mapping of field IMPORTE.
     */
    private Float importe;
}
