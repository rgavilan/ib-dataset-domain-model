package es.um.asio.domain.paginas;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Directores diploma estudios avanzados.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class DirectorDiplomaEstudiosAvanzados extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field DTNA_TINA_CODIGO.
     */
    private long dtnaTinaCodigo;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
    
    /**
     * Mapping of field DTNA_ORDEN.
     */
    private long dtnaOrden;
}
