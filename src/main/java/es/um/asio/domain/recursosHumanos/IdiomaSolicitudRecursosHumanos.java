package es.um.asio.domain.recursosHumanos;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Idiomas solicitudes recursos humanos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class IdiomaSolicitudRecursosHumanos extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field IDDOCUMENTO.
     */
    private String idDocumento;
    
    /**
     * Mapping of field CODIGO.
     */
    private String codigo;
    
    /**
     * Mapping of field NIVEL.
     */
    private String nivel;
}
