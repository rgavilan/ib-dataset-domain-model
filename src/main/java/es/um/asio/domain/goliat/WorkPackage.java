package es.um.asio.domain.goliat;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class WorkPackage.
 */
@Getter
@Setter
@ToString
public class WorkPackage extends DataSetDataBase {  
    
    /**
     * Mapping of field ID.
     */
    private long id;
    
    /**
     * Mapping of field ID_PROYECTO.
     */
    private long idProyecto;
    
    /**
     * Mapping of field ORDEN.
     */
    private long orden;
    
    /**
     * Mapping of field NOMBRE.
     */
    private String nombre;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
    
    /**
     * Mapping of field PERSON_MONTHS.
     */
    private float personMonths;
    
    /**
     * Mapping of field INICIO.
     */
    private String inicio;
    
    /**
     * Mapping of field FIN.
     */
    private String fin;
}
