package es.um.asio.domain.recursosHumanos;

import javax.persistence.Entity;
import javax.persistence.Lob;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Meritos solicitudes recursos humanos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class MeritosSolicitudRecursosHumanos extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field IDDOCUMENTO.
     */
    private String idDocumento;
    
    /**
     * Mapping of field TITULO.
     */
    @Lob
    private String titulo;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
}
