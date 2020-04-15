package es.um.asio.domain.contratos;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Impuestos contratos proyectos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class ImpuestoContratoProyecto extends OperationableDataSetDataBase {  
    
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
