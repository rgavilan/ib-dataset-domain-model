package es.um.asio.domain.proyectos;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Tipos auditorias proyectos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class TipoAuditoriaProyecto extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field CODTIPOAUDITORIA.
     */
    private String codTipoAuditoria;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
}
