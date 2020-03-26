package es.um.asio.domain.proyectos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Proyectos.xml"
 */
@Getter
@Setter
@ToString
public class Proyecto extends DataSetDataBase {
    
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
