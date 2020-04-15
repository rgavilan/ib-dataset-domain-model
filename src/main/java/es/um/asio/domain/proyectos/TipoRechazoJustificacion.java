package es.um.asio.domain.proyectos;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Tipos rechazos justificacion.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class TipoRechazoJustificacion extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field CODTIPORECHAZO.
     */
    private String codTipoRechazo;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
}
