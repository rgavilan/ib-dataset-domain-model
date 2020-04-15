package es.um.asio.domain.proyectos;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Tipos motivos cambios fechas.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class TipoMotivoCambioFecha extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field CODTIPOMOTIVOCAMBIOFECHA.
     */
    private String codTipoMotivoCambioFecha;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
}
