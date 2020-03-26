package es.um.asio.domain.goliat;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class WorkDescription.
 */
@Getter
@Setter
@ToString
public class WorkDescription extends DataSetDataBase {  
    
    /**
     * Mapping of field ID.
     */
    private long id;
    
    /**
     * Mapping of field ID_PROYECTO.
     */
    private long idProyecto;
    
    /**
     * Mapping of field ID_PERSONA.
     */
    private String id_Persona;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
    
    /**
     * Mapping of field DESCRIPCION.
     */
    private String descripcion;
    
    /**
     * Mapping of field INICIO.
     */
    private String inicio;
    
    /**
     * Mapping of field FIN.
     */
    private String fin;
}
