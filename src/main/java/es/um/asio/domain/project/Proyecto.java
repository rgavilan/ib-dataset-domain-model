package es.um.asio.domain.project;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Project data set POJO
 */
@Getter
@Setter
@ToString
public class Proyecto extends DataSetDataBase {
    /**
     * Project ID
     */
    private Long idProyecto;
    
    /**
     * project name
     */
    private String nombre;
    
    /**
     * Finalist project
     */
    private String proyectoFinalista;
    
    /**
     * Limitative
     */
    private String limitativo;
}
