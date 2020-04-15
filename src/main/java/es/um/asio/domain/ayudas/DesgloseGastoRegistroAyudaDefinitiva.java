package es.um.asio.domain.ayudas;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Desglose gastos registro ayudas definitivas.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class DesgloseGastoRegistroAyudaDefinitiva extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field IDDOCUMENTO.
     */
    private String idDocumento;
    
    /**
     * Mapping of field NUMERO.
     */
    private Long numero;
    
    /**
     * Mapping of field IDTIPOGASTOAYUDA.
     */
    private Long idTipoGastoAyuda;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
    
    /**
     * Mapping of field NUMEROANUALIDAD.
     */
    private String numeroAnualidad;
    
    /**
     * Mapping of field IMPORTE.
     */
    private Float importe;
    
    /**
     * Mapping of field PERMITIDO.
     */
    private String permitido;
    
    /**
     * Mapping of field OBSERVACIONES.
     */
    private String observaciones;
}
