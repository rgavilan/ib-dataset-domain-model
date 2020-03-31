package es.um.asio.domain.actividades;

import javax.persistence.Entity;

import es.um.asio.domain.DataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Grupos actividades.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class GrupoActividades extends DataSetDataBase {  
    
    /**
     * Mapping of field IDGRUPOACTIVIDADES.
     */
    private long idGrupoActividades;
    
    /**
     * Mapping of field CODTIPOACTIVIDAD.
     */
    private long codTipoActividad;
}
