package es.um.asio.domain.ayudas;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Tipos gastos unidades ayudas.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class TipoGastoUnidadAyuda extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field IDUNIDADAYUDA.
     */
    private long idUnidadAyuda;
    
    /**
     * Mapping of field IDTIPOGASTOAYUDA.
     */
    private long idTipoGastoAyuda;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
    
    /**
     * Mapping of field PERMITIDO.
     */
    private String permitido;
}
