package es.um.asio.domain.actividades;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Grupos actividades proyectos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class GrupoActividadesProyecto extends OperationableDataSetDataBase {
  
    /**
     * Mapping of field IDPROYECTO.
     */
    private long idProyecto;
    
    /**
     * Mapping of field NUMERO.
     */
    private long numero;  
    
    /**
     * Mapping of field IDGRUPOACTIVIDADES.
     */
    private long idGrupoActividades;
    
    /**
     * Mapping of field FECHAINICIOPERIODO.
     */
    private String fechaInicioPeriodo;
    
    /**
     * Mapping of field FECHAFINPERIODO.
     */
    private String fechaFinPeriodo;
}
