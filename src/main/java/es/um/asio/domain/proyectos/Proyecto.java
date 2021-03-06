package es.um.asio.domain.proyectos;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Proyectos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class Proyecto extends OperationableDataSetDataBase {
    
    /**
     * Mapping of field IDPROYECTO.
     */
    private Long idProyecto;
    
    /**
     * Mapping of field NOMBRE.
     */
    private String nombre;
    
    /**
     * Mapping of field PROYECTOFINALISTA.
     */
    private String proyectoFinalista;
    
    /**
     * Mapping of field LIMITATIVO.
     */
    private String limitativo;
}
